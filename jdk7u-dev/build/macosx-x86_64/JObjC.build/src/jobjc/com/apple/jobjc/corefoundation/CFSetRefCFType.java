package com.apple.jobjc.corefoundation;

public  class CFSetRefCFType extends com.apple.jobjc.CFType {
	public CFSetRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFSetRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFSetGetTypeID();
	}
}
