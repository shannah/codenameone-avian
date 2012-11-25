package com.apple.jobjc.appkit;

public  class NSStepper extends com.apple.jobjc.appkit.NSControl {
	public NSStepper(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSStepper(final NSStepper obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend autorepeat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autorepeat_IMetInst(){
		return ((autorepeat_IMetInst != null)
	? (autorepeat_IMetInst)
	: (autorepeat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autorepeat", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autorepeat(){
			final com.apple.jobjc.Invoke.MsgSend autorepeat_IMetInst = get_autorepeat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autorepeat_IMetInst.init(nativeBuffer, this);
		autorepeat_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend increment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_increment_IMetInst(){
		return ((increment_IMetInst != null)
	? (increment_IMetInst)
	: (increment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "increment", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double increment(){
			final com.apple.jobjc.Invoke.MsgSend increment_IMetInst = get_increment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		increment_IMetInst.init(nativeBuffer, this);
		increment_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxValue_IMetInst(){
		return ((maxValue_IMetInst != null)
	? (maxValue_IMetInst)
	: (maxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double maxValue(){
			final com.apple.jobjc.Invoke.MsgSend maxValue_IMetInst = get_maxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxValue_IMetInst.init(nativeBuffer, this);
		maxValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minValue_IMetInst(){
		return ((minValue_IMetInst != null)
	? (minValue_IMetInst)
	: (minValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double minValue(){
			final com.apple.jobjc.Invoke.MsgSend minValue_IMetInst = get_minValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minValue_IMetInst.init(nativeBuffer, this);
		minValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutorepeat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutorepeat_IMetInst(){
		return ((setAutorepeat_IMetInst != null)
	? (setAutorepeat_IMetInst)
	: (setAutorepeat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutorepeat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutorepeat(final boolean autorepeat){
			final com.apple.jobjc.Invoke.MsgSend setAutorepeat_IMetInst = get_setAutorepeat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutorepeat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, autorepeat);
		setAutorepeat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncrement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncrement_IMetInst(){
		return ((setIncrement_IMetInst != null)
	? (setIncrement_IMetInst)
	: (setIncrement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncrement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setIncrement(final double increment){
			final com.apple.jobjc.Invoke.MsgSend setIncrement_IMetInst = get_setIncrement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncrement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, increment);
		setIncrement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxValue_IMetInst(){
		return ((setMaxValue_IMetInst != null)
	? (setMaxValue_IMetInst)
	: (setMaxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMaxValue(final double maxValue){
			final com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst = get_setMaxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, maxValue);
		setMaxValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinValue_IMetInst(){
		return ((setMinValue_IMetInst != null)
	? (setMinValue_IMetInst)
	: (setMinValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMinValue(final double minValue){
			final com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst = get_setMinValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, minValue);
		setMinValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValueWraps_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValueWraps_IMetInst(){
		return ((setValueWraps_IMetInst != null)
	? (setValueWraps_IMetInst)
	: (setValueWraps_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValueWraps:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setValueWraps(final boolean valueWraps){
			final com.apple.jobjc.Invoke.MsgSend setValueWraps_IMetInst = get_setValueWraps_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValueWraps_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, valueWraps);
		setValueWraps_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWraps_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWraps_IMetInst(){
		return ((valueWraps_IMetInst != null)
	? (valueWraps_IMetInst)
	: (valueWraps_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWraps", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean valueWraps(){
			final com.apple.jobjc.Invoke.MsgSend valueWraps_IMetInst = get_valueWraps_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWraps_IMetInst.init(nativeBuffer, this);
		valueWraps_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
