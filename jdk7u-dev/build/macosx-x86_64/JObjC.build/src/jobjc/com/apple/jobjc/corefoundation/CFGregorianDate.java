package com.apple.jobjc.corefoundation;

public final class CFGregorianDate extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 16;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST){
		@Override protected CFGregorianDate newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFGregorianDate(runtime); }
	};

	CFGregorianDate(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFGregorianDate(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int YEAR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int year(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + YEAR_OFFSET));
return returnValue;
	}

	public void setYear(final int year__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + YEAR_OFFSET, year__);
	}

	private static final int MONTH_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte month(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + MONTH_OFFSET));
return returnValue;
	}

	public void setMonth(final byte month__){
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + MONTH_OFFSET, month__);
	}

	private static final int DAY_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 5 : 5;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte day(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + DAY_OFFSET));
return returnValue;
	}

	public void setDay(final byte day__){
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + DAY_OFFSET, day__);
	}

	private static final int HOUR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 6 : 6;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte hour(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + HOUR_OFFSET));
return returnValue;
	}

	public void setHour(final byte hour__){
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + HOUR_OFFSET, hour__);
	}

	private static final int MINUTE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 7 : 7;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte minute(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + MINUTE_OFFSET));
return returnValue;
	}

	public void setMinute(final byte minute__){
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + MINUTE_OFFSET, minute__);
	}

	private static final int SECOND_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public double second(){
final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(getRuntime(), this.raw.bufferPtr + SECOND_OFFSET));
return returnValue;
	}

	public void setSecond(final double second__){
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(getRuntime(), this.raw.bufferPtr + SECOND_OFFSET, second__);
	}
}
