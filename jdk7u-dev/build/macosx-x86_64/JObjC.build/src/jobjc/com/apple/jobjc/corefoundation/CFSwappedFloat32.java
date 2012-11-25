package com.apple.jobjc.corefoundation;

public final class CFSwappedFloat32 extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST){
		@Override protected CFSwappedFloat32 newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFSwappedFloat32(runtime); }
	};

	CFSwappedFloat32(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFSwappedFloat32(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int V_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int v(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + V_OFFSET));
return returnValue;
	}

	public void setV(final int v__){
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + V_OFFSET, v__);
	}
}
