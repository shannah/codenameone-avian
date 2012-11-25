package com.apple.jobjc.corefoundation;

public  class CFBagRefCFType extends com.apple.jobjc.CFType {
	public CFBagRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFBagRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBagGetTypeID();
	}
}
