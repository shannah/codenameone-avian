package com.apple.jobjc.appkit;

public final class NSEdgeInsets extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder){
		@Override protected NSEdgeInsets newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSEdgeInsets(runtime); }
	};

	NSEdgeInsets(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSEdgeInsets(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int TOP_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double top(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + TOP_OFFSET));
return returnValue;
	}

	public void setTop(final double top__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + TOP_OFFSET, top__);
	}

	private static final int LEFT_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double left(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + LEFT_OFFSET));
return returnValue;
	}

	public void setLeft(final double left__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + LEFT_OFFSET, left__);
	}

	private static final int BOTTOM_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double bottom(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + BOTTOM_OFFSET));
return returnValue;
	}

	public void setBottom(final double bottom__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + BOTTOM_OFFSET, bottom__);
	}

	private static final int RIGHT_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double right(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + RIGHT_OFFSET));
return returnValue;
	}

	public void setRight(final double right__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + RIGHT_OFFSET, right__);
	}
}
