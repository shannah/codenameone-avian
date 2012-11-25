package com.apple.jobjc;

public  class MixedPrimitiveCoder extends java.lang.Object {
	public static final com.apple.jobjc.PrimitiveCoder ULongUIntCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.UIntCoder.INST : com.apple.jobjc.PrimitiveCoder.ULongCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder FloatDoubleCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST : com.apple.jobjc.PrimitiveCoder.FloatCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder SIntULongLongCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST : com.apple.jobjc.PrimitiveCoder.SIntCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder SLongSLongLongCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST : com.apple.jobjc.PrimitiveCoder.SLongCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder ULongULongLongCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST : com.apple.jobjc.PrimitiveCoder.ULongCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder SIntSLongLongCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST : com.apple.jobjc.PrimitiveCoder.SIntCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder SLongSIntCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.SIntCoder.INST : com.apple.jobjc.PrimitiveCoder.SLongCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder UIntULongLongCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST : com.apple.jobjc.PrimitiveCoder.UIntCoder.INST;
	public static final com.apple.jobjc.PrimitiveCoder SShortSIntCoder = com.apple.jobjc.JObjCRuntime.IS64 ? com.apple.jobjc.PrimitiveCoder.SIntCoder.INST : com.apple.jobjc.PrimitiveCoder.SShortCoder.INST;
}
