package com.apple.jobjc.appkit;

public  class NSRulerViewClass extends com.apple.jobjc.appkit.NSViewClass {
	public NSRulerViewClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSRulerViewClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSRulerViewClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst(){
		return ((registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst != null)
	? (registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst)
	: (registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerUnitWithName:abbreviation:unitToPointsConversionFactor:stepUpCycle:stepDownCycle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle(final com.apple.jobjc.foundation.NSString unitName, final com.apple.jobjc.foundation.NSString abbreviation, final double conversionFactor, final com.apple.jobjc.foundation.NSArray stepUpCycle, final com.apple.jobjc.foundation.NSArray stepDownCycle){
			final com.apple.jobjc.Invoke.MsgSend registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst = get_registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unitName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, abbreviation);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, conversionFactor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stepUpCycle);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stepDownCycle);
		registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle_CMetInst.invoke(nativeBuffer);
		
		
	}

}
