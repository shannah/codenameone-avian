package com.apple.jobjc.corefoundation;

public  class CFAllocatorRefCFType extends com.apple.jobjc.CFType {
	public CFAllocatorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFAllocatorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFAllocatorGetTypeID();
	}
}
