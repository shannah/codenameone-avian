package com.apple.jobjc.corefoundation;

public  class CFWriteStreamRefCFType extends com.apple.jobjc.CFType {
	public CFWriteStreamRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFWriteStreamRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFWriteStreamGetTypeID();
	}
}
