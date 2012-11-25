package com.apple.jobjc.foundation;

public  class NSXMLNode extends com.apple.jobjc.foundation.NSObject {
	public NSXMLNode(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLNode(final NSXMLNode obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URI_IMetInst(){
		return ((URI_IMetInst != null)
	? (URI_IMetInst)
	: (URI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URI", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString URI(){
			final com.apple.jobjc.Invoke.MsgSend URI_IMetInst = get_URI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URI_IMetInst.init(nativeBuffer, this);
		URI_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend XMLString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_XMLString_IMetInst(){
		return ((XMLString_IMetInst != null)
	? (XMLString_IMetInst)
	: (XMLString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "XMLString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString XMLString(){
			final com.apple.jobjc.Invoke.MsgSend XMLString_IMetInst = get_XMLString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		XMLString_IMetInst.init(nativeBuffer, this);
		XMLString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend XMLStringWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_XMLStringWithOptions_IMetInst(){
		return ((XMLStringWithOptions_IMetInst != null)
	? (XMLStringWithOptions_IMetInst)
	: (XMLStringWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "XMLStringWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString XMLStringWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend XMLStringWithOptions_IMetInst = get_XMLStringWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		XMLStringWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		XMLStringWithOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend XPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_XPath_IMetInst(){
		return ((XPath_IMetInst != null)
	? (XPath_IMetInst)
	: (XPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "XPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString XPath(){
			final com.apple.jobjc.Invoke.MsgSend XPath_IMetInst = get_XPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		XPath_IMetInst.init(nativeBuffer, this);
		XPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canonicalXMLStringPreservingComments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canonicalXMLStringPreservingComments_IMetInst(){
		return ((canonicalXMLStringPreservingComments_IMetInst != null)
	? (canonicalXMLStringPreservingComments_IMetInst)
	: (canonicalXMLStringPreservingComments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canonicalXMLStringPreservingComments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString canonicalXMLStringPreservingComments(final boolean comments){
			final com.apple.jobjc.Invoke.MsgSend canonicalXMLStringPreservingComments_IMetInst = get_canonicalXMLStringPreservingComments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canonicalXMLStringPreservingComments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, comments);
		canonicalXMLStringPreservingComments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend childAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childAtIndex_IMetInst(){
		return ((childAtIndex_IMetInst != null)
	? (childAtIndex_IMetInst)
	: (childAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode childAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend childAtIndex_IMetInst = get_childAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		childAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend childCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childCount_IMetInst(){
		return ((childCount_IMetInst != null)
	? (childCount_IMetInst)
	: (childCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long childCount(){
			final com.apple.jobjc.Invoke.MsgSend childCount_IMetInst = get_childCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childCount_IMetInst.init(nativeBuffer, this);
		childCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend children_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_children_IMetInst(){
		return ((children_IMetInst != null)
	? (children_IMetInst)
	: (children_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "children", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray children(){
			final com.apple.jobjc.Invoke.MsgSend children_IMetInst = get_children_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		children_IMetInst.init(nativeBuffer, this);
		children_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend detach_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detach_IMetInst(){
		return ((detach_IMetInst != null)
	? (detach_IMetInst)
	: (detach_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detach", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void detach(){
			final com.apple.jobjc.Invoke.MsgSend detach_IMetInst = get_detach_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detach_IMetInst.init(nativeBuffer, this);
		detach_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend index_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_index_IMetInst(){
		return ((index_IMetInst != null)
	? (index_IMetInst)
	: (index_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "index", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long index(){
			final com.apple.jobjc.Invoke.MsgSend index_IMetInst = get_index_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		index_IMetInst.init(nativeBuffer, this);
		index_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKind_IMetInst(){
		return ((initWithKind_IMetInst != null)
	? (initWithKind_IMetInst)
	: (initWithKind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKind:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKind(final long kind){
			final com.apple.jobjc.Invoke.MsgSend initWithKind_IMetInst = get_initWithKind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKind_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, kind);
		initWithKind_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKind_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKind_options_IMetInst(){
		return ((initWithKind_options_IMetInst != null)
	? (initWithKind_options_IMetInst)
	: (initWithKind_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKind:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKind_options(final long kind, final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithKind_options_IMetInst = get_initWithKind_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKind_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, kind);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithKind_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend kind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_kind_IMetInst(){
		return ((kind_IMetInst != null)
	? (kind_IMetInst)
	: (kind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "kind", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long kind(){
			final com.apple.jobjc.Invoke.MsgSend kind_IMetInst = get_kind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		kind_IMetInst.init(nativeBuffer, this);
		kind_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend level_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_level_IMetInst(){
		return ((level_IMetInst != null)
	? (level_IMetInst)
	: (level_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "level", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long level(){
			final com.apple.jobjc.Invoke.MsgSend level_IMetInst = get_level_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		level_IMetInst.init(nativeBuffer, this);
		level_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localName_IMetInst(){
		return ((localName_IMetInst != null)
	? (localName_IMetInst)
	: (localName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localName(){
			final com.apple.jobjc.Invoke.MsgSend localName_IMetInst = get_localName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localName_IMetInst.init(nativeBuffer, this);
		localName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend nextNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextNode_IMetInst(){
		return ((nextNode_IMetInst != null)
	? (nextNode_IMetInst)
	: (nextNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextNode", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode nextNode(){
			final com.apple.jobjc.Invoke.MsgSend nextNode_IMetInst = get_nextNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextNode_IMetInst.init(nativeBuffer, this);
		nextNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextSibling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextSibling_IMetInst(){
		return ((nextSibling_IMetInst != null)
	? (nextSibling_IMetInst)
	: (nextSibling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextSibling", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode nextSibling(){
			final com.apple.jobjc.Invoke.MsgSend nextSibling_IMetInst = get_nextSibling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextSibling_IMetInst.init(nativeBuffer, this);
		nextSibling_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nodesForXPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nodesForXPath_error_IMetInst(){
		return ((nodesForXPath_error_IMetInst != null)
	? (nodesForXPath_error_IMetInst)
	: (nodesForXPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nodesForXPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray nodesForXPath_error(final com.apple.jobjc.foundation.NSString xpath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend nodesForXPath_error_IMetInst = get_nodesForXPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nodesForXPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xpath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		nodesForXPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectValue_IMetInst(){
		return ((objectValue_IMetInst != null)
	? (objectValue_IMetInst)
	: (objectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectValue(){
			final com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst = get_objectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectValue_IMetInst.init(nativeBuffer, this);
		objectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsForXQuery_constants_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsForXQuery_constants_error_IMetInst(){
		return ((objectsForXQuery_constants_error_IMetInst != null)
	? (objectsForXQuery_constants_error_IMetInst)
	: (objectsForXQuery_constants_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsForXQuery:constants:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray objectsForXQuery_constants_error(final com.apple.jobjc.foundation.NSString xquery, final com.apple.jobjc.foundation.NSDictionary constants, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend objectsForXQuery_constants_error_IMetInst = get_objectsForXQuery_constants_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsForXQuery_constants_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xquery);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constants);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		objectsForXQuery_constants_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsForXQuery_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsForXQuery_error_IMetInst(){
		return ((objectsForXQuery_error_IMetInst != null)
	? (objectsForXQuery_error_IMetInst)
	: (objectsForXQuery_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsForXQuery:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray objectsForXQuery_error(final com.apple.jobjc.foundation.NSString xquery, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend objectsForXQuery_error_IMetInst = get_objectsForXQuery_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsForXQuery_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xquery);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		objectsForXQuery_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parent_IMetInst(){
		return ((parent_IMetInst != null)
	? (parent_IMetInst)
	: (parent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode parent(){
			final com.apple.jobjc.Invoke.MsgSend parent_IMetInst = get_parent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parent_IMetInst.init(nativeBuffer, this);
		parent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prefix_IMetInst(){
		return ((prefix_IMetInst != null)
	? (prefix_IMetInst)
	: (prefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prefix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString prefix(){
			final com.apple.jobjc.Invoke.MsgSend prefix_IMetInst = get_prefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prefix_IMetInst.init(nativeBuffer, this);
		prefix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend previousNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_previousNode_IMetInst(){
		return ((previousNode_IMetInst != null)
	? (previousNode_IMetInst)
	: (previousNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "previousNode", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode previousNode(){
			final com.apple.jobjc.Invoke.MsgSend previousNode_IMetInst = get_previousNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		previousNode_IMetInst.init(nativeBuffer, this);
		previousNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend previousSibling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_previousSibling_IMetInst(){
		return ((previousSibling_IMetInst != null)
	? (previousSibling_IMetInst)
	: (previousSibling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "previousSibling", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode previousSibling(){
			final com.apple.jobjc.Invoke.MsgSend previousSibling_IMetInst = get_previousSibling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		previousSibling_IMetInst.init(nativeBuffer, this);
		previousSibling_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rootDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootDocument_IMetInst(){
		return ((rootDocument_IMetInst != null)
	? (rootDocument_IMetInst)
	: (rootDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootDocument", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDocument rootDocument(){
			final com.apple.jobjc.Invoke.MsgSend rootDocument_IMetInst = get_rootDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootDocument_IMetInst.init(nativeBuffer, this);
		rootDocument_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDocument returnValue = (com.apple.jobjc.foundation.NSXMLDocument) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setName_IMetInst(){
		return ((setName_IMetInst != null)
	? (setName_IMetInst)
	: (setName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setName_IMetInst = get_setName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectValue_IMetInst(){
		return ((setObjectValue_IMetInst != null)
	? (setObjectValue_IMetInst)
	: (setObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObjectValue(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst = get_setObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStringValue_IMetInst(){
		return ((setStringValue_IMetInst != null)
	? (setStringValue_IMetInst)
	: (setStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStringValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStringValue(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setStringValue_IMetInst = get_setStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setStringValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStringValue_resolvingEntities_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStringValue_resolvingEntities_IMetInst(){
		return ((setStringValue_resolvingEntities_IMetInst != null)
	? (setStringValue_resolvingEntities_IMetInst)
	: (setStringValue_resolvingEntities_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStringValue:resolvingEntities:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setStringValue_resolvingEntities(final com.apple.jobjc.foundation.NSString string, final boolean resolve){
			final com.apple.jobjc.Invoke.MsgSend setStringValue_resolvingEntities_IMetInst = get_setStringValue_resolvingEntities_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStringValue_resolvingEntities_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, resolve);
		setStringValue_resolvingEntities_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setURI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setURI_IMetInst(){
		return ((setURI_IMetInst != null)
	? (setURI_IMetInst)
	: (setURI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setURI:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setURI(final com.apple.jobjc.foundation.NSString URI){
			final com.apple.jobjc.Invoke.MsgSend setURI_IMetInst = get_setURI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setURI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		setURI_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringValue_IMetInst(){
		return ((stringValue_IMetInst != null)
	? (stringValue_IMetInst)
	: (stringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringValue(){
			final com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst = get_stringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringValue_IMetInst.init(nativeBuffer, this);
		stringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
