package com.apple.jobjc.appkit;

public  class NSBitmapImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSBitmapImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBitmapImageRep(final NSBitmapImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGImage_IMetInst(){
		return ((CGImage_IMetInst != null)
	? (CGImage_IMetInst)
	: (CGImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGImage", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ CGImage(){
			final com.apple.jobjc.Invoke.MsgSend CGImage_IMetInst = get_CGImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGImage_IMetInst.init(nativeBuffer, this);
		CGImage_IMetInst.invoke(nativeBuffer);
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

	 public com.apple.jobjc.foundation.NSData TIFFRepresentationUsingCompression_factor(final long comp, final float factor){
			final com.apple.jobjc.Invoke.MsgSend TIFFRepresentationUsingCompression_factor_IMetInst = get_TIFFRepresentationUsingCompression_factor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TIFFRepresentationUsingCompression_factor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, comp);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, factor);
		TIFFRepresentationUsingCompression_factor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitmapData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapData_IMetInst(){
		return ((bitmapData_IMetInst != null)
	? (bitmapData_IMetInst)
	: (bitmapData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapData", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> bitmapData(){
			final com.apple.jobjc.Invoke.MsgSend bitmapData_IMetInst = get_bitmapData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapData_IMetInst.init(nativeBuffer, this);
		bitmapData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitmapFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapFormat_IMetInst(){
		return ((bitmapFormat_IMetInst != null)
	? (bitmapFormat_IMetInst)
	: (bitmapFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapFormat", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long bitmapFormat(){
			final com.apple.jobjc.Invoke.MsgSend bitmapFormat_IMetInst = get_bitmapFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapFormat_IMetInst.init(nativeBuffer, this);
		bitmapFormat_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst(){
		return ((bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst != null)
	? (bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst)
	: (bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapImageRepByConvertingToColorSpace:renderingIntent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSBitmapImageRep bitmapImageRepByConvertingToColorSpace_renderingIntent(final com.apple.jobjc.appkit.NSColorSpace targetSpace, final long renderingIntent){
			final com.apple.jobjc.Invoke.MsgSend bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst = get_bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, targetSpace);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, renderingIntent);
		bitmapImageRepByConvertingToColorSpace_renderingIntent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBitmapImageRep returnValue = (com.apple.jobjc.appkit.NSBitmapImageRep) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitmapImageRepByRetaggingWithColorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapImageRepByRetaggingWithColorSpace_IMetInst(){
		return ((bitmapImageRepByRetaggingWithColorSpace_IMetInst != null)
	? (bitmapImageRepByRetaggingWithColorSpace_IMetInst)
	: (bitmapImageRepByRetaggingWithColorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapImageRepByRetaggingWithColorSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSBitmapImageRep bitmapImageRepByRetaggingWithColorSpace(final com.apple.jobjc.appkit.NSColorSpace newSpace){
			final com.apple.jobjc.Invoke.MsgSend bitmapImageRepByRetaggingWithColorSpace_IMetInst = get_bitmapImageRepByRetaggingWithColorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapImageRepByRetaggingWithColorSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newSpace);
		bitmapImageRepByRetaggingWithColorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBitmapImageRep returnValue = (com.apple.jobjc.appkit.NSBitmapImageRep) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bitsPerPixel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitsPerPixel_IMetInst(){
		return ((bitsPerPixel_IMetInst != null)
	? (bitsPerPixel_IMetInst)
	: (bitsPerPixel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitsPerPixel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long bitsPerPixel(){
			final com.apple.jobjc.Invoke.MsgSend bitsPerPixel_IMetInst = get_bitsPerPixel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitsPerPixel_IMetInst.init(nativeBuffer, this);
		bitsPerPixel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bytesPerPlane_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bytesPerPlane_IMetInst(){
		return ((bytesPerPlane_IMetInst != null)
	? (bytesPerPlane_IMetInst)
	: (bytesPerPlane_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bytesPerPlane", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long bytesPerPlane(){
			final com.apple.jobjc.Invoke.MsgSend bytesPerPlane_IMetInst = get_bytesPerPlane_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bytesPerPlane_IMetInst.init(nativeBuffer, this);
		bytesPerPlane_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bytesPerRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bytesPerRow_IMetInst(){
		return ((bytesPerRow_IMetInst != null)
	? (bytesPerRow_IMetInst)
	: (bytesPerRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bytesPerRow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long bytesPerRow(){
			final com.apple.jobjc.Invoke.MsgSend bytesPerRow_IMetInst = get_bytesPerRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bytesPerRow_IMetInst.init(nativeBuffer, this);
		bytesPerRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBeCompressedUsing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBeCompressedUsing_IMetInst(){
		return ((canBeCompressedUsing_IMetInst != null)
	? (canBeCompressedUsing_IMetInst)
	: (canBeCompressedUsing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBeCompressedUsing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean canBeCompressedUsing(final long compression){
			final com.apple.jobjc.Invoke.MsgSend canBeCompressedUsing_IMetInst = get_canBeCompressedUsing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBeCompressedUsing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, compression);
		canBeCompressedUsing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorAtX_y_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorAtX_y_IMetInst(){
		return ((colorAtX_y_IMetInst != null)
	? (colorAtX_y_IMetInst)
	: (colorAtX_y_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorAtX:y:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorAtX_y(final long x, final long y){
			final com.apple.jobjc.Invoke.MsgSend colorAtX_y_IMetInst = get_colorAtX_y_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorAtX_y_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, y);
		colorAtX_y_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst(){
		return ((colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst != null)
	? (colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst)
	: (colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorizeByMappingGray:toColor:blackMapping:whiteMapping:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void colorizeByMappingGray_toColor_blackMapping_whiteMapping(final double midPoint, final com.apple.jobjc.appkit.NSColor midPointColor, final com.apple.jobjc.appkit.NSColor shadowColor, final com.apple.jobjc.appkit.NSColor lightColor){
			final com.apple.jobjc.Invoke.MsgSend colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst = get_colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, midPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, midPointColor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, shadowColor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lightColor);
		colorizeByMappingGray_toColor_blackMapping_whiteMapping_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getBitmapDataPlanes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBitmapDataPlanes_IMetInst(){
		return ((getBitmapDataPlanes_IMetInst != null)
	? (getBitmapDataPlanes_IMetInst)
	: (getBitmapDataPlanes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBitmapDataPlanes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getBitmapDataPlanes(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> data){
			final com.apple.jobjc.Invoke.MsgSend getBitmapDataPlanes_IMetInst = get_getBitmapDataPlanes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBitmapDataPlanes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		getBitmapDataPlanes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCompression_factor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCompression_factor_IMetInst(){
		return ((getCompression_factor_IMetInst != null)
	? (getCompression_factor_IMetInst)
	: (getCompression_factor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCompression:factor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getCompression_factor(final com.apple.jobjc.Pointer<java.lang.Long> compression, final com.apple.jobjc.Pointer<java.lang.Float> factor){
			final com.apple.jobjc.Invoke.MsgSend getCompression_factor_IMetInst = get_getCompression_factor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCompression_factor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, compression);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, factor);
		getCompression_factor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getPixel_atX_y_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getPixel_atX_y_IMetInst(){
		return ((getPixel_atX_y_IMetInst != null)
	? (getPixel_atX_y_IMetInst)
	: (getPixel_atX_y_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getPixel:atX:y:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void getPixel_atX_y(final com.apple.jobjc.Pointer<java.lang.Long> p, final long x, final long y){
			final com.apple.jobjc.Invoke.MsgSend getPixel_atX_y_IMetInst = get_getPixel_atX_y_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getPixel_atX_y_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, p);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, y);
		getPixel_atX_y_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend incrementalLoadFromData_complete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_incrementalLoadFromData_complete_IMetInst(){
		return ((incrementalLoadFromData_complete_IMetInst != null)
	? (incrementalLoadFromData_complete_IMetInst)
	: (incrementalLoadFromData_complete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "incrementalLoadFromData:complete:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long incrementalLoadFromData_complete(final com.apple.jobjc.foundation.NSData data, final boolean complete){
			final com.apple.jobjc.Invoke.MsgSend incrementalLoadFromData_complete_IMetInst = get_incrementalLoadFromData_complete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		incrementalLoadFromData_complete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, complete);
		incrementalLoadFromData_complete_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initForIncrementalLoad_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForIncrementalLoad_IMetInst(){
		return ((initForIncrementalLoad_IMetInst != null)
	? (initForIncrementalLoad_IMetInst)
	: (initForIncrementalLoad_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForIncrementalLoad", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForIncrementalLoad(){
			final com.apple.jobjc.Invoke.MsgSend initForIncrementalLoad_IMetInst = get_initForIncrementalLoad_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForIncrementalLoad_IMetInst.init(nativeBuffer, this);
		initForIncrementalLoad_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst(){
		return ((initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst != null)
	? (initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst)
	: (initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bitmapFormat:bytesPerRow:bitsPerPixel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> planes, final long width, final long height, final long bps, final long spp, final boolean alpha, final boolean isPlanar, final com.apple.jobjc.foundation.NSString colorSpaceName, final long bitmapFormat, final long rBytes, final long pBits){
			final com.apple.jobjc.Invoke.MsgSend initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst = get_initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, planes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, width);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, height);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bps);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, spp);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, alpha);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isPlanar);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpaceName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bitmapFormat);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rBytes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, pBits);
		initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst(){
		return ((initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst != null)
	? (initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst)
	: (initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bytesPerRow:bitsPerPixel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> planes, final long width, final long height, final long bps, final long spp, final boolean alpha, final boolean isPlanar, final com.apple.jobjc.foundation.NSString colorSpaceName, final long rBytes, final long pBits){
			final com.apple.jobjc.Invoke.MsgSend initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst = get_initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, planes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, width);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, height);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bps);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, spp);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, alpha);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isPlanar);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpaceName);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rBytes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, pBits);
		initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGImage_IMetInst(){
		return ((initWithCGImage_IMetInst != null)
	? (initWithCGImage_IMetInst)
	: (initWithCGImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGImage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGImage(final Object /* CGImageRef (^{CGImage}, ^{CGImage}) */ cgImage){
			final com.apple.jobjc.Invoke.MsgSend initWithCGImage_IMetInst = get_initWithCGImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgImage);
		initWithCGImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCIImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCIImage_IMetInst(){
		return ((initWithCIImage_IMetInst != null)
	? (initWithCIImage_IMetInst)
	: (initWithCIImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCIImage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCIImage(final com.apple.jobjc.appkit.CIImage ciImage){
			final com.apple.jobjc.Invoke.MsgSend initWithCIImage_IMetInst = get_initWithCIImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCIImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ciImage);
		initWithCIImage_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend initWithFocusedViewRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFocusedViewRect_IMetInst(){
		return ((initWithFocusedViewRect_IMetInst != null)
	? (initWithFocusedViewRect_IMetInst)
	: (initWithFocusedViewRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFocusedViewRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFocusedViewRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend initWithFocusedViewRect_IMetInst = get_initWithFocusedViewRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFocusedViewRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		initWithFocusedViewRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPlanar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPlanar_IMetInst(){
		return ((isPlanar_IMetInst != null)
	? (isPlanar_IMetInst)
	: (isPlanar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPlanar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isPlanar(){
			final com.apple.jobjc.Invoke.MsgSend isPlanar_IMetInst = get_isPlanar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPlanar_IMetInst.init(nativeBuffer, this);
		isPlanar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfPlanes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfPlanes_IMetInst(){
		return ((numberOfPlanes_IMetInst != null)
	? (numberOfPlanes_IMetInst)
	: (numberOfPlanes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfPlanes", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfPlanes(){
			final com.apple.jobjc.Invoke.MsgSend numberOfPlanes_IMetInst = get_numberOfPlanes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfPlanes_IMetInst.init(nativeBuffer, this);
		numberOfPlanes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representationUsingType_properties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representationUsingType_properties_IMetInst(){
		return ((representationUsingType_properties_IMetInst != null)
	? (representationUsingType_properties_IMetInst)
	: (representationUsingType_properties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representationUsingType:properties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData representationUsingType_properties(final long storageType, final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend representationUsingType_properties_IMetInst = get_representationUsingType_properties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representationUsingType_properties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, storageType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		representationUsingType_properties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend samplesPerPixel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_samplesPerPixel_IMetInst(){
		return ((samplesPerPixel_IMetInst != null)
	? (samplesPerPixel_IMetInst)
	: (samplesPerPixel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "samplesPerPixel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long samplesPerPixel(){
			final com.apple.jobjc.Invoke.MsgSend samplesPerPixel_IMetInst = get_samplesPerPixel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		samplesPerPixel_IMetInst.init(nativeBuffer, this);
		samplesPerPixel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setColor_atX_y_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColor_atX_y_IMetInst(){
		return ((setColor_atX_y_IMetInst != null)
	? (setColor_atX_y_IMetInst)
	: (setColor_atX_y_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColor:atX:y:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setColor_atX_y(final com.apple.jobjc.appkit.NSColor color, final long x, final long y){
			final com.apple.jobjc.Invoke.MsgSend setColor_atX_y_IMetInst = get_setColor_atX_y_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColor_atX_y_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, y);
		setColor_atX_y_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompression_factor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompression_factor_IMetInst(){
		return ((setCompression_factor_IMetInst != null)
	? (setCompression_factor_IMetInst)
	: (setCompression_factor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompression:factor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setCompression_factor(final long compression, final float factor){
			final com.apple.jobjc.Invoke.MsgSend setCompression_factor_IMetInst = get_setCompression_factor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompression_factor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, compression);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, factor);
		setCompression_factor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPixel_atX_y_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPixel_atX_y_IMetInst(){
		return ((setPixel_atX_y_IMetInst != null)
	? (setPixel_atX_y_IMetInst)
	: (setPixel_atX_y_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPixel:atX:y:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPixel_atX_y(final com.apple.jobjc.Pointer<java.lang.Long> p, final long x, final long y){
			final com.apple.jobjc.Invoke.MsgSend setPixel_atX_y_IMetInst = get_setPixel_atX_y_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPixel_atX_y_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, p);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, y);
		setPixel_atX_y_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setProperty_withValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProperty_withValue_IMetInst(){
		return ((setProperty_withValue_IMetInst != null)
	? (setProperty_withValue_IMetInst)
	: (setProperty_withValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProperty:withValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setProperty_withValue(final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend setProperty_withValue_IMetInst = get_setProperty_withValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProperty_withValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setProperty_withValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForProperty_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForProperty_IMetInst(){
		return ((valueForProperty_IMetInst != null)
	? (valueForProperty_IMetInst)
	: (valueForProperty_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForProperty:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForProperty(final com.apple.jobjc.foundation.NSString property){
			final com.apple.jobjc.Invoke.MsgSend valueForProperty_IMetInst = get_valueForProperty_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForProperty_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		valueForProperty_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
