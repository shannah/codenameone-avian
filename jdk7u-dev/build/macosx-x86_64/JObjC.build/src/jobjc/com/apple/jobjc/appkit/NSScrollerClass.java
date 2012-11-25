package com.apple.jobjc.appkit;

public  class NSScrollerClass extends com.apple.jobjc.appkit.NSControlClass {
	public NSScrollerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScrollerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScrollerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend isCompatibleWithOverlayScrollers_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCompatibleWithOverlayScrollers_CMetInst(){
		return ((isCompatibleWithOverlayScrollers_CMetInst != null)
	? (isCompatibleWithOverlayScrollers_CMetInst)
	: (isCompatibleWithOverlayScrollers_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCompatibleWithOverlayScrollers", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCompatibleWithOverlayScrollers(){
			final com.apple.jobjc.Invoke.MsgSend isCompatibleWithOverlayScrollers_CMetInst = get_isCompatibleWithOverlayScrollers_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCompatibleWithOverlayScrollers_CMetInst.init(nativeBuffer, this);
		isCompatibleWithOverlayScrollers_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredScrollerStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredScrollerStyle_CMetInst(){
		return ((preferredScrollerStyle_CMetInst != null)
	? (preferredScrollerStyle_CMetInst)
	: (preferredScrollerStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredScrollerStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long preferredScrollerStyle(){
			final com.apple.jobjc.Invoke.MsgSend preferredScrollerStyle_CMetInst = get_preferredScrollerStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredScrollerStyle_CMetInst.init(nativeBuffer, this);
		preferredScrollerStyle_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerWidth_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerWidth_CMetInst(){
		return ((scrollerWidth_CMetInst != null)
	? (scrollerWidth_CMetInst)
	: (scrollerWidth_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double scrollerWidth(){
			final com.apple.jobjc.Invoke.MsgSend scrollerWidth_CMetInst = get_scrollerWidth_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerWidth_CMetInst.init(nativeBuffer, this);
		scrollerWidth_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerWidthForControlSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerWidthForControlSize_CMetInst(){
		return ((scrollerWidthForControlSize_CMetInst != null)
	? (scrollerWidthForControlSize_CMetInst)
	: (scrollerWidthForControlSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerWidthForControlSize:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public double scrollerWidthForControlSize(final long controlSize){
			final com.apple.jobjc.Invoke.MsgSend scrollerWidthForControlSize_CMetInst = get_scrollerWidthForControlSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerWidthForControlSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		scrollerWidthForControlSize_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerWidthForControlSize_scrollerStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerWidthForControlSize_scrollerStyle_CMetInst(){
		return ((scrollerWidthForControlSize_scrollerStyle_CMetInst != null)
	? (scrollerWidthForControlSize_scrollerStyle_CMetInst)
	: (scrollerWidthForControlSize_scrollerStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerWidthForControlSize:scrollerStyle:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double scrollerWidthForControlSize_scrollerStyle(final long controlSize, final long scrollerStyle){
			final com.apple.jobjc.Invoke.MsgSend scrollerWidthForControlSize_scrollerStyle_CMetInst = get_scrollerWidthForControlSize_scrollerStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerWidthForControlSize_scrollerStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, scrollerStyle);
		scrollerWidthForControlSize_scrollerStyle_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
