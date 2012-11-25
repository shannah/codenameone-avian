package com.apple.jobjc.corefoundation;

public  class CFUUIDRefCFType extends com.apple.jobjc.CFType {
	public CFUUIDRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFUUIDRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFUUIDGetTypeID();
	}
}
