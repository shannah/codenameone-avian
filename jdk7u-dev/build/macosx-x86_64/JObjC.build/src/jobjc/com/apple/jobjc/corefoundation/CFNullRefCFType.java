package com.apple.jobjc.corefoundation;

public  class CFNullRefCFType extends com.apple.jobjc.CFType {
	public CFNullRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFNullRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFNullGetTypeID();
	}
}
