package com.apple.jobjc.appkit;

public  class NSGraphicsContext extends com.apple.jobjc.foundation.NSObject {
	public NSGraphicsContext(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSGraphicsContext(final NSGraphicsContext obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CIContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CIContext_IMetInst(){
		return ((CIContext_IMetInst != null)
	? (CIContext_IMetInst)
	: (CIContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CIContext", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CIContext* (@, @) */ CIContext(){
			final com.apple.jobjc.Invoke.MsgSend CIContext_IMetInst = get_CIContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CIContext_IMetInst.init(nativeBuffer, this);
		CIContext_IMetInst.invoke(nativeBuffer);
		final Object /* CIContext* (@, @) */ returnValue = (Object /* CIContext* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributes_IMetInst(){
		return ((attributes_IMetInst != null)
	? (attributes_IMetInst)
	: (attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributes(){
			final com.apple.jobjc.Invoke.MsgSend attributes_IMetInst = get_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributes_IMetInst.init(nativeBuffer, this);
		attributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorRenderingIntent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorRenderingIntent_IMetInst(){
		return ((colorRenderingIntent_IMetInst != null)
	? (colorRenderingIntent_IMetInst)
	: (colorRenderingIntent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorRenderingIntent", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long colorRenderingIntent(){
			final com.apple.jobjc.Invoke.MsgSend colorRenderingIntent_IMetInst = get_colorRenderingIntent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorRenderingIntent_IMetInst.init(nativeBuffer, this);
		colorRenderingIntent_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compositingOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositingOperation_IMetInst(){
		return ((compositingOperation_IMetInst != null)
	? (compositingOperation_IMetInst)
	: (compositingOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositingOperation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long compositingOperation(){
			final com.apple.jobjc.Invoke.MsgSend compositingOperation_IMetInst = get_compositingOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositingOperation_IMetInst.init(nativeBuffer, this);
		compositingOperation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flushGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushGraphics_IMetInst(){
		return ((flushGraphics_IMetInst != null)
	? (flushGraphics_IMetInst)
	: (flushGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushGraphics", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushGraphics(){
			final com.apple.jobjc.Invoke.MsgSend flushGraphics_IMetInst = get_flushGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushGraphics_IMetInst.init(nativeBuffer, this);
		flushGraphics_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsPort_IMetInst(){
		return ((graphicsPort_IMetInst != null)
	? (graphicsPort_IMetInst)
	: (graphicsPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsPort", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> graphicsPort(){
			final com.apple.jobjc.Invoke.MsgSend graphicsPort_IMetInst = get_graphicsPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsPort_IMetInst.init(nativeBuffer, this);
		graphicsPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageInterpolation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageInterpolation_IMetInst(){
		return ((imageInterpolation_IMetInst != null)
	? (imageInterpolation_IMetInst)
	: (imageInterpolation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageInterpolation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imageInterpolation(){
			final com.apple.jobjc.Invoke.MsgSend imageInterpolation_IMetInst = get_imageInterpolation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageInterpolation_IMetInst.init(nativeBuffer, this);
		imageInterpolation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDrawingToScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDrawingToScreen_IMetInst(){
		return ((isDrawingToScreen_IMetInst != null)
	? (isDrawingToScreen_IMetInst)
	: (isDrawingToScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDrawingToScreen", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDrawingToScreen(){
			final com.apple.jobjc.Invoke.MsgSend isDrawingToScreen_IMetInst = get_isDrawingToScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDrawingToScreen_IMetInst.init(nativeBuffer, this);
		isDrawingToScreen_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFlipped_IMetInst(){
		return ((isFlipped_IMetInst != null)
	? (isFlipped_IMetInst)
	: (isFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFlipped", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFlipped(){
			final com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst = get_isFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFlipped_IMetInst.init(nativeBuffer, this);
		isFlipped_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend patternPhase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_patternPhase_IMetInst(){
		return ((patternPhase_IMetInst != null)
	? (patternPhase_IMetInst)
	: (patternPhase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "patternPhase", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint patternPhase(){
			final com.apple.jobjc.Invoke.MsgSend patternPhase_IMetInst = get_patternPhase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		patternPhase_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		patternPhase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreGraphicsState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreGraphicsState_IMetInst(){
		return ((restoreGraphicsState_IMetInst != null)
	? (restoreGraphicsState_IMetInst)
	: (restoreGraphicsState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreGraphicsState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void restoreGraphicsState(){
			final com.apple.jobjc.Invoke.MsgSend restoreGraphicsState_IMetInst = get_restoreGraphicsState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreGraphicsState_IMetInst.init(nativeBuffer, this);
		restoreGraphicsState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveGraphicsState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveGraphicsState_IMetInst(){
		return ((saveGraphicsState_IMetInst != null)
	? (saveGraphicsState_IMetInst)
	: (saveGraphicsState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveGraphicsState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void saveGraphicsState(){
			final com.apple.jobjc.Invoke.MsgSend saveGraphicsState_IMetInst = get_saveGraphicsState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveGraphicsState_IMetInst.init(nativeBuffer, this);
		saveGraphicsState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColorRenderingIntent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColorRenderingIntent_IMetInst(){
		return ((setColorRenderingIntent_IMetInst != null)
	? (setColorRenderingIntent_IMetInst)
	: (setColorRenderingIntent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColorRenderingIntent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setColorRenderingIntent(final long renderingIntent){
			final com.apple.jobjc.Invoke.MsgSend setColorRenderingIntent_IMetInst = get_setColorRenderingIntent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColorRenderingIntent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, renderingIntent);
		setColorRenderingIntent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompositingOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompositingOperation_IMetInst(){
		return ((setCompositingOperation_IMetInst != null)
	? (setCompositingOperation_IMetInst)
	: (setCompositingOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompositingOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCompositingOperation(final long operation){
			final com.apple.jobjc.Invoke.MsgSend setCompositingOperation_IMetInst = get_setCompositingOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompositingOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		setCompositingOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageInterpolation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageInterpolation_IMetInst(){
		return ((setImageInterpolation_IMetInst != null)
	? (setImageInterpolation_IMetInst)
	: (setImageInterpolation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageInterpolation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImageInterpolation(final long interpolation){
			final com.apple.jobjc.Invoke.MsgSend setImageInterpolation_IMetInst = get_setImageInterpolation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageInterpolation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, interpolation);
		setImageInterpolation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPatternPhase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPatternPhase_IMetInst(){
		return ((setPatternPhase_IMetInst != null)
	? (setPatternPhase_IMetInst)
	: (setPatternPhase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPatternPhase:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setPatternPhase(final com.apple.jobjc.foundation.NSPoint phase){
			final com.apple.jobjc.Invoke.MsgSend setPatternPhase_IMetInst = get_setPatternPhase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPatternPhase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, phase);
		setPatternPhase_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldAntialias_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldAntialias_IMetInst(){
		return ((setShouldAntialias_IMetInst != null)
	? (setShouldAntialias_IMetInst)
	: (setShouldAntialias_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldAntialias:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldAntialias(final boolean antialias){
			final com.apple.jobjc.Invoke.MsgSend setShouldAntialias_IMetInst = get_setShouldAntialias_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldAntialias_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, antialias);
		setShouldAntialias_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldAntialias_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldAntialias_IMetInst(){
		return ((shouldAntialias_IMetInst != null)
	? (shouldAntialias_IMetInst)
	: (shouldAntialias_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldAntialias", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldAntialias(){
			final com.apple.jobjc.Invoke.MsgSend shouldAntialias_IMetInst = get_shouldAntialias_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldAntialias_IMetInst.init(nativeBuffer, this);
		shouldAntialias_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
