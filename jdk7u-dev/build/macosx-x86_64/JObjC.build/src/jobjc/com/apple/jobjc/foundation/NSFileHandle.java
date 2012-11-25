package com.apple.jobjc.foundation;

public  class NSFileHandle extends com.apple.jobjc.foundation.NSObject {
	public NSFileHandle(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileHandle(final NSFileHandle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptConnectionInBackgroundAndNotify_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptConnectionInBackgroundAndNotify_IMetInst(){
		return ((acceptConnectionInBackgroundAndNotify_IMetInst != null)
	? (acceptConnectionInBackgroundAndNotify_IMetInst)
	: (acceptConnectionInBackgroundAndNotify_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptConnectionInBackgroundAndNotify", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void acceptConnectionInBackgroundAndNotify(){
			final com.apple.jobjc.Invoke.MsgSend acceptConnectionInBackgroundAndNotify_IMetInst = get_acceptConnectionInBackgroundAndNotify_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptConnectionInBackgroundAndNotify_IMetInst.init(nativeBuffer, this);
		acceptConnectionInBackgroundAndNotify_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend acceptConnectionInBackgroundAndNotifyForModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptConnectionInBackgroundAndNotifyForModes_IMetInst(){
		return ((acceptConnectionInBackgroundAndNotifyForModes_IMetInst != null)
	? (acceptConnectionInBackgroundAndNotifyForModes_IMetInst)
	: (acceptConnectionInBackgroundAndNotifyForModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptConnectionInBackgroundAndNotifyForModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void acceptConnectionInBackgroundAndNotifyForModes(final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend acceptConnectionInBackgroundAndNotifyForModes_IMetInst = get_acceptConnectionInBackgroundAndNotifyForModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptConnectionInBackgroundAndNotifyForModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		acceptConnectionInBackgroundAndNotifyForModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend availableData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableData_IMetInst(){
		return ((availableData_IMetInst != null)
	? (availableData_IMetInst)
	: (availableData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData availableData(){
			final com.apple.jobjc.Invoke.MsgSend availableData_IMetInst = get_availableData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableData_IMetInst.init(nativeBuffer, this);
		availableData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend closeFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closeFile_IMetInst(){
		return ((closeFile_IMetInst != null)
	? (closeFile_IMetInst)
	: (closeFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closeFile", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void closeFile(){
			final com.apple.jobjc.Invoke.MsgSend closeFile_IMetInst = get_closeFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closeFile_IMetInst.init(nativeBuffer, this);
		closeFile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fileDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileDescriptor_IMetInst(){
		return ((fileDescriptor_IMetInst != null)
	? (fileDescriptor_IMetInst)
	: (fileDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileDescriptor", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int fileDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend fileDescriptor_IMetInst = get_fileDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileDescriptor_IMetInst.init(nativeBuffer, this);
		fileDescriptor_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFileDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFileDescriptor_IMetInst(){
		return ((initWithFileDescriptor_IMetInst != null)
	? (initWithFileDescriptor_IMetInst)
	: (initWithFileDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFileDescriptor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFileDescriptor(final int fd){
			final com.apple.jobjc.Invoke.MsgSend initWithFileDescriptor_IMetInst = get_initWithFileDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFileDescriptor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, fd);
		initWithFileDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFileDescriptor_closeOnDealloc_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFileDescriptor_closeOnDealloc_IMetInst(){
		return ((initWithFileDescriptor_closeOnDealloc_IMetInst != null)
	? (initWithFileDescriptor_closeOnDealloc_IMetInst)
	: (initWithFileDescriptor_closeOnDealloc_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFileDescriptor:closeOnDealloc:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFileDescriptor_closeOnDealloc(final int fd, final boolean closeopt){
			final com.apple.jobjc.Invoke.MsgSend initWithFileDescriptor_closeOnDealloc_IMetInst = get_initWithFileDescriptor_closeOnDealloc_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFileDescriptor_closeOnDealloc_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, fd);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, closeopt);
		initWithFileDescriptor_closeOnDealloc_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend offsetInFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_offsetInFile_IMetInst(){
		return ((offsetInFile_IMetInst != null)
	? (offsetInFile_IMetInst)
	: (offsetInFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "offsetInFile", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long offsetInFile(){
			final com.apple.jobjc.Invoke.MsgSend offsetInFile_IMetInst = get_offsetInFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		offsetInFile_IMetInst.init(nativeBuffer, this);
		offsetInFile_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readDataOfLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readDataOfLength_IMetInst(){
		return ((readDataOfLength_IMetInst != null)
	? (readDataOfLength_IMetInst)
	: (readDataOfLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readDataOfLength:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSData readDataOfLength(final long length){
			final com.apple.jobjc.Invoke.MsgSend readDataOfLength_IMetInst = get_readDataOfLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readDataOfLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		readDataOfLength_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readDataToEndOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readDataToEndOfFile_IMetInst(){
		return ((readDataToEndOfFile_IMetInst != null)
	? (readDataToEndOfFile_IMetInst)
	: (readDataToEndOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readDataToEndOfFile", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData readDataToEndOfFile(){
			final com.apple.jobjc.Invoke.MsgSend readDataToEndOfFile_IMetInst = get_readDataToEndOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readDataToEndOfFile_IMetInst.init(nativeBuffer, this);
		readDataToEndOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readInBackgroundAndNotify_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readInBackgroundAndNotify_IMetInst(){
		return ((readInBackgroundAndNotify_IMetInst != null)
	? (readInBackgroundAndNotify_IMetInst)
	: (readInBackgroundAndNotify_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readInBackgroundAndNotify", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void readInBackgroundAndNotify(){
			final com.apple.jobjc.Invoke.MsgSend readInBackgroundAndNotify_IMetInst = get_readInBackgroundAndNotify_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readInBackgroundAndNotify_IMetInst.init(nativeBuffer, this);
		readInBackgroundAndNotify_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readInBackgroundAndNotifyForModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readInBackgroundAndNotifyForModes_IMetInst(){
		return ((readInBackgroundAndNotifyForModes_IMetInst != null)
	? (readInBackgroundAndNotifyForModes_IMetInst)
	: (readInBackgroundAndNotifyForModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readInBackgroundAndNotifyForModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void readInBackgroundAndNotifyForModes(final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend readInBackgroundAndNotifyForModes_IMetInst = get_readInBackgroundAndNotifyForModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readInBackgroundAndNotifyForModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		readInBackgroundAndNotifyForModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readToEndOfFileInBackgroundAndNotify_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readToEndOfFileInBackgroundAndNotify_IMetInst(){
		return ((readToEndOfFileInBackgroundAndNotify_IMetInst != null)
	? (readToEndOfFileInBackgroundAndNotify_IMetInst)
	: (readToEndOfFileInBackgroundAndNotify_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readToEndOfFileInBackgroundAndNotify", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void readToEndOfFileInBackgroundAndNotify(){
			final com.apple.jobjc.Invoke.MsgSend readToEndOfFileInBackgroundAndNotify_IMetInst = get_readToEndOfFileInBackgroundAndNotify_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readToEndOfFileInBackgroundAndNotify_IMetInst.init(nativeBuffer, this);
		readToEndOfFileInBackgroundAndNotify_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readToEndOfFileInBackgroundAndNotifyForModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readToEndOfFileInBackgroundAndNotifyForModes_IMetInst(){
		return ((readToEndOfFileInBackgroundAndNotifyForModes_IMetInst != null)
	? (readToEndOfFileInBackgroundAndNotifyForModes_IMetInst)
	: (readToEndOfFileInBackgroundAndNotifyForModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readToEndOfFileInBackgroundAndNotifyForModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void readToEndOfFileInBackgroundAndNotifyForModes(final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend readToEndOfFileInBackgroundAndNotifyForModes_IMetInst = get_readToEndOfFileInBackgroundAndNotifyForModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readToEndOfFileInBackgroundAndNotifyForModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		readToEndOfFileInBackgroundAndNotifyForModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readabilityHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readabilityHandler_IMetInst(){
		return ((readabilityHandler_IMetInst != null)
	? (readabilityHandler_IMetInst)
	: (readabilityHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readabilityHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(NSFileHandle*) (@, @) */ readabilityHandler(){
			final com.apple.jobjc.Invoke.MsgSend readabilityHandler_IMetInst = get_readabilityHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readabilityHandler_IMetInst.init(nativeBuffer, this);
		readabilityHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(NSFileHandle*) (@, @) */ returnValue = (Object /* void(^)(NSFileHandle*) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend seekToEndOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_seekToEndOfFile_IMetInst(){
		return ((seekToEndOfFile_IMetInst != null)
	? (seekToEndOfFile_IMetInst)
	: (seekToEndOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "seekToEndOfFile", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long seekToEndOfFile(){
			final com.apple.jobjc.Invoke.MsgSend seekToEndOfFile_IMetInst = get_seekToEndOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		seekToEndOfFile_IMetInst.init(nativeBuffer, this);
		seekToEndOfFile_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend seekToFileOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_seekToFileOffset_IMetInst(){
		return ((seekToFileOffset_IMetInst != null)
	? (seekToFileOffset_IMetInst)
	: (seekToFileOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "seekToFileOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public void seekToFileOffset(final long offset){
			final com.apple.jobjc.Invoke.MsgSend seekToFileOffset_IMetInst = get_seekToFileOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		seekToFileOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, offset);
		seekToFileOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReadabilityHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReadabilityHandler_IMetInst(){
		return ((setReadabilityHandler_IMetInst != null)
	? (setReadabilityHandler_IMetInst)
	: (setReadabilityHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReadabilityHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setReadabilityHandler(final Object /* void(^)(NSFileHandle*) (@, @) */ readabilityHandler){
			final com.apple.jobjc.Invoke.MsgSend setReadabilityHandler_IMetInst = get_setReadabilityHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReadabilityHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, readabilityHandler);
		setReadabilityHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWriteabilityHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWriteabilityHandler_IMetInst(){
		return ((setWriteabilityHandler_IMetInst != null)
	? (setWriteabilityHandler_IMetInst)
	: (setWriteabilityHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWriteabilityHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setWriteabilityHandler(final Object /* void(^)(NSFileHandle*) (@, @) */ writeabilityHandler){
			final com.apple.jobjc.Invoke.MsgSend setWriteabilityHandler_IMetInst = get_setWriteabilityHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWriteabilityHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, writeabilityHandler);
		setWriteabilityHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend synchronizeFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_synchronizeFile_IMetInst(){
		return ((synchronizeFile_IMetInst != null)
	? (synchronizeFile_IMetInst)
	: (synchronizeFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "synchronizeFile", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void synchronizeFile(){
			final com.apple.jobjc.Invoke.MsgSend synchronizeFile_IMetInst = get_synchronizeFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		synchronizeFile_IMetInst.init(nativeBuffer, this);
		synchronizeFile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend truncateFileAtOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_truncateFileAtOffset_IMetInst(){
		return ((truncateFileAtOffset_IMetInst != null)
	? (truncateFileAtOffset_IMetInst)
	: (truncateFileAtOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "truncateFileAtOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public void truncateFileAtOffset(final long offset){
			final com.apple.jobjc.Invoke.MsgSend truncateFileAtOffset_IMetInst = get_truncateFileAtOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		truncateFileAtOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, offset);
		truncateFileAtOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend waitForDataInBackgroundAndNotify_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitForDataInBackgroundAndNotify_IMetInst(){
		return ((waitForDataInBackgroundAndNotify_IMetInst != null)
	? (waitForDataInBackgroundAndNotify_IMetInst)
	: (waitForDataInBackgroundAndNotify_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitForDataInBackgroundAndNotify", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void waitForDataInBackgroundAndNotify(){
			final com.apple.jobjc.Invoke.MsgSend waitForDataInBackgroundAndNotify_IMetInst = get_waitForDataInBackgroundAndNotify_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitForDataInBackgroundAndNotify_IMetInst.init(nativeBuffer, this);
		waitForDataInBackgroundAndNotify_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend waitForDataInBackgroundAndNotifyForModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitForDataInBackgroundAndNotifyForModes_IMetInst(){
		return ((waitForDataInBackgroundAndNotifyForModes_IMetInst != null)
	? (waitForDataInBackgroundAndNotifyForModes_IMetInst)
	: (waitForDataInBackgroundAndNotifyForModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitForDataInBackgroundAndNotifyForModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void waitForDataInBackgroundAndNotifyForModes(final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend waitForDataInBackgroundAndNotifyForModes_IMetInst = get_waitForDataInBackgroundAndNotifyForModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitForDataInBackgroundAndNotifyForModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		waitForDataInBackgroundAndNotifyForModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend writeData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeData_IMetInst(){
		return ((writeData_IMetInst != null)
	? (writeData_IMetInst)
	: (writeData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writeData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend writeData_IMetInst = get_writeData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		writeData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend writeabilityHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeabilityHandler_IMetInst(){
		return ((writeabilityHandler_IMetInst != null)
	? (writeabilityHandler_IMetInst)
	: (writeabilityHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeabilityHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(NSFileHandle*) (@, @) */ writeabilityHandler(){
			final com.apple.jobjc.Invoke.MsgSend writeabilityHandler_IMetInst = get_writeabilityHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeabilityHandler_IMetInst.init(nativeBuffer, this);
		writeabilityHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(NSFileHandle*) (@, @) */ returnValue = (Object /* void(^)(NSFileHandle*) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
