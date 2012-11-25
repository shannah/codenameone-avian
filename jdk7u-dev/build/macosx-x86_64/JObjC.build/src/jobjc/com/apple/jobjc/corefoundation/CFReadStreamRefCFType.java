package com.apple.jobjc.corefoundation;

public  class CFReadStreamRefCFType extends com.apple.jobjc.CFType {
	public CFReadStreamRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFReadStreamRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFReadStreamGetTypeID();
	}
}
