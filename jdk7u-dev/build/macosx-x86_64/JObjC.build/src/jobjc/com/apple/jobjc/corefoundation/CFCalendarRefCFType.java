package com.apple.jobjc.corefoundation;

public  class CFCalendarRefCFType extends com.apple.jobjc.CFType {
	public CFCalendarRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFCalendarRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFCalendarGetTypeID();
	}
}
