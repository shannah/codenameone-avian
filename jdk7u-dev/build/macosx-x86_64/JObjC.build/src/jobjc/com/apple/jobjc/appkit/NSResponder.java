package com.apple.jobjc.appkit;

public  class NSResponder extends com.apple.jobjc.foundation.NSObject {
	public NSResponder(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSResponder(final NSResponder obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsFirstResponder_IMetInst(){
		return ((acceptsFirstResponder_IMetInst != null)
	? (acceptsFirstResponder_IMetInst)
	: (acceptsFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst = get_acceptsFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsFirstResponder_IMetInst.init(nativeBuffer, this);
		acceptsFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend becomeFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_becomeFirstResponder_IMetInst(){
		return ((becomeFirstResponder_IMetInst != null)
	? (becomeFirstResponder_IMetInst)
	: (becomeFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "becomeFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean becomeFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend becomeFirstResponder_IMetInst = get_becomeFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		becomeFirstResponder_IMetInst.init(nativeBuffer, this);
		becomeFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginGestureWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginGestureWithEvent_IMetInst(){
		return ((beginGestureWithEvent_IMetInst != null)
	? (beginGestureWithEvent_IMetInst)
	: (beginGestureWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginGestureWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void beginGestureWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend beginGestureWithEvent_IMetInst = get_beginGestureWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginGestureWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		beginGestureWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelOperation_IMetInst(){
		return ((cancelOperation_IMetInst != null)
	? (cancelOperation_IMetInst)
	: (cancelOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelOperation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend cancelOperation_IMetInst = get_cancelOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		cancelOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend capitalizeWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capitalizeWord_IMetInst(){
		return ((capitalizeWord_IMetInst != null)
	? (capitalizeWord_IMetInst)
	: (capitalizeWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capitalizeWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void capitalizeWord(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend capitalizeWord_IMetInst = get_capitalizeWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capitalizeWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		capitalizeWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend centerSelectionInVisibleArea_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_centerSelectionInVisibleArea_IMetInst(){
		return ((centerSelectionInVisibleArea_IMetInst != null)
	? (centerSelectionInVisibleArea_IMetInst)
	: (centerSelectionInVisibleArea_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "centerSelectionInVisibleArea:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void centerSelectionInVisibleArea(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend centerSelectionInVisibleArea_IMetInst = get_centerSelectionInVisibleArea_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		centerSelectionInVisibleArea_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		centerSelectionInVisibleArea_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeCaseOfLetter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeCaseOfLetter_IMetInst(){
		return ((changeCaseOfLetter_IMetInst != null)
	? (changeCaseOfLetter_IMetInst)
	: (changeCaseOfLetter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeCaseOfLetter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeCaseOfLetter(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeCaseOfLetter_IMetInst = get_changeCaseOfLetter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeCaseOfLetter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeCaseOfLetter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend complete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_complete_IMetInst(){
		return ((complete_IMetInst != null)
	? (complete_IMetInst)
	: (complete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "complete:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void complete(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend complete_IMetInst = get_complete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		complete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		complete_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cursorUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cursorUpdate_IMetInst(){
		return ((cursorUpdate_IMetInst != null)
	? (cursorUpdate_IMetInst)
	: (cursorUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cursorUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cursorUpdate(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend cursorUpdate_IMetInst = get_cursorUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cursorUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		cursorUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteBackward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteBackward_IMetInst(){
		return ((deleteBackward_IMetInst != null)
	? (deleteBackward_IMetInst)
	: (deleteBackward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteBackward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteBackward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteBackward_IMetInst = get_deleteBackward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteBackward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteBackward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteBackwardByDecomposingPreviousCharacter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteBackwardByDecomposingPreviousCharacter_IMetInst(){
		return ((deleteBackwardByDecomposingPreviousCharacter_IMetInst != null)
	? (deleteBackwardByDecomposingPreviousCharacter_IMetInst)
	: (deleteBackwardByDecomposingPreviousCharacter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteBackwardByDecomposingPreviousCharacter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteBackwardByDecomposingPreviousCharacter(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteBackwardByDecomposingPreviousCharacter_IMetInst = get_deleteBackwardByDecomposingPreviousCharacter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteBackwardByDecomposingPreviousCharacter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteBackwardByDecomposingPreviousCharacter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteForward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteForward_IMetInst(){
		return ((deleteForward_IMetInst != null)
	? (deleteForward_IMetInst)
	: (deleteForward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteForward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteForward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteForward_IMetInst = get_deleteForward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteForward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteForward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteToBeginningOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteToBeginningOfLine_IMetInst(){
		return ((deleteToBeginningOfLine_IMetInst != null)
	? (deleteToBeginningOfLine_IMetInst)
	: (deleteToBeginningOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteToBeginningOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteToBeginningOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteToBeginningOfLine_IMetInst = get_deleteToBeginningOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteToBeginningOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteToBeginningOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteToBeginningOfParagraph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteToBeginningOfParagraph_IMetInst(){
		return ((deleteToBeginningOfParagraph_IMetInst != null)
	? (deleteToBeginningOfParagraph_IMetInst)
	: (deleteToBeginningOfParagraph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteToBeginningOfParagraph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteToBeginningOfParagraph(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteToBeginningOfParagraph_IMetInst = get_deleteToBeginningOfParagraph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteToBeginningOfParagraph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteToBeginningOfParagraph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteToEndOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteToEndOfLine_IMetInst(){
		return ((deleteToEndOfLine_IMetInst != null)
	? (deleteToEndOfLine_IMetInst)
	: (deleteToEndOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteToEndOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteToEndOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteToEndOfLine_IMetInst = get_deleteToEndOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteToEndOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteToEndOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteToEndOfParagraph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteToEndOfParagraph_IMetInst(){
		return ((deleteToEndOfParagraph_IMetInst != null)
	? (deleteToEndOfParagraph_IMetInst)
	: (deleteToEndOfParagraph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteToEndOfParagraph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteToEndOfParagraph(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteToEndOfParagraph_IMetInst = get_deleteToEndOfParagraph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteToEndOfParagraph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteToEndOfParagraph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteToMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteToMark_IMetInst(){
		return ((deleteToMark_IMetInst != null)
	? (deleteToMark_IMetInst)
	: (deleteToMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteToMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteToMark(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteToMark_IMetInst = get_deleteToMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteToMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteToMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteWordBackward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteWordBackward_IMetInst(){
		return ((deleteWordBackward_IMetInst != null)
	? (deleteWordBackward_IMetInst)
	: (deleteWordBackward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteWordBackward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteWordBackward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteWordBackward_IMetInst = get_deleteWordBackward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteWordBackward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteWordBackward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteWordForward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteWordForward_IMetInst(){
		return ((deleteWordForward_IMetInst != null)
	? (deleteWordForward_IMetInst)
	: (deleteWordForward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteWordForward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteWordForward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deleteWordForward_IMetInst = get_deleteWordForward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteWordForward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deleteWordForward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doCommandBySelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doCommandBySelector_IMetInst(){
		return ((doCommandBySelector_IMetInst != null)
	? (doCommandBySelector_IMetInst)
	: (doCommandBySelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doCommandBySelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void doCommandBySelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend doCommandBySelector_IMetInst = get_doCommandBySelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doCommandBySelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		doCommandBySelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRestorableStateWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRestorableStateWithCoder_IMetInst(){
		return ((encodeRestorableStateWithCoder_IMetInst != null)
	? (encodeRestorableStateWithCoder_IMetInst)
	: (encodeRestorableStateWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRestorableStateWithCoder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeRestorableStateWithCoder(final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend encodeRestorableStateWithCoder_IMetInst = get_encodeRestorableStateWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRestorableStateWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		encodeRestorableStateWithCoder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endGestureWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endGestureWithEvent_IMetInst(){
		return ((endGestureWithEvent_IMetInst != null)
	? (endGestureWithEvent_IMetInst)
	: (endGestureWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endGestureWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void endGestureWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend endGestureWithEvent_IMetInst = get_endGestureWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endGestureWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		endGestureWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend flagsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flagsChanged_IMetInst(){
		return ((flagsChanged_IMetInst != null)
	? (flagsChanged_IMetInst)
	: (flagsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flagsChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void flagsChanged(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend flagsChanged_IMetInst = get_flagsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flagsChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		flagsChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend flushBufferedKeyEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushBufferedKeyEvents_IMetInst(){
		return ((flushBufferedKeyEvents_IMetInst != null)
	? (flushBufferedKeyEvents_IMetInst)
	: (flushBufferedKeyEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushBufferedKeyEvents", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushBufferedKeyEvents(){
			final com.apple.jobjc.Invoke.MsgSend flushBufferedKeyEvents_IMetInst = get_flushBufferedKeyEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushBufferedKeyEvents_IMetInst.init(nativeBuffer, this);
		flushBufferedKeyEvents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend helpRequested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_helpRequested_IMetInst(){
		return ((helpRequested_IMetInst != null)
	? (helpRequested_IMetInst)
	: (helpRequested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "helpRequested:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void helpRequested(final com.apple.jobjc.appkit.NSEvent eventPtr){
			final com.apple.jobjc.Invoke.MsgSend helpRequested_IMetInst = get_helpRequested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		helpRequested_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, eventPtr);
		helpRequested_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indent_IMetInst(){
		return ((indent_IMetInst != null)
	? (indent_IMetInst)
	: (indent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void indent(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend indent_IMetInst = get_indent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		indent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertBacktab_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertBacktab_IMetInst(){
		return ((insertBacktab_IMetInst != null)
	? (insertBacktab_IMetInst)
	: (insertBacktab_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertBacktab:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertBacktab(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertBacktab_IMetInst = get_insertBacktab_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertBacktab_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertBacktab_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertContainerBreak_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertContainerBreak_IMetInst(){
		return ((insertContainerBreak_IMetInst != null)
	? (insertContainerBreak_IMetInst)
	: (insertContainerBreak_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertContainerBreak:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertContainerBreak(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertContainerBreak_IMetInst = get_insertContainerBreak_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertContainerBreak_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertContainerBreak_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertDoubleQuoteIgnoringSubstitution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertDoubleQuoteIgnoringSubstitution_IMetInst(){
		return ((insertDoubleQuoteIgnoringSubstitution_IMetInst != null)
	? (insertDoubleQuoteIgnoringSubstitution_IMetInst)
	: (insertDoubleQuoteIgnoringSubstitution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertDoubleQuoteIgnoringSubstitution:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertDoubleQuoteIgnoringSubstitution(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertDoubleQuoteIgnoringSubstitution_IMetInst = get_insertDoubleQuoteIgnoringSubstitution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertDoubleQuoteIgnoringSubstitution_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertDoubleQuoteIgnoringSubstitution_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertLineBreak_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertLineBreak_IMetInst(){
		return ((insertLineBreak_IMetInst != null)
	? (insertLineBreak_IMetInst)
	: (insertLineBreak_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertLineBreak:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertLineBreak(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertLineBreak_IMetInst = get_insertLineBreak_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertLineBreak_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertLineBreak_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertNewline_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertNewline_IMetInst(){
		return ((insertNewline_IMetInst != null)
	? (insertNewline_IMetInst)
	: (insertNewline_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertNewline:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertNewline(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertNewline_IMetInst = get_insertNewline_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertNewline_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertNewline_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertNewlineIgnoringFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertNewlineIgnoringFieldEditor_IMetInst(){
		return ((insertNewlineIgnoringFieldEditor_IMetInst != null)
	? (insertNewlineIgnoringFieldEditor_IMetInst)
	: (insertNewlineIgnoringFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertNewlineIgnoringFieldEditor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertNewlineIgnoringFieldEditor(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertNewlineIgnoringFieldEditor_IMetInst = get_insertNewlineIgnoringFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertNewlineIgnoringFieldEditor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertNewlineIgnoringFieldEditor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertParagraphSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertParagraphSeparator_IMetInst(){
		return ((insertParagraphSeparator_IMetInst != null)
	? (insertParagraphSeparator_IMetInst)
	: (insertParagraphSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertParagraphSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertParagraphSeparator(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertParagraphSeparator_IMetInst = get_insertParagraphSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertParagraphSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertParagraphSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertSingleQuoteIgnoringSubstitution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertSingleQuoteIgnoringSubstitution_IMetInst(){
		return ((insertSingleQuoteIgnoringSubstitution_IMetInst != null)
	? (insertSingleQuoteIgnoringSubstitution_IMetInst)
	: (insertSingleQuoteIgnoringSubstitution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertSingleQuoteIgnoringSubstitution:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertSingleQuoteIgnoringSubstitution(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertSingleQuoteIgnoringSubstitution_IMetInst = get_insertSingleQuoteIgnoringSubstitution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertSingleQuoteIgnoringSubstitution_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertSingleQuoteIgnoringSubstitution_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertTab_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertTab_IMetInst(){
		return ((insertTab_IMetInst != null)
	? (insertTab_IMetInst)
	: (insertTab_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertTab:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertTab(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertTab_IMetInst = get_insertTab_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertTab_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertTab_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertTabIgnoringFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertTabIgnoringFieldEditor_IMetInst(){
		return ((insertTabIgnoringFieldEditor_IMetInst != null)
	? (insertTabIgnoringFieldEditor_IMetInst)
	: (insertTabIgnoringFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertTabIgnoringFieldEditor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertTabIgnoringFieldEditor(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertTabIgnoringFieldEditor_IMetInst = get_insertTabIgnoringFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertTabIgnoringFieldEditor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertTabIgnoringFieldEditor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertText_IMetInst(){
		return ((insertText_IMetInst != null)
	? (insertText_IMetInst)
	: (insertText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertText(final com.apple.jobjc.ID insertString){
			final com.apple.jobjc.Invoke.MsgSend insertText_IMetInst = get_insertText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, insertString);
		insertText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend interfaceStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interfaceStyle_IMetInst(){
		return ((interfaceStyle_IMetInst != null)
	? (interfaceStyle_IMetInst)
	: (interfaceStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interfaceStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long interfaceStyle(){
			final com.apple.jobjc.Invoke.MsgSend interfaceStyle_IMetInst = get_interfaceStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interfaceStyle_IMetInst.init(nativeBuffer, this);
		interfaceStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interpretKeyEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interpretKeyEvents_IMetInst(){
		return ((interpretKeyEvents_IMetInst != null)
	? (interpretKeyEvents_IMetInst)
	: (interpretKeyEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interpretKeyEvents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void interpretKeyEvents(final com.apple.jobjc.foundation.NSArray eventArray){
			final com.apple.jobjc.Invoke.MsgSend interpretKeyEvents_IMetInst = get_interpretKeyEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interpretKeyEvents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, eventArray);
		interpretKeyEvents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateRestorableState_IMetInst(){
		return ((invalidateRestorableState_IMetInst != null)
	? (invalidateRestorableState_IMetInst)
	: (invalidateRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateRestorableState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateRestorableState(){
			final com.apple.jobjc.Invoke.MsgSend invalidateRestorableState_IMetInst = get_invalidateRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateRestorableState_IMetInst.init(nativeBuffer, this);
		invalidateRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend keyDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyDown_IMetInst(){
		return ((keyDown_IMetInst != null)
	? (keyDown_IMetInst)
	: (keyDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void keyDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend keyDown_IMetInst = get_keyDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		keyDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend keyUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyUp_IMetInst(){
		return ((keyUp_IMetInst != null)
	? (keyUp_IMetInst)
	: (keyUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void keyUp(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend keyUp_IMetInst = get_keyUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		keyUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lowercaseWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lowercaseWord_IMetInst(){
		return ((lowercaseWord_IMetInst != null)
	? (lowercaseWord_IMetInst)
	: (lowercaseWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lowercaseWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void lowercaseWord(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend lowercaseWord_IMetInst = get_lowercaseWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lowercaseWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		lowercaseWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend magnifyWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magnifyWithEvent_IMetInst(){
		return ((magnifyWithEvent_IMetInst != null)
	? (magnifyWithEvent_IMetInst)
	: (magnifyWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magnifyWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void magnifyWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend magnifyWithEvent_IMetInst = get_magnifyWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magnifyWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		magnifyWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionLeftToRight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeBaseWritingDirectionLeftToRight_IMetInst(){
		return ((makeBaseWritingDirectionLeftToRight_IMetInst != null)
	? (makeBaseWritingDirectionLeftToRight_IMetInst)
	: (makeBaseWritingDirectionLeftToRight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeBaseWritingDirectionLeftToRight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeBaseWritingDirectionLeftToRight(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionLeftToRight_IMetInst = get_makeBaseWritingDirectionLeftToRight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeBaseWritingDirectionLeftToRight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeBaseWritingDirectionLeftToRight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionNatural_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeBaseWritingDirectionNatural_IMetInst(){
		return ((makeBaseWritingDirectionNatural_IMetInst != null)
	? (makeBaseWritingDirectionNatural_IMetInst)
	: (makeBaseWritingDirectionNatural_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeBaseWritingDirectionNatural:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeBaseWritingDirectionNatural(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionNatural_IMetInst = get_makeBaseWritingDirectionNatural_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeBaseWritingDirectionNatural_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeBaseWritingDirectionNatural_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionRightToLeft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeBaseWritingDirectionRightToLeft_IMetInst(){
		return ((makeBaseWritingDirectionRightToLeft_IMetInst != null)
	? (makeBaseWritingDirectionRightToLeft_IMetInst)
	: (makeBaseWritingDirectionRightToLeft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeBaseWritingDirectionRightToLeft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeBaseWritingDirectionRightToLeft(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeBaseWritingDirectionRightToLeft_IMetInst = get_makeBaseWritingDirectionRightToLeft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeBaseWritingDirectionRightToLeft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeBaseWritingDirectionRightToLeft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionLeftToRight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeTextWritingDirectionLeftToRight_IMetInst(){
		return ((makeTextWritingDirectionLeftToRight_IMetInst != null)
	? (makeTextWritingDirectionLeftToRight_IMetInst)
	: (makeTextWritingDirectionLeftToRight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeTextWritingDirectionLeftToRight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeTextWritingDirectionLeftToRight(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionLeftToRight_IMetInst = get_makeTextWritingDirectionLeftToRight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeTextWritingDirectionLeftToRight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeTextWritingDirectionLeftToRight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionNatural_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeTextWritingDirectionNatural_IMetInst(){
		return ((makeTextWritingDirectionNatural_IMetInst != null)
	? (makeTextWritingDirectionNatural_IMetInst)
	: (makeTextWritingDirectionNatural_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeTextWritingDirectionNatural:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeTextWritingDirectionNatural(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionNatural_IMetInst = get_makeTextWritingDirectionNatural_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeTextWritingDirectionNatural_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeTextWritingDirectionNatural_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionRightToLeft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeTextWritingDirectionRightToLeft_IMetInst(){
		return ((makeTextWritingDirectionRightToLeft_IMetInst != null)
	? (makeTextWritingDirectionRightToLeft_IMetInst)
	: (makeTextWritingDirectionRightToLeft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeTextWritingDirectionRightToLeft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeTextWritingDirectionRightToLeft(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeTextWritingDirectionRightToLeft_IMetInst = get_makeTextWritingDirectionRightToLeft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeTextWritingDirectionRightToLeft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeTextWritingDirectionRightToLeft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_IMetInst(){
		return ((menu_IMetInst != null)
	? (menu_IMetInst)
	: (menu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menu(){
			final com.apple.jobjc.Invoke.MsgSend menu_IMetInst = get_menu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_IMetInst.init(nativeBuffer, this);
		menu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDown_IMetInst(){
		return ((mouseDown_IMetInst != null)
	? (mouseDown_IMetInst)
	: (mouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst = get_mouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDragged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDragged_IMetInst(){
		return ((mouseDragged_IMetInst != null)
	? (mouseDragged_IMetInst)
	: (mouseDragged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDragged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseDragged(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseDragged_IMetInst = get_mouseDragged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDragged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseDragged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseEntered_IMetInst(){
		return ((mouseEntered_IMetInst != null)
	? (mouseEntered_IMetInst)
	: (mouseEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseEntered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseEntered(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst = get_mouseEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseEntered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseEntered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseExited_IMetInst(){
		return ((mouseExited_IMetInst != null)
	? (mouseExited_IMetInst)
	: (mouseExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseExited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseExited(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst = get_mouseExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseExited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseExited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseMoved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseMoved_IMetInst(){
		return ((mouseMoved_IMetInst != null)
	? (mouseMoved_IMetInst)
	: (mouseMoved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseMoved:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseMoved(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseMoved_IMetInst = get_mouseMoved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseMoved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseMoved_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseUp_IMetInst(){
		return ((mouseUp_IMetInst != null)
	? (mouseUp_IMetInst)
	: (mouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseUp(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseUp_IMetInst = get_mouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveBackward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveBackward_IMetInst(){
		return ((moveBackward_IMetInst != null)
	? (moveBackward_IMetInst)
	: (moveBackward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveBackward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveBackward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveBackward_IMetInst = get_moveBackward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveBackward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveBackward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveBackwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveBackwardAndModifySelection_IMetInst(){
		return ((moveBackwardAndModifySelection_IMetInst != null)
	? (moveBackwardAndModifySelection_IMetInst)
	: (moveBackwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveBackwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveBackwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveBackwardAndModifySelection_IMetInst = get_moveBackwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveBackwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveBackwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveDown_IMetInst(){
		return ((moveDown_IMetInst != null)
	? (moveDown_IMetInst)
	: (moveDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveDown(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveDown_IMetInst = get_moveDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveDownAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveDownAndModifySelection_IMetInst(){
		return ((moveDownAndModifySelection_IMetInst != null)
	? (moveDownAndModifySelection_IMetInst)
	: (moveDownAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveDownAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveDownAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveDownAndModifySelection_IMetInst = get_moveDownAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveDownAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveDownAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveForward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveForward_IMetInst(){
		return ((moveForward_IMetInst != null)
	? (moveForward_IMetInst)
	: (moveForward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveForward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveForward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveForward_IMetInst = get_moveForward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveForward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveForward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveForwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveForwardAndModifySelection_IMetInst(){
		return ((moveForwardAndModifySelection_IMetInst != null)
	? (moveForwardAndModifySelection_IMetInst)
	: (moveForwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveForwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveForwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveForwardAndModifySelection_IMetInst = get_moveForwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveForwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveForwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveLeft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveLeft_IMetInst(){
		return ((moveLeft_IMetInst != null)
	? (moveLeft_IMetInst)
	: (moveLeft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveLeft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveLeft(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveLeft_IMetInst = get_moveLeft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveLeft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveLeft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveLeftAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveLeftAndModifySelection_IMetInst(){
		return ((moveLeftAndModifySelection_IMetInst != null)
	? (moveLeftAndModifySelection_IMetInst)
	: (moveLeftAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveLeftAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveLeftAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveLeftAndModifySelection_IMetInst = get_moveLeftAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveLeftAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveLeftAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveParagraphBackwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveParagraphBackwardAndModifySelection_IMetInst(){
		return ((moveParagraphBackwardAndModifySelection_IMetInst != null)
	? (moveParagraphBackwardAndModifySelection_IMetInst)
	: (moveParagraphBackwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveParagraphBackwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveParagraphBackwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveParagraphBackwardAndModifySelection_IMetInst = get_moveParagraphBackwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveParagraphBackwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveParagraphBackwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveParagraphForwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveParagraphForwardAndModifySelection_IMetInst(){
		return ((moveParagraphForwardAndModifySelection_IMetInst != null)
	? (moveParagraphForwardAndModifySelection_IMetInst)
	: (moveParagraphForwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveParagraphForwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveParagraphForwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveParagraphForwardAndModifySelection_IMetInst = get_moveParagraphForwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveParagraphForwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveParagraphForwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveRight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveRight_IMetInst(){
		return ((moveRight_IMetInst != null)
	? (moveRight_IMetInst)
	: (moveRight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveRight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveRight(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveRight_IMetInst = get_moveRight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveRight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveRight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveRightAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveRightAndModifySelection_IMetInst(){
		return ((moveRightAndModifySelection_IMetInst != null)
	? (moveRightAndModifySelection_IMetInst)
	: (moveRightAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveRightAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveRightAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveRightAndModifySelection_IMetInst = get_moveRightAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveRightAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveRightAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfDocument_IMetInst(){
		return ((moveToBeginningOfDocument_IMetInst != null)
	? (moveToBeginningOfDocument_IMetInst)
	: (moveToBeginningOfDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfDocument_IMetInst = get_moveToBeginningOfDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfDocumentAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfDocumentAndModifySelection_IMetInst(){
		return ((moveToBeginningOfDocumentAndModifySelection_IMetInst != null)
	? (moveToBeginningOfDocumentAndModifySelection_IMetInst)
	: (moveToBeginningOfDocumentAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfDocumentAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfDocumentAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfDocumentAndModifySelection_IMetInst = get_moveToBeginningOfDocumentAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfDocumentAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfDocumentAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfLine_IMetInst(){
		return ((moveToBeginningOfLine_IMetInst != null)
	? (moveToBeginningOfLine_IMetInst)
	: (moveToBeginningOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfLine_IMetInst = get_moveToBeginningOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfLineAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfLineAndModifySelection_IMetInst(){
		return ((moveToBeginningOfLineAndModifySelection_IMetInst != null)
	? (moveToBeginningOfLineAndModifySelection_IMetInst)
	: (moveToBeginningOfLineAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfLineAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfLineAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfLineAndModifySelection_IMetInst = get_moveToBeginningOfLineAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfLineAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfLineAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfParagraph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfParagraph_IMetInst(){
		return ((moveToBeginningOfParagraph_IMetInst != null)
	? (moveToBeginningOfParagraph_IMetInst)
	: (moveToBeginningOfParagraph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfParagraph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfParagraph(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfParagraph_IMetInst = get_moveToBeginningOfParagraph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfParagraph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfParagraph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToBeginningOfParagraphAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToBeginningOfParagraphAndModifySelection_IMetInst(){
		return ((moveToBeginningOfParagraphAndModifySelection_IMetInst != null)
	? (moveToBeginningOfParagraphAndModifySelection_IMetInst)
	: (moveToBeginningOfParagraphAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToBeginningOfParagraphAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToBeginningOfParagraphAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToBeginningOfParagraphAndModifySelection_IMetInst = get_moveToBeginningOfParagraphAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToBeginningOfParagraphAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToBeginningOfParagraphAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfDocument_IMetInst(){
		return ((moveToEndOfDocument_IMetInst != null)
	? (moveToEndOfDocument_IMetInst)
	: (moveToEndOfDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfDocument_IMetInst = get_moveToEndOfDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfDocumentAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfDocumentAndModifySelection_IMetInst(){
		return ((moveToEndOfDocumentAndModifySelection_IMetInst != null)
	? (moveToEndOfDocumentAndModifySelection_IMetInst)
	: (moveToEndOfDocumentAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfDocumentAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfDocumentAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfDocumentAndModifySelection_IMetInst = get_moveToEndOfDocumentAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfDocumentAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfDocumentAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfLine_IMetInst(){
		return ((moveToEndOfLine_IMetInst != null)
	? (moveToEndOfLine_IMetInst)
	: (moveToEndOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfLine_IMetInst = get_moveToEndOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfLineAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfLineAndModifySelection_IMetInst(){
		return ((moveToEndOfLineAndModifySelection_IMetInst != null)
	? (moveToEndOfLineAndModifySelection_IMetInst)
	: (moveToEndOfLineAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfLineAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfLineAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfLineAndModifySelection_IMetInst = get_moveToEndOfLineAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfLineAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfLineAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfParagraph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfParagraph_IMetInst(){
		return ((moveToEndOfParagraph_IMetInst != null)
	? (moveToEndOfParagraph_IMetInst)
	: (moveToEndOfParagraph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfParagraph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfParagraph(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfParagraph_IMetInst = get_moveToEndOfParagraph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfParagraph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfParagraph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToEndOfParagraphAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToEndOfParagraphAndModifySelection_IMetInst(){
		return ((moveToEndOfParagraphAndModifySelection_IMetInst != null)
	? (moveToEndOfParagraphAndModifySelection_IMetInst)
	: (moveToEndOfParagraphAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToEndOfParagraphAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToEndOfParagraphAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToEndOfParagraphAndModifySelection_IMetInst = get_moveToEndOfParagraphAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToEndOfParagraphAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToEndOfParagraphAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToLeftEndOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToLeftEndOfLine_IMetInst(){
		return ((moveToLeftEndOfLine_IMetInst != null)
	? (moveToLeftEndOfLine_IMetInst)
	: (moveToLeftEndOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToLeftEndOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToLeftEndOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToLeftEndOfLine_IMetInst = get_moveToLeftEndOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToLeftEndOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToLeftEndOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToLeftEndOfLineAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToLeftEndOfLineAndModifySelection_IMetInst(){
		return ((moveToLeftEndOfLineAndModifySelection_IMetInst != null)
	? (moveToLeftEndOfLineAndModifySelection_IMetInst)
	: (moveToLeftEndOfLineAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToLeftEndOfLineAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToLeftEndOfLineAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToLeftEndOfLineAndModifySelection_IMetInst = get_moveToLeftEndOfLineAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToLeftEndOfLineAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToLeftEndOfLineAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToRightEndOfLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToRightEndOfLine_IMetInst(){
		return ((moveToRightEndOfLine_IMetInst != null)
	? (moveToRightEndOfLine_IMetInst)
	: (moveToRightEndOfLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToRightEndOfLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToRightEndOfLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToRightEndOfLine_IMetInst = get_moveToRightEndOfLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToRightEndOfLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToRightEndOfLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToRightEndOfLineAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToRightEndOfLineAndModifySelection_IMetInst(){
		return ((moveToRightEndOfLineAndModifySelection_IMetInst != null)
	? (moveToRightEndOfLineAndModifySelection_IMetInst)
	: (moveToRightEndOfLineAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToRightEndOfLineAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveToRightEndOfLineAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveToRightEndOfLineAndModifySelection_IMetInst = get_moveToRightEndOfLineAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToRightEndOfLineAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveToRightEndOfLineAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveUp_IMetInst(){
		return ((moveUp_IMetInst != null)
	? (moveUp_IMetInst)
	: (moveUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveUp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveUp_IMetInst = get_moveUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveUpAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveUpAndModifySelection_IMetInst(){
		return ((moveUpAndModifySelection_IMetInst != null)
	? (moveUpAndModifySelection_IMetInst)
	: (moveUpAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveUpAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveUpAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveUpAndModifySelection_IMetInst = get_moveUpAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveUpAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveUpAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordBackward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordBackward_IMetInst(){
		return ((moveWordBackward_IMetInst != null)
	? (moveWordBackward_IMetInst)
	: (moveWordBackward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordBackward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordBackward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordBackward_IMetInst = get_moveWordBackward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordBackward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordBackward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordBackwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordBackwardAndModifySelection_IMetInst(){
		return ((moveWordBackwardAndModifySelection_IMetInst != null)
	? (moveWordBackwardAndModifySelection_IMetInst)
	: (moveWordBackwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordBackwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordBackwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordBackwardAndModifySelection_IMetInst = get_moveWordBackwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordBackwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordBackwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordForward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordForward_IMetInst(){
		return ((moveWordForward_IMetInst != null)
	? (moveWordForward_IMetInst)
	: (moveWordForward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordForward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordForward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordForward_IMetInst = get_moveWordForward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordForward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordForward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordForwardAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordForwardAndModifySelection_IMetInst(){
		return ((moveWordForwardAndModifySelection_IMetInst != null)
	? (moveWordForwardAndModifySelection_IMetInst)
	: (moveWordForwardAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordForwardAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordForwardAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordForwardAndModifySelection_IMetInst = get_moveWordForwardAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordForwardAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordForwardAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordLeft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordLeft_IMetInst(){
		return ((moveWordLeft_IMetInst != null)
	? (moveWordLeft_IMetInst)
	: (moveWordLeft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordLeft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordLeft(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordLeft_IMetInst = get_moveWordLeft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordLeft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordLeft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordLeftAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordLeftAndModifySelection_IMetInst(){
		return ((moveWordLeftAndModifySelection_IMetInst != null)
	? (moveWordLeftAndModifySelection_IMetInst)
	: (moveWordLeftAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordLeftAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordLeftAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordLeftAndModifySelection_IMetInst = get_moveWordLeftAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordLeftAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordLeftAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordRight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordRight_IMetInst(){
		return ((moveWordRight_IMetInst != null)
	? (moveWordRight_IMetInst)
	: (moveWordRight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordRight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordRight(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordRight_IMetInst = get_moveWordRight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordRight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordRight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveWordRightAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveWordRightAndModifySelection_IMetInst(){
		return ((moveWordRightAndModifySelection_IMetInst != null)
	? (moveWordRightAndModifySelection_IMetInst)
	: (moveWordRightAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveWordRightAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveWordRightAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveWordRightAndModifySelection_IMetInst = get_moveWordRightAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveWordRightAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveWordRightAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend nextResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextResponder_IMetInst(){
		return ((nextResponder_IMetInst != null)
	? (nextResponder_IMetInst)
	: (nextResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextResponder", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSResponder nextResponder(){
			final com.apple.jobjc.Invoke.MsgSend nextResponder_IMetInst = get_nextResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextResponder_IMetInst.init(nativeBuffer, this);
		nextResponder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSResponder returnValue = (com.apple.jobjc.appkit.NSResponder) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noResponderFor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noResponderFor_IMetInst(){
		return ((noResponderFor_IMetInst != null)
	? (noResponderFor_IMetInst)
	: (noResponderFor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noResponderFor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void noResponderFor(final com.apple.jobjc.SEL eventSelector){
			final com.apple.jobjc.Invoke.MsgSend noResponderFor_IMetInst = get_noResponderFor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noResponderFor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, eventSelector);
		noResponderFor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend otherMouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherMouseDown_IMetInst(){
		return ((otherMouseDown_IMetInst != null)
	? (otherMouseDown_IMetInst)
	: (otherMouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherMouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void otherMouseDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend otherMouseDown_IMetInst = get_otherMouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherMouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		otherMouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend otherMouseDragged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherMouseDragged_IMetInst(){
		return ((otherMouseDragged_IMetInst != null)
	? (otherMouseDragged_IMetInst)
	: (otherMouseDragged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherMouseDragged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void otherMouseDragged(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend otherMouseDragged_IMetInst = get_otherMouseDragged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherMouseDragged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		otherMouseDragged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend otherMouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherMouseUp_IMetInst(){
		return ((otherMouseUp_IMetInst != null)
	? (otherMouseUp_IMetInst)
	: (otherMouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherMouseUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void otherMouseUp(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend otherMouseUp_IMetInst = get_otherMouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherMouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		otherMouseUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageDown_IMetInst(){
		return ((pageDown_IMetInst != null)
	? (pageDown_IMetInst)
	: (pageDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageDown(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pageDown_IMetInst = get_pageDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pageDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageDownAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageDownAndModifySelection_IMetInst(){
		return ((pageDownAndModifySelection_IMetInst != null)
	? (pageDownAndModifySelection_IMetInst)
	: (pageDownAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageDownAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageDownAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pageDownAndModifySelection_IMetInst = get_pageDownAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageDownAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pageDownAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageUp_IMetInst(){
		return ((pageUp_IMetInst != null)
	? (pageUp_IMetInst)
	: (pageUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageUp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pageUp_IMetInst = get_pageUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pageUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageUpAndModifySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageUpAndModifySelection_IMetInst(){
		return ((pageUpAndModifySelection_IMetInst != null)
	? (pageUpAndModifySelection_IMetInst)
	: (pageUpAndModifySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageUpAndModifySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageUpAndModifySelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pageUpAndModifySelection_IMetInst = get_pageUpAndModifySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageUpAndModifySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pageUpAndModifySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performKeyEquivalent_IMetInst(){
		return ((performKeyEquivalent_IMetInst != null)
	? (performKeyEquivalent_IMetInst)
	: (performKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performKeyEquivalent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performKeyEquivalent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst = get_performKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		performKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performMnemonic_IMetInst(){
		return ((performMnemonic_IMetInst != null)
	? (performMnemonic_IMetInst)
	: (performMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performMnemonic:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performMnemonic(final com.apple.jobjc.foundation.NSString theString){
			final com.apple.jobjc.Invoke.MsgSend performMnemonic_IMetInst = get_performMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theString);
		performMnemonic_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performTextFinderAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performTextFinderAction_IMetInst(){
		return ((performTextFinderAction_IMetInst != null)
	? (performTextFinderAction_IMetInst)
	: (performTextFinderAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performTextFinderAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performTextFinderAction(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performTextFinderAction_IMetInst = get_performTextFinderAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performTextFinderAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performTextFinderAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentError_IMetInst(){
		return ((presentError_IMetInst != null)
	? (presentError_IMetInst)
	: (presentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean presentError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend presentError_IMetInst = get_presentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		presentError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst(){
		return ((presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst != null)
	? (presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst)
	: (presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentError:modalForWindow:delegate:didPresentSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void presentError_modalForWindow_delegate_didPresentSelector_contextInfo(final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didPresentSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst = get_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didPresentSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend quickLookPreviewItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quickLookPreviewItems_IMetInst(){
		return ((quickLookPreviewItems_IMetInst != null)
	? (quickLookPreviewItems_IMetInst)
	: (quickLookPreviewItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quickLookPreviewItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void quickLookPreviewItems(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend quickLookPreviewItems_IMetInst = get_quickLookPreviewItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quickLookPreviewItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		quickLookPreviewItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend quickLookWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quickLookWithEvent_IMetInst(){
		return ((quickLookWithEvent_IMetInst != null)
	? (quickLookWithEvent_IMetInst)
	: (quickLookWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quickLookWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void quickLookWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend quickLookWithEvent_IMetInst = get_quickLookWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quickLookWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		quickLookWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resignFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resignFirstResponder_IMetInst(){
		return ((resignFirstResponder_IMetInst != null)
	? (resignFirstResponder_IMetInst)
	: (resignFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resignFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean resignFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend resignFirstResponder_IMetInst = get_resignFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resignFirstResponder_IMetInst.init(nativeBuffer, this);
		resignFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreStateWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreStateWithCoder_IMetInst(){
		return ((restoreStateWithCoder_IMetInst != null)
	? (restoreStateWithCoder_IMetInst)
	: (restoreStateWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreStateWithCoder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void restoreStateWithCoder(final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend restoreStateWithCoder_IMetInst = get_restoreStateWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreStateWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		restoreStateWithCoder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rightMouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightMouseDown_IMetInst(){
		return ((rightMouseDown_IMetInst != null)
	? (rightMouseDown_IMetInst)
	: (rightMouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightMouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rightMouseDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend rightMouseDown_IMetInst = get_rightMouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightMouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		rightMouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rightMouseDragged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightMouseDragged_IMetInst(){
		return ((rightMouseDragged_IMetInst != null)
	? (rightMouseDragged_IMetInst)
	: (rightMouseDragged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightMouseDragged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rightMouseDragged(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend rightMouseDragged_IMetInst = get_rightMouseDragged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightMouseDragged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		rightMouseDragged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rightMouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightMouseUp_IMetInst(){
		return ((rightMouseUp_IMetInst != null)
	? (rightMouseUp_IMetInst)
	: (rightMouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightMouseUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rightMouseUp(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend rightMouseUp_IMetInst = get_rightMouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightMouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		rightMouseUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rotateWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rotateWithEvent_IMetInst(){
		return ((rotateWithEvent_IMetInst != null)
	? (rotateWithEvent_IMetInst)
	: (rotateWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rotateWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rotateWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend rotateWithEvent_IMetInst = get_rotateWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rotateWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		rotateWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollLineDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollLineDown_IMetInst(){
		return ((scrollLineDown_IMetInst != null)
	? (scrollLineDown_IMetInst)
	: (scrollLineDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollLineDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollLineDown(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollLineDown_IMetInst = get_scrollLineDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollLineDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollLineDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollLineUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollLineUp_IMetInst(){
		return ((scrollLineUp_IMetInst != null)
	? (scrollLineUp_IMetInst)
	: (scrollLineUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollLineUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollLineUp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollLineUp_IMetInst = get_scrollLineUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollLineUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollLineUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollPageDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollPageDown_IMetInst(){
		return ((scrollPageDown_IMetInst != null)
	? (scrollPageDown_IMetInst)
	: (scrollPageDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollPageDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollPageDown(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollPageDown_IMetInst = get_scrollPageDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollPageDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollPageDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollPageUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollPageUp_IMetInst(){
		return ((scrollPageUp_IMetInst != null)
	? (scrollPageUp_IMetInst)
	: (scrollPageUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollPageUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollPageUp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollPageUp_IMetInst = get_scrollPageUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollPageUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollPageUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollToBeginningOfDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollToBeginningOfDocument_IMetInst(){
		return ((scrollToBeginningOfDocument_IMetInst != null)
	? (scrollToBeginningOfDocument_IMetInst)
	: (scrollToBeginningOfDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollToBeginningOfDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollToBeginningOfDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollToBeginningOfDocument_IMetInst = get_scrollToBeginningOfDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollToBeginningOfDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollToBeginningOfDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollToEndOfDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollToEndOfDocument_IMetInst(){
		return ((scrollToEndOfDocument_IMetInst != null)
	? (scrollToEndOfDocument_IMetInst)
	: (scrollToEndOfDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollToEndOfDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollToEndOfDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend scrollToEndOfDocument_IMetInst = get_scrollToEndOfDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollToEndOfDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollToEndOfDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollWheel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollWheel_IMetInst(){
		return ((scrollWheel_IMetInst != null)
	? (scrollWheel_IMetInst)
	: (scrollWheel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollWheel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollWheel(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend scrollWheel_IMetInst = get_scrollWheel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollWheel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		scrollWheel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectAll_IMetInst(){
		return ((selectAll_IMetInst != null)
	? (selectAll_IMetInst)
	: (selectAll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectAll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectAll(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst = get_selectAll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectAll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectAll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectLine_IMetInst(){
		return ((selectLine_IMetInst != null)
	? (selectLine_IMetInst)
	: (selectLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectLine(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectLine_IMetInst = get_selectLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectParagraph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectParagraph_IMetInst(){
		return ((selectParagraph_IMetInst != null)
	? (selectParagraph_IMetInst)
	: (selectParagraph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectParagraph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectParagraph(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectParagraph_IMetInst = get_selectParagraph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectParagraph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectParagraph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectToMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectToMark_IMetInst(){
		return ((selectToMark_IMetInst != null)
	? (selectToMark_IMetInst)
	: (selectToMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectToMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectToMark(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectToMark_IMetInst = get_selectToMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectToMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectToMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectWord_IMetInst(){
		return ((selectWord_IMetInst != null)
	? (selectWord_IMetInst)
	: (selectWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectWord(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectWord_IMetInst = get_selectWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInterfaceStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInterfaceStyle_IMetInst(){
		return ((setInterfaceStyle_IMetInst != null)
	? (setInterfaceStyle_IMetInst)
	: (setInterfaceStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInterfaceStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setInterfaceStyle(final long interfaceStyle){
			final com.apple.jobjc.Invoke.MsgSend setInterfaceStyle_IMetInst = get_setInterfaceStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInterfaceStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, interfaceStyle);
		setInterfaceStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMark_IMetInst(){
		return ((setMark_IMetInst != null)
	? (setMark_IMetInst)
	: (setMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMark(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend setMark_IMetInst = get_setMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		setMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenu_IMetInst(){
		return ((setMenu_IMetInst != null)
	? (setMenu_IMetInst)
	: (setMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenu(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst = get_setMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		setMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNextResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNextResponder_IMetInst(){
		return ((setNextResponder_IMetInst != null)
	? (setNextResponder_IMetInst)
	: (setNextResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNextResponder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNextResponder(final com.apple.jobjc.appkit.NSResponder aResponder){
			final com.apple.jobjc.Invoke.MsgSend setNextResponder_IMetInst = get_setNextResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNextResponder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aResponder);
		setNextResponder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldBeTreatedAsInkEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldBeTreatedAsInkEvent_IMetInst(){
		return ((shouldBeTreatedAsInkEvent_IMetInst != null)
	? (shouldBeTreatedAsInkEvent_IMetInst)
	: (shouldBeTreatedAsInkEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldBeTreatedAsInkEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldBeTreatedAsInkEvent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend shouldBeTreatedAsInkEvent_IMetInst = get_shouldBeTreatedAsInkEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldBeTreatedAsInkEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		shouldBeTreatedAsInkEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showContextHelp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showContextHelp_IMetInst(){
		return ((showContextHelp_IMetInst != null)
	? (showContextHelp_IMetInst)
	: (showContextHelp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showContextHelp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showContextHelp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend showContextHelp_IMetInst = get_showContextHelp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showContextHelp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		showContextHelp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend smartMagnifyWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartMagnifyWithEvent_IMetInst(){
		return ((smartMagnifyWithEvent_IMetInst != null)
	? (smartMagnifyWithEvent_IMetInst)
	: (smartMagnifyWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartMagnifyWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void smartMagnifyWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend smartMagnifyWithEvent_IMetInst = get_smartMagnifyWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartMagnifyWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		smartMagnifyWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend supplementalTargetForAction_sender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supplementalTargetForAction_sender_IMetInst(){
		return ((supplementalTargetForAction_sender_IMetInst != null)
	? (supplementalTargetForAction_sender_IMetInst)
	: (supplementalTargetForAction_sender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supplementalTargetForAction:sender:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T supplementalTargetForAction_sender(final com.apple.jobjc.SEL action, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend supplementalTargetForAction_sender_IMetInst = get_supplementalTargetForAction_sender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supplementalTargetForAction_sender_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, action);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		supplementalTargetForAction_sender_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend swapWithMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_swapWithMark_IMetInst(){
		return ((swapWithMark_IMetInst != null)
	? (swapWithMark_IMetInst)
	: (swapWithMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "swapWithMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void swapWithMark(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend swapWithMark_IMetInst = get_swapWithMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		swapWithMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		swapWithMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend swipeWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_swipeWithEvent_IMetInst(){
		return ((swipeWithEvent_IMetInst != null)
	? (swipeWithEvent_IMetInst)
	: (swipeWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "swipeWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void swipeWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend swipeWithEvent_IMetInst = get_swipeWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		swipeWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		swipeWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabletPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabletPoint_IMetInst(){
		return ((tabletPoint_IMetInst != null)
	? (tabletPoint_IMetInst)
	: (tabletPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabletPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tabletPoint(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend tabletPoint_IMetInst = get_tabletPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabletPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		tabletPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabletProximity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabletProximity_IMetInst(){
		return ((tabletProximity_IMetInst != null)
	? (tabletProximity_IMetInst)
	: (tabletProximity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabletProximity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tabletProximity(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend tabletProximity_IMetInst = get_tabletProximity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabletProximity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		tabletProximity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend touchesBeganWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_touchesBeganWithEvent_IMetInst(){
		return ((touchesBeganWithEvent_IMetInst != null)
	? (touchesBeganWithEvent_IMetInst)
	: (touchesBeganWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "touchesBeganWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void touchesBeganWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend touchesBeganWithEvent_IMetInst = get_touchesBeganWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		touchesBeganWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		touchesBeganWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend touchesCancelledWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_touchesCancelledWithEvent_IMetInst(){
		return ((touchesCancelledWithEvent_IMetInst != null)
	? (touchesCancelledWithEvent_IMetInst)
	: (touchesCancelledWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "touchesCancelledWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void touchesCancelledWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend touchesCancelledWithEvent_IMetInst = get_touchesCancelledWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		touchesCancelledWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		touchesCancelledWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend touchesEndedWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_touchesEndedWithEvent_IMetInst(){
		return ((touchesEndedWithEvent_IMetInst != null)
	? (touchesEndedWithEvent_IMetInst)
	: (touchesEndedWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "touchesEndedWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void touchesEndedWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend touchesEndedWithEvent_IMetInst = get_touchesEndedWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		touchesEndedWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		touchesEndedWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend touchesMovedWithEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_touchesMovedWithEvent_IMetInst(){
		return ((touchesMovedWithEvent_IMetInst != null)
	? (touchesMovedWithEvent_IMetInst)
	: (touchesMovedWithEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "touchesMovedWithEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void touchesMovedWithEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend touchesMovedWithEvent_IMetInst = get_touchesMovedWithEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		touchesMovedWithEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		touchesMovedWithEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transpose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transpose_IMetInst(){
		return ((transpose_IMetInst != null)
	? (transpose_IMetInst)
	: (transpose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transpose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void transpose(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend transpose_IMetInst = get_transpose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transpose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		transpose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transposeWords_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transposeWords_IMetInst(){
		return ((transposeWords_IMetInst != null)
	? (transposeWords_IMetInst)
	: (transposeWords_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transposeWords:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void transposeWords(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend transposeWords_IMetInst = get_transposeWords_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transposeWords_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		transposeWords_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tryToPerform_with_IMetInst(){
		return ((tryToPerform_with_IMetInst != null)
	? (tryToPerform_with_IMetInst)
	: (tryToPerform_with_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tryToPerform:with:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tryToPerform_with(final com.apple.jobjc.SEL anAction, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst = get_tryToPerform_with_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tryToPerform_with_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, anAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		tryToPerform_with_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend undoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoManager_IMetInst(){
		return ((undoManager_IMetInst != null)
	? (undoManager_IMetInst)
	: (undoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUndoManager undoManager(){
			final com.apple.jobjc.Invoke.MsgSend undoManager_IMetInst = get_undoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoManager_IMetInst.init(nativeBuffer, this);
		undoManager_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUndoManager returnValue = (com.apple.jobjc.foundation.NSUndoManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uppercaseWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uppercaseWord_IMetInst(){
		return ((uppercaseWord_IMetInst != null)
	? (uppercaseWord_IMetInst)
	: (uppercaseWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uppercaseWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void uppercaseWord(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend uppercaseWord_IMetInst = get_uppercaseWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uppercaseWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		uppercaseWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validRequestorForSendType_returnType_IMetInst(){
		return ((validRequestorForSendType_returnType_IMetInst != null)
	? (validRequestorForSendType_returnType_IMetInst)
	: (validRequestorForSendType_returnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validRequestorForSendType:returnType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T validRequestorForSendType_returnType(final com.apple.jobjc.foundation.NSString sendType, final com.apple.jobjc.foundation.NSString returnType){
			final com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst = get_validRequestorForSendType_returnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validRequestorForSendType_returnType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, returnType);
		validRequestorForSendType_returnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateProposedFirstResponder_forEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateProposedFirstResponder_forEvent_IMetInst(){
		return ((validateProposedFirstResponder_forEvent_IMetInst != null)
	? (validateProposedFirstResponder_forEvent_IMetInst)
	: (validateProposedFirstResponder_forEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateProposedFirstResponder:forEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateProposedFirstResponder_forEvent(final com.apple.jobjc.appkit.NSResponder responder, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend validateProposedFirstResponder_forEvent_IMetInst = get_validateProposedFirstResponder_forEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateProposedFirstResponder_forEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, responder);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		validateProposedFirstResponder_forEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsForwardedScrollEventsForAxis_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsForwardedScrollEventsForAxis_IMetInst(){
		return ((wantsForwardedScrollEventsForAxis_IMetInst != null)
	? (wantsForwardedScrollEventsForAxis_IMetInst)
	: (wantsForwardedScrollEventsForAxis_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsForwardedScrollEventsForAxis:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean wantsForwardedScrollEventsForAxis(final long axis){
			final com.apple.jobjc.Invoke.MsgSend wantsForwardedScrollEventsForAxis_IMetInst = get_wantsForwardedScrollEventsForAxis_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsForwardedScrollEventsForAxis_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, axis);
		wantsForwardedScrollEventsForAxis_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsScrollEventsForSwipeTrackingOnAxis_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsScrollEventsForSwipeTrackingOnAxis_IMetInst(){
		return ((wantsScrollEventsForSwipeTrackingOnAxis_IMetInst != null)
	? (wantsScrollEventsForSwipeTrackingOnAxis_IMetInst)
	: (wantsScrollEventsForSwipeTrackingOnAxis_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsScrollEventsForSwipeTrackingOnAxis:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean wantsScrollEventsForSwipeTrackingOnAxis(final long axis){
			final com.apple.jobjc.Invoke.MsgSend wantsScrollEventsForSwipeTrackingOnAxis_IMetInst = get_wantsScrollEventsForSwipeTrackingOnAxis_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsScrollEventsForSwipeTrackingOnAxis_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, axis);
		wantsScrollEventsForSwipeTrackingOnAxis_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend willPresentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willPresentError_IMetInst(){
		return ((willPresentError_IMetInst != null)
	? (willPresentError_IMetInst)
	: (willPresentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willPresentError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError willPresentError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend willPresentError_IMetInst = get_willPresentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willPresentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		willPresentError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend yank_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_yank_IMetInst(){
		return ((yank_IMetInst != null)
	? (yank_IMetInst)
	: (yank_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "yank:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void yank(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend yank_IMetInst = get_yank_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		yank_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		yank_IMetInst.invoke(nativeBuffer);
		
		
	}

}
