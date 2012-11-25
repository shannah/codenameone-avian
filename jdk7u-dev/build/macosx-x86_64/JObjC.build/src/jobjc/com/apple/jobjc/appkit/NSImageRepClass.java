package com.apple.jobjc.appkit;

public  class NSImageRepClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSImageRepClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSImageRepClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSImageRepClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canInitWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithData_CMetInst(){
		return ((canInitWithData_CMetInst != null)
	? (canInitWithData_CMetInst)
	: (canInitWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend canInitWithData_CMetInst = get_canInitWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		canInitWithData_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithPasteboard_CMetInst(){
		return ((canInitWithPasteboard_CMetInst != null)
	? (canInitWithPasteboard_CMetInst)
	: (canInitWithPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst = get_canInitWithPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		canInitWithPasteboard_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageFileTypes_CMetInst(){
		return ((imageFileTypes_CMetInst != null)
	? (imageFileTypes_CMetInst)
	: (imageFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageFileTypes_CMetInst = get_imageFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageFileTypes_CMetInst.init(nativeBuffer, this);
		imageFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imagePasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imagePasteboardTypes_CMetInst(){
		return ((imagePasteboardTypes_CMetInst != null)
	? (imagePasteboardTypes_CMetInst)
	: (imagePasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imagePasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imagePasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend imagePasteboardTypes_CMetInst = get_imagePasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imagePasteboardTypes_CMetInst.init(nativeBuffer, this);
		imagePasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepClassForData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepClassForData_CMetInst(){
		return ((imageRepClassForData_CMetInst != null)
	? (imageRepClassForData_CMetInst)
	: (imageRepClassForData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepClassForData:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T imageRepClassForData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend imageRepClassForData_CMetInst = get_imageRepClassForData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepClassForData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		imageRepClassForData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepClassForFileType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepClassForFileType_CMetInst(){
		return ((imageRepClassForFileType_CMetInst != null)
	? (imageRepClassForFileType_CMetInst)
	: (imageRepClassForFileType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepClassForFileType:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T imageRepClassForFileType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend imageRepClassForFileType_CMetInst = get_imageRepClassForFileType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepClassForFileType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		imageRepClassForFileType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepClassForPasteboardType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepClassForPasteboardType_CMetInst(){
		return ((imageRepClassForPasteboardType_CMetInst != null)
	? (imageRepClassForPasteboardType_CMetInst)
	: (imageRepClassForPasteboardType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepClassForPasteboardType:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T imageRepClassForPasteboardType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend imageRepClassForPasteboardType_CMetInst = get_imageRepClassForPasteboardType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepClassForPasteboardType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		imageRepClassForPasteboardType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepClassForType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepClassForType_CMetInst(){
		return ((imageRepClassForType_CMetInst != null)
	? (imageRepClassForType_CMetInst)
	: (imageRepClassForType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepClassForType:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T imageRepClassForType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend imageRepClassForType_CMetInst = get_imageRepClassForType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepClassForType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		imageRepClassForType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithContentsOfFile_CMetInst(){
		return ((imageRepWithContentsOfFile_CMetInst != null)
	? (imageRepWithContentsOfFile_CMetInst)
	: (imageRepWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithContentsOfFile(final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithContentsOfFile_CMetInst = get_imageRepWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		imageRepWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithContentsOfURL_CMetInst(){
		return ((imageRepWithContentsOfURL_CMetInst != null)
	? (imageRepWithContentsOfURL_CMetInst)
	: (imageRepWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithContentsOfURL_CMetInst = get_imageRepWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		imageRepWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepWithPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithPasteboard_CMetInst(){
		return ((imageRepWithPasteboard_CMetInst != null)
	? (imageRepWithPasteboard_CMetInst)
	: (imageRepWithPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithPasteboard_CMetInst = get_imageRepWithPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		imageRepWithPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepsWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepsWithContentsOfFile_CMetInst(){
		return ((imageRepsWithContentsOfFile_CMetInst != null)
	? (imageRepsWithContentsOfFile_CMetInst)
	: (imageRepsWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepsWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageRepsWithContentsOfFile(final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend imageRepsWithContentsOfFile_CMetInst = get_imageRepsWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepsWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		imageRepsWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepsWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepsWithContentsOfURL_CMetInst(){
		return ((imageRepsWithContentsOfURL_CMetInst != null)
	? (imageRepsWithContentsOfURL_CMetInst)
	: (imageRepsWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepsWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageRepsWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend imageRepsWithContentsOfURL_CMetInst = get_imageRepsWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepsWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		imageRepsWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepsWithPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepsWithPasteboard_CMetInst(){
		return ((imageRepsWithPasteboard_CMetInst != null)
	? (imageRepsWithPasteboard_CMetInst)
	: (imageRepsWithPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepsWithPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageRepsWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend imageRepsWithPasteboard_CMetInst = get_imageRepsWithPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepsWithPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		imageRepsWithPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageTypes_CMetInst(){
		return ((imageTypes_CMetInst != null)
	? (imageTypes_CMetInst)
	: (imageTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageTypes_CMetInst = get_imageTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageTypes_CMetInst.init(nativeBuffer, this);
		imageTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredFileTypes_CMetInst(){
		return ((imageUnfilteredFileTypes_CMetInst != null)
	? (imageUnfilteredFileTypes_CMetInst)
	: (imageUnfilteredFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredFileTypes_CMetInst = get_imageUnfilteredFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredFileTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredPasteboardTypes_CMetInst(){
		return ((imageUnfilteredPasteboardTypes_CMetInst != null)
	? (imageUnfilteredPasteboardTypes_CMetInst)
	: (imageUnfilteredPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredPasteboardTypes_CMetInst = get_imageUnfilteredPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredPasteboardTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredTypes_CMetInst(){
		return ((imageUnfilteredTypes_CMetInst != null)
	? (imageUnfilteredTypes_CMetInst)
	: (imageUnfilteredTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredTypes_CMetInst = get_imageUnfilteredTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerImageRepClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerImageRepClass_CMetInst(){
		return ((registerImageRepClass_CMetInst != null)
	? (registerImageRepClass_CMetInst)
	: (registerImageRepClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerImageRepClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void registerImageRepClass(final com.apple.jobjc.NSClass imageRepClass){
			final com.apple.jobjc.Invoke.MsgSend registerImageRepClass_CMetInst = get_registerImageRepClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerImageRepClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, imageRepClass);
		registerImageRepClass_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registeredImageRepClasses_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registeredImageRepClasses_CMetInst(){
		return ((registeredImageRepClasses_CMetInst != null)
	? (registeredImageRepClasses_CMetInst)
	: (registeredImageRepClasses_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registeredImageRepClasses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray registeredImageRepClasses(){
			final com.apple.jobjc.Invoke.MsgSend registeredImageRepClasses_CMetInst = get_registeredImageRepClasses_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registeredImageRepClasses_CMetInst.init(nativeBuffer, this);
		registeredImageRepClasses_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unregisterImageRepClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unregisterImageRepClass_CMetInst(){
		return ((unregisterImageRepClass_CMetInst != null)
	? (unregisterImageRepClass_CMetInst)
	: (unregisterImageRepClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unregisterImageRepClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void unregisterImageRepClass(final com.apple.jobjc.NSClass imageRepClass){
			final com.apple.jobjc.Invoke.MsgSend unregisterImageRepClass_CMetInst = get_unregisterImageRepClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unregisterImageRepClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, imageRepClass);
		unregisterImageRepClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
