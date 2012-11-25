package com.apple.jobjc.foundation;

public final class NSHashEnumerator extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder,
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected NSHashEnumerator newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSHashEnumerator(runtime); }
	};

	NSHashEnumerator(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSHashEnumerator(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int _PI_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long _pi(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + _PI_OFFSET));
return returnValue;
	}

	public void set_pi(final long _pi__){
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(getRuntime(), this.raw.bufferPtr + _PI_OFFSET, _pi__);
	}

	private static final int _SI_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long _si(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + _SI_OFFSET));
return returnValue;
	}

	public void set_si(final long _si__){
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(getRuntime(), this.raw.bufferPtr + _SI_OFFSET, _si__);
	}

	private static final int _BS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFTypeRefCFType _bs(){
final com.apple.jobjc.corefoundation.CFTypeRefCFType returnValue = (com.apple.jobjc.corefoundation.CFTypeRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + _BS_OFFSET));
return returnValue;
	}

	public void set_bs(final com.apple.jobjc.corefoundation.CFTypeRefCFType _bs__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + _BS_OFFSET, _bs__);
	}
}
