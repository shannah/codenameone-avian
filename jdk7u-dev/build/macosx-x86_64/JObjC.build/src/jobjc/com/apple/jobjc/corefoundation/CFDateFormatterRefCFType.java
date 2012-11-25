package com.apple.jobjc.corefoundation;

public  class CFDateFormatterRefCFType extends com.apple.jobjc.CFType {
	public CFDateFormatterRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFDateFormatterRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDateFormatterGetTypeID();
	}
}
