package com.apple.jobjc.appkit;

public  class NSTouch extends com.apple.jobjc.foundation.NSObject {
	public NSTouch(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTouch(final NSTouch obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend device_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_device_IMetInst(){
		return ((device_IMetInst != null)
	? (device_IMetInst)
	: (device_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "device", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T device(){
			final com.apple.jobjc.Invoke.MsgSend device_IMetInst = get_device_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		device_IMetInst.init(nativeBuffer, this);
		device_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceSize_IMetInst(){
		return ((deviceSize_IMetInst != null)
	? (deviceSize_IMetInst)
	: (deviceSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize deviceSize(){
			final com.apple.jobjc.Invoke.MsgSend deviceSize_IMetInst = get_deviceSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		deviceSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend identity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identity_IMetInst(){
		return ((identity_IMetInst != null)
	? (identity_IMetInst)
	: (identity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identity", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T identity(){
			final com.apple.jobjc.Invoke.MsgSend identity_IMetInst = get_identity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identity_IMetInst.init(nativeBuffer, this);
		identity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isResting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isResting_IMetInst(){
		return ((isResting_IMetInst != null)
	? (isResting_IMetInst)
	: (isResting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isResting", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isResting(){
			final com.apple.jobjc.Invoke.MsgSend isResting_IMetInst = get_isResting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isResting_IMetInst.init(nativeBuffer, this);
		isResting_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend normalizedPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_normalizedPosition_IMetInst(){
		return ((normalizedPosition_IMetInst != null)
	? (normalizedPosition_IMetInst)
	: (normalizedPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "normalizedPosition", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint normalizedPosition(){
			final com.apple.jobjc.Invoke.MsgSend normalizedPosition_IMetInst = get_normalizedPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		normalizedPosition_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		normalizedPosition_IMetInst.invoke(nativeBuffer, returnValue);
		
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

}
