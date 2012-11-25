package com.apple.jobjc.corefoundation;

public  class CFURLEnumeratorRefCFType extends com.apple.jobjc.CFType {
	public CFURLEnumeratorRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFURLEnumeratorRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFURLEnumeratorGetTypeID();
	}
}
