package com.apple.jobjc.appkit;

public  class NSWindowClass extends com.apple.jobjc.appkit.NSResponderClass {
	public NSWindowClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSWindowClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSWindowClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend contentRectForFrameRect_styleMask_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentRectForFrameRect_styleMask_CMetInst(){
		return ((contentRectForFrameRect_styleMask_CMetInst != null)
	? (contentRectForFrameRect_styleMask_CMetInst)
	: (contentRectForFrameRect_styleMask_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentRectForFrameRect:styleMask:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect contentRectForFrameRect_styleMask(final com.apple.jobjc.foundation.NSRect fRect, final long aStyle){
			final com.apple.jobjc.Invoke.MsgSend contentRectForFrameRect_styleMask_CMetInst = get_contentRectForFrameRect_styleMask_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentRectForFrameRect_styleMask_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aStyle);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		contentRectForFrameRect_styleMask_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultDepthLimit_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultDepthLimit_CMetInst(){
		return ((defaultDepthLimit_CMetInst != null)
	? (defaultDepthLimit_CMetInst)
	: (defaultDepthLimit_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultDepthLimit", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int defaultDepthLimit(){
			final com.apple.jobjc.Invoke.MsgSend defaultDepthLimit_CMetInst = get_defaultDepthLimit_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultDepthLimit_CMetInst.init(nativeBuffer, this);
		defaultDepthLimit_CMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameRectForContentRect_styleMask_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameRectForContentRect_styleMask_CMetInst(){
		return ((frameRectForContentRect_styleMask_CMetInst != null)
	? (frameRectForContentRect_styleMask_CMetInst)
	: (frameRectForContentRect_styleMask_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameRectForContentRect:styleMask:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameRectForContentRect_styleMask(final com.apple.jobjc.foundation.NSRect cRect, final long aStyle){
			final com.apple.jobjc.Invoke.MsgSend frameRectForContentRect_styleMask_CMetInst = get_frameRectForContentRect_styleMask_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameRectForContentRect_styleMask_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aStyle);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameRectForContentRect_styleMask_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuChanged_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuChanged_CMetInst(){
		return ((menuChanged_CMetInst != null)
	? (menuChanged_CMetInst)
	: (menuChanged_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void menuChanged(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend menuChanged_CMetInst = get_menuChanged_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuChanged_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		menuChanged_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minFrameWidthWithTitle_styleMask_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minFrameWidthWithTitle_styleMask_CMetInst(){
		return ((minFrameWidthWithTitle_styleMask_CMetInst != null)
	? (minFrameWidthWithTitle_styleMask_CMetInst)
	: (minFrameWidthWithTitle_styleMask_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minFrameWidthWithTitle:styleMask:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public double minFrameWidthWithTitle_styleMask(final com.apple.jobjc.foundation.NSString aTitle, final long aStyle){
			final com.apple.jobjc.Invoke.MsgSend minFrameWidthWithTitle_styleMask_CMetInst = get_minFrameWidthWithTitle_styleMask_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minFrameWidthWithTitle_styleMask_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTitle);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aStyle);
		minFrameWidthWithTitle_styleMask_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFrameUsingName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFrameUsingName_CMetInst(){
		return ((removeFrameUsingName_CMetInst != null)
	? (removeFrameUsingName_CMetInst)
	: (removeFrameUsingName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFrameUsingName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFrameUsingName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend removeFrameUsingName_CMetInst = get_removeFrameUsingName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFrameUsingName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		removeFrameUsingName_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend standardWindowButton_forStyleMask_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardWindowButton_forStyleMask_CMetInst(){
		return ((standardWindowButton_forStyleMask_CMetInst != null)
	? (standardWindowButton_forStyleMask_CMetInst)
	: (standardWindowButton_forStyleMask_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardWindowButton:forStyleMask:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSButton standardWindowButton_forStyleMask(final long b, final long styleMask){
			final com.apple.jobjc.Invoke.MsgSend standardWindowButton_forStyleMask_CMetInst = get_standardWindowButton_forStyleMask_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardWindowButton_forStyleMask_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, b);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, styleMask);
		standardWindowButton_forStyleMask_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButton returnValue = (com.apple.jobjc.appkit.NSButton) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst(){
		return ((windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst != null)
	? (windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst)
	: (windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNumberAtPoint:belowWindowWithWindowNumber:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long windowNumberAtPoint_belowWindowWithWindowNumber(final com.apple.jobjc.foundation.NSPoint point, final long windowNumber){
			final com.apple.jobjc.Invoke.MsgSend windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst = get_windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, windowNumber);
		windowNumberAtPoint_belowWindowWithWindowNumber_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNumbersWithOptions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNumbersWithOptions_CMetInst(){
		return ((windowNumbersWithOptions_CMetInst != null)
	? (windowNumbersWithOptions_CMetInst)
	: (windowNumbersWithOptions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNumbersWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray windowNumbersWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend windowNumbersWithOptions_CMetInst = get_windowNumbersWithOptions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNumbersWithOptions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		windowNumbersWithOptions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
