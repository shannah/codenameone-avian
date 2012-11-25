package com.apple.jobjc.corefoundation;

public  class CFMutableBitVectorRefCFType extends com.apple.jobjc.CFType {
	public CFMutableBitVectorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableBitVectorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBitVectorGetTypeID();
	}
}
