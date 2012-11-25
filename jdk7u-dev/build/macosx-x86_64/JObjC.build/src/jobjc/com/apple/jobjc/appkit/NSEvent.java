package com.apple.jobjc.appkit;

public  class NSEvent extends com.apple.jobjc.foundation.NSObject {
	public NSEvent(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSEvent(final NSEvent obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGEvent_IMetInst(){
		return ((CGEvent_IMetInst != null)
	? (CGEvent_IMetInst)
	: (CGEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGEvent", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CGEventRef (^{__CGEvent}, ^{__CGEvent}) */ CGEvent(){
			final com.apple.jobjc.Invoke.MsgSend CGEvent_IMetInst = get_CGEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGEvent_IMetInst.init(nativeBuffer, this);
		CGEvent_IMetInst.invoke(nativeBuffer);
		final Object /* CGEventRef (^{__CGEvent}, ^{__CGEvent}) */ returnValue = (Object /* CGEventRef (^{__CGEvent}, ^{__CGEvent}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absoluteX_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absoluteX_IMetInst(){
		return ((absoluteX_IMetInst != null)
	? (absoluteX_IMetInst)
	: (absoluteX_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absoluteX", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long absoluteX(){
			final com.apple.jobjc.Invoke.MsgSend absoluteX_IMetInst = get_absoluteX_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absoluteX_IMetInst.init(nativeBuffer, this);
		absoluteX_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absoluteY_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absoluteY_IMetInst(){
		return ((absoluteY_IMetInst != null)
	? (absoluteY_IMetInst)
	: (absoluteY_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absoluteY", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long absoluteY(){
			final com.apple.jobjc.Invoke.MsgSend absoluteY_IMetInst = get_absoluteY_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absoluteY_IMetInst.init(nativeBuffer, this);
		absoluteY_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absoluteZ_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absoluteZ_IMetInst(){
		return ((absoluteZ_IMetInst != null)
	? (absoluteZ_IMetInst)
	: (absoluteZ_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absoluteZ", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long absoluteZ(){
			final com.apple.jobjc.Invoke.MsgSend absoluteZ_IMetInst = get_absoluteZ_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absoluteZ_IMetInst.init(nativeBuffer, this);
		absoluteZ_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend buttonMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_buttonMask_IMetInst(){
		return ((buttonMask_IMetInst != null)
	? (buttonMask_IMetInst)
	: (buttonMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "buttonMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long buttonMask(){
			final com.apple.jobjc.Invoke.MsgSend buttonMask_IMetInst = get_buttonMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		buttonMask_IMetInst.init(nativeBuffer, this);
		buttonMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend buttonNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_buttonNumber_IMetInst(){
		return ((buttonNumber_IMetInst != null)
	? (buttonNumber_IMetInst)
	: (buttonNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "buttonNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long buttonNumber(){
			final com.apple.jobjc.Invoke.MsgSend buttonNumber_IMetInst = get_buttonNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		buttonNumber_IMetInst.init(nativeBuffer, this);
		buttonNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend capabilityMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capabilityMask_IMetInst(){
		return ((capabilityMask_IMetInst != null)
	? (capabilityMask_IMetInst)
	: (capabilityMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capabilityMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long capabilityMask(){
			final com.apple.jobjc.Invoke.MsgSend capabilityMask_IMetInst = get_capabilityMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capabilityMask_IMetInst.init(nativeBuffer, this);
		capabilityMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characters_IMetInst(){
		return ((characters_IMetInst != null)
	? (characters_IMetInst)
	: (characters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characters", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString characters(){
			final com.apple.jobjc.Invoke.MsgSend characters_IMetInst = get_characters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characters_IMetInst.init(nativeBuffer, this);
		characters_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend charactersIgnoringModifiers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_charactersIgnoringModifiers_IMetInst(){
		return ((charactersIgnoringModifiers_IMetInst != null)
	? (charactersIgnoringModifiers_IMetInst)
	: (charactersIgnoringModifiers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "charactersIgnoringModifiers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString charactersIgnoringModifiers(){
			final com.apple.jobjc.Invoke.MsgSend charactersIgnoringModifiers_IMetInst = get_charactersIgnoringModifiers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		charactersIgnoringModifiers_IMetInst.init(nativeBuffer, this);
		charactersIgnoringModifiers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clickCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clickCount_IMetInst(){
		return ((clickCount_IMetInst != null)
	? (clickCount_IMetInst)
	: (clickCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clickCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long clickCount(){
			final com.apple.jobjc.Invoke.MsgSend clickCount_IMetInst = get_clickCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clickCount_IMetInst.init(nativeBuffer, this);
		clickCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_context_IMetInst(){
		return ((context_IMetInst != null)
	? (context_IMetInst)
	: (context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "context", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext context(){
			final com.apple.jobjc.Invoke.MsgSend context_IMetInst = get_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		context_IMetInst.init(nativeBuffer, this);
		context_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend data1_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data1_IMetInst(){
		return ((data1_IMetInst != null)
	? (data1_IMetInst)
	: (data1_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data1", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long data1(){
			final com.apple.jobjc.Invoke.MsgSend data1_IMetInst = get_data1_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data1_IMetInst.init(nativeBuffer, this);
		data1_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend data2_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data2_IMetInst(){
		return ((data2_IMetInst != null)
	? (data2_IMetInst)
	: (data2_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data2", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long data2(){
			final com.apple.jobjc.Invoke.MsgSend data2_IMetInst = get_data2_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data2_IMetInst.init(nativeBuffer, this);
		data2_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deltaX_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deltaX_IMetInst(){
		return ((deltaX_IMetInst != null)
	? (deltaX_IMetInst)
	: (deltaX_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deltaX", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double deltaX(){
			final com.apple.jobjc.Invoke.MsgSend deltaX_IMetInst = get_deltaX_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deltaX_IMetInst.init(nativeBuffer, this);
		deltaX_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deltaY_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deltaY_IMetInst(){
		return ((deltaY_IMetInst != null)
	? (deltaY_IMetInst)
	: (deltaY_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deltaY", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double deltaY(){
			final com.apple.jobjc.Invoke.MsgSend deltaY_IMetInst = get_deltaY_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deltaY_IMetInst.init(nativeBuffer, this);
		deltaY_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deltaZ_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deltaZ_IMetInst(){
		return ((deltaZ_IMetInst != null)
	? (deltaZ_IMetInst)
	: (deltaZ_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deltaZ", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double deltaZ(){
			final com.apple.jobjc.Invoke.MsgSend deltaZ_IMetInst = get_deltaZ_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deltaZ_IMetInst.init(nativeBuffer, this);
		deltaZ_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceID_IMetInst(){
		return ((deviceID_IMetInst != null)
	? (deviceID_IMetInst)
	: (deviceID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceID", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long deviceID(){
			final com.apple.jobjc.Invoke.MsgSend deviceID_IMetInst = get_deviceID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceID_IMetInst.init(nativeBuffer, this);
		deviceID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventNumber_IMetInst(){
		return ((eventNumber_IMetInst != null)
	? (eventNumber_IMetInst)
	: (eventNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long eventNumber(){
			final com.apple.jobjc.Invoke.MsgSend eventNumber_IMetInst = get_eventNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventNumber_IMetInst.init(nativeBuffer, this);
		eventNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventRef_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventRef_IMetInst(){
		return ((eventRef_IMetInst != null)
	? (eventRef_IMetInst)
	: (eventRef_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventRef", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> eventRef(){
			final com.apple.jobjc.Invoke.MsgSend eventRef_IMetInst = get_eventRef_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventRef_IMetInst.init(nativeBuffer, this);
		eventRef_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasPreciseScrollingDeltas_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasPreciseScrollingDeltas_IMetInst(){
		return ((hasPreciseScrollingDeltas_IMetInst != null)
	? (hasPreciseScrollingDeltas_IMetInst)
	: (hasPreciseScrollingDeltas_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasPreciseScrollingDeltas", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasPreciseScrollingDeltas(){
			final com.apple.jobjc.Invoke.MsgSend hasPreciseScrollingDeltas_IMetInst = get_hasPreciseScrollingDeltas_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasPreciseScrollingDeltas_IMetInst.init(nativeBuffer, this);
		hasPreciseScrollingDeltas_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isARepeat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isARepeat_IMetInst(){
		return ((isARepeat_IMetInst != null)
	? (isARepeat_IMetInst)
	: (isARepeat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isARepeat", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isARepeat(){
			final com.apple.jobjc.Invoke.MsgSend isARepeat_IMetInst = get_isARepeat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isARepeat_IMetInst.init(nativeBuffer, this);
		isARepeat_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDirectionInvertedFromDevice_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDirectionInvertedFromDevice_IMetInst(){
		return ((isDirectionInvertedFromDevice_IMetInst != null)
	? (isDirectionInvertedFromDevice_IMetInst)
	: (isDirectionInvertedFromDevice_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDirectionInvertedFromDevice", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDirectionInvertedFromDevice(){
			final com.apple.jobjc.Invoke.MsgSend isDirectionInvertedFromDevice_IMetInst = get_isDirectionInvertedFromDevice_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDirectionInvertedFromDevice_IMetInst.init(nativeBuffer, this);
		isDirectionInvertedFromDevice_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnteringProximity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnteringProximity_IMetInst(){
		return ((isEnteringProximity_IMetInst != null)
	? (isEnteringProximity_IMetInst)
	: (isEnteringProximity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnteringProximity", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEnteringProximity(){
			final com.apple.jobjc.Invoke.MsgSend isEnteringProximity_IMetInst = get_isEnteringProximity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnteringProximity_IMetInst.init(nativeBuffer, this);
		isEnteringProximity_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyCode_IMetInst(){
		return ((keyCode_IMetInst != null)
	? (keyCode_IMetInst)
	: (keyCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyCode", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short keyCode(){
			final com.apple.jobjc.Invoke.MsgSend keyCode_IMetInst = get_keyCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyCode_IMetInst.init(nativeBuffer, this);
		keyCode_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locationInWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locationInWindow_IMetInst(){
		return ((locationInWindow_IMetInst != null)
	? (locationInWindow_IMetInst)
	: (locationInWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locationInWindow", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint locationInWindow(){
			final com.apple.jobjc.Invoke.MsgSend locationInWindow_IMetInst = get_locationInWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locationInWindow_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		locationInWindow_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend magnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magnification_IMetInst(){
		return ((magnification_IMetInst != null)
	? (magnification_IMetInst)
	: (magnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magnification", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double magnification(){
			final com.apple.jobjc.Invoke.MsgSend magnification_IMetInst = get_magnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magnification_IMetInst.init(nativeBuffer, this);
		magnification_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend modifierFlags_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modifierFlags_IMetInst(){
		return ((modifierFlags_IMetInst != null)
	? (modifierFlags_IMetInst)
	: (modifierFlags_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modifierFlags", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long modifierFlags(){
			final com.apple.jobjc.Invoke.MsgSend modifierFlags_IMetInst = get_modifierFlags_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modifierFlags_IMetInst.init(nativeBuffer, this);
		modifierFlags_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend momentumPhase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_momentumPhase_IMetInst(){
		return ((momentumPhase_IMetInst != null)
	? (momentumPhase_IMetInst)
	: (momentumPhase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "momentumPhase", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long momentumPhase(){
			final com.apple.jobjc.Invoke.MsgSend momentumPhase_IMetInst = get_momentumPhase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		momentumPhase_IMetInst.init(nativeBuffer, this);
		momentumPhase_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend phase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_phase_IMetInst(){
		return ((phase_IMetInst != null)
	? (phase_IMetInst)
	: (phase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "phase", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long phase(){
			final com.apple.jobjc.Invoke.MsgSend phase_IMetInst = get_phase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		phase_IMetInst.init(nativeBuffer, this);
		phase_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointingDeviceID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointingDeviceID_IMetInst(){
		return ((pointingDeviceID_IMetInst != null)
	? (pointingDeviceID_IMetInst)
	: (pointingDeviceID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointingDeviceID", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long pointingDeviceID(){
			final com.apple.jobjc.Invoke.MsgSend pointingDeviceID_IMetInst = get_pointingDeviceID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointingDeviceID_IMetInst.init(nativeBuffer, this);
		pointingDeviceID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointingDeviceSerialNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointingDeviceSerialNumber_IMetInst(){
		return ((pointingDeviceSerialNumber_IMetInst != null)
	? (pointingDeviceSerialNumber_IMetInst)
	: (pointingDeviceSerialNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointingDeviceSerialNumber", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long pointingDeviceSerialNumber(){
			final com.apple.jobjc.Invoke.MsgSend pointingDeviceSerialNumber_IMetInst = get_pointingDeviceSerialNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointingDeviceSerialNumber_IMetInst.init(nativeBuffer, this);
		pointingDeviceSerialNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointingDeviceType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointingDeviceType_IMetInst(){
		return ((pointingDeviceType_IMetInst != null)
	? (pointingDeviceType_IMetInst)
	: (pointingDeviceType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointingDeviceType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long pointingDeviceType(){
			final com.apple.jobjc.Invoke.MsgSend pointingDeviceType_IMetInst = get_pointingDeviceType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointingDeviceType_IMetInst.init(nativeBuffer, this);
		pointingDeviceType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pressure_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pressure_IMetInst(){
		return ((pressure_IMetInst != null)
	? (pressure_IMetInst)
	: (pressure_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pressure", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float pressure(){
			final com.apple.jobjc.Invoke.MsgSend pressure_IMetInst = get_pressure_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pressure_IMetInst.init(nativeBuffer, this);
		pressure_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rotation_IMetInst(){
		return ((rotation_IMetInst != null)
	? (rotation_IMetInst)
	: (rotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rotation", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float rotation(){
			final com.apple.jobjc.Invoke.MsgSend rotation_IMetInst = get_rotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rotation_IMetInst.init(nativeBuffer, this);
		rotation_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollingDeltaX_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollingDeltaX_IMetInst(){
		return ((scrollingDeltaX_IMetInst != null)
	? (scrollingDeltaX_IMetInst)
	: (scrollingDeltaX_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollingDeltaX", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double scrollingDeltaX(){
			final com.apple.jobjc.Invoke.MsgSend scrollingDeltaX_IMetInst = get_scrollingDeltaX_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollingDeltaX_IMetInst.init(nativeBuffer, this);
		scrollingDeltaX_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollingDeltaY_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollingDeltaY_IMetInst(){
		return ((scrollingDeltaY_IMetInst != null)
	? (scrollingDeltaY_IMetInst)
	: (scrollingDeltaY_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollingDeltaY", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double scrollingDeltaY(){
			final com.apple.jobjc.Invoke.MsgSend scrollingDeltaY_IMetInst = get_scrollingDeltaY_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollingDeltaY_IMetInst.init(nativeBuffer, this);
		scrollingDeltaY_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subtype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subtype_IMetInst(){
		return ((subtype_IMetInst != null)
	? (subtype_IMetInst)
	: (subtype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subtype", com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public short subtype(){
			final com.apple.jobjc.Invoke.MsgSend subtype_IMetInst = get_subtype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subtype_IMetInst.init(nativeBuffer, this);
		subtype_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemTabletID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemTabletID_IMetInst(){
		return ((systemTabletID_IMetInst != null)
	? (systemTabletID_IMetInst)
	: (systemTabletID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemTabletID", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long systemTabletID(){
			final com.apple.jobjc.Invoke.MsgSend systemTabletID_IMetInst = get_systemTabletID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemTabletID_IMetInst.init(nativeBuffer, this);
		systemTabletID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabletID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabletID_IMetInst(){
		return ((tabletID_IMetInst != null)
	? (tabletID_IMetInst)
	: (tabletID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabletID", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tabletID(){
			final com.apple.jobjc.Invoke.MsgSend tabletID_IMetInst = get_tabletID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabletID_IMetInst.init(nativeBuffer, this);
		tabletID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tangentialPressure_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tangentialPressure_IMetInst(){
		return ((tangentialPressure_IMetInst != null)
	? (tangentialPressure_IMetInst)
	: (tangentialPressure_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tangentialPressure", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float tangentialPressure(){
			final com.apple.jobjc.Invoke.MsgSend tangentialPressure_IMetInst = get_tangentialPressure_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tangentialPressure_IMetInst.init(nativeBuffer, this);
		tangentialPressure_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tilt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tilt_IMetInst(){
		return ((tilt_IMetInst != null)
	? (tilt_IMetInst)
	: (tilt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tilt", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint tilt(){
			final com.apple.jobjc.Invoke.MsgSend tilt_IMetInst = get_tilt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tilt_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		tilt_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timestamp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timestamp_IMetInst(){
		return ((timestamp_IMetInst != null)
	? (timestamp_IMetInst)
	: (timestamp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timestamp", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timestamp(){
			final com.apple.jobjc.Invoke.MsgSend timestamp_IMetInst = get_timestamp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timestamp_IMetInst.init(nativeBuffer, this);
		timestamp_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend touchesMatchingPhase_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_touchesMatchingPhase_inView_IMetInst(){
		return ((touchesMatchingPhase_inView_IMetInst != null)
	? (touchesMatchingPhase_inView_IMetInst)
	: (touchesMatchingPhase_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "touchesMatchingPhase:inView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet touchesMatchingPhase_inView(final long phase, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend touchesMatchingPhase_inView_IMetInst = get_touchesMatchingPhase_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		touchesMatchingPhase_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, phase);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		touchesMatchingPhase_inView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst(){
		return ((trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst != null)
	? (trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst)
	: (trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackSwipeEventWithOptions:dampenAmountThresholdMin:max:usingHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler(final long options, final double minDampenThreshold, final double maxDampenThreshold, final Object /* void(^)(CGFloat,NSEventPhase,BOOL,BOOL*) (@, @) */ trackingHandler){
			final com.apple.jobjc.Invoke.MsgSend trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst = get_trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, minDampenThreshold);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, maxDampenThreshold);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, trackingHandler);
		trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend trackingArea_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackingArea_IMetInst(){
		return ((trackingArea_IMetInst != null)
	? (trackingArea_IMetInst)
	: (trackingArea_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackingArea", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTrackingArea trackingArea(){
			final com.apple.jobjc.Invoke.MsgSend trackingArea_IMetInst = get_trackingArea_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackingArea_IMetInst.init(nativeBuffer, this);
		trackingArea_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTrackingArea returnValue = (com.apple.jobjc.appkit.NSTrackingArea) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackingNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackingNumber_IMetInst(){
		return ((trackingNumber_IMetInst != null)
	? (trackingNumber_IMetInst)
	: (trackingNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackingNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long trackingNumber(){
			final com.apple.jobjc.Invoke.MsgSend trackingNumber_IMetInst = get_trackingNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackingNumber_IMetInst.init(nativeBuffer, this);
		trackingNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_type_IMetInst(){
		return ((type_IMetInst != null)
	? (type_IMetInst)
	: (type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "type", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long type(){
			final com.apple.jobjc.Invoke.MsgSend type_IMetInst = get_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		type_IMetInst.init(nativeBuffer, this);
		type_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uniqueID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uniqueID_IMetInst(){
		return ((uniqueID_IMetInst != null)
	? (uniqueID_IMetInst)
	: (uniqueID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uniqueID", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long uniqueID(){
			final com.apple.jobjc.Invoke.MsgSend uniqueID_IMetInst = get_uniqueID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uniqueID_IMetInst.init(nativeBuffer, this);
		uniqueID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userData_IMetInst(){
		return ((userData_IMetInst != null)
	? (userData_IMetInst)
	: (userData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userData", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> userData(){
			final com.apple.jobjc.Invoke.MsgSend userData_IMetInst = get_userData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userData_IMetInst.init(nativeBuffer, this);
		userData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend vendorDefined_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_vendorDefined_IMetInst(){
		return ((vendorDefined_IMetInst != null)
	? (vendorDefined_IMetInst)
	: (vendorDefined_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "vendorDefined", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T vendorDefined(){
			final com.apple.jobjc.Invoke.MsgSend vendorDefined_IMetInst = get_vendorDefined_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		vendorDefined_IMetInst.init(nativeBuffer, this);
		vendorDefined_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend vendorID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_vendorID_IMetInst(){
		return ((vendorID_IMetInst != null)
	? (vendorID_IMetInst)
	: (vendorID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "vendorID", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long vendorID(){
			final com.apple.jobjc.Invoke.MsgSend vendorID_IMetInst = get_vendorID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		vendorID_IMetInst.init(nativeBuffer, this);
		vendorID_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend vendorPointingDeviceType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_vendorPointingDeviceType_IMetInst(){
		return ((vendorPointingDeviceType_IMetInst != null)
	? (vendorPointingDeviceType_IMetInst)
	: (vendorPointingDeviceType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "vendorPointingDeviceType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long vendorPointingDeviceType(){
			final com.apple.jobjc.Invoke.MsgSend vendorPointingDeviceType_IMetInst = get_vendorPointingDeviceType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		vendorPointingDeviceType_IMetInst.init(nativeBuffer, this);
		vendorPointingDeviceType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_IMetInst(){
		return ((window_IMetInst != null)
	? (window_IMetInst)
	: (window_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow window(){
			final com.apple.jobjc.Invoke.MsgSend window_IMetInst = get_window_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_IMetInst.init(nativeBuffer, this);
		window_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNumber_IMetInst(){
		return ((windowNumber_IMetInst != null)
	? (windowNumber_IMetInst)
	: (windowNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long windowNumber(){
			final com.apple.jobjc.Invoke.MsgSend windowNumber_IMetInst = get_windowNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNumber_IMetInst.init(nativeBuffer, this);
		windowNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
