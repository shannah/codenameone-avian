package com.apple.jobjc.corefoundation;

public final class CFGregorianUnits extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 28;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST){
		@Override protected CFGregorianUnits newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFGregorianUnits(runtime); }
	};

	CFGregorianUnits(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFGregorianUnits(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int YEARS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int years(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + YEARS_OFFSET));
return returnValue;
	}

	public void setYears(final int years__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + YEARS_OFFSET, years__);
	}

	private static final int MONTHS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int months(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + MONTHS_OFFSET));
return returnValue;
	}

	public void setMonths(final int months__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + MONTHS_OFFSET, months__);
	}

	private static final int DAYS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int days(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + DAYS_OFFSET));
return returnValue;
	}

	public void setDays(final int days__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + DAYS_OFFSET, days__);
	}

	private static final int HOURS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 12 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int hours(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + HOURS_OFFSET));
return returnValue;
	}

	public void setHours(final int hours__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + HOURS_OFFSET, hours__);
	}

	private static final int MINUTES_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int minutes(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + MINUTES_OFFSET));
return returnValue;
	}

	public void setMinutes(final int minutes__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + MINUTES_OFFSET, minutes__);
	}

	private static final int SECONDS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public double seconds(){
final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(getRuntime(), this.raw.bufferPtr + SECONDS_OFFSET));
return returnValue;
	}

	public void setSeconds(final double seconds__){
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(getRuntime(), this.raw.bufferPtr + SECONDS_OFFSET, seconds__);
	}
}
