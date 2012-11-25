package com.apple.jobjc.corefoundation;

public final class CFStreamError extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST){
		@Override protected CFStreamError newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFStreamError(runtime); }
	};

	CFStreamError(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFStreamError(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int DOMAIN_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long domain(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + DOMAIN_OFFSET));
return returnValue;
	}

	public void setDomain(final long domain__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + DOMAIN_OFFSET, domain__);
	}

	private static final int ERROR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int error(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + ERROR_OFFSET));
return returnValue;
	}

	public void setError(final int error__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + ERROR_OFFSET, error__);
	}
}
