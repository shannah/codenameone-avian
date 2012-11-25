package com.apple.jobjc.appkit;

public  class NSColor extends com.apple.jobjc.foundation.NSObject {
	public NSColor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColor(final NSColor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGColor_IMetInst(){
		return ((CGColor_IMetInst != null)
	? (CGColor_IMetInst)
	: (CGColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGColor", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CGColorRef (^{CGColor}, ^{CGColor}) */ CGColor(){
			final com.apple.jobjc.Invoke.MsgSend CGColor_IMetInst = get_CGColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGColor_IMetInst.init(nativeBuffer, this);
		CGColor_IMetInst.invoke(nativeBuffer);
		final Object /* CGColorRef (^{CGColor}, ^{CGColor}) */ returnValue = (Object /* CGColorRef (^{CGColor}, ^{CGColor}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alphaComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alphaComponent_IMetInst(){
		return ((alphaComponent_IMetInst != null)
	? (alphaComponent_IMetInst)
	: (alphaComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alphaComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double alphaComponent(){
			final com.apple.jobjc.Invoke.MsgSend alphaComponent_IMetInst = get_alphaComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alphaComponent_IMetInst.init(nativeBuffer, this);
		alphaComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend blackComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blackComponent_IMetInst(){
		return ((blackComponent_IMetInst != null)
	? (blackComponent_IMetInst)
	: (blackComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blackComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double blackComponent(){
			final com.apple.jobjc.Invoke.MsgSend blackComponent_IMetInst = get_blackComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blackComponent_IMetInst.init(nativeBuffer, this);
		blackComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend blendedColorWithFraction_ofColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blendedColorWithFraction_ofColor_IMetInst(){
		return ((blendedColorWithFraction_ofColor_IMetInst != null)
	? (blendedColorWithFraction_ofColor_IMetInst)
	: (blendedColorWithFraction_ofColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blendedColorWithFraction:ofColor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor blendedColorWithFraction_ofColor(final double fraction, final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend blendedColorWithFraction_ofColor_IMetInst = get_blendedColorWithFraction_ofColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blendedColorWithFraction_ofColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fraction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		blendedColorWithFraction_ofColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend blueComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blueComponent_IMetInst(){
		return ((blueComponent_IMetInst != null)
	? (blueComponent_IMetInst)
	: (blueComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blueComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double blueComponent(){
			final com.apple.jobjc.Invoke.MsgSend blueComponent_IMetInst = get_blueComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blueComponent_IMetInst.init(nativeBuffer, this);
		blueComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend brightnessComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_brightnessComponent_IMetInst(){
		return ((brightnessComponent_IMetInst != null)
	? (brightnessComponent_IMetInst)
	: (brightnessComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "brightnessComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double brightnessComponent(){
			final com.apple.jobjc.Invoke.MsgSend brightnessComponent_IMetInst = get_brightnessComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		brightnessComponent_IMetInst.init(nativeBuffer, this);
		brightnessComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend catalogNameComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_catalogNameComponent_IMetInst(){
		return ((catalogNameComponent_IMetInst != null)
	? (catalogNameComponent_IMetInst)
	: (catalogNameComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "catalogNameComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString catalogNameComponent(){
			final com.apple.jobjc.Invoke.MsgSend catalogNameComponent_IMetInst = get_catalogNameComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		catalogNameComponent_IMetInst.init(nativeBuffer, this);
		catalogNameComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorNameComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorNameComponent_IMetInst(){
		return ((colorNameComponent_IMetInst != null)
	? (colorNameComponent_IMetInst)
	: (colorNameComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorNameComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString colorNameComponent(){
			final com.apple.jobjc.Invoke.MsgSend colorNameComponent_IMetInst = get_colorNameComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorNameComponent_IMetInst.init(nativeBuffer, this);
		colorNameComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend colorUsingColorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorUsingColorSpace_IMetInst(){
		return ((colorUsingColorSpace_IMetInst != null)
	? (colorUsingColorSpace_IMetInst)
	: (colorUsingColorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorUsingColorSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorUsingColorSpace(final com.apple.jobjc.appkit.NSColorSpace space){
			final com.apple.jobjc.Invoke.MsgSend colorUsingColorSpace_IMetInst = get_colorUsingColorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorUsingColorSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		colorUsingColorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorUsingColorSpaceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorUsingColorSpaceName_IMetInst(){
		return ((colorUsingColorSpaceName_IMetInst != null)
	? (colorUsingColorSpaceName_IMetInst)
	: (colorUsingColorSpaceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorUsingColorSpaceName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorUsingColorSpaceName(final com.apple.jobjc.foundation.NSString colorSpace){
			final com.apple.jobjc.Invoke.MsgSend colorUsingColorSpaceName_IMetInst = get_colorUsingColorSpaceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorUsingColorSpaceName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpace);
		colorUsingColorSpaceName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorUsingColorSpaceName_device_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorUsingColorSpaceName_device_IMetInst(){
		return ((colorUsingColorSpaceName_device_IMetInst != null)
	? (colorUsingColorSpaceName_device_IMetInst)
	: (colorUsingColorSpaceName_device_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorUsingColorSpaceName:device:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorUsingColorSpaceName_device(final com.apple.jobjc.foundation.NSString colorSpace, final com.apple.jobjc.foundation.NSDictionary deviceDescription){
			final com.apple.jobjc.Invoke.MsgSend colorUsingColorSpaceName_device_IMetInst = get_colorUsingColorSpaceName_device_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorUsingColorSpaceName_device_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpace);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deviceDescription);
		colorUsingColorSpaceName_device_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorWithAlphaComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithAlphaComponent_IMetInst(){
		return ((colorWithAlphaComponent_IMetInst != null)
	? (colorWithAlphaComponent_IMetInst)
	: (colorWithAlphaComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithAlphaComponent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithAlphaComponent(final double alpha){
			final com.apple.jobjc.Invoke.MsgSend colorWithAlphaComponent_IMetInst = get_colorWithAlphaComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithAlphaComponent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alpha);
		colorWithAlphaComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cyanComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cyanComponent_IMetInst(){
		return ((cyanComponent_IMetInst != null)
	? (cyanComponent_IMetInst)
	: (cyanComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cyanComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double cyanComponent(){
			final com.apple.jobjc.Invoke.MsgSend cyanComponent_IMetInst = get_cyanComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cyanComponent_IMetInst.init(nativeBuffer, this);
		cyanComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSwatchInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSwatchInRect_IMetInst(){
		return ((drawSwatchInRect_IMetInst != null)
	? (drawSwatchInRect_IMetInst)
	: (drawSwatchInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSwatchInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawSwatchInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawSwatchInRect_IMetInst = get_drawSwatchInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSwatchInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawSwatchInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getComponents_IMetInst(){
		return ((getComponents_IMetInst != null)
	? (getComponents_IMetInst)
	: (getComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getComponents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getComponents(final com.apple.jobjc.Pointer<java.lang.Double> components){
			final com.apple.jobjc.Invoke.MsgSend getComponents_IMetInst = get_getComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getComponents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, components);
		getComponents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCyan_magenta_yellow_black_alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCyan_magenta_yellow_black_alpha_IMetInst(){
		return ((getCyan_magenta_yellow_black_alpha_IMetInst != null)
	? (getCyan_magenta_yellow_black_alpha_IMetInst)
	: (getCyan_magenta_yellow_black_alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCyan:magenta:yellow:black:alpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getCyan_magenta_yellow_black_alpha(final com.apple.jobjc.Pointer<java.lang.Double> cyan, final com.apple.jobjc.Pointer<java.lang.Double> magenta, final com.apple.jobjc.Pointer<java.lang.Double> yellow, final com.apple.jobjc.Pointer<java.lang.Double> black, final com.apple.jobjc.Pointer<java.lang.Double> alpha){
			final com.apple.jobjc.Invoke.MsgSend getCyan_magenta_yellow_black_alpha_IMetInst = get_getCyan_magenta_yellow_black_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCyan_magenta_yellow_black_alpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, cyan);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, magenta);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, yellow);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, black);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, alpha);
		getCyan_magenta_yellow_black_alpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getHue_saturation_brightness_alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getHue_saturation_brightness_alpha_IMetInst(){
		return ((getHue_saturation_brightness_alpha_IMetInst != null)
	? (getHue_saturation_brightness_alpha_IMetInst)
	: (getHue_saturation_brightness_alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getHue:saturation:brightness:alpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getHue_saturation_brightness_alpha(final com.apple.jobjc.Pointer<java.lang.Double> hue, final com.apple.jobjc.Pointer<java.lang.Double> saturation, final com.apple.jobjc.Pointer<java.lang.Double> brightness, final com.apple.jobjc.Pointer<java.lang.Double> alpha){
			final com.apple.jobjc.Invoke.MsgSend getHue_saturation_brightness_alpha_IMetInst = get_getHue_saturation_brightness_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getHue_saturation_brightness_alpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, hue);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, saturation);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, brightness);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, alpha);
		getHue_saturation_brightness_alpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getRed_green_blue_alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRed_green_blue_alpha_IMetInst(){
		return ((getRed_green_blue_alpha_IMetInst != null)
	? (getRed_green_blue_alpha_IMetInst)
	: (getRed_green_blue_alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRed:green:blue:alpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getRed_green_blue_alpha(final com.apple.jobjc.Pointer<java.lang.Double> red, final com.apple.jobjc.Pointer<java.lang.Double> green, final com.apple.jobjc.Pointer<java.lang.Double> blue, final com.apple.jobjc.Pointer<java.lang.Double> alpha){
			final com.apple.jobjc.Invoke.MsgSend getRed_green_blue_alpha_IMetInst = get_getRed_green_blue_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRed_green_blue_alpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, red);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, green);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, blue);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, alpha);
		getRed_green_blue_alpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getWhite_alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getWhite_alpha_IMetInst(){
		return ((getWhite_alpha_IMetInst != null)
	? (getWhite_alpha_IMetInst)
	: (getWhite_alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getWhite:alpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getWhite_alpha(final com.apple.jobjc.Pointer<java.lang.Double> white, final com.apple.jobjc.Pointer<java.lang.Double> alpha){
			final com.apple.jobjc.Invoke.MsgSend getWhite_alpha_IMetInst = get_getWhite_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getWhite_alpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, white);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, alpha);
		getWhite_alpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend greenComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_greenComponent_IMetInst(){
		return ((greenComponent_IMetInst != null)
	? (greenComponent_IMetInst)
	: (greenComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "greenComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double greenComponent(){
			final com.apple.jobjc.Invoke.MsgSend greenComponent_IMetInst = get_greenComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		greenComponent_IMetInst.init(nativeBuffer, this);
		greenComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightWithLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightWithLevel_IMetInst(){
		return ((highlightWithLevel_IMetInst != null)
	? (highlightWithLevel_IMetInst)
	: (highlightWithLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightWithLevel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor highlightWithLevel(final double val){
			final com.apple.jobjc.Invoke.MsgSend highlightWithLevel_IMetInst = get_highlightWithLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightWithLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		highlightWithLevel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hueComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hueComponent_IMetInst(){
		return ((hueComponent_IMetInst != null)
	? (hueComponent_IMetInst)
	: (hueComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hueComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double hueComponent(){
			final com.apple.jobjc.Invoke.MsgSend hueComponent_IMetInst = get_hueComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hueComponent_IMetInst.init(nativeBuffer, this);
		hueComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedCatalogNameComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedCatalogNameComponent_IMetInst(){
		return ((localizedCatalogNameComponent_IMetInst != null)
	? (localizedCatalogNameComponent_IMetInst)
	: (localizedCatalogNameComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedCatalogNameComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedCatalogNameComponent(){
			final com.apple.jobjc.Invoke.MsgSend localizedCatalogNameComponent_IMetInst = get_localizedCatalogNameComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedCatalogNameComponent_IMetInst.init(nativeBuffer, this);
		localizedCatalogNameComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedColorNameComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedColorNameComponent_IMetInst(){
		return ((localizedColorNameComponent_IMetInst != null)
	? (localizedColorNameComponent_IMetInst)
	: (localizedColorNameComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedColorNameComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedColorNameComponent(){
			final com.apple.jobjc.Invoke.MsgSend localizedColorNameComponent_IMetInst = get_localizedColorNameComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedColorNameComponent_IMetInst.init(nativeBuffer, this);
		localizedColorNameComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend magentaComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magentaComponent_IMetInst(){
		return ((magentaComponent_IMetInst != null)
	? (magentaComponent_IMetInst)
	: (magentaComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magentaComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double magentaComponent(){
			final com.apple.jobjc.Invoke.MsgSend magentaComponent_IMetInst = get_magentaComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magentaComponent_IMetInst.init(nativeBuffer, this);
		magentaComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfComponents_IMetInst(){
		return ((numberOfComponents_IMetInst != null)
	? (numberOfComponents_IMetInst)
	: (numberOfComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfComponents", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfComponents(){
			final com.apple.jobjc.Invoke.MsgSend numberOfComponents_IMetInst = get_numberOfComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfComponents_IMetInst.init(nativeBuffer, this);
		numberOfComponents_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend patternImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_patternImage_IMetInst(){
		return ((patternImage_IMetInst != null)
	? (patternImage_IMetInst)
	: (patternImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "patternImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage patternImage(){
			final com.apple.jobjc.Invoke.MsgSend patternImage_IMetInst = get_patternImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		patternImage_IMetInst.init(nativeBuffer, this);
		patternImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redComponent_IMetInst(){
		return ((redComponent_IMetInst != null)
	? (redComponent_IMetInst)
	: (redComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double redComponent(){
			final com.apple.jobjc.Invoke.MsgSend redComponent_IMetInst = get_redComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redComponent_IMetInst.init(nativeBuffer, this);
		redComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend saturationComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saturationComponent_IMetInst(){
		return ((saturationComponent_IMetInst != null)
	? (saturationComponent_IMetInst)
	: (saturationComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saturationComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double saturationComponent(){
			final com.apple.jobjc.Invoke.MsgSend saturationComponent_IMetInst = get_saturationComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saturationComponent_IMetInst.init(nativeBuffer, this);
		saturationComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend set_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_IMetInst(){
		return ((set_IMetInst != null)
	? (set_IMetInst)
	: (set_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void set(){
			final com.apple.jobjc.Invoke.MsgSend set_IMetInst = get_set_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_IMetInst.init(nativeBuffer, this);
		set_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFill_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFill_IMetInst(){
		return ((setFill_IMetInst != null)
	? (setFill_IMetInst)
	: (setFill_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFill", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setFill(){
			final com.apple.jobjc.Invoke.MsgSend setFill_IMetInst = get_setFill_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFill_IMetInst.init(nativeBuffer, this);
		setFill_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStroke_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStroke_IMetInst(){
		return ((setStroke_IMetInst != null)
	? (setStroke_IMetInst)
	: (setStroke_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStroke", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setStroke(){
			final com.apple.jobjc.Invoke.MsgSend setStroke_IMetInst = get_setStroke_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStroke_IMetInst.init(nativeBuffer, this);
		setStroke_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shadowWithLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadowWithLevel_IMetInst(){
		return ((shadowWithLevel_IMetInst != null)
	? (shadowWithLevel_IMetInst)
	: (shadowWithLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadowWithLevel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor shadowWithLevel(final double val){
			final com.apple.jobjc.Invoke.MsgSend shadowWithLevel_IMetInst = get_shadowWithLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadowWithLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		shadowWithLevel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend whiteComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_whiteComponent_IMetInst(){
		return ((whiteComponent_IMetInst != null)
	? (whiteComponent_IMetInst)
	: (whiteComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "whiteComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double whiteComponent(){
			final com.apple.jobjc.Invoke.MsgSend whiteComponent_IMetInst = get_whiteComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		whiteComponent_IMetInst.init(nativeBuffer, this);
		whiteComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToPasteboard_IMetInst(){
		return ((writeToPasteboard_IMetInst != null)
	? (writeToPasteboard_IMetInst)
	: (writeToPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToPasteboard:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writeToPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteBoard){
			final com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst = get_writeToPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteBoard);
		writeToPasteboard_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend yellowComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_yellowComponent_IMetInst(){
		return ((yellowComponent_IMetInst != null)
	? (yellowComponent_IMetInst)
	: (yellowComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "yellowComponent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double yellowComponent(){
			final com.apple.jobjc.Invoke.MsgSend yellowComponent_IMetInst = get_yellowComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		yellowComponent_IMetInst.init(nativeBuffer, this);
		yellowComponent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
