package com.apple.jobjc.corefoundation;

public  class CFMutableBagRefCFType extends com.apple.jobjc.CFType {
	public CFMutableBagRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableBagRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBagGetTypeID();
	}
}
