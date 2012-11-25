package com.apple.jobjc.appkit;

public  class NSScreen extends com.apple.jobjc.foundation.NSObject {
	public NSScreen(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScreen(final NSScreen obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend backingAlignedRect_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingAlignedRect_options_IMetInst(){
		return ((backingAlignedRect_options_IMetInst != null)
	? (backingAlignedRect_options_IMetInst)
	: (backingAlignedRect_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingAlignedRect:options:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect backingAlignedRect_options(final com.apple.jobjc.foundation.NSRect aRect, final long options){
			final com.apple.jobjc.Invoke.MsgSend backingAlignedRect_options_IMetInst = get_backingAlignedRect_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingAlignedRect_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, options);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		backingAlignedRect_options_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backingScaleFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingScaleFactor_IMetInst(){
		return ((backingScaleFactor_IMetInst != null)
	? (backingScaleFactor_IMetInst)
	: (backingScaleFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingScaleFactor", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double backingScaleFactor(){
			final com.apple.jobjc.Invoke.MsgSend backingScaleFactor_IMetInst = get_backingScaleFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingScaleFactor_IMetInst.init(nativeBuffer, this);
		backingScaleFactor_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorSpace_IMetInst(){
		return ((colorSpace_IMetInst != null)
	? (colorSpace_IMetInst)
	: (colorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace colorSpace(){
			final com.apple.jobjc.Invoke.MsgSend colorSpace_IMetInst = get_colorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorSpace_IMetInst.init(nativeBuffer, this);
		colorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectFromBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectFromBacking_IMetInst(){
		return ((convertRectFromBacking_IMetInst != null)
	? (convertRectFromBacking_IMetInst)
	: (convertRectFromBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectFromBacking:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectFromBacking(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectFromBacking_IMetInst = get_convertRectFromBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectFromBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectFromBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectToBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectToBacking_IMetInst(){
		return ((convertRectToBacking_IMetInst != null)
	? (convertRectToBacking_IMetInst)
	: (convertRectToBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectToBacking:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectToBacking(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectToBacking_IMetInst = get_convertRectToBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectToBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectToBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend depth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_depth_IMetInst(){
		return ((depth_IMetInst != null)
	? (depth_IMetInst)
	: (depth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "depth", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int depth(){
			final com.apple.jobjc.Invoke.MsgSend depth_IMetInst = get_depth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		depth_IMetInst.init(nativeBuffer, this);
		depth_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceDescription_IMetInst(){
		return ((deviceDescription_IMetInst != null)
	? (deviceDescription_IMetInst)
	: (deviceDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary deviceDescription(){
			final com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst = get_deviceDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceDescription_IMetInst.init(nativeBuffer, this);
		deviceDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frame_IMetInst(){
		return ((frame_IMetInst != null)
	? (frame_IMetInst)
	: (frame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frame", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect frame(){
			final com.apple.jobjc.Invoke.MsgSend frame_IMetInst = get_frame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frame_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend supportedWindowDepths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supportedWindowDepths_IMetInst(){
		return ((supportedWindowDepths_IMetInst != null)
	? (supportedWindowDepths_IMetInst)
	: (supportedWindowDepths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supportedWindowDepths", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Integer> supportedWindowDepths(){
			final com.apple.jobjc.Invoke.MsgSend supportedWindowDepths_IMetInst = get_supportedWindowDepths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supportedWindowDepths_IMetInst.init(nativeBuffer, this);
		supportedWindowDepths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Integer> returnValue = (com.apple.jobjc.Pointer<java.lang.Integer>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userSpaceScaleFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userSpaceScaleFactor_IMetInst(){
		return ((userSpaceScaleFactor_IMetInst != null)
	? (userSpaceScaleFactor_IMetInst)
	: (userSpaceScaleFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userSpaceScaleFactor", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double userSpaceScaleFactor(){
			final com.apple.jobjc.Invoke.MsgSend userSpaceScaleFactor_IMetInst = get_userSpaceScaleFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userSpaceScaleFactor_IMetInst.init(nativeBuffer, this);
		userSpaceScaleFactor_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend visibleFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visibleFrame_IMetInst(){
		return ((visibleFrame_IMetInst != null)
	? (visibleFrame_IMetInst)
	: (visibleFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visibleFrame", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect visibleFrame(){
			final com.apple.jobjc.Invoke.MsgSend visibleFrame_IMetInst = get_visibleFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visibleFrame_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		visibleFrame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
