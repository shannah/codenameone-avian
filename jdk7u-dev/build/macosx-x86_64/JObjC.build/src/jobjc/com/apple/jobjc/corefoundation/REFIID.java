package com.apple.jobjc.corefoundation;

public final class REFIID extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 16;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST){
		@Override protected REFIID newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new REFIID(runtime); }
	};

	REFIID(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public REFIID(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int BYTE0_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte0(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE0_OFFSET));
return returnValue;
	}

	public void setByte0(final byte byte0__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE0_OFFSET, byte0__);
	}

	private static final int BYTE1_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 1 : 1;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte1(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE1_OFFSET));
return returnValue;
	}

	public void setByte1(final byte byte1__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE1_OFFSET, byte1__);
	}

	private static final int BYTE2_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 2 : 2;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte2(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE2_OFFSET));
return returnValue;
	}

	public void setByte2(final byte byte2__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE2_OFFSET, byte2__);
	}

	private static final int BYTE3_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 3 : 3;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte3(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE3_OFFSET));
return returnValue;
	}

	public void setByte3(final byte byte3__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE3_OFFSET, byte3__);
	}

	private static final int BYTE4_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte4(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE4_OFFSET));
return returnValue;
	}

	public void setByte4(final byte byte4__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE4_OFFSET, byte4__);
	}

	private static final int BYTE5_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 5 : 5;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte5(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE5_OFFSET));
return returnValue;
	}

	public void setByte5(final byte byte5__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE5_OFFSET, byte5__);
	}

	private static final int BYTE6_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 6 : 6;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte6(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE6_OFFSET));
return returnValue;
	}

	public void setByte6(final byte byte6__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE6_OFFSET, byte6__);
	}

	private static final int BYTE7_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 7 : 7;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte7(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE7_OFFSET));
return returnValue;
	}

	public void setByte7(final byte byte7__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE7_OFFSET, byte7__);
	}

	private static final int BYTE8_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte8(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE8_OFFSET));
return returnValue;
	}

	public void setByte8(final byte byte8__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE8_OFFSET, byte8__);
	}

	private static final int BYTE9_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 9 : 9;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte9(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE9_OFFSET));
return returnValue;
	}

	public void setByte9(final byte byte9__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE9_OFFSET, byte9__);
	}

	private static final int BYTE10_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 10 : 10;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte10(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE10_OFFSET));
return returnValue;
	}

	public void setByte10(final byte byte10__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE10_OFFSET, byte10__);
	}

	private static final int BYTE11_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 11 : 11;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte11(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE11_OFFSET));
return returnValue;
	}

	public void setByte11(final byte byte11__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE11_OFFSET, byte11__);
	}

	private static final int BYTE12_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 12 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte12(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE12_OFFSET));
return returnValue;
	}

	public void setByte12(final byte byte12__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE12_OFFSET, byte12__);
	}

	private static final int BYTE13_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 13 : 13;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte13(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE13_OFFSET));
return returnValue;
	}

	public void setByte13(final byte byte13__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE13_OFFSET, byte13__);
	}

	private static final int BYTE14_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 14 : 14;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte14(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE14_OFFSET));
return returnValue;
	}

	public void setByte14(final byte byte14__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE14_OFFSET, byte14__);
	}

	private static final int BYTE15_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 15 : 15;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public byte byte15(){
final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(getRuntime(), this.raw.bufferPtr + BYTE15_OFFSET));
return returnValue;
	}

	public void setByte15(final byte byte15__){
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(getRuntime(), this.raw.bufferPtr + BYTE15_OFFSET, byte15__);
	}
}
