package com.apple.jobjc.appkit;

public  class NSColorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSColorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSColorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSColorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alternateSelectedControlColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateSelectedControlColor_CMetInst(){
		return ((alternateSelectedControlColor_CMetInst != null)
	? (alternateSelectedControlColor_CMetInst)
	: (alternateSelectedControlColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateSelectedControlColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor alternateSelectedControlColor(){
			final com.apple.jobjc.Invoke.MsgSend alternateSelectedControlColor_CMetInst = get_alternateSelectedControlColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateSelectedControlColor_CMetInst.init(nativeBuffer, this);
		alternateSelectedControlColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alternateSelectedControlTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateSelectedControlTextColor_CMetInst(){
		return ((alternateSelectedControlTextColor_CMetInst != null)
	? (alternateSelectedControlTextColor_CMetInst)
	: (alternateSelectedControlTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateSelectedControlTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor alternateSelectedControlTextColor(){
			final com.apple.jobjc.Invoke.MsgSend alternateSelectedControlTextColor_CMetInst = get_alternateSelectedControlTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateSelectedControlTextColor_CMetInst.init(nativeBuffer, this);
		alternateSelectedControlTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend blackColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blackColor_CMetInst(){
		return ((blackColor_CMetInst != null)
	? (blackColor_CMetInst)
	: (blackColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blackColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor blackColor(){
			final com.apple.jobjc.Invoke.MsgSend blackColor_CMetInst = get_blackColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blackColor_CMetInst.init(nativeBuffer, this);
		blackColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend blueColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blueColor_CMetInst(){
		return ((blueColor_CMetInst != null)
	? (blueColor_CMetInst)
	: (blueColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blueColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor blueColor(){
			final com.apple.jobjc.Invoke.MsgSend blueColor_CMetInst = get_blueColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blueColor_CMetInst.init(nativeBuffer, this);
		blueColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend brownColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_brownColor_CMetInst(){
		return ((brownColor_CMetInst != null)
	? (brownColor_CMetInst)
	: (brownColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "brownColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor brownColor(){
			final com.apple.jobjc.Invoke.MsgSend brownColor_CMetInst = get_brownColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		brownColor_CMetInst.init(nativeBuffer, this);
		brownColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clearColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearColor_CMetInst(){
		return ((clearColor_CMetInst != null)
	? (clearColor_CMetInst)
	: (clearColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor clearColor(){
			final com.apple.jobjc.Invoke.MsgSend clearColor_CMetInst = get_clearColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearColor_CMetInst.init(nativeBuffer, this);
		clearColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorForControlTint_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorForControlTint_CMetInst(){
		return ((colorForControlTint_CMetInst != null)
	? (colorForControlTint_CMetInst)
	: (colorForControlTint_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorForControlTint:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorForControlTint(final long controlTint){
			final com.apple.jobjc.Invoke.MsgSend colorForControlTint_CMetInst = get_colorForControlTint_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorForControlTint_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlTint);
		colorForControlTint_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorFromPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorFromPasteboard_CMetInst(){
		return ((colorFromPasteboard_CMetInst != null)
	? (colorFromPasteboard_CMetInst)
	: (colorFromPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorFromPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorFromPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteBoard){
			final com.apple.jobjc.Invoke.MsgSend colorFromPasteboard_CMetInst = get_colorFromPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorFromPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteBoard);
		colorFromPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCGColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCGColor_CMetInst(){
		return ((colorWithCGColor_CMetInst != null)
	? (colorWithCGColor_CMetInst)
	: (colorWithCGColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCGColor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCGColor(final Object /* CGColorRef (^{CGColor}, ^{CGColor}) */ cgColor){
			final com.apple.jobjc.Invoke.MsgSend colorWithCGColor_CMetInst = get_colorWithCGColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCGColor_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgColor);
		colorWithCGColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCIColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCIColor_CMetInst(){
		return ((colorWithCIColor_CMetInst != null)
	? (colorWithCIColor_CMetInst)
	: (colorWithCIColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCIColor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCIColor(final com.apple.jobjc.appkit.CIColor color){
			final com.apple.jobjc.Invoke.MsgSend colorWithCIColor_CMetInst = get_colorWithCIColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCIColor_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		colorWithCIColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCalibratedHue_saturation_brightness_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCalibratedHue_saturation_brightness_alpha_CMetInst(){
		return ((colorWithCalibratedHue_saturation_brightness_alpha_CMetInst != null)
	? (colorWithCalibratedHue_saturation_brightness_alpha_CMetInst)
	: (colorWithCalibratedHue_saturation_brightness_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCalibratedHue:saturation:brightness:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCalibratedHue_saturation_brightness_alpha(final double hue, final double saturation, final double brightness, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithCalibratedHue_saturation_brightness_alpha_CMetInst = get_colorWithCalibratedHue_saturation_brightness_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCalibratedHue_saturation_brightness_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, hue);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, saturation);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, brightness);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithCalibratedHue_saturation_brightness_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCalibratedRed_green_blue_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCalibratedRed_green_blue_alpha_CMetInst(){
		return ((colorWithCalibratedRed_green_blue_alpha_CMetInst != null)
	? (colorWithCalibratedRed_green_blue_alpha_CMetInst)
	: (colorWithCalibratedRed_green_blue_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCalibratedRed:green:blue:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCalibratedRed_green_blue_alpha(final double red, final double green, final double blue, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithCalibratedRed_green_blue_alpha_CMetInst = get_colorWithCalibratedRed_green_blue_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCalibratedRed_green_blue_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, red);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, green);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, blue);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithCalibratedRed_green_blue_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCalibratedWhite_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCalibratedWhite_alpha_CMetInst(){
		return ((colorWithCalibratedWhite_alpha_CMetInst != null)
	? (colorWithCalibratedWhite_alpha_CMetInst)
	: (colorWithCalibratedWhite_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCalibratedWhite:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCalibratedWhite_alpha(final double white, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithCalibratedWhite_alpha_CMetInst = get_colorWithCalibratedWhite_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCalibratedWhite_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, white);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithCalibratedWhite_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithCatalogName_colorName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithCatalogName_colorName_CMetInst(){
		return ((colorWithCatalogName_colorName_CMetInst != null)
	? (colorWithCatalogName_colorName_CMetInst)
	: (colorWithCatalogName_colorName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithCatalogName:colorName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithCatalogName_colorName(final com.apple.jobjc.foundation.NSString listName, final com.apple.jobjc.foundation.NSString colorName){
			final com.apple.jobjc.Invoke.MsgSend colorWithCatalogName_colorName_CMetInst = get_colorWithCatalogName_colorName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithCatalogName_colorName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, listName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorName);
		colorWithCatalogName_colorName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithColorSpace_components_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithColorSpace_components_count_CMetInst(){
		return ((colorWithColorSpace_components_count_CMetInst != null)
	? (colorWithColorSpace_components_count_CMetInst)
	: (colorWithColorSpace_components_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithColorSpace:components:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithColorSpace_components_count(final com.apple.jobjc.appkit.NSColorSpace space, final com.apple.jobjc.Pointer<java.lang.Double> components, final long numberOfComponents){
			final com.apple.jobjc.Invoke.MsgSend colorWithColorSpace_components_count_CMetInst = get_colorWithColorSpace_components_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithColorSpace_components_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, components);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, numberOfComponents);
		colorWithColorSpace_components_count_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst(){
		return ((colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst != null)
	? (colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst)
	: (colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithDeviceCyan:magenta:yellow:black:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithDeviceCyan_magenta_yellow_black_alpha(final double cyan, final double magenta, final double yellow, final double black, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst = get_colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, cyan);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, magenta);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, yellow);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, black);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithDeviceCyan_magenta_yellow_black_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithDeviceHue_saturation_brightness_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithDeviceHue_saturation_brightness_alpha_CMetInst(){
		return ((colorWithDeviceHue_saturation_brightness_alpha_CMetInst != null)
	? (colorWithDeviceHue_saturation_brightness_alpha_CMetInst)
	: (colorWithDeviceHue_saturation_brightness_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithDeviceHue:saturation:brightness:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithDeviceHue_saturation_brightness_alpha(final double hue, final double saturation, final double brightness, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithDeviceHue_saturation_brightness_alpha_CMetInst = get_colorWithDeviceHue_saturation_brightness_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithDeviceHue_saturation_brightness_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, hue);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, saturation);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, brightness);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithDeviceHue_saturation_brightness_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithDeviceRed_green_blue_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithDeviceRed_green_blue_alpha_CMetInst(){
		return ((colorWithDeviceRed_green_blue_alpha_CMetInst != null)
	? (colorWithDeviceRed_green_blue_alpha_CMetInst)
	: (colorWithDeviceRed_green_blue_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithDeviceRed:green:blue:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithDeviceRed_green_blue_alpha(final double red, final double green, final double blue, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithDeviceRed_green_blue_alpha_CMetInst = get_colorWithDeviceRed_green_blue_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithDeviceRed_green_blue_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, red);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, green);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, blue);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithDeviceRed_green_blue_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithDeviceWhite_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithDeviceWhite_alpha_CMetInst(){
		return ((colorWithDeviceWhite_alpha_CMetInst != null)
	? (colorWithDeviceWhite_alpha_CMetInst)
	: (colorWithDeviceWhite_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithDeviceWhite:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithDeviceWhite_alpha(final double white, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithDeviceWhite_alpha_CMetInst = get_colorWithDeviceWhite_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithDeviceWhite_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, white);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithDeviceWhite_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithGenericGamma22White_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithGenericGamma22White_alpha_CMetInst(){
		return ((colorWithGenericGamma22White_alpha_CMetInst != null)
	? (colorWithGenericGamma22White_alpha_CMetInst)
	: (colorWithGenericGamma22White_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithGenericGamma22White:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithGenericGamma22White_alpha(final double white, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithGenericGamma22White_alpha_CMetInst = get_colorWithGenericGamma22White_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithGenericGamma22White_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, white);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithGenericGamma22White_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithPatternImage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithPatternImage_CMetInst(){
		return ((colorWithPatternImage_CMetInst != null)
	? (colorWithPatternImage_CMetInst)
	: (colorWithPatternImage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithPatternImage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithPatternImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend colorWithPatternImage_CMetInst = get_colorWithPatternImage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithPatternImage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		colorWithPatternImage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithSRGBRed_green_blue_alpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithSRGBRed_green_blue_alpha_CMetInst(){
		return ((colorWithSRGBRed_green_blue_alpha_CMetInst != null)
	? (colorWithSRGBRed_green_blue_alpha_CMetInst)
	: (colorWithSRGBRed_green_blue_alpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithSRGBRed:green:blue:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithSRGBRed_green_blue_alpha(final double red, final double green, final double blue, final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithSRGBRed_green_blue_alpha_CMetInst = get_colorWithSRGBRed_green_blue_alpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithSRGBRed_green_blue_alpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, red);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, green);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, blue);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithSRGBRed_green_blue_alpha_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlAlternatingRowBackgroundColors_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlAlternatingRowBackgroundColors_CMetInst(){
		return ((controlAlternatingRowBackgroundColors_CMetInst != null)
	? (controlAlternatingRowBackgroundColors_CMetInst)
	: (controlAlternatingRowBackgroundColors_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlAlternatingRowBackgroundColors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray controlAlternatingRowBackgroundColors(){
			final com.apple.jobjc.Invoke.MsgSend controlAlternatingRowBackgroundColors_CMetInst = get_controlAlternatingRowBackgroundColors_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlAlternatingRowBackgroundColors_CMetInst.init(nativeBuffer, this);
		controlAlternatingRowBackgroundColors_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlBackgroundColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlBackgroundColor_CMetInst(){
		return ((controlBackgroundColor_CMetInst != null)
	? (controlBackgroundColor_CMetInst)
	: (controlBackgroundColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend controlBackgroundColor_CMetInst = get_controlBackgroundColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlBackgroundColor_CMetInst.init(nativeBuffer, this);
		controlBackgroundColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlColor_CMetInst(){
		return ((controlColor_CMetInst != null)
	? (controlColor_CMetInst)
	: (controlColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlColor(){
			final com.apple.jobjc.Invoke.MsgSend controlColor_CMetInst = get_controlColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlColor_CMetInst.init(nativeBuffer, this);
		controlColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlDarkShadowColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlDarkShadowColor_CMetInst(){
		return ((controlDarkShadowColor_CMetInst != null)
	? (controlDarkShadowColor_CMetInst)
	: (controlDarkShadowColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlDarkShadowColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlDarkShadowColor(){
			final com.apple.jobjc.Invoke.MsgSend controlDarkShadowColor_CMetInst = get_controlDarkShadowColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlDarkShadowColor_CMetInst.init(nativeBuffer, this);
		controlDarkShadowColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlHighlightColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlHighlightColor_CMetInst(){
		return ((controlHighlightColor_CMetInst != null)
	? (controlHighlightColor_CMetInst)
	: (controlHighlightColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlHighlightColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlHighlightColor(){
			final com.apple.jobjc.Invoke.MsgSend controlHighlightColor_CMetInst = get_controlHighlightColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlHighlightColor_CMetInst.init(nativeBuffer, this);
		controlHighlightColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlLightHighlightColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlLightHighlightColor_CMetInst(){
		return ((controlLightHighlightColor_CMetInst != null)
	? (controlLightHighlightColor_CMetInst)
	: (controlLightHighlightColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlLightHighlightColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlLightHighlightColor(){
			final com.apple.jobjc.Invoke.MsgSend controlLightHighlightColor_CMetInst = get_controlLightHighlightColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlLightHighlightColor_CMetInst.init(nativeBuffer, this);
		controlLightHighlightColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlShadowColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlShadowColor_CMetInst(){
		return ((controlShadowColor_CMetInst != null)
	? (controlShadowColor_CMetInst)
	: (controlShadowColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlShadowColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlShadowColor(){
			final com.apple.jobjc.Invoke.MsgSend controlShadowColor_CMetInst = get_controlShadowColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlShadowColor_CMetInst.init(nativeBuffer, this);
		controlShadowColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTextColor_CMetInst(){
		return ((controlTextColor_CMetInst != null)
	? (controlTextColor_CMetInst)
	: (controlTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor controlTextColor(){
			final com.apple.jobjc.Invoke.MsgSend controlTextColor_CMetInst = get_controlTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTextColor_CMetInst.init(nativeBuffer, this);
		controlTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentControlTint_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentControlTint_CMetInst(){
		return ((currentControlTint_CMetInst != null)
	? (currentControlTint_CMetInst)
	: (currentControlTint_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentControlTint", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long currentControlTint(){
			final com.apple.jobjc.Invoke.MsgSend currentControlTint_CMetInst = get_currentControlTint_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentControlTint_CMetInst.init(nativeBuffer, this);
		currentControlTint_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cyanColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cyanColor_CMetInst(){
		return ((cyanColor_CMetInst != null)
	? (cyanColor_CMetInst)
	: (cyanColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cyanColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor cyanColor(){
			final com.apple.jobjc.Invoke.MsgSend cyanColor_CMetInst = get_cyanColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cyanColor_CMetInst.init(nativeBuffer, this);
		cyanColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend darkGrayColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_darkGrayColor_CMetInst(){
		return ((darkGrayColor_CMetInst != null)
	? (darkGrayColor_CMetInst)
	: (darkGrayColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "darkGrayColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor darkGrayColor(){
			final com.apple.jobjc.Invoke.MsgSend darkGrayColor_CMetInst = get_darkGrayColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		darkGrayColor_CMetInst.init(nativeBuffer, this);
		darkGrayColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend disabledControlTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disabledControlTextColor_CMetInst(){
		return ((disabledControlTextColor_CMetInst != null)
	? (disabledControlTextColor_CMetInst)
	: (disabledControlTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disabledControlTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor disabledControlTextColor(){
			final com.apple.jobjc.Invoke.MsgSend disabledControlTextColor_CMetInst = get_disabledControlTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disabledControlTextColor_CMetInst.init(nativeBuffer, this);
		disabledControlTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend grayColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_grayColor_CMetInst(){
		return ((grayColor_CMetInst != null)
	? (grayColor_CMetInst)
	: (grayColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "grayColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor grayColor(){
			final com.apple.jobjc.Invoke.MsgSend grayColor_CMetInst = get_grayColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		grayColor_CMetInst.init(nativeBuffer, this);
		grayColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend greenColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_greenColor_CMetInst(){
		return ((greenColor_CMetInst != null)
	? (greenColor_CMetInst)
	: (greenColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "greenColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor greenColor(){
			final com.apple.jobjc.Invoke.MsgSend greenColor_CMetInst = get_greenColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		greenColor_CMetInst.init(nativeBuffer, this);
		greenColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend gridColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gridColor_CMetInst(){
		return ((gridColor_CMetInst != null)
	? (gridColor_CMetInst)
	: (gridColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gridColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor gridColor(){
			final com.apple.jobjc.Invoke.MsgSend gridColor_CMetInst = get_gridColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gridColor_CMetInst.init(nativeBuffer, this);
		gridColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerColor_CMetInst(){
		return ((headerColor_CMetInst != null)
	? (headerColor_CMetInst)
	: (headerColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor headerColor(){
			final com.apple.jobjc.Invoke.MsgSend headerColor_CMetInst = get_headerColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerColor_CMetInst.init(nativeBuffer, this);
		headerColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerTextColor_CMetInst(){
		return ((headerTextColor_CMetInst != null)
	? (headerTextColor_CMetInst)
	: (headerTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor headerTextColor(){
			final com.apple.jobjc.Invoke.MsgSend headerTextColor_CMetInst = get_headerTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerTextColor_CMetInst.init(nativeBuffer, this);
		headerTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightColor_CMetInst(){
		return ((highlightColor_CMetInst != null)
	? (highlightColor_CMetInst)
	: (highlightColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor highlightColor(){
			final com.apple.jobjc.Invoke.MsgSend highlightColor_CMetInst = get_highlightColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightColor_CMetInst.init(nativeBuffer, this);
		highlightColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoresAlpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoresAlpha_CMetInst(){
		return ((ignoresAlpha_CMetInst != null)
	? (ignoresAlpha_CMetInst)
	: (ignoresAlpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoresAlpha", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ignoresAlpha(){
			final com.apple.jobjc.Invoke.MsgSend ignoresAlpha_CMetInst = get_ignoresAlpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoresAlpha_CMetInst.init(nativeBuffer, this);
		ignoresAlpha_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyboardFocusIndicatorColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyboardFocusIndicatorColor_CMetInst(){
		return ((keyboardFocusIndicatorColor_CMetInst != null)
	? (keyboardFocusIndicatorColor_CMetInst)
	: (keyboardFocusIndicatorColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyboardFocusIndicatorColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor keyboardFocusIndicatorColor(){
			final com.apple.jobjc.Invoke.MsgSend keyboardFocusIndicatorColor_CMetInst = get_keyboardFocusIndicatorColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyboardFocusIndicatorColor_CMetInst.init(nativeBuffer, this);
		keyboardFocusIndicatorColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knobColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knobColor_CMetInst(){
		return ((knobColor_CMetInst != null)
	? (knobColor_CMetInst)
	: (knobColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knobColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor knobColor(){
			final com.apple.jobjc.Invoke.MsgSend knobColor_CMetInst = get_knobColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knobColor_CMetInst.init(nativeBuffer, this);
		knobColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lightGrayColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lightGrayColor_CMetInst(){
		return ((lightGrayColor_CMetInst != null)
	? (lightGrayColor_CMetInst)
	: (lightGrayColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lightGrayColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor lightGrayColor(){
			final com.apple.jobjc.Invoke.MsgSend lightGrayColor_CMetInst = get_lightGrayColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lightGrayColor_CMetInst.init(nativeBuffer, this);
		lightGrayColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend magentaColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magentaColor_CMetInst(){
		return ((magentaColor_CMetInst != null)
	? (magentaColor_CMetInst)
	: (magentaColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magentaColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor magentaColor(){
			final com.apple.jobjc.Invoke.MsgSend magentaColor_CMetInst = get_magentaColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magentaColor_CMetInst.init(nativeBuffer, this);
		magentaColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orangeColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orangeColor_CMetInst(){
		return ((orangeColor_CMetInst != null)
	? (orangeColor_CMetInst)
	: (orangeColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orangeColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor orangeColor(){
			final com.apple.jobjc.Invoke.MsgSend orangeColor_CMetInst = get_orangeColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orangeColor_CMetInst.init(nativeBuffer, this);
		orangeColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend purpleColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_purpleColor_CMetInst(){
		return ((purpleColor_CMetInst != null)
	? (purpleColor_CMetInst)
	: (purpleColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "purpleColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor purpleColor(){
			final com.apple.jobjc.Invoke.MsgSend purpleColor_CMetInst = get_purpleColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		purpleColor_CMetInst.init(nativeBuffer, this);
		purpleColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redColor_CMetInst(){
		return ((redColor_CMetInst != null)
	? (redColor_CMetInst)
	: (redColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor redColor(){
			final com.apple.jobjc.Invoke.MsgSend redColor_CMetInst = get_redColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redColor_CMetInst.init(nativeBuffer, this);
		redColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollBarColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollBarColor_CMetInst(){
		return ((scrollBarColor_CMetInst != null)
	? (scrollBarColor_CMetInst)
	: (scrollBarColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollBarColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor scrollBarColor(){
			final com.apple.jobjc.Invoke.MsgSend scrollBarColor_CMetInst = get_scrollBarColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollBarColor_CMetInst.init(nativeBuffer, this);
		scrollBarColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondarySelectedControlColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondarySelectedControlColor_CMetInst(){
		return ((secondarySelectedControlColor_CMetInst != null)
	? (secondarySelectedControlColor_CMetInst)
	: (secondarySelectedControlColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondarySelectedControlColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor secondarySelectedControlColor(){
			final com.apple.jobjc.Invoke.MsgSend secondarySelectedControlColor_CMetInst = get_secondarySelectedControlColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondarySelectedControlColor_CMetInst.init(nativeBuffer, this);
		secondarySelectedControlColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedControlColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedControlColor_CMetInst(){
		return ((selectedControlColor_CMetInst != null)
	? (selectedControlColor_CMetInst)
	: (selectedControlColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedControlColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedControlColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedControlColor_CMetInst = get_selectedControlColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedControlColor_CMetInst.init(nativeBuffer, this);
		selectedControlColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedControlTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedControlTextColor_CMetInst(){
		return ((selectedControlTextColor_CMetInst != null)
	? (selectedControlTextColor_CMetInst)
	: (selectedControlTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedControlTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedControlTextColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedControlTextColor_CMetInst = get_selectedControlTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedControlTextColor_CMetInst.init(nativeBuffer, this);
		selectedControlTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedKnobColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedKnobColor_CMetInst(){
		return ((selectedKnobColor_CMetInst != null)
	? (selectedKnobColor_CMetInst)
	: (selectedKnobColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedKnobColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedKnobColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedKnobColor_CMetInst = get_selectedKnobColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedKnobColor_CMetInst.init(nativeBuffer, this);
		selectedKnobColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedMenuItemColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedMenuItemColor_CMetInst(){
		return ((selectedMenuItemColor_CMetInst != null)
	? (selectedMenuItemColor_CMetInst)
	: (selectedMenuItemColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedMenuItemColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedMenuItemColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedMenuItemColor_CMetInst = get_selectedMenuItemColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedMenuItemColor_CMetInst.init(nativeBuffer, this);
		selectedMenuItemColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedMenuItemTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedMenuItemTextColor_CMetInst(){
		return ((selectedMenuItemTextColor_CMetInst != null)
	? (selectedMenuItemTextColor_CMetInst)
	: (selectedMenuItemTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedMenuItemTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedMenuItemTextColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedMenuItemTextColor_CMetInst = get_selectedMenuItemTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedMenuItemTextColor_CMetInst.init(nativeBuffer, this);
		selectedMenuItemTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedTextBackgroundColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedTextBackgroundColor_CMetInst(){
		return ((selectedTextBackgroundColor_CMetInst != null)
	? (selectedTextBackgroundColor_CMetInst)
	: (selectedTextBackgroundColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedTextBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedTextBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedTextBackgroundColor_CMetInst = get_selectedTextBackgroundColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedTextBackgroundColor_CMetInst.init(nativeBuffer, this);
		selectedTextBackgroundColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedTextColor_CMetInst(){
		return ((selectedTextColor_CMetInst != null)
	? (selectedTextColor_CMetInst)
	: (selectedTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor selectedTextColor(){
			final com.apple.jobjc.Invoke.MsgSend selectedTextColor_CMetInst = get_selectedTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedTextColor_CMetInst.init(nativeBuffer, this);
		selectedTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setIgnoresAlpha_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIgnoresAlpha_CMetInst(){
		return ((setIgnoresAlpha_CMetInst != null)
	? (setIgnoresAlpha_CMetInst)
	: (setIgnoresAlpha_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIgnoresAlpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIgnoresAlpha(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIgnoresAlpha_CMetInst = get_setIgnoresAlpha_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIgnoresAlpha_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIgnoresAlpha_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shadowColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadowColor_CMetInst(){
		return ((shadowColor_CMetInst != null)
	? (shadowColor_CMetInst)
	: (shadowColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadowColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor shadowColor(){
			final com.apple.jobjc.Invoke.MsgSend shadowColor_CMetInst = get_shadowColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadowColor_CMetInst.init(nativeBuffer, this);
		shadowColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textBackgroundColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textBackgroundColor_CMetInst(){
		return ((textBackgroundColor_CMetInst != null)
	? (textBackgroundColor_CMetInst)
	: (textBackgroundColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor textBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend textBackgroundColor_CMetInst = get_textBackgroundColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textBackgroundColor_CMetInst.init(nativeBuffer, this);
		textBackgroundColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textColor_CMetInst(){
		return ((textColor_CMetInst != null)
	? (textColor_CMetInst)
	: (textColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor textColor(){
			final com.apple.jobjc.Invoke.MsgSend textColor_CMetInst = get_textColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textColor_CMetInst.init(nativeBuffer, this);
		textColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend underPageBackgroundColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_underPageBackgroundColor_CMetInst(){
		return ((underPageBackgroundColor_CMetInst != null)
	? (underPageBackgroundColor_CMetInst)
	: (underPageBackgroundColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "underPageBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor underPageBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend underPageBackgroundColor_CMetInst = get_underPageBackgroundColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		underPageBackgroundColor_CMetInst.init(nativeBuffer, this);
		underPageBackgroundColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend whiteColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_whiteColor_CMetInst(){
		return ((whiteColor_CMetInst != null)
	? (whiteColor_CMetInst)
	: (whiteColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "whiteColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor whiteColor(){
			final com.apple.jobjc.Invoke.MsgSend whiteColor_CMetInst = get_whiteColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		whiteColor_CMetInst.init(nativeBuffer, this);
		whiteColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowBackgroundColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowBackgroundColor_CMetInst(){
		return ((windowBackgroundColor_CMetInst != null)
	? (windowBackgroundColor_CMetInst)
	: (windowBackgroundColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor windowBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend windowBackgroundColor_CMetInst = get_windowBackgroundColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowBackgroundColor_CMetInst.init(nativeBuffer, this);
		windowBackgroundColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowFrameColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowFrameColor_CMetInst(){
		return ((windowFrameColor_CMetInst != null)
	? (windowFrameColor_CMetInst)
	: (windowFrameColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowFrameColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor windowFrameColor(){
			final com.apple.jobjc.Invoke.MsgSend windowFrameColor_CMetInst = get_windowFrameColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowFrameColor_CMetInst.init(nativeBuffer, this);
		windowFrameColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowFrameTextColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowFrameTextColor_CMetInst(){
		return ((windowFrameTextColor_CMetInst != null)
	? (windowFrameTextColor_CMetInst)
	: (windowFrameTextColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowFrameTextColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor windowFrameTextColor(){
			final com.apple.jobjc.Invoke.MsgSend windowFrameTextColor_CMetInst = get_windowFrameTextColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowFrameTextColor_CMetInst.init(nativeBuffer, this);
		windowFrameTextColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend yellowColor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_yellowColor_CMetInst(){
		return ((yellowColor_CMetInst != null)
	? (yellowColor_CMetInst)
	: (yellowColor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "yellowColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor yellowColor(){
			final com.apple.jobjc.Invoke.MsgSend yellowColor_CMetInst = get_yellowColor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		yellowColor_CMetInst.init(nativeBuffer, this);
		yellowColor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
