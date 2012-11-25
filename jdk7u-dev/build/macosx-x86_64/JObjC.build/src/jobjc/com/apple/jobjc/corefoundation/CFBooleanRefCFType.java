package com.apple.jobjc.corefoundation;

public  class CFBooleanRefCFType extends com.apple.jobjc.CFType {
	public CFBooleanRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFBooleanRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBooleanGetTypeID();
	}
}
