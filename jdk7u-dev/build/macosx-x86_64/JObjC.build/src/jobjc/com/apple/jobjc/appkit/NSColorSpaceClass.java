package com.apple.jobjc.appkit;

public  class NSColorSpaceClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSColorSpaceClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSColorSpaceClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSColorSpaceClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend adobeRGB1998ColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_adobeRGB1998ColorSpace_CMetInst(){
		return ((adobeRGB1998ColorSpace_CMetInst != null)
	? (adobeRGB1998ColorSpace_CMetInst)
	: (adobeRGB1998ColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "adobeRGB1998ColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace adobeRGB1998ColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend adobeRGB1998ColorSpace_CMetInst = get_adobeRGB1998ColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		adobeRGB1998ColorSpace_CMetInst.init(nativeBuffer, this);
		adobeRGB1998ColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableColorSpacesWithModel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableColorSpacesWithModel_CMetInst(){
		return ((availableColorSpacesWithModel_CMetInst != null)
	? (availableColorSpacesWithModel_CMetInst)
	: (availableColorSpacesWithModel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableColorSpacesWithModel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray availableColorSpacesWithModel(final long model){
			final com.apple.jobjc.Invoke.MsgSend availableColorSpacesWithModel_CMetInst = get_availableColorSpacesWithModel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableColorSpacesWithModel_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, model);
		availableColorSpacesWithModel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceCMYKColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceCMYKColorSpace_CMetInst(){
		return ((deviceCMYKColorSpace_CMetInst != null)
	? (deviceCMYKColorSpace_CMetInst)
	: (deviceCMYKColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceCMYKColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace deviceCMYKColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend deviceCMYKColorSpace_CMetInst = get_deviceCMYKColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceCMYKColorSpace_CMetInst.init(nativeBuffer, this);
		deviceCMYKColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceGrayColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceGrayColorSpace_CMetInst(){
		return ((deviceGrayColorSpace_CMetInst != null)
	? (deviceGrayColorSpace_CMetInst)
	: (deviceGrayColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceGrayColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace deviceGrayColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend deviceGrayColorSpace_CMetInst = get_deviceGrayColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceGrayColorSpace_CMetInst.init(nativeBuffer, this);
		deviceGrayColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceRGBColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceRGBColorSpace_CMetInst(){
		return ((deviceRGBColorSpace_CMetInst != null)
	? (deviceRGBColorSpace_CMetInst)
	: (deviceRGBColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceRGBColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace deviceRGBColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend deviceRGBColorSpace_CMetInst = get_deviceRGBColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceRGBColorSpace_CMetInst.init(nativeBuffer, this);
		deviceRGBColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend genericCMYKColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_genericCMYKColorSpace_CMetInst(){
		return ((genericCMYKColorSpace_CMetInst != null)
	? (genericCMYKColorSpace_CMetInst)
	: (genericCMYKColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "genericCMYKColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace genericCMYKColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend genericCMYKColorSpace_CMetInst = get_genericCMYKColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		genericCMYKColorSpace_CMetInst.init(nativeBuffer, this);
		genericCMYKColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend genericGamma22GrayColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_genericGamma22GrayColorSpace_CMetInst(){
		return ((genericGamma22GrayColorSpace_CMetInst != null)
	? (genericGamma22GrayColorSpace_CMetInst)
	: (genericGamma22GrayColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "genericGamma22GrayColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace genericGamma22GrayColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend genericGamma22GrayColorSpace_CMetInst = get_genericGamma22GrayColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		genericGamma22GrayColorSpace_CMetInst.init(nativeBuffer, this);
		genericGamma22GrayColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend genericGrayColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_genericGrayColorSpace_CMetInst(){
		return ((genericGrayColorSpace_CMetInst != null)
	? (genericGrayColorSpace_CMetInst)
	: (genericGrayColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "genericGrayColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace genericGrayColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend genericGrayColorSpace_CMetInst = get_genericGrayColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		genericGrayColorSpace_CMetInst.init(nativeBuffer, this);
		genericGrayColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend genericRGBColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_genericRGBColorSpace_CMetInst(){
		return ((genericRGBColorSpace_CMetInst != null)
	? (genericRGBColorSpace_CMetInst)
	: (genericRGBColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "genericRGBColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace genericRGBColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend genericRGBColorSpace_CMetInst = get_genericRGBColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		genericRGBColorSpace_CMetInst.init(nativeBuffer, this);
		genericRGBColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sRGBColorSpace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sRGBColorSpace_CMetInst(){
		return ((sRGBColorSpace_CMetInst != null)
	? (sRGBColorSpace_CMetInst)
	: (sRGBColorSpace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sRGBColorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace sRGBColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend sRGBColorSpace_CMetInst = get_sRGBColorSpace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sRGBColorSpace_CMetInst.init(nativeBuffer, this);
		sRGBColorSpace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
