package com.apple.jobjc.corefoundation;

public  class CFURLRefCFType extends com.apple.jobjc.CFType {
	public CFURLRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFURLRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFURLGetTypeID();
	}
}
