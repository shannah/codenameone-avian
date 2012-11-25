package com.apple.jobjc.foundation;

public final class NSRect extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.foundation.NSPoint.getStructCoder(),
		com.apple.jobjc.foundation.NSSize.getStructCoder()){
		@Override protected NSRect newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSRect(runtime); }
	};

	NSRect(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSRect(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int ORIGIN_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	private com.apple.jobjc.foundation.NSPoint origin__ = null;
	public com.apple.jobjc.foundation.NSPoint origin(){
		if(null==origin__){
			this.raw.position(ORIGIN_OFFSET);
			origin__ = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint(this.raw.slice());
		}
		return origin__;
	}

	private static final int SIZE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	private com.apple.jobjc.foundation.NSSize size__ = null;
	public com.apple.jobjc.foundation.NSSize size(){
		if(null==size__){
			this.raw.position(SIZE_OFFSET);
			size__ = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize(this.raw.slice());
		}
		return size__;
	}
}
