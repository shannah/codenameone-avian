package com.apple.jobjc.appkit;

public  class NSSpeechRecognizer extends com.apple.jobjc.foundation.NSObject {
	public NSSpeechRecognizer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSpeechRecognizer(final NSSpeechRecognizer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend blocksOtherRecognizers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blocksOtherRecognizers_IMetInst(){
		return ((blocksOtherRecognizers_IMetInst != null)
	? (blocksOtherRecognizers_IMetInst)
	: (blocksOtherRecognizers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blocksOtherRecognizers", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean blocksOtherRecognizers(){
			final com.apple.jobjc.Invoke.MsgSend blocksOtherRecognizers_IMetInst = get_blocksOtherRecognizers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blocksOtherRecognizers_IMetInst.init(nativeBuffer, this);
		blocksOtherRecognizers_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commands_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commands_IMetInst(){
		return ((commands_IMetInst != null)
	? (commands_IMetInst)
	: (commands_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commands", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray commands(){
			final com.apple.jobjc.Invoke.MsgSend commands_IMetInst = get_commands_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commands_IMetInst.init(nativeBuffer, this);
		commands_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend displayedCommandsTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayedCommandsTitle_IMetInst(){
		return ((displayedCommandsTitle_IMetInst != null)
	? (displayedCommandsTitle_IMetInst)
	: (displayedCommandsTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayedCommandsTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayedCommandsTitle(){
			final com.apple.jobjc.Invoke.MsgSend displayedCommandsTitle_IMetInst = get_displayedCommandsTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayedCommandsTitle_IMetInst.init(nativeBuffer, this);
		displayedCommandsTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend listensInForegroundOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_listensInForegroundOnly_IMetInst(){
		return ((listensInForegroundOnly_IMetInst != null)
	? (listensInForegroundOnly_IMetInst)
	: (listensInForegroundOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "listensInForegroundOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean listensInForegroundOnly(){
			final com.apple.jobjc.Invoke.MsgSend listensInForegroundOnly_IMetInst = get_listensInForegroundOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		listensInForegroundOnly_IMetInst.init(nativeBuffer, this);
		listensInForegroundOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBlocksOtherRecognizers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBlocksOtherRecognizers_IMetInst(){
		return ((setBlocksOtherRecognizers_IMetInst != null)
	? (setBlocksOtherRecognizers_IMetInst)
	: (setBlocksOtherRecognizers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBlocksOtherRecognizers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBlocksOtherRecognizers(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBlocksOtherRecognizers_IMetInst = get_setBlocksOtherRecognizers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBlocksOtherRecognizers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBlocksOtherRecognizers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCommands_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCommands_IMetInst(){
		return ((setCommands_IMetInst != null)
	? (setCommands_IMetInst)
	: (setCommands_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCommands:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCommands(final com.apple.jobjc.foundation.NSArray commands){
			final com.apple.jobjc.Invoke.MsgSend setCommands_IMetInst = get_setCommands_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCommands_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commands);
		setCommands_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplayedCommandsTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplayedCommandsTitle_IMetInst(){
		return ((setDisplayedCommandsTitle_IMetInst != null)
	? (setDisplayedCommandsTitle_IMetInst)
	: (setDisplayedCommandsTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplayedCommandsTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDisplayedCommandsTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend setDisplayedCommandsTitle_IMetInst = get_setDisplayedCommandsTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplayedCommandsTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setDisplayedCommandsTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setListensInForegroundOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setListensInForegroundOnly_IMetInst(){
		return ((setListensInForegroundOnly_IMetInst != null)
	? (setListensInForegroundOnly_IMetInst)
	: (setListensInForegroundOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setListensInForegroundOnly:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setListensInForegroundOnly(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setListensInForegroundOnly_IMetInst = get_setListensInForegroundOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setListensInForegroundOnly_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setListensInForegroundOnly_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startListening_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startListening_IMetInst(){
		return ((startListening_IMetInst != null)
	? (startListening_IMetInst)
	: (startListening_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startListening", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void startListening(){
			final com.apple.jobjc.Invoke.MsgSend startListening_IMetInst = get_startListening_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startListening_IMetInst.init(nativeBuffer, this);
		startListening_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopListening_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopListening_IMetInst(){
		return ((stopListening_IMetInst != null)
	? (stopListening_IMetInst)
	: (stopListening_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopListening", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopListening(){
			final com.apple.jobjc.Invoke.MsgSend stopListening_IMetInst = get_stopListening_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopListening_IMetInst.init(nativeBuffer, this);
		stopListening_IMetInst.invoke(nativeBuffer);
		
		
	}

}
