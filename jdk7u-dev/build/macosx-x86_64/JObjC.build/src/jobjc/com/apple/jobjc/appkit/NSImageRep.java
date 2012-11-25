package com.apple.jobjc.appkit;

public  class NSImageRep extends com.apple.jobjc.foundation.NSObject {
	public NSImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSImageRep(final NSImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGImageForProposedRect_context_hints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGImageForProposedRect_context_hints_IMetInst(){
		return ((CGImageForProposedRect_context_hints_IMetInst != null)
	? (CGImageForProposedRect_context_hints_IMetInst)
	: (CGImageForProposedRect_context_hints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGImageForProposedRect:context:hints:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ CGImageForProposedRect_context_hints(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> proposedDestRect, final com.apple.jobjc.appkit.NSGraphicsContext context, final com.apple.jobjc.foundation.NSDictionary hints){
			final com.apple.jobjc.Invoke.MsgSend CGImageForProposedRect_context_hints_IMetInst = get_CGImageForProposedRect_context_hints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGImageForProposedRect_context_hints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedDestRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hints);
		CGImageForProposedRect_context_hints_IMetInst.invoke(nativeBuffer);
		final Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ returnValue = (Object /* CGImageRef (^{CGImage}, ^{CGImage}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitsPerSample_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitsPerSample_IMetInst(){
		return ((bitsPerSample_IMetInst != null)
	? (bitsPerSample_IMetInst)
	: (bitsPerSample_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitsPerSample", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long bitsPerSample(){
			final com.apple.jobjc.Invoke.MsgSend bitsPerSample_IMetInst = get_bitsPerSample_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitsPerSample_IMetInst.init(nativeBuffer, this);
		bitsPerSample_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorSpaceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorSpaceName_IMetInst(){
		return ((colorSpaceName_IMetInst != null)
	? (colorSpaceName_IMetInst)
	: (colorSpaceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorSpaceName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString colorSpaceName(){
			final com.apple.jobjc.Invoke.MsgSend colorSpaceName_IMetInst = get_colorSpaceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorSpaceName_IMetInst.init(nativeBuffer, this);
		colorSpaceName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draw_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draw_IMetInst(){
		return ((draw_IMetInst != null)
	? (draw_IMetInst)
	: (draw_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draw", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean draw(){
			final com.apple.jobjc.Invoke.MsgSend draw_IMetInst = get_draw_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draw_IMetInst.init(nativeBuffer, this);
		draw_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawAtPoint_IMetInst(){
		return ((drawAtPoint_IMetInst != null)
	? (drawAtPoint_IMetInst)
	: (drawAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawAtPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean drawAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend drawAtPoint_IMetInst = get_drawAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		drawAtPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_IMetInst(){
		return ((drawInRect_IMetInst != null)
	? (drawInRect_IMetInst)
	: (drawInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean drawInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_IMetInst = get_drawInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawInRect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst(){
		return ((drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst != null)
	? (drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst)
	: (drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:fromRect:operation:fraction:respectFlipped:hints:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean drawInRect_fromRect_operation_fraction_respectFlipped_hints(final com.apple.jobjc.foundation.NSRect dstSpacePortionRect, final com.apple.jobjc.foundation.NSRect srcSpacePortionRect, final long op, final double requestedAlpha, final boolean respectContextIsFlipped, final com.apple.jobjc.foundation.NSDictionary hints){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst = get_drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dstSpacePortionRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, srcSpacePortionRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, requestedAlpha);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, respectContextIsFlipped);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hints);
		drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasAlpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasAlpha_IMetInst(){
		return ((hasAlpha_IMetInst != null)
	? (hasAlpha_IMetInst)
	: (hasAlpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasAlpha", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasAlpha(){
			final com.apple.jobjc.Invoke.MsgSend hasAlpha_IMetInst = get_hasAlpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasAlpha_IMetInst.init(nativeBuffer, this);
		hasAlpha_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOpaque_IMetInst(){
		return ((isOpaque_IMetInst != null)
	? (isOpaque_IMetInst)
	: (isOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOpaque", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOpaque(){
			final com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst = get_isOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOpaque_IMetInst.init(nativeBuffer, this);
		isOpaque_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelsHigh_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelsHigh_IMetInst(){
		return ((pixelsHigh_IMetInst != null)
	? (pixelsHigh_IMetInst)
	: (pixelsHigh_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelsHigh", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long pixelsHigh(){
			final com.apple.jobjc.Invoke.MsgSend pixelsHigh_IMetInst = get_pixelsHigh_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelsHigh_IMetInst.init(nativeBuffer, this);
		pixelsHigh_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelsWide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelsWide_IMetInst(){
		return ((pixelsWide_IMetInst != null)
	? (pixelsWide_IMetInst)
	: (pixelsWide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelsWide", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long pixelsWide(){
			final com.apple.jobjc.Invoke.MsgSend pixelsWide_IMetInst = get_pixelsWide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelsWide_IMetInst.init(nativeBuffer, this);
		pixelsWide_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlpha_IMetInst(){
		return ((setAlpha_IMetInst != null)
	? (setAlpha_IMetInst)
	: (setAlpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAlpha(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAlpha_IMetInst = get_setAlpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAlpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBitsPerSample_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBitsPerSample_IMetInst(){
		return ((setBitsPerSample_IMetInst != null)
	? (setBitsPerSample_IMetInst)
	: (setBitsPerSample_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBitsPerSample:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBitsPerSample(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend setBitsPerSample_IMetInst = get_setBitsPerSample_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBitsPerSample_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		setBitsPerSample_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColorSpaceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColorSpaceName_IMetInst(){
		return ((setColorSpaceName_IMetInst != null)
	? (setColorSpaceName_IMetInst)
	: (setColorSpaceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColorSpaceName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColorSpaceName(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setColorSpaceName_IMetInst = get_setColorSpaceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColorSpaceName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setColorSpaceName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOpaque_IMetInst(){
		return ((setOpaque_IMetInst != null)
	? (setOpaque_IMetInst)
	: (setOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOpaque:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setOpaque(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setOpaque_IMetInst = get_setOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOpaque_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setOpaque_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPixelsHigh_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPixelsHigh_IMetInst(){
		return ((setPixelsHigh_IMetInst != null)
	? (setPixelsHigh_IMetInst)
	: (setPixelsHigh_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPixelsHigh:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPixelsHigh(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend setPixelsHigh_IMetInst = get_setPixelsHigh_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPixelsHigh_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		setPixelsHigh_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPixelsWide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPixelsWide_IMetInst(){
		return ((setPixelsWide_IMetInst != null)
	? (setPixelsWide_IMetInst)
	: (setPixelsWide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPixelsWide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPixelsWide(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend setPixelsWide_IMetInst = get_setPixelsWide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPixelsWide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		setPixelsWide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSize_IMetInst(){
		return ((setSize_IMetInst != null)
	? (setSize_IMetInst)
	: (setSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend setSize_IMetInst = get_setSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		setSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_size_IMetInst(){
		return ((size_IMetInst != null)
	? (size_IMetInst)
	: (size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "size", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize size(){
			final com.apple.jobjc.Invoke.MsgSend size_IMetInst = get_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		size_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		size_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
