package com.apple.jobjc.appkit;

public  class NSImage extends com.apple.jobjc.foundation.NSObject {
	public NSImage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSImage(final NSImage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGImageForProposedRect_context_hints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGImageForProposedRect_context_hints_IMetInst(){
		return ((CGImageForProposedRect_context_hints_IMetInst != null)
	? (CGImageForProposedRect_context_hints_IMetInst)
	: (CGImageForProposedRect_context_hints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGImageForProposedRect:context:hints:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ CGImageForProposedRect_context_hints(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> proposedDestRect, final com.apple.jobjc.appkit.NSGraphicsContext referenceContext, final com.apple.jobjc.foundation.NSDictionary hints){
			final com.apple.jobjc.Invoke.MsgSend CGImageForProposedRect_context_hints_IMetInst = get_CGImageForProposedRect_context_hints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGImageForProposedRect_context_hints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedDestRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, referenceContext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hints);
		CGImageForProposedRect_context_hints_IMetInst.invoke(nativeBuffer);
		final Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ returnValue = (Object /* CGImageRef (^{CGImage}, ^{CGImage}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend TIFFRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_TIFFRepresentation_IMetInst(){
		return ((TIFFRepresentation_IMetInst != null)
	? (TIFFRepresentation_IMetInst)
	: (TIFFRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "TIFFRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData TIFFRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend TIFFRepresentation_IMetInst = get_TIFFRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TIFFRepresentation_IMetInst.init(nativeBuffer, this);
		TIFFRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend TIFFRepresentationUsingCompression_factor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_TIFFRepresentationUsingCompression_factor_IMetInst(){
		return ((TIFFRepresentationUsingCompression_factor_IMetInst != null)
	? (TIFFRepresentationUsingCompression_factor_IMetInst)
	: (TIFFRepresentationUsingCompression_factor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "TIFFRepresentationUsingCompression:factor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData TIFFRepresentationUsingCompression_factor(final long comp, final float aFloat){
			final com.apple.jobjc.Invoke.MsgSend TIFFRepresentationUsingCompression_factor_IMetInst = get_TIFFRepresentationUsingCompression_factor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TIFFRepresentationUsingCompression_factor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, comp);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, aFloat);
		TIFFRepresentationUsingCompression_factor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityDescription_IMetInst(){
		return ((accessibilityDescription_IMetInst != null)
	? (accessibilityDescription_IMetInst)
	: (accessibilityDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString accessibilityDescription(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityDescription_IMetInst = get_accessibilityDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityDescription_IMetInst.init(nativeBuffer, this);
		accessibilityDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRepresentation_IMetInst(){
		return ((addRepresentation_IMetInst != null)
	? (addRepresentation_IMetInst)
	: (addRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRepresentation(final com.apple.jobjc.appkit.NSImageRep imageRep){
			final com.apple.jobjc.Invoke.MsgSend addRepresentation_IMetInst = get_addRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageRep);
		addRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addRepresentations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRepresentations_IMetInst(){
		return ((addRepresentations_IMetInst != null)
	? (addRepresentations_IMetInst)
	: (addRepresentations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRepresentations:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRepresentations(final com.apple.jobjc.foundation.NSArray imageReps){
			final com.apple.jobjc.Invoke.MsgSend addRepresentations_IMetInst = get_addRepresentations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRepresentations_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageReps);
		addRepresentations_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend alignmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignmentRect_IMetInst(){
		return ((alignmentRect_IMetInst != null)
	? (alignmentRect_IMetInst)
	: (alignmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignmentRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect alignmentRect(){
			final com.apple.jobjc.Invoke.MsgSend alignmentRect_IMetInst = get_alignmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignmentRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		alignmentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bestRepresentationForDevice_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bestRepresentationForDevice_IMetInst(){
		return ((bestRepresentationForDevice_IMetInst != null)
	? (bestRepresentationForDevice_IMetInst)
	: (bestRepresentationForDevice_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bestRepresentationForDevice:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImageRep bestRepresentationForDevice(final com.apple.jobjc.foundation.NSDictionary deviceDescription){
			final com.apple.jobjc.Invoke.MsgSend bestRepresentationForDevice_IMetInst = get_bestRepresentationForDevice_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bestRepresentationForDevice_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deviceDescription);
		bestRepresentationForDevice_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImageRep returnValue = (com.apple.jobjc.appkit.NSImageRep) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bestRepresentationForRect_context_hints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bestRepresentationForRect_context_hints_IMetInst(){
		return ((bestRepresentationForRect_context_hints_IMetInst != null)
	? (bestRepresentationForRect_context_hints_IMetInst)
	: (bestRepresentationForRect_context_hints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bestRepresentationForRect:context:hints:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImageRep bestRepresentationForRect_context_hints(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSGraphicsContext referenceContext, final com.apple.jobjc.foundation.NSDictionary hints){
			final com.apple.jobjc.Invoke.MsgSend bestRepresentationForRect_context_hints_IMetInst = get_bestRepresentationForRect_context_hints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bestRepresentationForRect_context_hints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, referenceContext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hints);
		bestRepresentationForRect_context_hints_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImageRep returnValue = (com.apple.jobjc.appkit.NSImageRep) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cacheDepthMatchesImageDepth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cacheDepthMatchesImageDepth_IMetInst(){
		return ((cacheDepthMatchesImageDepth_IMetInst != null)
	? (cacheDepthMatchesImageDepth_IMetInst)
	: (cacheDepthMatchesImageDepth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cacheDepthMatchesImageDepth", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean cacheDepthMatchesImageDepth(){
			final com.apple.jobjc.Invoke.MsgSend cacheDepthMatchesImageDepth_IMetInst = get_cacheDepthMatchesImageDepth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cacheDepthMatchesImageDepth_IMetInst.init(nativeBuffer, this);
		cacheDepthMatchesImageDepth_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cacheMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cacheMode_IMetInst(){
		return ((cacheMode_IMetInst != null)
	? (cacheMode_IMetInst)
	: (cacheMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cacheMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long cacheMode(){
			final com.apple.jobjc.Invoke.MsgSend cacheMode_IMetInst = get_cacheMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cacheMode_IMetInst.init(nativeBuffer, this);
		cacheMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelIncrementalLoad_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelIncrementalLoad_IMetInst(){
		return ((cancelIncrementalLoad_IMetInst != null)
	? (cancelIncrementalLoad_IMetInst)
	: (cancelIncrementalLoad_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelIncrementalLoad", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelIncrementalLoad(){
			final com.apple.jobjc.Invoke.MsgSend cancelIncrementalLoad_IMetInst = get_cancelIncrementalLoad_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelIncrementalLoad_IMetInst.init(nativeBuffer, this);
		cancelIncrementalLoad_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend compositeToPoint_fromRect_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositeToPoint_fromRect_operation_IMetInst(){
		return ((compositeToPoint_fromRect_operation_IMetInst != null)
	? (compositeToPoint_fromRect_operation_IMetInst)
	: (compositeToPoint_fromRect_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositeToPoint:fromRect:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void compositeToPoint_fromRect_operation(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect rect, final long op){
			final com.apple.jobjc.Invoke.MsgSend compositeToPoint_fromRect_operation_IMetInst = get_compositeToPoint_fromRect_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositeToPoint_fromRect_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		compositeToPoint_fromRect_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend compositeToPoint_fromRect_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositeToPoint_fromRect_operation_fraction_IMetInst(){
		return ((compositeToPoint_fromRect_operation_fraction_IMetInst != null)
	? (compositeToPoint_fromRect_operation_fraction_IMetInst)
	: (compositeToPoint_fromRect_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositeToPoint:fromRect:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void compositeToPoint_fromRect_operation_fraction(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect rect, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend compositeToPoint_fromRect_operation_fraction_IMetInst = get_compositeToPoint_fromRect_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositeToPoint_fromRect_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		compositeToPoint_fromRect_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend compositeToPoint_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositeToPoint_operation_IMetInst(){
		return ((compositeToPoint_operation_IMetInst != null)
	? (compositeToPoint_operation_IMetInst)
	: (compositeToPoint_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositeToPoint:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void compositeToPoint_operation(final com.apple.jobjc.foundation.NSPoint point, final long op){
			final com.apple.jobjc.Invoke.MsgSend compositeToPoint_operation_IMetInst = get_compositeToPoint_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositeToPoint_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		compositeToPoint_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend compositeToPoint_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositeToPoint_operation_fraction_IMetInst(){
		return ((compositeToPoint_operation_fraction_IMetInst != null)
	? (compositeToPoint_operation_fraction_IMetInst)
	: (compositeToPoint_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositeToPoint:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void compositeToPoint_operation_fraction(final com.apple.jobjc.foundation.NSPoint point, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend compositeToPoint_operation_fraction_IMetInst = get_compositeToPoint_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositeToPoint_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		compositeToPoint_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dissolveToPoint_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dissolveToPoint_fraction_IMetInst(){
		return ((dissolveToPoint_fraction_IMetInst != null)
	? (dissolveToPoint_fraction_IMetInst)
	: (dissolveToPoint_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dissolveToPoint:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void dissolveToPoint_fraction(final com.apple.jobjc.foundation.NSPoint point, final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend dissolveToPoint_fraction_IMetInst = get_dissolveToPoint_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dissolveToPoint_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		dissolveToPoint_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dissolveToPoint_fromRect_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dissolveToPoint_fromRect_fraction_IMetInst(){
		return ((dissolveToPoint_fromRect_fraction_IMetInst != null)
	? (dissolveToPoint_fromRect_fraction_IMetInst)
	: (dissolveToPoint_fromRect_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dissolveToPoint:fromRect:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void dissolveToPoint_fromRect_fraction(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect rect, final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend dissolveToPoint_fromRect_fraction_IMetInst = get_dissolveToPoint_fromRect_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dissolveToPoint_fromRect_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		dissolveToPoint_fromRect_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawAtPoint_fromRect_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawAtPoint_fromRect_operation_fraction_IMetInst(){
		return ((drawAtPoint_fromRect_operation_fraction_IMetInst != null)
	? (drawAtPoint_fromRect_operation_fraction_IMetInst)
	: (drawAtPoint_fromRect_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawAtPoint:fromRect:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawAtPoint_fromRect_operation_fraction(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect fromRect, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend drawAtPoint_fromRect_operation_fraction_IMetInst = get_drawAtPoint_fromRect_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawAtPoint_fromRect_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fromRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		drawAtPoint_fromRect_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_fromRect_operation_fraction_IMetInst(){
		return ((drawInRect_fromRect_operation_fraction_IMetInst != null)
	? (drawInRect_fromRect_operation_fraction_IMetInst)
	: (drawInRect_fromRect_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:fromRect:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawInRect_fromRect_operation_fraction(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSRect fromRect, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_IMetInst = get_drawInRect_fromRect_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_fromRect_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fromRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		drawInRect_fromRect_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst(){
		return ((drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst != null)
	? (drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst)
	: (drawInRect_fromRect_operation_fraction_respectFlipped_hints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:fromRect:operation:fraction:respectFlipped:hints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawInRect_fromRect_operation_fraction_respectFlipped_hints(final com.apple.jobjc.foundation.NSRect dstSpacePortionRect, final com.apple.jobjc.foundation.NSRect srcSpacePortionRect, final long op, final double requestedAlpha, final boolean respectContextIsFlipped, final com.apple.jobjc.foundation.NSDictionary hints){
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
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawRepresentation_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawRepresentation_inRect_IMetInst(){
		return ((drawRepresentation_inRect_IMetInst != null)
	? (drawRepresentation_inRect_IMetInst)
	: (drawRepresentation_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawRepresentation:inRect:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean drawRepresentation_inRect(final com.apple.jobjc.appkit.NSImageRep imageRep, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawRepresentation_inRect_IMetInst = get_drawRepresentation_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawRepresentation_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageRep);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawRepresentation_inRect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst(){
		return ((hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst != null)
	? (hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst)
	: (hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hitTestRect:withImageDestinationRect:context:hints:flipped:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hitTestRect_withImageDestinationRect_context_hints_flipped(final com.apple.jobjc.foundation.NSRect testRectDestSpace, final com.apple.jobjc.foundation.NSRect imageRectDestSpace, final com.apple.jobjc.appkit.NSGraphicsContext context, final com.apple.jobjc.foundation.NSDictionary hints, final boolean flipped){
			final com.apple.jobjc.Invoke.MsgSend hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst = get_hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, testRectDestSpace);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, imageRectDestSpace);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hints);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		hitTestRect_withImageDestinationRect_context_hints_flipped_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initByReferencingFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initByReferencingFile_IMetInst(){
		return ((initByReferencingFile_IMetInst != null)
	? (initByReferencingFile_IMetInst)
	: (initByReferencingFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initByReferencingFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initByReferencingFile(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend initByReferencingFile_IMetInst = get_initByReferencingFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initByReferencingFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		initByReferencingFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initByReferencingURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initByReferencingURL_IMetInst(){
		return ((initByReferencingURL_IMetInst != null)
	? (initByReferencingURL_IMetInst)
	: (initByReferencingURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initByReferencingURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initByReferencingURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initByReferencingURL_IMetInst = get_initByReferencingURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initByReferencingURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initByReferencingURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGImage_size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGImage_size_IMetInst(){
		return ((initWithCGImage_size_IMetInst != null)
	? (initWithCGImage_size_IMetInst)
	: (initWithCGImage_size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGImage:size:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGImage_size(final Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ cgImage, final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend initWithCGImage_size_IMetInst = get_initWithCGImage_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGImage_size_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgImage);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		initWithCGImage_size_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_IMetInst(){
		return ((initWithContentsOfFile_IMetInst != null)
	? (initWithContentsOfFile_IMetInst)
	: (initWithContentsOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst = get_initWithContentsOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		initWithContentsOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDataIgnoringOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDataIgnoringOrientation_IMetInst(){
		return ((initWithDataIgnoringOrientation_IMetInst != null)
	? (initWithDataIgnoringOrientation_IMetInst)
	: (initWithDataIgnoringOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDataIgnoringOrientation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDataIgnoringOrientation(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithDataIgnoringOrientation_IMetInst = get_initWithDataIgnoringOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDataIgnoringOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithDataIgnoringOrientation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIconRef_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIconRef_IMetInst(){
		return ((initWithIconRef_IMetInst != null)
	? (initWithIconRef_IMetInst)
	: (initWithIconRef_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIconRef:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIconRef(final Object /* IconRef (^{OpaqueIconRef}, ^{OpaqueIconRef}) */ iconRef){
			final com.apple.jobjc.Invoke.MsgSend initWithIconRef_IMetInst = get_initWithIconRef_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIconRef_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, iconRef);
		initWithIconRef_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPasteboard_IMetInst(){
		return ((initWithPasteboard_IMetInst != null)
	? (initWithPasteboard_IMetInst)
	: (initWithPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst = get_initWithPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		initWithPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSize_IMetInst(){
		return ((initWithSize_IMetInst != null)
	? (initWithSize_IMetInst)
	: (initWithSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend initWithSize_IMetInst = get_initWithSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		initWithSize_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isCachedSeparately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCachedSeparately_IMetInst(){
		return ((isCachedSeparately_IMetInst != null)
	? (isCachedSeparately_IMetInst)
	: (isCachedSeparately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCachedSeparately", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCachedSeparately(){
			final com.apple.jobjc.Invoke.MsgSend isCachedSeparately_IMetInst = get_isCachedSeparately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCachedSeparately_IMetInst.init(nativeBuffer, this);
		isCachedSeparately_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDataRetained_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDataRetained_IMetInst(){
		return ((isDataRetained_IMetInst != null)
	? (isDataRetained_IMetInst)
	: (isDataRetained_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDataRetained", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDataRetained(){
			final com.apple.jobjc.Invoke.MsgSend isDataRetained_IMetInst = get_isDataRetained_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDataRetained_IMetInst.init(nativeBuffer, this);
		isDataRetained_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTemplate_IMetInst(){
		return ((isTemplate_IMetInst != null)
	? (isTemplate_IMetInst)
	: (isTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTemplate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTemplate(){
			final com.apple.jobjc.Invoke.MsgSend isTemplate_IMetInst = get_isTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTemplate_IMetInst.init(nativeBuffer, this);
		isTemplate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValid_IMetInst(){
		return ((isValid_IMetInst != null)
	? (isValid_IMetInst)
	: (isValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValid", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isValid(){
			final com.apple.jobjc.Invoke.MsgSend isValid_IMetInst = get_isValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValid_IMetInst.init(nativeBuffer, this);
		isValid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layerContentsForContentsScale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layerContentsForContentsScale_IMetInst(){
		return ((layerContentsForContentsScale_IMetInst != null)
	? (layerContentsForContentsScale_IMetInst)
	: (layerContentsForContentsScale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layerContentsForContentsScale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T layerContentsForContentsScale(final double layerContentsScale){
			final com.apple.jobjc.Invoke.MsgSend layerContentsForContentsScale_IMetInst = get_layerContentsForContentsScale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layerContentsForContentsScale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, layerContentsScale);
		layerContentsForContentsScale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocus_IMetInst(){
		return ((lockFocus_IMetInst != null)
	? (lockFocus_IMetInst)
	: (lockFocus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocus", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void lockFocus(){
			final com.apple.jobjc.Invoke.MsgSend lockFocus_IMetInst = get_lockFocus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocus_IMetInst.init(nativeBuffer, this);
		lockFocus_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocusFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocusFlipped_IMetInst(){
		return ((lockFocusFlipped_IMetInst != null)
	? (lockFocusFlipped_IMetInst)
	: (lockFocusFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocusFlipped:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void lockFocusFlipped(final boolean flipped){
			final com.apple.jobjc.Invoke.MsgSend lockFocusFlipped_IMetInst = get_lockFocusFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocusFlipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		lockFocusFlipped_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocusOnRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocusOnRepresentation_IMetInst(){
		return ((lockFocusOnRepresentation_IMetInst != null)
	? (lockFocusOnRepresentation_IMetInst)
	: (lockFocusOnRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocusOnRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void lockFocusOnRepresentation(final com.apple.jobjc.appkit.NSImageRep imageRepresentation){
			final com.apple.jobjc.Invoke.MsgSend lockFocusOnRepresentation_IMetInst = get_lockFocusOnRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocusOnRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageRepresentation);
		lockFocusOnRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend matchesOnMultipleResolution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchesOnMultipleResolution_IMetInst(){
		return ((matchesOnMultipleResolution_IMetInst != null)
	? (matchesOnMultipleResolution_IMetInst)
	: (matchesOnMultipleResolution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchesOnMultipleResolution", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean matchesOnMultipleResolution(){
			final com.apple.jobjc.Invoke.MsgSend matchesOnMultipleResolution_IMetInst = get_matchesOnMultipleResolution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchesOnMultipleResolution_IMetInst.init(nativeBuffer, this);
		matchesOnMultipleResolution_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchesOnlyOnBestFittingAxis_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchesOnlyOnBestFittingAxis_IMetInst(){
		return ((matchesOnlyOnBestFittingAxis_IMetInst != null)
	? (matchesOnlyOnBestFittingAxis_IMetInst)
	: (matchesOnlyOnBestFittingAxis_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchesOnlyOnBestFittingAxis", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean matchesOnlyOnBestFittingAxis(){
			final com.apple.jobjc.Invoke.MsgSend matchesOnlyOnBestFittingAxis_IMetInst = get_matchesOnlyOnBestFittingAxis_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchesOnlyOnBestFittingAxis_IMetInst.init(nativeBuffer, this);
		matchesOnlyOnBestFittingAxis_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prefersColorMatch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prefersColorMatch_IMetInst(){
		return ((prefersColorMatch_IMetInst != null)
	? (prefersColorMatch_IMetInst)
	: (prefersColorMatch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prefersColorMatch", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean prefersColorMatch(){
			final com.apple.jobjc.Invoke.MsgSend prefersColorMatch_IMetInst = get_prefersColorMatch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prefersColorMatch_IMetInst.init(nativeBuffer, this);
		prefersColorMatch_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recache_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recache_IMetInst(){
		return ((recache_IMetInst != null)
	? (recache_IMetInst)
	: (recache_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recache", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void recache(){
			final com.apple.jobjc.Invoke.MsgSend recache_IMetInst = get_recache_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recache_IMetInst.init(nativeBuffer, this);
		recache_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend recommendedLayerContentsScale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recommendedLayerContentsScale_IMetInst(){
		return ((recommendedLayerContentsScale_IMetInst != null)
	? (recommendedLayerContentsScale_IMetInst)
	: (recommendedLayerContentsScale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recommendedLayerContentsScale:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double recommendedLayerContentsScale(final double preferredContentsScale){
			final com.apple.jobjc.Invoke.MsgSend recommendedLayerContentsScale_IMetInst = get_recommendedLayerContentsScale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recommendedLayerContentsScale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, preferredContentsScale);
		recommendedLayerContentsScale_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRepresentation_IMetInst(){
		return ((removeRepresentation_IMetInst != null)
	? (removeRepresentation_IMetInst)
	: (removeRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeRepresentation(final com.apple.jobjc.appkit.NSImageRep imageRep){
			final com.apple.jobjc.Invoke.MsgSend removeRepresentation_IMetInst = get_removeRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageRep);
		removeRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend representations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representations_IMetInst(){
		return ((representations_IMetInst != null)
	? (representations_IMetInst)
	: (representations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray representations(){
			final com.apple.jobjc.Invoke.MsgSend representations_IMetInst = get_representations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representations_IMetInst.init(nativeBuffer, this);
		representations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scalesWhenResized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scalesWhenResized_IMetInst(){
		return ((scalesWhenResized_IMetInst != null)
	? (scalesWhenResized_IMetInst)
	: (scalesWhenResized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scalesWhenResized", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean scalesWhenResized(){
			final com.apple.jobjc.Invoke.MsgSend scalesWhenResized_IMetInst = get_scalesWhenResized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scalesWhenResized_IMetInst.init(nativeBuffer, this);
		scalesWhenResized_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessibilityDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessibilityDescription_IMetInst(){
		return ((setAccessibilityDescription_IMetInst != null)
	? (setAccessibilityDescription_IMetInst)
	: (setAccessibilityDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessibilityDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessibilityDescription(final com.apple.jobjc.foundation.NSString description){
			final com.apple.jobjc.Invoke.MsgSend setAccessibilityDescription_IMetInst = get_setAccessibilityDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessibilityDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		setAccessibilityDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlignmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlignmentRect_IMetInst(){
		return ((setAlignmentRect_IMetInst != null)
	? (setAlignmentRect_IMetInst)
	: (setAlignmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlignmentRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setAlignmentRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend setAlignmentRect_IMetInst = get_setAlignmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlignmentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		setAlignmentRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor aColor){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aColor);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCacheDepthMatchesImageDepth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCacheDepthMatchesImageDepth_IMetInst(){
		return ((setCacheDepthMatchesImageDepth_IMetInst != null)
	? (setCacheDepthMatchesImageDepth_IMetInst)
	: (setCacheDepthMatchesImageDepth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCacheDepthMatchesImageDepth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCacheDepthMatchesImageDepth(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCacheDepthMatchesImageDepth_IMetInst = get_setCacheDepthMatchesImageDepth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCacheDepthMatchesImageDepth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCacheDepthMatchesImageDepth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCacheMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCacheMode_IMetInst(){
		return ((setCacheMode_IMetInst != null)
	? (setCacheMode_IMetInst)
	: (setCacheMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCacheMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCacheMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setCacheMode_IMetInst = get_setCacheMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCacheMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setCacheMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCachedSeparately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCachedSeparately_IMetInst(){
		return ((setCachedSeparately_IMetInst != null)
	? (setCachedSeparately_IMetInst)
	: (setCachedSeparately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCachedSeparately:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCachedSeparately(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCachedSeparately_IMetInst = get_setCachedSeparately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCachedSeparately_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCachedSeparately_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDataRetained_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDataRetained_IMetInst(){
		return ((setDataRetained_IMetInst != null)
	? (setDataRetained_IMetInst)
	: (setDataRetained_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDataRetained:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDataRetained(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDataRetained_IMetInst = get_setDataRetained_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDataRetained_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDataRetained_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFlipped_IMetInst(){
		return ((setFlipped_IMetInst != null)
	? (setFlipped_IMetInst)
	: (setFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFlipped:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFlipped(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setFlipped_IMetInst = get_setFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFlipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setFlipped_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMatchesOnMultipleResolution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMatchesOnMultipleResolution_IMetInst(){
		return ((setMatchesOnMultipleResolution_IMetInst != null)
	? (setMatchesOnMultipleResolution_IMetInst)
	: (setMatchesOnMultipleResolution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMatchesOnMultipleResolution:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMatchesOnMultipleResolution(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMatchesOnMultipleResolution_IMetInst = get_setMatchesOnMultipleResolution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMatchesOnMultipleResolution_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMatchesOnMultipleResolution_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMatchesOnlyOnBestFittingAxis_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMatchesOnlyOnBestFittingAxis_IMetInst(){
		return ((setMatchesOnlyOnBestFittingAxis_IMetInst != null)
	? (setMatchesOnlyOnBestFittingAxis_IMetInst)
	: (setMatchesOnlyOnBestFittingAxis_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMatchesOnlyOnBestFittingAxis:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMatchesOnlyOnBestFittingAxis(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMatchesOnlyOnBestFittingAxis_IMetInst = get_setMatchesOnlyOnBestFittingAxis_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMatchesOnlyOnBestFittingAxis_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMatchesOnlyOnBestFittingAxis_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setName_IMetInst(){
		return ((setName_IMetInst != null)
	? (setName_IMetInst)
	: (setName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setName(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setName_IMetInst = get_setName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrefersColorMatch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrefersColorMatch_IMetInst(){
		return ((setPrefersColorMatch_IMetInst != null)
	? (setPrefersColorMatch_IMetInst)
	: (setPrefersColorMatch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrefersColorMatch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPrefersColorMatch(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPrefersColorMatch_IMetInst = get_setPrefersColorMatch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrefersColorMatch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPrefersColorMatch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScalesWhenResized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScalesWhenResized_IMetInst(){
		return ((setScalesWhenResized_IMetInst != null)
	? (setScalesWhenResized_IMetInst)
	: (setScalesWhenResized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScalesWhenResized:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setScalesWhenResized(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setScalesWhenResized_IMetInst = get_setScalesWhenResized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScalesWhenResized_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setScalesWhenResized_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTemplate_IMetInst(){
		return ((setTemplate_IMetInst != null)
	? (setTemplate_IMetInst)
	: (setTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTemplate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTemplate(final boolean isTemplate){
			final com.apple.jobjc.Invoke.MsgSend setTemplate_IMetInst = get_setTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTemplate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isTemplate);
		setTemplate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesEPSOnResolutionMismatch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesEPSOnResolutionMismatch_IMetInst(){
		return ((setUsesEPSOnResolutionMismatch_IMetInst != null)
	? (setUsesEPSOnResolutionMismatch_IMetInst)
	: (setUsesEPSOnResolutionMismatch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesEPSOnResolutionMismatch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesEPSOnResolutionMismatch(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesEPSOnResolutionMismatch_IMetInst = get_setUsesEPSOnResolutionMismatch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesEPSOnResolutionMismatch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesEPSOnResolutionMismatch_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend unlockFocus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockFocus_IMetInst(){
		return ((unlockFocus_IMetInst != null)
	? (unlockFocus_IMetInst)
	: (unlockFocus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockFocus", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unlockFocus(){
			final com.apple.jobjc.Invoke.MsgSend unlockFocus_IMetInst = get_unlockFocus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockFocus_IMetInst.init(nativeBuffer, this);
		unlockFocus_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesEPSOnResolutionMismatch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesEPSOnResolutionMismatch_IMetInst(){
		return ((usesEPSOnResolutionMismatch_IMetInst != null)
	? (usesEPSOnResolutionMismatch_IMetInst)
	: (usesEPSOnResolutionMismatch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesEPSOnResolutionMismatch", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesEPSOnResolutionMismatch(){
			final com.apple.jobjc.Invoke.MsgSend usesEPSOnResolutionMismatch_IMetInst = get_usesEPSOnResolutionMismatch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesEPSOnResolutionMismatch_IMetInst.init(nativeBuffer, this);
		usesEPSOnResolutionMismatch_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
