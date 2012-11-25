package com.apple.jobjc.corefoundation;

public  class CFFileDescriptorRefCFType extends com.apple.jobjc.CFType {
	public CFFileDescriptorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFFileDescriptorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFFileDescriptorGetTypeID();
	}
}
