package com.apple.jobjc.corefoundation;

public  class CFBitVectorRefCFType extends com.apple.jobjc.CFType {
	public CFBitVectorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFBitVectorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBitVectorGetTypeID();
	}
}
