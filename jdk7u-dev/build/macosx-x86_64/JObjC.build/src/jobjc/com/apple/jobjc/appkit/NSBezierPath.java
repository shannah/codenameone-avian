package com.apple.jobjc.appkit;

public  class NSBezierPath extends com.apple.jobjc.foundation.NSObject {
	public NSBezierPath(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBezierPath(final NSBezierPath obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addClip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addClip_IMetInst(){
		return ((addClip_IMetInst != null)
	? (addClip_IMetInst)
	: (addClip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addClip", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void addClip(){
			final com.apple.jobjc.Invoke.MsgSend addClip_IMetInst = get_addClip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addClip_IMetInst.init(nativeBuffer, this);
		addClip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPath_IMetInst(){
		return ((appendBezierPath_IMetInst != null)
	? (appendBezierPath_IMetInst)
	: (appendBezierPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendBezierPath(final com.apple.jobjc.appkit.NSBezierPath path){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPath_IMetInst = get_appendBezierPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		appendBezierPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst(){
		return ((appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst != null)
	? (appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst)
	: (appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithArcFromPoint:toPoint:radius:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void appendBezierPathWithArcFromPoint_toPoint_radius(final com.apple.jobjc.foundation.NSPoint point1, final com.apple.jobjc.foundation.NSPoint point2, final double radius){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst = get_appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point1);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point2);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, radius);
		appendBezierPathWithArcFromPoint_toPoint_radius_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst(){
		return ((appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst != null)
	? (appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst)
	: (appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void appendBezierPathWithArcWithCenter_radius_startAngle_endAngle(final com.apple.jobjc.foundation.NSPoint center, final double radius, final double startAngle, final double endAngle){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst = get_appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, center);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, radius);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, startAngle);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, endAngle);
		appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst(){
		return ((appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst != null)
	? (appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst)
	: (appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:clockwise:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise(final com.apple.jobjc.foundation.NSPoint center, final double radius, final double startAngle, final double endAngle, final boolean clockwise){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst = get_appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, center);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, radius);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, startAngle);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, endAngle);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, clockwise);
		appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithGlyph_inFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithGlyph_inFont_IMetInst(){
		return ((appendBezierPathWithGlyph_inFont_IMetInst != null)
	? (appendBezierPathWithGlyph_inFont_IMetInst)
	: (appendBezierPathWithGlyph_inFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithGlyph:inFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendBezierPathWithGlyph_inFont(final int glyph, final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithGlyph_inFont_IMetInst = get_appendBezierPathWithGlyph_inFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithGlyph_inFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, glyph);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		appendBezierPathWithGlyph_inFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithGlyphs_count_inFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithGlyphs_count_inFont_IMetInst(){
		return ((appendBezierPathWithGlyphs_count_inFont_IMetInst != null)
	? (appendBezierPathWithGlyphs_count_inFont_IMetInst)
	: (appendBezierPathWithGlyphs_count_inFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithGlyphs:count:inFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendBezierPathWithGlyphs_count_inFont(final com.apple.jobjc.Pointer<java.lang.Integer> glyphs, final long count, final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithGlyphs_count_inFont_IMetInst = get_appendBezierPathWithGlyphs_count_inFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithGlyphs_count_inFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		appendBezierPathWithGlyphs_count_inFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithOvalInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithOvalInRect_IMetInst(){
		return ((appendBezierPathWithOvalInRect_IMetInst != null)
	? (appendBezierPathWithOvalInRect_IMetInst)
	: (appendBezierPathWithOvalInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithOvalInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void appendBezierPathWithOvalInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithOvalInRect_IMetInst = get_appendBezierPathWithOvalInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithOvalInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		appendBezierPathWithOvalInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithPackedGlyphs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithPackedGlyphs_IMetInst(){
		return ((appendBezierPathWithPackedGlyphs_IMetInst != null)
	? (appendBezierPathWithPackedGlyphs_IMetInst)
	: (appendBezierPathWithPackedGlyphs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithPackedGlyphs:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void appendBezierPathWithPackedGlyphs(final com.apple.jobjc.Pointer<java.lang.Byte> packedGlyphs){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithPackedGlyphs_IMetInst = get_appendBezierPathWithPackedGlyphs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithPackedGlyphs_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, packedGlyphs);
		appendBezierPathWithPackedGlyphs_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithPoints_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithPoints_count_IMetInst(){
		return ((appendBezierPathWithPoints_count_IMetInst != null)
	? (appendBezierPathWithPoints_count_IMetInst)
	: (appendBezierPathWithPoints_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithPoints:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void appendBezierPathWithPoints_count(final Object /* NSPointArray (^{_NSPoint="x"f"y"f}, ^{CGPoint="x"d"y"d}) */ points, final long count){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithPoints_count_IMetInst = get_appendBezierPathWithPoints_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithPoints_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, points);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		appendBezierPathWithPoints_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithRect_IMetInst(){
		return ((appendBezierPathWithRect_IMetInst != null)
	? (appendBezierPathWithRect_IMetInst)
	: (appendBezierPathWithRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void appendBezierPathWithRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithRect_IMetInst = get_appendBezierPathWithRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		appendBezierPathWithRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst(){
		return ((appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst != null)
	? (appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst)
	: (appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBezierPathWithRoundedRect:xRadius:yRadius:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void appendBezierPathWithRoundedRect_xRadius_yRadius(final com.apple.jobjc.foundation.NSRect rect, final double xRadius, final double yRadius){
			final com.apple.jobjc.Invoke.MsgSend appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst = get_appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, xRadius);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, yRadius);
		appendBezierPathWithRoundedRect_xRadius_yRadius_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend bezierPathByFlatteningPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPathByFlatteningPath_IMetInst(){
		return ((bezierPathByFlatteningPath_IMetInst != null)
	? (bezierPathByFlatteningPath_IMetInst)
	: (bezierPathByFlatteningPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPathByFlatteningPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPathByFlatteningPath(){
			final com.apple.jobjc.Invoke.MsgSend bezierPathByFlatteningPath_IMetInst = get_bezierPathByFlatteningPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPathByFlatteningPath_IMetInst.init(nativeBuffer, this);
		bezierPathByFlatteningPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezierPathByReversingPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPathByReversingPath_IMetInst(){
		return ((bezierPathByReversingPath_IMetInst != null)
	? (bezierPathByReversingPath_IMetInst)
	: (bezierPathByReversingPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPathByReversingPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPathByReversingPath(){
			final com.apple.jobjc.Invoke.MsgSend bezierPathByReversingPath_IMetInst = get_bezierPathByReversingPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPathByReversingPath_IMetInst.init(nativeBuffer, this);
		bezierPathByReversingPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bounds_IMetInst(){
		return ((bounds_IMetInst != null)
	? (bounds_IMetInst)
	: (bounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect bounds(){
			final com.apple.jobjc.Invoke.MsgSend bounds_IMetInst = get_bounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		bounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cachesBezierPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cachesBezierPath_IMetInst(){
		return ((cachesBezierPath_IMetInst != null)
	? (cachesBezierPath_IMetInst)
	: (cachesBezierPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cachesBezierPath", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean cachesBezierPath(){
			final com.apple.jobjc.Invoke.MsgSend cachesBezierPath_IMetInst = get_cachesBezierPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cachesBezierPath_IMetInst.init(nativeBuffer, this);
		cachesBezierPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend closePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closePath_IMetInst(){
		return ((closePath_IMetInst != null)
	? (closePath_IMetInst)
	: (closePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closePath", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void closePath(){
			final com.apple.jobjc.Invoke.MsgSend closePath_IMetInst = get_closePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closePath_IMetInst.init(nativeBuffer, this);
		closePath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend containsPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsPoint_IMetInst(){
		return ((containsPoint_IMetInst != null)
	? (containsPoint_IMetInst)
	: (containsPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean containsPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend containsPoint_IMetInst = get_containsPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		containsPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlPointBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlPointBounds_IMetInst(){
		return ((controlPointBounds_IMetInst != null)
	? (controlPointBounds_IMetInst)
	: (controlPointBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlPointBounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect controlPointBounds(){
			final com.apple.jobjc.Invoke.MsgSend controlPointBounds_IMetInst = get_controlPointBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlPointBounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		controlPointBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentPoint_IMetInst(){
		return ((currentPoint_IMetInst != null)
	? (currentPoint_IMetInst)
	: (currentPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentPoint", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint currentPoint(){
			final com.apple.jobjc.Invoke.MsgSend currentPoint_IMetInst = get_currentPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentPoint_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		currentPoint_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend curveToPoint_controlPoint1_controlPoint2_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_curveToPoint_controlPoint1_controlPoint2_IMetInst(){
		return ((curveToPoint_controlPoint1_controlPoint2_IMetInst != null)
	? (curveToPoint_controlPoint1_controlPoint2_IMetInst)
	: (curveToPoint_controlPoint1_controlPoint2_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "curveToPoint:controlPoint1:controlPoint2:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void curveToPoint_controlPoint1_controlPoint2(final com.apple.jobjc.foundation.NSPoint endPoint, final com.apple.jobjc.foundation.NSPoint controlPoint1, final com.apple.jobjc.foundation.NSPoint controlPoint2){
			final com.apple.jobjc.Invoke.MsgSend curveToPoint_controlPoint1_controlPoint2_IMetInst = get_curveToPoint_controlPoint1_controlPoint2_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		curveToPoint_controlPoint1_controlPoint2_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, endPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, controlPoint1);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, controlPoint2);
		curveToPoint_controlPoint1_controlPoint2_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend elementAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementAtIndex_IMetInst(){
		return ((elementAtIndex_IMetInst != null)
	? (elementAtIndex_IMetInst)
	: (elementAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long elementAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend elementAtIndex_IMetInst = get_elementAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		elementAtIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementAtIndex_associatedPoints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementAtIndex_associatedPoints_IMetInst(){
		return ((elementAtIndex_associatedPoints_IMetInst != null)
	? (elementAtIndex_associatedPoints_IMetInst)
	: (elementAtIndex_associatedPoints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementAtIndex:associatedPoints:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long elementAtIndex_associatedPoints(final long index, final Object /* NSPointArray (^{_NSPoint="x"f"y"f}, ^{CGPoint="x"d"y"d}) */ points){
			final com.apple.jobjc.Invoke.MsgSend elementAtIndex_associatedPoints_IMetInst = get_elementAtIndex_associatedPoints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementAtIndex_associatedPoints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, points);
		elementAtIndex_associatedPoints_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementCount_IMetInst(){
		return ((elementCount_IMetInst != null)
	? (elementCount_IMetInst)
	: (elementCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long elementCount(){
			final com.apple.jobjc.Invoke.MsgSend elementCount_IMetInst = get_elementCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementCount_IMetInst.init(nativeBuffer, this);
		elementCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fill_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fill_IMetInst(){
		return ((fill_IMetInst != null)
	? (fill_IMetInst)
	: (fill_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fill", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void fill(){
			final com.apple.jobjc.Invoke.MsgSend fill_IMetInst = get_fill_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fill_IMetInst.init(nativeBuffer, this);
		fill_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend flatness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flatness_IMetInst(){
		return ((flatness_IMetInst != null)
	? (flatness_IMetInst)
	: (flatness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flatness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double flatness(){
			final com.apple.jobjc.Invoke.MsgSend flatness_IMetInst = get_flatness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flatness_IMetInst.init(nativeBuffer, this);
		flatness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getLineDash_count_phase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getLineDash_count_phase_IMetInst(){
		return ((getLineDash_count_phase_IMetInst != null)
	? (getLineDash_count_phase_IMetInst)
	: (getLineDash_count_phase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getLineDash:count:phase:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getLineDash_count_phase(final com.apple.jobjc.Pointer<java.lang.Double> pattern, final com.apple.jobjc.Pointer<java.lang.Long> count, final com.apple.jobjc.Pointer<java.lang.Double> phase){
			final com.apple.jobjc.Invoke.MsgSend getLineDash_count_phase_IMetInst = get_getLineDash_count_phase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getLineDash_count_phase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pattern);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, phase);
		getLineDash_count_phase_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isEmpty_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEmpty_IMetInst(){
		return ((isEmpty_IMetInst != null)
	? (isEmpty_IMetInst)
	: (isEmpty_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEmpty", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEmpty(){
			final com.apple.jobjc.Invoke.MsgSend isEmpty_IMetInst = get_isEmpty_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEmpty_IMetInst.init(nativeBuffer, this);
		isEmpty_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineCapStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineCapStyle_IMetInst(){
		return ((lineCapStyle_IMetInst != null)
	? (lineCapStyle_IMetInst)
	: (lineCapStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineCapStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lineCapStyle(){
			final com.apple.jobjc.Invoke.MsgSend lineCapStyle_IMetInst = get_lineCapStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineCapStyle_IMetInst.init(nativeBuffer, this);
		lineCapStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineJoinStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineJoinStyle_IMetInst(){
		return ((lineJoinStyle_IMetInst != null)
	? (lineJoinStyle_IMetInst)
	: (lineJoinStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineJoinStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lineJoinStyle(){
			final com.apple.jobjc.Invoke.MsgSend lineJoinStyle_IMetInst = get_lineJoinStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineJoinStyle_IMetInst.init(nativeBuffer, this);
		lineJoinStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineToPoint_IMetInst(){
		return ((lineToPoint_IMetInst != null)
	? (lineToPoint_IMetInst)
	: (lineToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void lineToPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend lineToPoint_IMetInst = get_lineToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		lineToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lineWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineWidth_IMetInst(){
		return ((lineWidth_IMetInst != null)
	? (lineWidth_IMetInst)
	: (lineWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineWidth(){
			final com.apple.jobjc.Invoke.MsgSend lineWidth_IMetInst = get_lineWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineWidth_IMetInst.init(nativeBuffer, this);
		lineWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend miterLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_miterLimit_IMetInst(){
		return ((miterLimit_IMetInst != null)
	? (miterLimit_IMetInst)
	: (miterLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "miterLimit", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double miterLimit(){
			final com.apple.jobjc.Invoke.MsgSend miterLimit_IMetInst = get_miterLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		miterLimit_IMetInst.init(nativeBuffer, this);
		miterLimit_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToPoint_IMetInst(){
		return ((moveToPoint_IMetInst != null)
	? (moveToPoint_IMetInst)
	: (moveToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void moveToPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend moveToPoint_IMetInst = get_moveToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		moveToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst(){
		return ((relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst != null)
	? (relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst)
	: (relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativeCurveToPoint:controlPoint1:controlPoint2:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void relativeCurveToPoint_controlPoint1_controlPoint2(final com.apple.jobjc.foundation.NSPoint endPoint, final com.apple.jobjc.foundation.NSPoint controlPoint1, final com.apple.jobjc.foundation.NSPoint controlPoint2){
			final com.apple.jobjc.Invoke.MsgSend relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst = get_relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, endPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, controlPoint1);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, controlPoint2);
		relativeCurveToPoint_controlPoint1_controlPoint2_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend relativeLineToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativeLineToPoint_IMetInst(){
		return ((relativeLineToPoint_IMetInst != null)
	? (relativeLineToPoint_IMetInst)
	: (relativeLineToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativeLineToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void relativeLineToPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend relativeLineToPoint_IMetInst = get_relativeLineToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativeLineToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		relativeLineToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend relativeMoveToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativeMoveToPoint_IMetInst(){
		return ((relativeMoveToPoint_IMetInst != null)
	? (relativeMoveToPoint_IMetInst)
	: (relativeMoveToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativeMoveToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void relativeMoveToPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend relativeMoveToPoint_IMetInst = get_relativeMoveToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativeMoveToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		relativeMoveToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllPoints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllPoints_IMetInst(){
		return ((removeAllPoints_IMetInst != null)
	? (removeAllPoints_IMetInst)
	: (removeAllPoints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllPoints", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllPoints(){
			final com.apple.jobjc.Invoke.MsgSend removeAllPoints_IMetInst = get_removeAllPoints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllPoints_IMetInst.init(nativeBuffer, this);
		removeAllPoints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAssociatedPoints_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAssociatedPoints_atIndex_IMetInst(){
		return ((setAssociatedPoints_atIndex_IMetInst != null)
	? (setAssociatedPoints_atIndex_IMetInst)
	: (setAssociatedPoints_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAssociatedPoints:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setAssociatedPoints_atIndex(final Object /* NSPointArray (^{_NSPoint="x"f"y"f}, ^{CGPoint="x"d"y"d}) */ points, final long index){
			final com.apple.jobjc.Invoke.MsgSend setAssociatedPoints_atIndex_IMetInst = get_setAssociatedPoints_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAssociatedPoints_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, points);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setAssociatedPoints_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCachesBezierPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCachesBezierPath_IMetInst(){
		return ((setCachesBezierPath_IMetInst != null)
	? (setCachesBezierPath_IMetInst)
	: (setCachesBezierPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCachesBezierPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCachesBezierPath(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCachesBezierPath_IMetInst = get_setCachesBezierPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCachesBezierPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCachesBezierPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setClip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClip_IMetInst(){
		return ((setClip_IMetInst != null)
	? (setClip_IMetInst)
	: (setClip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClip", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setClip(){
			final com.apple.jobjc.Invoke.MsgSend setClip_IMetInst = get_setClip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClip_IMetInst.init(nativeBuffer, this);
		setClip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFlatness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFlatness_IMetInst(){
		return ((setFlatness_IMetInst != null)
	? (setFlatness_IMetInst)
	: (setFlatness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFlatness:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFlatness(final double flatness){
			final com.apple.jobjc.Invoke.MsgSend setFlatness_IMetInst = get_setFlatness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFlatness_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, flatness);
		setFlatness_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineCapStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineCapStyle_IMetInst(){
		return ((setLineCapStyle_IMetInst != null)
	? (setLineCapStyle_IMetInst)
	: (setLineCapStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineCapStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLineCapStyle(final long lineCapStyle){
			final com.apple.jobjc.Invoke.MsgSend setLineCapStyle_IMetInst = get_setLineCapStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineCapStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lineCapStyle);
		setLineCapStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineDash_count_phase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineDash_count_phase_IMetInst(){
		return ((setLineDash_count_phase_IMetInst != null)
	? (setLineDash_count_phase_IMetInst)
	: (setLineDash_count_phase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineDash:count:phase:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineDash_count_phase(final com.apple.jobjc.Pointer<java.lang.Double> pattern, final long count, final double phase){
			final com.apple.jobjc.Invoke.MsgSend setLineDash_count_phase_IMetInst = get_setLineDash_count_phase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineDash_count_phase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pattern);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, phase);
		setLineDash_count_phase_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineJoinStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineJoinStyle_IMetInst(){
		return ((setLineJoinStyle_IMetInst != null)
	? (setLineJoinStyle_IMetInst)
	: (setLineJoinStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineJoinStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLineJoinStyle(final long lineJoinStyle){
			final com.apple.jobjc.Invoke.MsgSend setLineJoinStyle_IMetInst = get_setLineJoinStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineJoinStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lineJoinStyle);
		setLineJoinStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineWidth_IMetInst(){
		return ((setLineWidth_IMetInst != null)
	? (setLineWidth_IMetInst)
	: (setLineWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineWidth(final double lineWidth){
			final com.apple.jobjc.Invoke.MsgSend setLineWidth_IMetInst = get_setLineWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, lineWidth);
		setLineWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMiterLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMiterLimit_IMetInst(){
		return ((setMiterLimit_IMetInst != null)
	? (setMiterLimit_IMetInst)
	: (setMiterLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMiterLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMiterLimit(final double miterLimit){
			final com.apple.jobjc.Invoke.MsgSend setMiterLimit_IMetInst = get_setMiterLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMiterLimit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, miterLimit);
		setMiterLimit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindingRule_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindingRule_IMetInst(){
		return ((setWindingRule_IMetInst != null)
	? (setWindingRule_IMetInst)
	: (setWindingRule_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindingRule:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setWindingRule(final long windingRule){
			final com.apple.jobjc.Invoke.MsgSend setWindingRule_IMetInst = get_setWindingRule_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindingRule_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, windingRule);
		setWindingRule_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stroke_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stroke_IMetInst(){
		return ((stroke_IMetInst != null)
	? (stroke_IMetInst)
	: (stroke_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stroke", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stroke(){
			final com.apple.jobjc.Invoke.MsgSend stroke_IMetInst = get_stroke_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stroke_IMetInst.init(nativeBuffer, this);
		stroke_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transformUsingAffineTransform_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformUsingAffineTransform_IMetInst(){
		return ((transformUsingAffineTransform_IMetInst != null)
	? (transformUsingAffineTransform_IMetInst)
	: (transformUsingAffineTransform_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformUsingAffineTransform:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void transformUsingAffineTransform(final com.apple.jobjc.foundation.NSAffineTransform transform){
			final com.apple.jobjc.Invoke.MsgSend transformUsingAffineTransform_IMetInst = get_transformUsingAffineTransform_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformUsingAffineTransform_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, transform);
		transformUsingAffineTransform_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windingRule_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windingRule_IMetInst(){
		return ((windingRule_IMetInst != null)
	? (windingRule_IMetInst)
	: (windingRule_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windingRule", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long windingRule(){
			final com.apple.jobjc.Invoke.MsgSend windingRule_IMetInst = get_windingRule_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windingRule_IMetInst.init(nativeBuffer, this);
		windingRule_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
