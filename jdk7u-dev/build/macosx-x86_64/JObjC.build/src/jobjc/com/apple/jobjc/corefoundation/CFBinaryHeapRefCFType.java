package com.apple.jobjc.corefoundation;

public  class CFBinaryHeapRefCFType extends com.apple.jobjc.CFType {
	public CFBinaryHeapRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFBinaryHeapRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFBinaryHeapGetTypeID();
	}
}
