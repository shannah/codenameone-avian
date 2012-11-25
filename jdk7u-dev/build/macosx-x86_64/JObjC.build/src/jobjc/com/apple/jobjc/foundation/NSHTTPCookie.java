package com.apple.jobjc.foundation;

public  class NSHTTPCookie extends com.apple.jobjc.foundation.NSObject {
	public NSHTTPCookie(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHTTPCookie(final NSHTTPCookie obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend comment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comment_IMetInst(){
		return ((comment_IMetInst != null)
	? (comment_IMetInst)
	: (comment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comment", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString comment(){
			final com.apple.jobjc.Invoke.MsgSend comment_IMetInst = get_comment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comment_IMetInst.init(nativeBuffer, this);
		comment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commentURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commentURL_IMetInst(){
		return ((commentURL_IMetInst != null)
	? (commentURL_IMetInst)
	: (commentURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commentURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL commentURL(){
			final com.apple.jobjc.Invoke.MsgSend commentURL_IMetInst = get_commentURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commentURL_IMetInst.init(nativeBuffer, this);
		commentURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend domain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_domain_IMetInst(){
		return ((domain_IMetInst != null)
	? (domain_IMetInst)
	: (domain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "domain", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString domain(){
			final com.apple.jobjc.Invoke.MsgSend domain_IMetInst = get_domain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		domain_IMetInst.init(nativeBuffer, this);
		domain_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expiresDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expiresDate_IMetInst(){
		return ((expiresDate_IMetInst != null)
	? (expiresDate_IMetInst)
	: (expiresDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expiresDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate expiresDate(){
			final com.apple.jobjc.Invoke.MsgSend expiresDate_IMetInst = get_expiresDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expiresDate_IMetInst.init(nativeBuffer, this);
		expiresDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithProperties_IMetInst(){
		return ((initWithProperties_IMetInst != null)
	? (initWithProperties_IMetInst)
	: (initWithProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithProperties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithProperties(final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend initWithProperties_IMetInst = get_initWithProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithProperties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		initWithProperties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHTTPOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHTTPOnly_IMetInst(){
		return ((isHTTPOnly_IMetInst != null)
	? (isHTTPOnly_IMetInst)
	: (isHTTPOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHTTPOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHTTPOnly(){
			final com.apple.jobjc.Invoke.MsgSend isHTTPOnly_IMetInst = get_isHTTPOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHTTPOnly_IMetInst.init(nativeBuffer, this);
		isHTTPOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSecure_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSecure_IMetInst(){
		return ((isSecure_IMetInst != null)
	? (isSecure_IMetInst)
	: (isSecure_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSecure", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSecure(){
			final com.apple.jobjc.Invoke.MsgSend isSecure_IMetInst = get_isSecure_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSecure_IMetInst.init(nativeBuffer, this);
		isSecure_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSessionOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSessionOnly_IMetInst(){
		return ((isSessionOnly_IMetInst != null)
	? (isSessionOnly_IMetInst)
	: (isSessionOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSessionOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSessionOnly(){
			final com.apple.jobjc.Invoke.MsgSend isSessionOnly_IMetInst = get_isSessionOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSessionOnly_IMetInst.init(nativeBuffer, this);
		isSessionOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend path_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_path_IMetInst(){
		return ((path_IMetInst != null)
	? (path_IMetInst)
	: (path_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "path", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString path(){
			final com.apple.jobjc.Invoke.MsgSend path_IMetInst = get_path_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		path_IMetInst.init(nativeBuffer, this);
		path_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portList_IMetInst(){
		return ((portList_IMetInst != null)
	? (portList_IMetInst)
	: (portList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portList", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray portList(){
			final com.apple.jobjc.Invoke.MsgSend portList_IMetInst = get_portList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portList_IMetInst.init(nativeBuffer, this);
		portList_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend properties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_properties_IMetInst(){
		return ((properties_IMetInst != null)
	? (properties_IMetInst)
	: (properties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "properties", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary properties(){
			final com.apple.jobjc.Invoke.MsgSend properties_IMetInst = get_properties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		properties_IMetInst.init(nativeBuffer, this);
		properties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_value_IMetInst(){
		return ((value_IMetInst != null)
	? (value_IMetInst)
	: (value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "value", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString value(){
			final com.apple.jobjc.Invoke.MsgSend value_IMetInst = get_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		value_IMetInst.init(nativeBuffer, this);
		value_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend versionLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_versionLong_IMetInst(){
		return ((versionLong_IMetInst != null)
	? (versionLong_IMetInst)
	: (versionLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "version", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long versionLong(){
			final com.apple.jobjc.Invoke.MsgSend versionLong_IMetInst = get_versionLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		versionLong_IMetInst.init(nativeBuffer, this);
		versionLong_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
