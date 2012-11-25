package com.apple.jobjc.appkit;

public  class NSScrollViewClass extends com.apple.jobjc.appkit.NSViewClass {
	public NSScrollViewClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScrollViewClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScrollViewClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst(){
		return ((contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst != null)
	? (contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst)
	: (contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentSizeForFrameSize:hasHorizontalScroller:hasVerticalScroller:borderType:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType(final com.apple.jobjc.foundation.NSSize fSize, final boolean hFlag, final boolean vFlag, final long aType){
			final com.apple.jobjc.Invoke.MsgSend contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst = get_contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, fSize);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hFlag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, vFlag);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst(){
		return ((contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst != null)
	? (contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst)
	: (contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentSizeForFrameSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(final com.apple.jobjc.foundation.NSSize fSize, final com.apple.jobjc.NSClass horizontalScrollerClass, final com.apple.jobjc.NSClass verticalScrollerClass, final long aType, final long controlSize, final long scrollerStyle){
			final com.apple.jobjc.Invoke.MsgSend contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst = get_contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, fSize);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, horizontalScrollerClass);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, verticalScrollerClass);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, scrollerStyle);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst(){
		return ((frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst != null)
	? (frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst)
	: (frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameSizeForContentSize:hasHorizontalScroller:hasVerticalScroller:borderType:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType(final com.apple.jobjc.foundation.NSSize cSize, final boolean hFlag, final boolean vFlag, final long aType){
			final com.apple.jobjc.Invoke.MsgSend frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst = get_frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, cSize);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hFlag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, vFlag);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst(){
		return ((frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst != null)
	? (frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst)
	: (frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameSizeForContentSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(final com.apple.jobjc.foundation.NSSize cSize, final com.apple.jobjc.NSClass horizontalScrollerClass, final com.apple.jobjc.NSClass verticalScrollerClass, final long aType, final long controlSize, final long scrollerStyle){
			final com.apple.jobjc.Invoke.MsgSend frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst = get_frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, cSize);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, horizontalScrollerClass);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, verticalScrollerClass);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, scrollerStyle);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerViewClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerViewClass_CMetInst(){
		return ((rulerViewClass_CMetInst != null)
	? (rulerViewClass_CMetInst)
	: (rulerViewClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerViewClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T rulerViewClass(){
			final com.apple.jobjc.Invoke.MsgSend rulerViewClass_CMetInst = get_rulerViewClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerViewClass_CMetInst.init(nativeBuffer, this);
		rulerViewClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setRulerViewClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRulerViewClass_CMetInst(){
		return ((setRulerViewClass_CMetInst != null)
	? (setRulerViewClass_CMetInst)
	: (setRulerViewClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRulerViewClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setRulerViewClass(final com.apple.jobjc.NSClass rulerViewClass){
			final com.apple.jobjc.Invoke.MsgSend setRulerViewClass_CMetInst = get_setRulerViewClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRulerViewClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, rulerViewClass);
		setRulerViewClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
