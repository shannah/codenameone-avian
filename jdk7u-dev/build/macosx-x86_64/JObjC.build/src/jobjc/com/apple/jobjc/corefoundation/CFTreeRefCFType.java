package com.apple.jobjc.corefoundation;

public  class CFTreeRefCFType extends com.apple.jobjc.CFType {
	public CFTreeRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFTreeRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFTreeGetTypeID();
	}
}
