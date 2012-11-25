package com.apple.jobjc.appkit;

public  class NSBezierPathClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSBezierPathClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBezierPathClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBezierPathClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend bezierPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPath_CMetInst(){
		return ((bezierPath_CMetInst != null)
	? (bezierPath_CMetInst)
	: (bezierPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPath(){
			final com.apple.jobjc.Invoke.MsgSend bezierPath_CMetInst = get_bezierPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPath_CMetInst.init(nativeBuffer, this);
		bezierPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezierPathWithOvalInRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPathWithOvalInRect_CMetInst(){
		return ((bezierPathWithOvalInRect_CMetInst != null)
	? (bezierPathWithOvalInRect_CMetInst)
	: (bezierPathWithOvalInRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPathWithOvalInRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPathWithOvalInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend bezierPathWithOvalInRect_CMetInst = get_bezierPathWithOvalInRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPathWithOvalInRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		bezierPathWithOvalInRect_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezierPathWithRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPathWithRect_CMetInst(){
		return ((bezierPathWithRect_CMetInst != null)
	? (bezierPathWithRect_CMetInst)
	: (bezierPathWithRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPathWithRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPathWithRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend bezierPathWithRect_CMetInst = get_bezierPathWithRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPathWithRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		bezierPathWithRect_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezierPathWithRoundedRect_xRadius_yRadius_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezierPathWithRoundedRect_xRadius_yRadius_CMetInst(){
		return ((bezierPathWithRoundedRect_xRadius_yRadius_CMetInst != null)
	? (bezierPathWithRoundedRect_xRadius_yRadius_CMetInst)
	: (bezierPathWithRoundedRect_xRadius_yRadius_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezierPathWithRoundedRect:xRadius:yRadius:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSBezierPath bezierPathWithRoundedRect_xRadius_yRadius(final com.apple.jobjc.foundation.NSRect rect, final double xRadius, final double yRadius){
			final com.apple.jobjc.Invoke.MsgSend bezierPathWithRoundedRect_xRadius_yRadius_CMetInst = get_bezierPathWithRoundedRect_xRadius_yRadius_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezierPathWithRoundedRect_xRadius_yRadius_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, xRadius);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, yRadius);
		bezierPathWithRoundedRect_xRadius_yRadius_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clipRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clipRect_CMetInst(){
		return ((clipRect_CMetInst != null)
	? (clipRect_CMetInst)
	: (clipRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clipRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void clipRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend clipRect_CMetInst = get_clipRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clipRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		clipRect_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultFlatness_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultFlatness_CMetInst(){
		return ((defaultFlatness_CMetInst != null)
	? (defaultFlatness_CMetInst)
	: (defaultFlatness_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultFlatness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultFlatness(){
			final com.apple.jobjc.Invoke.MsgSend defaultFlatness_CMetInst = get_defaultFlatness_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultFlatness_CMetInst.init(nativeBuffer, this);
		defaultFlatness_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultLineCapStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultLineCapStyle_CMetInst(){
		return ((defaultLineCapStyle_CMetInst != null)
	? (defaultLineCapStyle_CMetInst)
	: (defaultLineCapStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultLineCapStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultLineCapStyle(){
			final com.apple.jobjc.Invoke.MsgSend defaultLineCapStyle_CMetInst = get_defaultLineCapStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultLineCapStyle_CMetInst.init(nativeBuffer, this);
		defaultLineCapStyle_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultLineJoinStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultLineJoinStyle_CMetInst(){
		return ((defaultLineJoinStyle_CMetInst != null)
	? (defaultLineJoinStyle_CMetInst)
	: (defaultLineJoinStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultLineJoinStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultLineJoinStyle(){
			final com.apple.jobjc.Invoke.MsgSend defaultLineJoinStyle_CMetInst = get_defaultLineJoinStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultLineJoinStyle_CMetInst.init(nativeBuffer, this);
		defaultLineJoinStyle_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultLineWidth_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultLineWidth_CMetInst(){
		return ((defaultLineWidth_CMetInst != null)
	? (defaultLineWidth_CMetInst)
	: (defaultLineWidth_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultLineWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultLineWidth(){
			final com.apple.jobjc.Invoke.MsgSend defaultLineWidth_CMetInst = get_defaultLineWidth_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultLineWidth_CMetInst.init(nativeBuffer, this);
		defaultLineWidth_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultMiterLimit_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultMiterLimit_CMetInst(){
		return ((defaultMiterLimit_CMetInst != null)
	? (defaultMiterLimit_CMetInst)
	: (defaultMiterLimit_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultMiterLimit", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultMiterLimit(){
			final com.apple.jobjc.Invoke.MsgSend defaultMiterLimit_CMetInst = get_defaultMiterLimit_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultMiterLimit_CMetInst.init(nativeBuffer, this);
		defaultMiterLimit_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultWindingRule_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultWindingRule_CMetInst(){
		return ((defaultWindingRule_CMetInst != null)
	? (defaultWindingRule_CMetInst)
	: (defaultWindingRule_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultWindingRule", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultWindingRule(){
			final com.apple.jobjc.Invoke.MsgSend defaultWindingRule_CMetInst = get_defaultWindingRule_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultWindingRule_CMetInst.init(nativeBuffer, this);
		defaultWindingRule_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawPackedGlyphs_atPoint_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawPackedGlyphs_atPoint_CMetInst(){
		return ((drawPackedGlyphs_atPoint_CMetInst != null)
	? (drawPackedGlyphs_atPoint_CMetInst)
	: (drawPackedGlyphs_atPoint_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawPackedGlyphs:atPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawPackedGlyphs_atPoint(final com.apple.jobjc.Pointer<java.lang.Byte> packedGlyphs, final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend drawPackedGlyphs_atPoint_CMetInst = get_drawPackedGlyphs_atPoint_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawPackedGlyphs_atPoint_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, packedGlyphs);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		drawPackedGlyphs_atPoint_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fillRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fillRect_CMetInst(){
		return ((fillRect_CMetInst != null)
	? (fillRect_CMetInst)
	: (fillRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fillRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void fillRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend fillRect_CMetInst = get_fillRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fillRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		fillRect_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultFlatness_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultFlatness_CMetInst(){
		return ((setDefaultFlatness_CMetInst != null)
	? (setDefaultFlatness_CMetInst)
	: (setDefaultFlatness_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultFlatness:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setDefaultFlatness(final double flatness){
			final com.apple.jobjc.Invoke.MsgSend setDefaultFlatness_CMetInst = get_setDefaultFlatness_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultFlatness_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, flatness);
		setDefaultFlatness_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultLineCapStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultLineCapStyle_CMetInst(){
		return ((setDefaultLineCapStyle_CMetInst != null)
	? (setDefaultLineCapStyle_CMetInst)
	: (setDefaultLineCapStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultLineCapStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultLineCapStyle(final long lineCapStyle){
			final com.apple.jobjc.Invoke.MsgSend setDefaultLineCapStyle_CMetInst = get_setDefaultLineCapStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultLineCapStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lineCapStyle);
		setDefaultLineCapStyle_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultLineJoinStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultLineJoinStyle_CMetInst(){
		return ((setDefaultLineJoinStyle_CMetInst != null)
	? (setDefaultLineJoinStyle_CMetInst)
	: (setDefaultLineJoinStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultLineJoinStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultLineJoinStyle(final long lineJoinStyle){
			final com.apple.jobjc.Invoke.MsgSend setDefaultLineJoinStyle_CMetInst = get_setDefaultLineJoinStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultLineJoinStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lineJoinStyle);
		setDefaultLineJoinStyle_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultLineWidth_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultLineWidth_CMetInst(){
		return ((setDefaultLineWidth_CMetInst != null)
	? (setDefaultLineWidth_CMetInst)
	: (setDefaultLineWidth_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultLineWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setDefaultLineWidth(final double lineWidth){
			final com.apple.jobjc.Invoke.MsgSend setDefaultLineWidth_CMetInst = get_setDefaultLineWidth_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultLineWidth_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, lineWidth);
		setDefaultLineWidth_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultMiterLimit_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultMiterLimit_CMetInst(){
		return ((setDefaultMiterLimit_CMetInst != null)
	? (setDefaultMiterLimit_CMetInst)
	: (setDefaultMiterLimit_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultMiterLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setDefaultMiterLimit(final double limit){
			final com.apple.jobjc.Invoke.MsgSend setDefaultMiterLimit_CMetInst = get_setDefaultMiterLimit_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultMiterLimit_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, limit);
		setDefaultMiterLimit_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultWindingRule_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultWindingRule_CMetInst(){
		return ((setDefaultWindingRule_CMetInst != null)
	? (setDefaultWindingRule_CMetInst)
	: (setDefaultWindingRule_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultWindingRule:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultWindingRule(final long windingRule){
			final com.apple.jobjc.Invoke.MsgSend setDefaultWindingRule_CMetInst = get_setDefaultWindingRule_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultWindingRule_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, windingRule);
		setDefaultWindingRule_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend strokeLineFromPoint_toPoint_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strokeLineFromPoint_toPoint_CMetInst(){
		return ((strokeLineFromPoint_toPoint_CMetInst != null)
	? (strokeLineFromPoint_toPoint_CMetInst)
	: (strokeLineFromPoint_toPoint_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strokeLineFromPoint:toPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void strokeLineFromPoint_toPoint(final com.apple.jobjc.foundation.NSPoint point1, final com.apple.jobjc.foundation.NSPoint point2){
			final com.apple.jobjc.Invoke.MsgSend strokeLineFromPoint_toPoint_CMetInst = get_strokeLineFromPoint_toPoint_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strokeLineFromPoint_toPoint_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point1);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point2);
		strokeLineFromPoint_toPoint_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend strokeRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strokeRect_CMetInst(){
		return ((strokeRect_CMetInst != null)
	? (strokeRect_CMetInst)
	: (strokeRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strokeRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void strokeRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend strokeRect_CMetInst = get_strokeRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strokeRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		strokeRect_CMetInst.invoke(nativeBuffer);
		
		
	}

}
