package com.apple.jobjc.corefoundation;

public  class CFErrorRefCFType extends com.apple.jobjc.CFType {
	public CFErrorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFErrorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFErrorGetTypeID();
	}
}
