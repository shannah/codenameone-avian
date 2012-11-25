package com.apple.jobjc.appkit;

public  class NSGradient extends com.apple.jobjc.foundation.NSObject {
	public NSGradient(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSGradient(final NSGradient obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend drawFromCenter_radius_toCenter_radius_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawFromCenter_radius_toCenter_radius_options_IMetInst(){
		return ((drawFromCenter_radius_toCenter_radius_options_IMetInst != null)
	? (drawFromCenter_radius_toCenter_radius_options_IMetInst)
	: (drawFromCenter_radius_toCenter_radius_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawFromCenter:radius:toCenter:radius:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void drawFromCenter_radius_toCenter_radius_options(final com.apple.jobjc.foundation.NSPoint startCenter, final double startRadius, final com.apple.jobjc.foundation.NSPoint endCenter, final double endRadius, final long options){
			final com.apple.jobjc.Invoke.MsgSend drawFromCenter_radius_toCenter_radius_options_IMetInst = get_drawFromCenter_radius_toCenter_radius_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawFromCenter_radius_toCenter_radius_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, startCenter);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, startRadius);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, endCenter);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, endRadius);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		drawFromCenter_radius_toCenter_radius_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawFromPoint_toPoint_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawFromPoint_toPoint_options_IMetInst(){
		return ((drawFromPoint_toPoint_options_IMetInst != null)
	? (drawFromPoint_toPoint_options_IMetInst)
	: (drawFromPoint_toPoint_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawFromPoint:toPoint:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void drawFromPoint_toPoint_options(final com.apple.jobjc.foundation.NSPoint startingPoint, final com.apple.jobjc.foundation.NSPoint endingPoint, final long options){
			final com.apple.jobjc.Invoke.MsgSend drawFromPoint_toPoint_options_IMetInst = get_drawFromPoint_toPoint_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawFromPoint_toPoint_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, startingPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, endingPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		drawFromPoint_toPoint_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInBezierPath_angle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInBezierPath_angle_IMetInst(){
		return ((drawInBezierPath_angle_IMetInst != null)
	? (drawInBezierPath_angle_IMetInst)
	: (drawInBezierPath_angle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInBezierPath:angle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawInBezierPath_angle(final com.apple.jobjc.appkit.NSBezierPath path, final double angle){
			final com.apple.jobjc.Invoke.MsgSend drawInBezierPath_angle_IMetInst = get_drawInBezierPath_angle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInBezierPath_angle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		drawInBezierPath_angle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInBezierPath_relativeCenterPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInBezierPath_relativeCenterPosition_IMetInst(){
		return ((drawInBezierPath_relativeCenterPosition_IMetInst != null)
	? (drawInBezierPath_relativeCenterPosition_IMetInst)
	: (drawInBezierPath_relativeCenterPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInBezierPath:relativeCenterPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawInBezierPath_relativeCenterPosition(final com.apple.jobjc.appkit.NSBezierPath path, final com.apple.jobjc.foundation.NSPoint relativeCenterPosition){
			final com.apple.jobjc.Invoke.MsgSend drawInBezierPath_relativeCenterPosition_IMetInst = get_drawInBezierPath_relativeCenterPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInBezierPath_relativeCenterPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, relativeCenterPosition);
		drawInBezierPath_relativeCenterPosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_angle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_angle_IMetInst(){
		return ((drawInRect_angle_IMetInst != null)
	? (drawInRect_angle_IMetInst)
	: (drawInRect_angle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:angle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawInRect_angle(final com.apple.jobjc.foundation.NSRect rect, final double angle){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_angle_IMetInst = get_drawInRect_angle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_angle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		drawInRect_angle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_relativeCenterPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_relativeCenterPosition_IMetInst(){
		return ((drawInRect_relativeCenterPosition_IMetInst != null)
	? (drawInRect_relativeCenterPosition_IMetInst)
	: (drawInRect_relativeCenterPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:relativeCenterPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawInRect_relativeCenterPosition(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSPoint relativeCenterPosition){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_relativeCenterPosition_IMetInst = get_drawInRect_relativeCenterPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_relativeCenterPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, relativeCenterPosition);
		drawInRect_relativeCenterPosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getColor_location_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getColor_location_atIndex_IMetInst(){
		return ((getColor_location_atIndex_IMetInst != null)
	? (getColor_location_atIndex_IMetInst)
	: (getColor_location_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getColor:location:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void getColor_location_atIndex(final com.apple.jobjc.Pointer<com.apple.jobjc.appkit.NSColor> color, final com.apple.jobjc.Pointer<java.lang.Double> location, final long index){
			final com.apple.jobjc.Invoke.MsgSend getColor_location_atIndex_IMetInst = get_getColor_location_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getColor_location_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, location);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		getColor_location_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithColors_IMetInst(){
		return ((initWithColors_IMetInst != null)
	? (initWithColors_IMetInst)
	: (initWithColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithColors:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithColors(final com.apple.jobjc.foundation.NSArray colorArray){
			final com.apple.jobjc.Invoke.MsgSend initWithColors_IMetInst = get_initWithColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithColors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorArray);
		initWithColors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithColors_atLocations_colorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithColors_atLocations_colorSpace_IMetInst(){
		return ((initWithColors_atLocations_colorSpace_IMetInst != null)
	? (initWithColors_atLocations_colorSpace_IMetInst)
	: (initWithColors_atLocations_colorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithColors:atLocations:colorSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithColors_atLocations_colorSpace(final com.apple.jobjc.foundation.NSArray colorArray, final com.apple.jobjc.Pointer<java.lang.Double> locations, final com.apple.jobjc.appkit.NSColorSpace colorSpace){
			final com.apple.jobjc.Invoke.MsgSend initWithColors_atLocations_colorSpace_IMetInst = get_initWithColors_atLocations_colorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithColors_atLocations_colorSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorArray);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, locations);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpace);
		initWithColors_atLocations_colorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithColorsAndLocations(final com.apple.jobjc.appkit.NSColor firstColor, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend initWithColorsAndLocations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithColorsAndLocations:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithColorsAndLocations_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstColor);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		initWithColorsAndLocations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithStartingColor_endingColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithStartingColor_endingColor_IMetInst(){
		return ((initWithStartingColor_endingColor_IMetInst != null)
	? (initWithStartingColor_endingColor_IMetInst)
	: (initWithStartingColor_endingColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithStartingColor:endingColor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithStartingColor_endingColor(final com.apple.jobjc.appkit.NSColor startingColor, final com.apple.jobjc.appkit.NSColor endingColor){
			final com.apple.jobjc.Invoke.MsgSend initWithStartingColor_endingColor_IMetInst = get_initWithStartingColor_endingColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithStartingColor_endingColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startingColor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, endingColor);
		initWithStartingColor_endingColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interpolatedColorAtLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interpolatedColorAtLocation_IMetInst(){
		return ((interpolatedColorAtLocation_IMetInst != null)
	? (interpolatedColorAtLocation_IMetInst)
	: (interpolatedColorAtLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interpolatedColorAtLocation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor interpolatedColorAtLocation(final double location){
			final com.apple.jobjc.Invoke.MsgSend interpolatedColorAtLocation_IMetInst = get_interpolatedColorAtLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interpolatedColorAtLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		interpolatedColorAtLocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfColorStops_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfColorStops_IMetInst(){
		return ((numberOfColorStops_IMetInst != null)
	? (numberOfColorStops_IMetInst)
	: (numberOfColorStops_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfColorStops", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfColorStops(){
			final com.apple.jobjc.Invoke.MsgSend numberOfColorStops_IMetInst = get_numberOfColorStops_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfColorStops_IMetInst.init(nativeBuffer, this);
		numberOfColorStops_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
