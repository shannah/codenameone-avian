package com.apple.jobjc.corefoundation;

public  class CFBundleRefCFType extends com.apple.jobjc.CFType {
	public CFBundleRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFBundleRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBundleGetTypeID();
	}
}
