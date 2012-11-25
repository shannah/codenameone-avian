package com.apple.jobjc.foundation;

public final class NSAffineTransformStruct extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 48 : 24;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder){
		@Override protected NSAffineTransformStruct newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSAffineTransformStruct(runtime); }
	};

	NSAffineTransformStruct(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSAffineTransformStruct(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int M11_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double m11(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + M11_OFFSET));
return returnValue;
	}

	public void setM11(final double m11__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + M11_OFFSET, m11__);
	}

	private static final int M12_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double m12(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + M12_OFFSET));
return returnValue;
	}

	public void setM12(final double m12__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + M12_OFFSET, m12__);
	}

	private static final int M21_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double m21(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + M21_OFFSET));
return returnValue;
	}

	public void setM21(final double m21__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + M21_OFFSET, m21__);
	}

	private static final int M22_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double m22(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + M22_OFFSET));
return returnValue;
	}

	public void setM22(final double m22__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + M22_OFFSET, m22__);
	}

	private static final int TX_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double tX(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + TX_OFFSET));
return returnValue;
	}

	public void setTX(final double tX__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + TX_OFFSET, tX__);
	}

	private static final int TY_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double tY(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + TY_OFFSET));
return returnValue;
	}

	public void setTY(final double tY__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + TY_OFFSET, tY__);
	}
}
