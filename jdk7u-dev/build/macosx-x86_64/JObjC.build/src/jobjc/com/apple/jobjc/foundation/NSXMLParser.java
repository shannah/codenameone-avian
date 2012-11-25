package com.apple.jobjc.foundation;

public  class NSXMLParser extends com.apple.jobjc.foundation.NSObject {
	public NSXMLParser(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLParser(final NSXMLParser obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend abortParsing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abortParsing_IMetInst(){
		return ((abortParsing_IMetInst != null)
	? (abortParsing_IMetInst)
	: (abortParsing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abortParsing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void abortParsing(){
			final com.apple.jobjc.Invoke.MsgSend abortParsing_IMetInst = get_abortParsing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abortParsing_IMetInst.init(nativeBuffer, this);
		abortParsing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend columnNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnNumber_IMetInst(){
		return ((columnNumber_IMetInst != null)
	? (columnNumber_IMetInst)
	: (columnNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long columnNumber(){
			final com.apple.jobjc.Invoke.MsgSend columnNumber_IMetInst = get_columnNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnNumber_IMetInst.init(nativeBuffer, this);
		columnNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithStream_IMetInst(){
		return ((initWithStream_IMetInst != null)
	? (initWithStream_IMetInst)
	: (initWithStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithStream:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithStream(final com.apple.jobjc.foundation.NSInputStream stream){
			final com.apple.jobjc.Invoke.MsgSend initWithStream_IMetInst = get_initWithStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithStream_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stream);
		initWithStream_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineNumber_IMetInst(){
		return ((lineNumber_IMetInst != null)
	? (lineNumber_IMetInst)
	: (lineNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long lineNumber(){
			final com.apple.jobjc.Invoke.MsgSend lineNumber_IMetInst = get_lineNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineNumber_IMetInst.init(nativeBuffer, this);
		lineNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parse_IMetInst(){
		return ((parse_IMetInst != null)
	? (parse_IMetInst)
	: (parse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parse", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean parse(){
			final com.apple.jobjc.Invoke.MsgSend parse_IMetInst = get_parse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parse_IMetInst.init(nativeBuffer, this);
		parse_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parserError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parserError_IMetInst(){
		return ((parserError_IMetInst != null)
	? (parserError_IMetInst)
	: (parserError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parserError", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError parserError(){
			final com.apple.jobjc.Invoke.MsgSend parserError_IMetInst = get_parserError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parserError_IMetInst.init(nativeBuffer, this);
		parserError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend publicID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_publicID_IMetInst(){
		return ((publicID_IMetInst != null)
	? (publicID_IMetInst)
	: (publicID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "publicID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString publicID(){
			final com.apple.jobjc.Invoke.MsgSend publicID_IMetInst = get_publicID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		publicID_IMetInst.init(nativeBuffer, this);
		publicID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldProcessNamespaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldProcessNamespaces_IMetInst(){
		return ((setShouldProcessNamespaces_IMetInst != null)
	? (setShouldProcessNamespaces_IMetInst)
	: (setShouldProcessNamespaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldProcessNamespaces:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldProcessNamespaces(final boolean shouldProcessNamespaces){
			final com.apple.jobjc.Invoke.MsgSend setShouldProcessNamespaces_IMetInst = get_setShouldProcessNamespaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldProcessNamespaces_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldProcessNamespaces);
		setShouldProcessNamespaces_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldReportNamespacePrefixes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldReportNamespacePrefixes_IMetInst(){
		return ((setShouldReportNamespacePrefixes_IMetInst != null)
	? (setShouldReportNamespacePrefixes_IMetInst)
	: (setShouldReportNamespacePrefixes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldReportNamespacePrefixes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldReportNamespacePrefixes(final boolean shouldReportNamespacePrefixes){
			final com.apple.jobjc.Invoke.MsgSend setShouldReportNamespacePrefixes_IMetInst = get_setShouldReportNamespacePrefixes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldReportNamespacePrefixes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldReportNamespacePrefixes);
		setShouldReportNamespacePrefixes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldResolveExternalEntities_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldResolveExternalEntities_IMetInst(){
		return ((setShouldResolveExternalEntities_IMetInst != null)
	? (setShouldResolveExternalEntities_IMetInst)
	: (setShouldResolveExternalEntities_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldResolveExternalEntities:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldResolveExternalEntities(final boolean shouldResolveExternalEntities){
			final com.apple.jobjc.Invoke.MsgSend setShouldResolveExternalEntities_IMetInst = get_setShouldResolveExternalEntities_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldResolveExternalEntities_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldResolveExternalEntities);
		setShouldResolveExternalEntities_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldProcessNamespaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldProcessNamespaces_IMetInst(){
		return ((shouldProcessNamespaces_IMetInst != null)
	? (shouldProcessNamespaces_IMetInst)
	: (shouldProcessNamespaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldProcessNamespaces", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldProcessNamespaces(){
			final com.apple.jobjc.Invoke.MsgSend shouldProcessNamespaces_IMetInst = get_shouldProcessNamespaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldProcessNamespaces_IMetInst.init(nativeBuffer, this);
		shouldProcessNamespaces_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldReportNamespacePrefixes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldReportNamespacePrefixes_IMetInst(){
		return ((shouldReportNamespacePrefixes_IMetInst != null)
	? (shouldReportNamespacePrefixes_IMetInst)
	: (shouldReportNamespacePrefixes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldReportNamespacePrefixes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldReportNamespacePrefixes(){
			final com.apple.jobjc.Invoke.MsgSend shouldReportNamespacePrefixes_IMetInst = get_shouldReportNamespacePrefixes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldReportNamespacePrefixes_IMetInst.init(nativeBuffer, this);
		shouldReportNamespacePrefixes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldResolveExternalEntities_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldResolveExternalEntities_IMetInst(){
		return ((shouldResolveExternalEntities_IMetInst != null)
	? (shouldResolveExternalEntities_IMetInst)
	: (shouldResolveExternalEntities_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldResolveExternalEntities", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldResolveExternalEntities(){
			final com.apple.jobjc.Invoke.MsgSend shouldResolveExternalEntities_IMetInst = get_shouldResolveExternalEntities_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldResolveExternalEntities_IMetInst.init(nativeBuffer, this);
		shouldResolveExternalEntities_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemID_IMetInst(){
		return ((systemID_IMetInst != null)
	? (systemID_IMetInst)
	: (systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString systemID(){
			final com.apple.jobjc.Invoke.MsgSend systemID_IMetInst = get_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemID_IMetInst.init(nativeBuffer, this);
		systemID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
