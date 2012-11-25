package com.apple.jobjc.foundation;

public  class FoundationFramework extends com.apple.jobjc.MacOSXFramework {
	public FoundationFramework(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime, new String[]{});
	}

	public NSAffineTransformStruct makeNSAffineTransformStruct(){
		return new NSAffineTransformStruct(getRuntime());
	}
	public NSAffineTransformStruct makeNSAffineTransformStruct(com.apple.jobjc.NativeBuffer base){
		return new NSAffineTransformStruct(getRuntime(), base);
	}
	public NSDecimal makeNSDecimal(){
		return new NSDecimal(getRuntime());
	}
	public NSDecimal makeNSDecimal(com.apple.jobjc.NativeBuffer base){
		return new NSDecimal(getRuntime(), base);
	}
	public NSFastEnumerationState makeNSFastEnumerationState(){
		return new NSFastEnumerationState(getRuntime());
	}
	public NSFastEnumerationState makeNSFastEnumerationState(com.apple.jobjc.NativeBuffer base){
		return new NSFastEnumerationState(getRuntime(), base);
	}
	public NSHashEnumerator makeNSHashEnumerator(){
		return new NSHashEnumerator(getRuntime());
	}
	public NSHashEnumerator makeNSHashEnumerator(com.apple.jobjc.NativeBuffer base){
		return new NSHashEnumerator(getRuntime(), base);
	}
	public NSHashTableCallBacks makeNSHashTableCallBacks(){
		return new NSHashTableCallBacks(getRuntime());
	}
	public NSHashTableCallBacks makeNSHashTableCallBacks(com.apple.jobjc.NativeBuffer base){
		return new NSHashTableCallBacks(getRuntime(), base);
	}
	public NSMapEnumerator makeNSMapEnumerator(){
		return new NSMapEnumerator(getRuntime());
	}
	public NSMapEnumerator makeNSMapEnumerator(com.apple.jobjc.NativeBuffer base){
		return new NSMapEnumerator(getRuntime(), base);
	}
	public NSMapTableKeyCallBacks makeNSMapTableKeyCallBacks(){
		return new NSMapTableKeyCallBacks(getRuntime());
	}
	public NSMapTableKeyCallBacks makeNSMapTableKeyCallBacks(com.apple.jobjc.NativeBuffer base){
		return new NSMapTableKeyCallBacks(getRuntime(), base);
	}
	public NSMapTableValueCallBacks makeNSMapTableValueCallBacks(){
		return new NSMapTableValueCallBacks(getRuntime());
	}
	public NSMapTableValueCallBacks makeNSMapTableValueCallBacks(com.apple.jobjc.NativeBuffer base){
		return new NSMapTableValueCallBacks(getRuntime(), base);
	}
	public NSPoint makeNSPoint(){
		return new NSPoint(getRuntime());
	}
	public NSPoint makeNSPoint(com.apple.jobjc.NativeBuffer base){
		return new NSPoint(getRuntime(), base);
	}
	public NSRange makeNSRange(){
		return new NSRange(getRuntime());
	}
	public NSRange makeNSRange(com.apple.jobjc.NativeBuffer base){
		return new NSRange(getRuntime(), base);
	}
	public NSRect makeNSRect(){
		return new NSRect(getRuntime());
	}
	public NSRect makeNSRect(com.apple.jobjc.NativeBuffer base){
		return new NSRect(getRuntime(), base);
	}
	public NSSize makeNSSize(){
		return new NSSize(getRuntime());
	}
	public NSSize makeNSSize(com.apple.jobjc.NativeBuffer base){
		return new NSSize(getRuntime(), base);
	}
	public NSSwappedDouble makeNSSwappedDouble(){
		return new NSSwappedDouble(getRuntime());
	}
	public NSSwappedDouble makeNSSwappedDouble(com.apple.jobjc.NativeBuffer base){
		return new NSSwappedDouble(getRuntime(), base);
	}
	public NSSwappedFloat makeNSSwappedFloat(){
		return new NSSwappedFloat(getRuntime());
	}
	public NSSwappedFloat makeNSSwappedFloat(com.apple.jobjc.NativeBuffer base){
		return new NSSwappedFloat(getRuntime(), base);
	}
	public final int NSASCIIStringEncoding(){ return 1 ; }
	public final int NSAdminApplicationDirectory(){ return 4 ; }
	public final int NSAggregateExpressionType(){ return 14 ; }
	public final int NSAlignAllEdgesInward(){ return 15 ; }
	public final int NSAlignAllEdgesNearest(){ return 983040 ; }
	public final int NSAlignAllEdgesOutward(){ return 3840 ; }
	public final int NSAlignHeightInward(){ return 32 ; }
	public final int NSAlignHeightNearest(){ return 2097152 ; }
	public final int NSAlignHeightOutward(){ return 8192 ; }
	public final int NSAlignMaxXInward(){ return 4 ; }
	public final int NSAlignMaxXNearest(){ return 262144 ; }
	public final int NSAlignMaxXOutward(){ return 1024 ; }
	public final int NSAlignMaxYInward(){ return 8 ; }
	public final int NSAlignMaxYNearest(){ return 524288 ; }
	public final int NSAlignMaxYOutward(){ return 2048 ; }
	public final int NSAlignMinXInward(){ return 1 ; }
	public final int NSAlignMinXNearest(){ return 65536 ; }
	public final int NSAlignMinXOutward(){ return 256 ; }
	public final int NSAlignMinYInward(){ return 2 ; }
	public final int NSAlignMinYNearest(){ return 131072 ; }
	public final int NSAlignMinYOutward(){ return 512 ; }
	public final float NSAlignRectFlipped(){ return 9223372036854775808f; }
	public final int NSAlignWidthInward(){ return 16 ; }
	public final int NSAlignWidthNearest(){ return 1048576 ; }
	public final int NSAlignWidthOutward(){ return 4096 ; }
	public final int NSAllApplicationsDirectory(){ return 100 ; }
	public final int NSAllDomainsMask(){ return 65535 ; }
	public final int NSAllLibrariesDirectory(){ return 101 ; }
	public final int NSAllPredicateModifier(){ return 1 ; }
	public final int NSAnchoredSearch(){ return 8 ; }
	public final int NSAndPredicateType(){ return 1 ; }
	public final int NSAnyPredicateModifier(){ return 2 ; }
	public final int NSApplicationDirectory(){ return 1 ; }
	public final int NSApplicationScriptsDirectory(){ return 23 ; }
	public final int NSApplicationSupportDirectory(){ return 14 ; }
	public final int NSArgumentEvaluationScriptError(){ return 3 ; }
	public final int NSArgumentsWrongScriptError(){ return 6 ; }
	public final int NSAtomicWrite(){ return 1 ; }
	public final int NSAttributedStringEnumerationLongestEffectiveRangeNotRequired(){ return 1048576 ; }
	public final int NSAttributedStringEnumerationReverse(){ return 2 ; }
	public final int NSAutosavedInformationDirectory(){ return 11 ; }
	public final int NSBackwardsSearch(){ return 4 ; }
	public final int NSBeginsWithComparison(){ return 5 ; }
	public final int NSBeginsWithPredicateOperatorType(){ return 8 ; }
	public final int NSBetweenPredicateOperatorType(){ return 100 ; }
	public final int NSBinarySearchingFirstEqual(){ return 256 ; }
	public final int NSBinarySearchingInsertionIndex(){ return 1024 ; }
	public final int NSBinarySearchingLastEqual(){ return 512 ; }
	public final int NSBlockExpressionType(){ return 19 ; }
	public final int NSBundleExecutableArchitectureI386(){ return 7 ; }
	public final int NSBundleExecutableArchitecturePPC(){ return 18 ; }
	public final int NSBundleExecutableArchitecturePPC64(){ return 16777234 ; }
	public final int NSBundleExecutableArchitectureX86_64(){ return 16777223 ; }
	public final int NSByteCountFormatterCountStyleBinary(){ return 3 ; }
	public final int NSByteCountFormatterCountStyleDecimal(){ return 2 ; }
	public final int NSByteCountFormatterCountStyleFile(){ return 0 ; }
	public final int NSByteCountFormatterCountStyleMemory(){ return 1 ; }
	public final int NSByteCountFormatterUseAll(){ return 65535 ; }
	public final int NSByteCountFormatterUseBytes(){ return 1 ; }
	public final int NSByteCountFormatterUseDefault(){ return 0 ; }
	public final int NSByteCountFormatterUseEB(){ return 64 ; }
	public final int NSByteCountFormatterUseGB(){ return 8 ; }
	public final int NSByteCountFormatterUseKB(){ return 2 ; }
	public final int NSByteCountFormatterUseMB(){ return 4 ; }
	public final int NSByteCountFormatterUsePB(){ return 32 ; }
	public final int NSByteCountFormatterUseTB(){ return 16 ; }
	public final int NSByteCountFormatterUseYBOrHigher(){ return 65280 ; }
	public final int NSByteCountFormatterUseZB(){ return 128 ; }
	public final int NSCachesDirectory(){ return 13 ; }
	public final int NSCalculationDivideByZero(){ return 4 ; }
	public final int NSCalculationLossOfPrecision(){ return 1 ; }
	public final int NSCalculationNoError(){ return 0 ; }
	public final int NSCalculationOverflow(){ return 3 ; }
	public final int NSCalculationUnderflow(){ return 2 ; }
	public final int NSCalendarCalendarUnit(){ return 1048576 ; }
	public final int NSCannotCreateScriptCommandError(){ return 10 ; }
	public final int NSCaseInsensitivePredicateOption(){ return 1 ; }
	public final int NSCaseInsensitiveSearch(){ return 1 ; }
	public final int NSCollectorDisabledOption(){ return 2 ; }
	public final int NSConstantValueExpressionType(){ return 0 ; }
	public final int NSContainerSpecifierError(){ return 2 ; }
	public final int NSContainsComparison(){ return 7 ; }
	public final int NSContainsPredicateOperatorType(){ return 99 ; }
	public final int NSCoreServiceDirectory(){ return 10 ; }
	public final int NSCustomSelectorPredicateOperatorType(){ return 11 ; }
	public final int NSDataReadingMapped(){ return 1 ; }
	public final int NSDataReadingMappedAlways(){ return 8 ; }
	public final int NSDataReadingMappedIfSafe(){ return 1 ; }
	public final int NSDataReadingUncached(){ return 2 ; }
	public final int NSDataSearchAnchored(){ return 2 ; }
	public final int NSDataSearchBackwards(){ return 1 ; }
	public final int NSDataWritingAtomic(){ return 1 ; }
	public final int NSDataWritingFileProtectionComplete(){ return 536870912 ; }
	public final int NSDataWritingFileProtectionCompleteUnlessOpen(){ return 805306368 ; }
	public final int NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication(){ return 1073741824 ; }
	public final long NSDataWritingFileProtectionMask(){ return 4026531840l; }
	public final int NSDataWritingFileProtectionNone(){ return 268435456 ; }
	public final int NSDataWritingWithoutOverwriting(){ return 2 ; }
	public final int NSDateFormatterBehavior10_0(){ return 1000 ; }
	public final int NSDateFormatterBehavior10_4(){ return 1040 ; }
	public final int NSDateFormatterBehaviorDefault(){ return 0 ; }
	public final int NSDateFormatterFullStyle(){ return 4 ; }
	public final int NSDateFormatterLongStyle(){ return 3 ; }
	public final int NSDateFormatterMediumStyle(){ return 2 ; }
	public final int NSDateFormatterNoStyle(){ return 0 ; }
	public final int NSDateFormatterShortStyle(){ return 1 ; }
	public final int NSDayCalendarUnit(){ return 16 ; }
	public final int NSDecimalMaxSize(){ return 8 ; }
	public final int NSDecimalNoScale(){ return 32767 ; }
	public final int NSDemoApplicationDirectory(){ return 2 ; }
	public final int NSDesktopDirectory(){ return 12 ; }
	public final int NSDeveloperApplicationDirectory(){ return 3 ; }
	public final int NSDeveloperDirectory(){ return 6 ; }
	public final int NSDiacriticInsensitivePredicateOption(){ return 2 ; }
	public final int NSDiacriticInsensitiveSearch(){ return 128 ; }
	public final int NSDirectPredicateModifier(){ return 0 ; }
	public final int NSDirectoryEnumerationSkipsHiddenFiles(){ return 4 ; }
	public final int NSDirectoryEnumerationSkipsPackageDescendants(){ return 2 ; }
	public final int NSDirectoryEnumerationSkipsSubdirectoryDescendants(){ return 1 ; }
	public final int NSDocumentDirectory(){ return 9 ; }
	public final int NSDocumentationDirectory(){ return 8 ; }
	public final int NSDownloadsDirectory(){ return 15 ; }
	public final int NSEndsWithComparison(){ return 6 ; }
	public final int NSEndsWithPredicateOperatorType(){ return 9 ; }
	public final int NSEnumerationConcurrent(){ return 1 ; }
	public final int NSEnumerationReverse(){ return 2 ; }
	public final int NSEqualToComparison(){ return 0 ; }
	public final int NSEqualToPredicateOperatorType(){ return 4 ; }
	public final int NSEraCalendarUnit(){ return 2 ; }
	public final int NSEvaluatedObjectExpressionType(){ return 1 ; }
	public final int NSEverySubelement(){ return 1 ; }
	public final int NSExecutableArchitectureMismatchError(){ return 3585 ; }
	public final int NSExecutableErrorMaximum(){ return 3839 ; }
	public final int NSExecutableErrorMinimum(){ return 3584 ; }
	public final int NSExecutableLinkError(){ return 3588 ; }
	public final int NSExecutableLoadError(){ return 3587 ; }
	public final int NSExecutableNotLoadableError(){ return 3584 ; }
	public final int NSExecutableRuntimeMismatchError(){ return 3586 ; }
	public final int NSFeatureUnsupportedError(){ return 3328 ; }
	public final int NSFileCoordinatorReadingResolvesSymbolicLink(){ return 2 ; }
	public final int NSFileCoordinatorReadingWithoutChanges(){ return 1 ; }
	public final int NSFileCoordinatorWritingForDeleting(){ return 1 ; }
	public final int NSFileCoordinatorWritingForMerging(){ return 4 ; }
	public final int NSFileCoordinatorWritingForMoving(){ return 2 ; }
	public final int NSFileCoordinatorWritingForReplacing(){ return 8 ; }
	public final int NSFileErrorMaximum(){ return 1023 ; }
	public final int NSFileErrorMinimum(){ return 0 ; }
	public final int NSFileLockingError(){ return 255 ; }
	public final int NSFileManagerItemReplacementUsingNewMetadataOnly(){ return 1 ; }
	public final int NSFileManagerItemReplacementWithoutDeletingBackupItem(){ return 2 ; }
	public final int NSFileNoSuchFileError(){ return 4 ; }
	public final int NSFileReadCorruptFileError(){ return 259 ; }
	public final int NSFileReadInapplicableStringEncodingError(){ return 261 ; }
	public final int NSFileReadInvalidFileNameError(){ return 258 ; }
	public final int NSFileReadNoPermissionError(){ return 257 ; }
	public final int NSFileReadNoSuchFileError(){ return 260 ; }
	public final int NSFileReadTooLargeError(){ return 263 ; }
	public final int NSFileReadUnknownError(){ return 256 ; }
	public final int NSFileReadUnknownStringEncodingError(){ return 264 ; }
	public final int NSFileReadUnsupportedSchemeError(){ return 262 ; }
	public final int NSFileVersionAddingByMoving(){ return 1 ; }
	public final int NSFileVersionReplacingByMoving(){ return 1 ; }
	public final int NSFileWrapperReadingImmediate(){ return 1 ; }
	public final int NSFileWrapperReadingWithoutMapping(){ return 2 ; }
	public final int NSFileWrapperWritingAtomic(){ return 1 ; }
	public final int NSFileWrapperWritingWithNameUpdating(){ return 2 ; }
	public final int NSFileWriteFileExistsError(){ return 516 ; }
	public final int NSFileWriteInapplicableStringEncodingError(){ return 517 ; }
	public final int NSFileWriteInvalidFileNameError(){ return 514 ; }
	public final int NSFileWriteNoPermissionError(){ return 513 ; }
	public final int NSFileWriteOutOfSpaceError(){ return 640 ; }
	public final int NSFileWriteUnknownError(){ return 512 ; }
	public final int NSFileWriteUnsupportedSchemeError(){ return 518 ; }
	public final int NSFileWriteVolumeReadOnlyError(){ return 642 ; }
	public final int NSForcedOrderingSearch(){ return 512 ; }
	public final int NSFormattingError(){ return 2048 ; }
	public final int NSFormattingErrorMaximum(){ return 2559 ; }
	public final int NSFormattingErrorMinimum(){ return 2048 ; }
	public final double NSFoundationVersionNumber10_0(){ return 397.40d; }
	public final float NSFoundationVersionNumber10_1(){ return 425.00f; }
	public final float NSFoundationVersionNumber10_1_1(){ return 425.00f; }
	public final float NSFoundationVersionNumber10_1_2(){ return 425.00f; }
	public final float NSFoundationVersionNumber10_1_3(){ return 425.00f; }
	public final float NSFoundationVersionNumber10_1_4(){ return 425.00f; }
	public final float NSFoundationVersionNumber10_2(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_1(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_2(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_3(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_4(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_5(){ return 462.00f; }
	public final float NSFoundationVersionNumber10_2_6(){ return 462.00f; }
	public final double NSFoundationVersionNumber10_2_7(){ return 462.70d; }
	public final double NSFoundationVersionNumber10_2_8(){ return 462.70d; }
	public final float NSFoundationVersionNumber10_3(){ return 500.00f; }
	public final float NSFoundationVersionNumber10_3_1(){ return 500.00f; }
	public final double NSFoundationVersionNumber10_3_2(){ return 500.30d; }
	public final double NSFoundationVersionNumber10_3_3(){ return 500.54d; }
	public final double NSFoundationVersionNumber10_3_4(){ return 500.56d; }
	public final double NSFoundationVersionNumber10_3_5(){ return 500.56d; }
	public final double NSFoundationVersionNumber10_3_6(){ return 500.56d; }
	public final double NSFoundationVersionNumber10_3_7(){ return 500.56d; }
	public final double NSFoundationVersionNumber10_3_8(){ return 500.56d; }
	public final double NSFoundationVersionNumber10_3_9(){ return 500.58d; }
	public final float NSFoundationVersionNumber10_4(){ return 567.00f; }
	public final float NSFoundationVersionNumber10_4_1(){ return 567.00f; }
	public final double NSFoundationVersionNumber10_4_10(){ return 567.29d; }
	public final double NSFoundationVersionNumber10_4_11(){ return 567.36d; }
	public final double NSFoundationVersionNumber10_4_2(){ return 567.12d; }
	public final double NSFoundationVersionNumber10_4_3(){ return 567.21d; }
	public final double NSFoundationVersionNumber10_4_4_Intel(){ return 567.23d; }
	public final double NSFoundationVersionNumber10_4_4_PowerPC(){ return 567.21d; }
	public final float NSFoundationVersionNumber10_4_5(){ return 567.25f; }
	public final double NSFoundationVersionNumber10_4_6(){ return 567.26d; }
	public final double NSFoundationVersionNumber10_4_7(){ return 567.27d; }
	public final double NSFoundationVersionNumber10_4_8(){ return 567.28d; }
	public final double NSFoundationVersionNumber10_4_9(){ return 567.29d; }
	public final float NSFoundationVersionNumber10_5(){ return 677.00f; }
	public final double NSFoundationVersionNumber10_5_1(){ return 677.10d; }
	public final double NSFoundationVersionNumber10_5_2(){ return 677.15d; }
	public final double NSFoundationVersionNumber10_5_3(){ return 677.19d; }
	public final double NSFoundationVersionNumber10_5_4(){ return 677.19d; }
	public final double NSFoundationVersionNumber10_5_5(){ return 677.21d; }
	public final double NSFoundationVersionNumber10_5_6(){ return 677.22d; }
	public final double NSFoundationVersionNumber10_5_7(){ return 677.24d; }
	public final double NSFoundationVersionNumber10_5_8(){ return 677.26d; }
	public final float NSFoundationVersionNumber10_6(){ return 751.00f; }
	public final float NSFoundationVersionNumber10_6_1(){ return 751.00f; }
	public final double NSFoundationVersionNumber10_6_2(){ return 751.14d; }
	public final double NSFoundationVersionNumber10_6_3(){ return 751.21d; }
	public final double NSFoundationVersionNumber10_6_4(){ return 751.29d; }
	public final double NSFoundationVersionNumber10_6_5(){ return 751.42d; }
	public final double NSFoundationVersionNumber10_6_6(){ return 751.53d; }
	public final double NSFoundationVersionNumber10_6_7(){ return 751.53d; }
	public final double NSFoundationVersionNumber10_6_8(){ return 751.62d; }
	public final double NSFoundationVersionNumber10_7(){ return 833.10d; }
	public final double NSFoundationVersionNumber10_7_1(){ return 833.10d; }
	public final double NSFoundationVersionNumber10_7_2(){ return 833.20d; }
	public final double NSFoundationVersionNumber10_7_3(){ return 833.24d; }
	public final float NSFoundationVersionNumber10_7_4(){ return 833.25f; }
	public final int NSFoundationVersionWithFileManagerResourceForkSupport(){ return 412 ; }
	public final int NSFunctionExpressionType(){ return 4 ; }
	public final int NSGEOMETRY_TYPES_SAME_AS_CGGEOMETRY_TYPES(){ return 1 ; }
	public final int NSGreaterThanComparison(){ return 4 ; }
	public final int NSGreaterThanOrEqualToComparison(){ return 3 ; }
	public final int NSGreaterThanOrEqualToPredicateOperatorType(){ return 3 ; }
	public final int NSGreaterThanPredicateOperatorType(){ return 2 ; }
	public final int NSHPUXOperatingSystem(){ return 4 ; }
	public final int NSHTTPCookieAcceptPolicyAlways(){ return 0 ; }
	public final int NSHTTPCookieAcceptPolicyNever(){ return 1 ; }
	public final int NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain(){ return 2 ; }
	public final int NSHashTableCopyIn(){ return 65536 ; }
	public final int NSHashTableObjectPointerPersonality(){ return 512 ; }
	public final int NSHashTableStrongMemory(){ return 0 ; }
	public final int NSHashTableWeakMemory(){ return 5 ; }
	public final int NSHashTableZeroingWeakMemory(){ return 1 ; }
	public final int NSHourCalendarUnit(){ return 32 ; }
	public final int NSINTEGER_DEFINED(){ return 1 ; }
	public final int NSISO2022JPStringEncoding(){ return 21 ; }
	public final int NSISOLatin1StringEncoding(){ return 5 ; }
	public final int NSISOLatin2StringEncoding(){ return 9 ; }
	public final int NSInPredicateOperatorType(){ return 10 ; }
	public final int NSIndexSubelement(){ return 0 ; }
	public final int NSInputMethodsDirectory(){ return 16 ; }
	public final long NSIntegerMax(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 9223372036854775807l : 2147483647l); }
	public final long NSIntegerMin(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? -9223372036854775808l : -2147483648l); }
	public final int NSInternalScriptError(){ return 8 ; }
	public final int NSInternalSpecifierError(){ return 5 ; }
	public final int NSIntersectSetExpressionType(){ return 6 ; }
	public final int NSInvalidIndexSpecifierError(){ return 4 ; }
	public final int NSItemReplacementDirectory(){ return 99 ; }
	public final int NSJSONReadingAllowFragments(){ return 4 ; }
	public final int NSJSONReadingMutableContainers(){ return 1 ; }
	public final int NSJSONReadingMutableLeaves(){ return 2 ; }
	public final int NSJSONWritingPrettyPrinted(){ return 1 ; }
	public final int NSJapaneseEUCStringEncoding(){ return 3 ; }
	public final int NSKeyPathExpressionType(){ return 3 ; }
	public final int NSKeySpecifierEvaluationScriptError(){ return 2 ; }
	public final int NSKeyValueChangeInsertion(){ return 2 ; }
	public final int NSKeyValueChangeRemoval(){ return 3 ; }
	public final int NSKeyValueChangeReplacement(){ return 4 ; }
	public final int NSKeyValueChangeSetting(){ return 1 ; }
	public final int NSKeyValueIntersectSetMutation(){ return 3 ; }
	public final int NSKeyValueMinusSetMutation(){ return 2 ; }
	public final int NSKeyValueObservingOptionInitial(){ return 4 ; }
	public final int NSKeyValueObservingOptionNew(){ return 1 ; }
	public final int NSKeyValueObservingOptionOld(){ return 2 ; }
	public final int NSKeyValueObservingOptionPrior(){ return 8 ; }
	public final int NSKeyValueSetSetMutation(){ return 4 ; }
	public final int NSKeyValueUnionSetMutation(){ return 1 ; }
	public final int NSKeyValueValidationError(){ return 1024 ; }
	public final int NSLessThanComparison(){ return 2 ; }
	public final int NSLessThanOrEqualToComparison(){ return 1 ; }
	public final int NSLessThanOrEqualToPredicateOperatorType(){ return 1 ; }
	public final int NSLessThanPredicateOperatorType(){ return 0 ; }
	public final int NSLibraryDirectory(){ return 5 ; }
	public final int NSLikePredicateOperatorType(){ return 7 ; }
	public final int NSLinguisticTaggerJoinNames(){ return 16 ; }
	public final int NSLinguisticTaggerOmitOther(){ return 8 ; }
	public final int NSLinguisticTaggerOmitPunctuation(){ return 2 ; }
	public final int NSLinguisticTaggerOmitWhitespace(){ return 4 ; }
	public final int NSLinguisticTaggerOmitWords(){ return 1 ; }
	public final int NSLiteralSearch(){ return 2 ; }
	public final int NSLocalDomainMask(){ return 2 ; }
	public final int NSLocaleLanguageDirectionBottomToTop(){ return 4 ; }
	public final int NSLocaleLanguageDirectionLeftToRight(){ return 1 ; }
	public final int NSLocaleLanguageDirectionRightToLeft(){ return 2 ; }
	public final int NSLocaleLanguageDirectionTopToBottom(){ return 3 ; }
	public final int NSLocaleLanguageDirectionUnknown(){ return 0 ; }
	public final int NSMACHOperatingSystem(){ return 5 ; }
	public final int NSMacOSRomanStringEncoding(){ return 30 ; }
	public final int NSMachPortDeallocateNone(){ return 0 ; }
	public final int NSMachPortDeallocateReceiveRight(){ return 2 ; }
	public final int NSMachPortDeallocateSendRight(){ return 1 ; }
	public final int NSMapTableCopyIn(){ return 65536 ; }
	public final int NSMapTableObjectPointerPersonality(){ return 512 ; }
	public final int NSMapTableStrongMemory(){ return 0 ; }
	public final int NSMapTableWeakMemory(){ return 5 ; }
	public final int NSMapTableZeroingWeakMemory(){ return 1 ; }
	public final int NSMappedRead(){ return 1 ; }
	public final int NSMatchesPredicateOperatorType(){ return 6 ; }
	public final int NSMatchingAnchored(){ return 4 ; }
	public final int NSMatchingCompleted(){ return 2 ; }
	public final int NSMatchingHitEnd(){ return 4 ; }
	public final int NSMatchingInternalError(){ return 16 ; }
	public final int NSMatchingProgress(){ return 1 ; }
	public final int NSMatchingReportCompletion(){ return 2 ; }
	public final int NSMatchingReportProgress(){ return 1 ; }
	public final int NSMatchingRequiredEnd(){ return 8 ; }
	public final int NSMatchingWithTransparentBounds(){ return 8 ; }
	public final int NSMatchingWithoutAnchoringBounds(){ return 16 ; }
	public final int NSMaxXEdge(){ return 2 ; }
	public final int NSMaxYEdge(){ return 3 ; }
	public final int NSMaximumStringLength(){ return 2147483646 ; }
	public final int NSMiddleSubelement(){ return 2 ; }
	public final int NSMinXEdge(){ return 0 ; }
	public final int NSMinYEdge(){ return 1 ; }
	public final int NSMinusSetExpressionType(){ return 7 ; }
	public final int NSMinuteCalendarUnit(){ return 64 ; }
	public final int NSMonthCalendarUnit(){ return 8 ; }
	public final int NSMoviesDirectory(){ return 17 ; }
	public final int NSMusicDirectory(){ return 18 ; }
	public final int NSNEXTSTEPStringEncoding(){ return 2 ; }
	public final int NSNetServiceNoAutoRename(){ return 1 ; }
	public final int NSNetServicesActivityInProgress(){ return -72003 ; }
	public final int NSNetServicesBadArgumentError(){ return -72004 ; }
	public final int NSNetServicesCancelledError(){ return -72005 ; }
	public final int NSNetServicesCollisionError(){ return -72001 ; }
	public final int NSNetServicesInvalidError(){ return -72006 ; }
	public final int NSNetServicesNotFoundError(){ return -72002 ; }
	public final int NSNetServicesTimeoutError(){ return -72007 ; }
	public final int NSNetServicesUnknownError(){ return -72000 ; }
	public final int NSNetworkDomainMask(){ return 4 ; }
	public final int NSNoScriptError(){ return 0 ; }
	public final int NSNoSpecifierError(){ return 0 ; }
	public final int NSNoSubelement(){ return 4 ; }
	public final int NSNoTopLevelContainersSpecifierError(){ return 1 ; }
	public final int NSNonLossyASCIIStringEncoding(){ return 7 ; }
	public final int NSNormalizedPredicateOption(){ return 4 ; }
	public final int NSNotEqualToPredicateOperatorType(){ return 5 ; }
	public final long NSNotFound(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 9223372036854775807l : 2147483647l); }
	public final int NSNotPredicateType(){ return 0 ; }
	public final int NSNotificationCoalescingOnName(){ return 1 ; }
	public final int NSNotificationCoalescingOnSender(){ return 2 ; }
	public final int NSNotificationDeliverImmediately(){ return 1 ; }
	public final int NSNotificationNoCoalescing(){ return 0 ; }
	public final int NSNotificationPostToAllSessions(){ return 2 ; }
	public final int NSNotificationSuspensionBehaviorCoalesce(){ return 2 ; }
	public final int NSNotificationSuspensionBehaviorDeliverImmediately(){ return 4 ; }
	public final int NSNotificationSuspensionBehaviorDrop(){ return 1 ; }
	public final int NSNotificationSuspensionBehaviorHold(){ return 3 ; }
	public final int NSNumberFormatterBehavior10_0(){ return 1000 ; }
	public final int NSNumberFormatterBehavior10_4(){ return 1040 ; }
	public final int NSNumberFormatterBehaviorDefault(){ return 0 ; }
	public final int NSNumberFormatterCurrencyStyle(){ return 2 ; }
	public final int NSNumberFormatterDecimalStyle(){ return 1 ; }
	public final int NSNumberFormatterNoStyle(){ return 0 ; }
	public final int NSNumberFormatterPadAfterPrefix(){ return 1 ; }
	public final int NSNumberFormatterPadAfterSuffix(){ return 3 ; }
	public final int NSNumberFormatterPadBeforePrefix(){ return 0 ; }
	public final int NSNumberFormatterPadBeforeSuffix(){ return 2 ; }
	public final int NSNumberFormatterPercentStyle(){ return 3 ; }
	public final int NSNumberFormatterRoundCeiling(){ return 0 ; }
	public final int NSNumberFormatterRoundDown(){ return 2 ; }
	public final int NSNumberFormatterRoundFloor(){ return 1 ; }
	public final int NSNumberFormatterRoundHalfDown(){ return 5 ; }
	public final int NSNumberFormatterRoundHalfEven(){ return 4 ; }
	public final int NSNumberFormatterRoundHalfUp(){ return 6 ; }
	public final int NSNumberFormatterRoundUp(){ return 3 ; }
	public final int NSNumberFormatterScientificStyle(){ return 4 ; }
	public final int NSNumberFormatterSpellOutStyle(){ return 5 ; }
	public final int NSNumericSearch(){ return 64 ; }
	public final int NSOSF1OperatingSystem(){ return 7 ; }
	public final int NSObjectAutoreleasedEvent(){ return 3 ; }
	public final int NSObjectExtraRefDecrementedEvent(){ return 5 ; }
	public final int NSObjectExtraRefIncrementedEvent(){ return 4 ; }
	public final int NSObjectInternalRefDecrementedEvent(){ return 7 ; }
	public final int NSObjectInternalRefIncrementedEvent(){ return 6 ; }
	public final int NSOpenStepUnicodeReservedBase(){ return 62464 ; }
	public final int NSOperationNotSupportedForKeyScriptError(){ return 9 ; }
	public final int NSOperationNotSupportedForKeySpecifierError(){ return 6 ; }
	public final int NSOperationQueueDefaultMaxConcurrentOperationCount(){ return -1 ; }
	public final int NSOperationQueuePriorityHigh(){ return 4 ; }
	public final int NSOperationQueuePriorityLow(){ return -4 ; }
	public final int NSOperationQueuePriorityNormal(){ return 0 ; }
	public final int NSOperationQueuePriorityVeryHigh(){ return 8 ; }
	public final int NSOperationQueuePriorityVeryLow(){ return -8 ; }
	public final int NSOrPredicateType(){ return 2 ; }
	public final int NSOrderedAscending(){ return -1 ; }
	public final int NSOrderedDescending(){ return 1 ; }
	public final int NSOrderedSame(){ return 0 ; }
	public final int NSPicturesDirectory(){ return 19 ; }
	public final int NSPointerFunctionsCStringPersonality(){ return 768 ; }
	public final int NSPointerFunctionsCopyIn(){ return 65536 ; }
	public final int NSPointerFunctionsIntegerPersonality(){ return 1280 ; }
	public final int NSPointerFunctionsMachVirtualMemory(){ return 4 ; }
	public final int NSPointerFunctionsMallocMemory(){ return 3 ; }
	public final int NSPointerFunctionsObjectPersonality(){ return 0 ; }
	public final int NSPointerFunctionsObjectPointerPersonality(){ return 512 ; }
	public final int NSPointerFunctionsOpaqueMemory(){ return 2 ; }
	public final int NSPointerFunctionsOpaquePersonality(){ return 256 ; }
	public final int NSPointerFunctionsStrongMemory(){ return 0 ; }
	public final int NSPointerFunctionsStructPersonality(){ return 1024 ; }
	public final int NSPointerFunctionsWeakMemory(){ return 5 ; }
	public final int NSPointerFunctionsZeroingWeakMemory(){ return 1 ; }
	public final int NSPositionAfter(){ return 0 ; }
	public final int NSPositionBefore(){ return 1 ; }
	public final int NSPositionBeginning(){ return 2 ; }
	public final int NSPositionEnd(){ return 3 ; }
	public final int NSPositionReplace(){ return 4 ; }
	public final int NSPostASAP(){ return 2 ; }
	public final int NSPostNow(){ return 3 ; }
	public final int NSPostWhenIdle(){ return 1 ; }
	public final int NSPreferencePanesDirectory(){ return 22 ; }
	public final int NSPrinterDescriptionDirectory(){ return 20 ; }
	public final int NSPropertyListBinaryFormat_v1_0(){ return 200 ; }
	public final int NSPropertyListErrorMaximum(){ return 4095 ; }
	public final int NSPropertyListErrorMinimum(){ return 3840 ; }
	public final int NSPropertyListImmutable(){ return 0 ; }
	public final int NSPropertyListMutableContainers(){ return 1 ; }
	public final int NSPropertyListMutableContainersAndLeaves(){ return 2 ; }
	public final int NSPropertyListOpenStepFormat(){ return 1 ; }
	public final int NSPropertyListReadCorruptError(){ return 3840 ; }
	public final int NSPropertyListReadStreamError(){ return 3842 ; }
	public final int NSPropertyListReadUnknownVersionError(){ return 3841 ; }
	public final int NSPropertyListWriteStreamError(){ return 3851 ; }
	public final int NSPropertyListXMLFormat_v1_0(){ return 100 ; }
	public final int NSProprietaryStringEncoding(){ return 65536 ; }
	public final int NSQuarterCalendarUnit(){ return 2048 ; }
	public final int NSRandomSubelement(){ return 3 ; }
	public final int NSReceiverEvaluationScriptError(){ return 1 ; }
	public final int NSReceiversCantHandleCommandScriptError(){ return 4 ; }
	public final int NSRegularExpressionAllowCommentsAndWhitespace(){ return 2 ; }
	public final int NSRegularExpressionAnchorsMatchLines(){ return 16 ; }
	public final int NSRegularExpressionCaseInsensitive(){ return 1 ; }
	public final int NSRegularExpressionDotMatchesLineSeparators(){ return 8 ; }
	public final int NSRegularExpressionIgnoreMetacharacters(){ return 4 ; }
	public final int NSRegularExpressionSearch(){ return 1024 ; }
	public final int NSRegularExpressionUseUnicodeWordBoundaries(){ return 64 ; }
	public final int NSRegularExpressionUseUnixLineSeparators(){ return 32 ; }
	public final int NSRelativeAfter(){ return 0 ; }
	public final int NSRelativeBefore(){ return 1 ; }
	public final int NSRequiredArgumentsMissingScriptError(){ return 5 ; }
	public final int NSRoundBankers(){ return 3 ; }
	public final int NSRoundDown(){ return 1 ; }
	public final int NSRoundPlain(){ return 0 ; }
	public final int NSRoundUp(){ return 2 ; }
	public final int NSSaveOptionsAsk(){ return 2 ; }
	public final int NSSaveOptionsNo(){ return 1 ; }
	public final int NSSaveOptionsYes(){ return 0 ; }
	public final int NSScannedOption(){ return 1 ; }
	public final int NSSecondCalendarUnit(){ return 128 ; }
	public final int NSSharedPublicDirectory(){ return 21 ; }
	public final int NSShiftJISStringEncoding(){ return 8 ; }
	public final int NSSolarisOperatingSystem(){ return 3 ; }
	public final int NSSortConcurrent(){ return 1 ; }
	public final int NSSortStable(){ return 16 ; }
	public final int NSStreamEventEndEncountered(){ return 16 ; }
	public final int NSStreamEventErrorOccurred(){ return 8 ; }
	public final int NSStreamEventHasBytesAvailable(){ return 2 ; }
	public final int NSStreamEventHasSpaceAvailable(){ return 4 ; }
	public final int NSStreamEventNone(){ return 0 ; }
	public final int NSStreamEventOpenCompleted(){ return 1 ; }
	public final int NSStreamStatusAtEnd(){ return 5 ; }
	public final int NSStreamStatusClosed(){ return 6 ; }
	public final int NSStreamStatusError(){ return 7 ; }
	public final int NSStreamStatusNotOpen(){ return 0 ; }
	public final int NSStreamStatusOpen(){ return 2 ; }
	public final int NSStreamStatusOpening(){ return 1 ; }
	public final int NSStreamStatusReading(){ return 3 ; }
	public final int NSStreamStatusWriting(){ return 4 ; }
	public final int NSStringEncodingConversionAllowLossy(){ return 1 ; }
	public final int NSStringEncodingConversionExternalRepresentation(){ return 2 ; }
	public final int NSStringEnumerationByComposedCharacterSequences(){ return 2 ; }
	public final int NSStringEnumerationByLines(){ return 0 ; }
	public final int NSStringEnumerationByParagraphs(){ return 1 ; }
	public final int NSStringEnumerationBySentences(){ return 4 ; }
	public final int NSStringEnumerationByWords(){ return 3 ; }
	public final int NSStringEnumerationLocalized(){ return 1024 ; }
	public final int NSStringEnumerationReverse(){ return 256 ; }
	public final int NSStringEnumerationSubstringNotRequired(){ return 512 ; }
	public final int NSSubqueryExpressionType(){ return 13 ; }
	public final int NSSunOSOperatingSystem(){ return 6 ; }
	public final int NSSymbolStringEncoding(){ return 6 ; }
	public final int NSSystemDomainMask(){ return 8 ; }
	public final int NSTaskTerminationReasonExit(){ return 1 ; }
	public final int NSTaskTerminationReasonUncaughtSignal(){ return 2 ; }
	public final double NSTextCheckingAllCustomTypes(){ return 18446744069414584320d; }
	public final long NSTextCheckingAllSystemTypes(){ return 4294967295l; }
	public final float NSTextCheckingAllTypes(){ return 18446744073709551615f; }
	public final int NSTextCheckingTypeAddress(){ return 16 ; }
	public final int NSTextCheckingTypeCorrection(){ return 512 ; }
	public final int NSTextCheckingTypeDash(){ return 128 ; }
	public final int NSTextCheckingTypeDate(){ return 8 ; }
	public final int NSTextCheckingTypeGrammar(){ return 4 ; }
	public final int NSTextCheckingTypeLink(){ return 32 ; }
	public final int NSTextCheckingTypeOrthography(){ return 1 ; }
	public final int NSTextCheckingTypePhoneNumber(){ return 2048 ; }
	public final int NSTextCheckingTypeQuote(){ return 64 ; }
	public final int NSTextCheckingTypeRegularExpression(){ return 1024 ; }
	public final int NSTextCheckingTypeReplacement(){ return 256 ; }
	public final int NSTextCheckingTypeSpelling(){ return 2 ; }
	public final int NSTextCheckingTypeTransitInformation(){ return 4096 ; }
	public final float NSTimeIntervalSince1970(){ return 978307200.0f; }
	public final int NSTimeZoneCalendarUnit(){ return 2097152 ; }
	public final int NSTimeZoneNameStyleDaylightSaving(){ return 2 ; }
	public final int NSTimeZoneNameStyleGeneric(){ return 4 ; }
	public final int NSTimeZoneNameStyleShortDaylightSaving(){ return 3 ; }
	public final int NSTimeZoneNameStyleShortGeneric(){ return 5 ; }
	public final int NSTimeZoneNameStyleShortStandard(){ return 1 ; }
	public final int NSTimeZoneNameStyleStandard(){ return 0 ; }
	public final int NSTrashDirectory(){ return 102 ; }
	public final double NSUIntegerMax(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 18446744073709551615d : 4294967295d); }
	public final int NSURLBookmarkCreationMinimalBookmark(){ return 512 ; }
	public final int NSURLBookmarkCreationPreferFileIDResolution(){ return 256 ; }
	public final int NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess(){ return 4096 ; }
	public final int NSURLBookmarkCreationSuitableForBookmarkFile(){ return 1024 ; }
	public final int NSURLBookmarkCreationWithSecurityScope(){ return 2048 ; }
	public final int NSURLBookmarkResolutionWithSecurityScope(){ return 1024 ; }
	public final int NSURLBookmarkResolutionWithoutMounting(){ return 512 ; }
	public final int NSURLBookmarkResolutionWithoutUI(){ return 256 ; }
	public final int NSURLCacheStorageAllowed(){ return 0 ; }
	public final int NSURLCacheStorageAllowedInMemoryOnly(){ return 1 ; }
	public final int NSURLCacheStorageNotAllowed(){ return 2 ; }
	public final int NSURLCredentialPersistenceForSession(){ return 1 ; }
	public final int NSURLCredentialPersistenceNone(){ return 0 ; }
	public final int NSURLCredentialPersistencePermanent(){ return 2 ; }
	public final int NSURLErrorBadServerResponse(){ return -1011 ; }
	public final int NSURLErrorBadURL(){ return -1000 ; }
	public final int NSURLErrorCallIsActive(){ return -1019 ; }
	public final int NSURLErrorCancelled(){ return -999 ; }
	public final int NSURLErrorCannotCloseFile(){ return -3002 ; }
	public final int NSURLErrorCannotConnectToHost(){ return -1004 ; }
	public final int NSURLErrorCannotCreateFile(){ return -3000 ; }
	public final int NSURLErrorCannotDecodeContentData(){ return -1016 ; }
	public final int NSURLErrorCannotDecodeRawData(){ return -1015 ; }
	public final int NSURLErrorCannotFindHost(){ return -1003 ; }
	public final int NSURLErrorCannotLoadFromNetwork(){ return -2000 ; }
	public final int NSURLErrorCannotMoveFile(){ return -3005 ; }
	public final int NSURLErrorCannotOpenFile(){ return -3001 ; }
	public final int NSURLErrorCannotParseResponse(){ return -1017 ; }
	public final int NSURLErrorCannotRemoveFile(){ return -3004 ; }
	public final int NSURLErrorCannotWriteToFile(){ return -3003 ; }
	public final int NSURLErrorClientCertificateRejected(){ return -1205 ; }
	public final int NSURLErrorClientCertificateRequired(){ return -1206 ; }
	public final int NSURLErrorDNSLookupFailed(){ return -1006 ; }
	public final int NSURLErrorDataLengthExceedsMaximum(){ return -1103 ; }
	public final int NSURLErrorDataNotAllowed(){ return -1020 ; }
	public final int NSURLErrorDownloadDecodingFailedMidStream(){ return -3006 ; }
	public final int NSURLErrorDownloadDecodingFailedToComplete(){ return -3007 ; }
	public final int NSURLErrorFileDoesNotExist(){ return -1100 ; }
	public final int NSURLErrorFileIsDirectory(){ return -1101 ; }
	public final int NSURLErrorHTTPTooManyRedirects(){ return -1007 ; }
	public final int NSURLErrorInternationalRoamingOff(){ return -1018 ; }
	public final int NSURLErrorNetworkConnectionLost(){ return -1005 ; }
	public final int NSURLErrorNoPermissionsToReadFile(){ return -1102 ; }
	public final int NSURLErrorNotConnectedToInternet(){ return -1009 ; }
	public final int NSURLErrorRedirectToNonExistentLocation(){ return -1010 ; }
	public final int NSURLErrorRequestBodyStreamExhausted(){ return -1021 ; }
	public final int NSURLErrorResourceUnavailable(){ return -1008 ; }
	public final int NSURLErrorSecureConnectionFailed(){ return -1200 ; }
	public final int NSURLErrorServerCertificateHasBadDate(){ return -1201 ; }
	public final int NSURLErrorServerCertificateHasUnknownRoot(){ return -1203 ; }
	public final int NSURLErrorServerCertificateNotYetValid(){ return -1204 ; }
	public final int NSURLErrorServerCertificateUntrusted(){ return -1202 ; }
	public final int NSURLErrorTimedOut(){ return -1001 ; }
	public final int NSURLErrorUnknown(){ return -1 ; }
	public final int NSURLErrorUnsupportedURL(){ return -1002 ; }
	public final int NSURLErrorUserAuthenticationRequired(){ return -1013 ; }
	public final int NSURLErrorUserCancelledAuthentication(){ return -1012 ; }
	public final int NSURLErrorZeroByteResource(){ return -1014 ; }
	public final int NSURLHandleLoadFailed(){ return 3 ; }
	public final int NSURLHandleLoadInProgress(){ return 2 ; }
	public final int NSURLHandleLoadSucceeded(){ return 1 ; }
	public final int NSURLHandleNotLoaded(){ return 0 ; }
	public final int NSURLNetworkServiceTypeBackground(){ return 3 ; }
	public final int NSURLNetworkServiceTypeDefault(){ return 0 ; }
	public final int NSURLNetworkServiceTypeVideo(){ return 2 ; }
	public final int NSURLNetworkServiceTypeVoIP(){ return 1 ; }
	public final int NSURLNetworkServiceTypeVoice(){ return 4 ; }
	public final int NSURLRequestReloadIgnoringCacheData(){ return 1 ; }
	public final int NSURLRequestReloadIgnoringLocalAndRemoteCacheData(){ return 4 ; }
	public final int NSURLRequestReloadIgnoringLocalCacheData(){ return 1 ; }
	public final int NSURLRequestReloadRevalidatingCacheData(){ return 5 ; }
	public final int NSURLRequestReturnCacheDataDontLoad(){ return 3 ; }
	public final int NSURLRequestReturnCacheDataElseLoad(){ return 2 ; }
	public final int NSURLRequestUseProtocolCachePolicy(){ return 0 ; }
	public final int NSURLResponseUnknownLength(){ return -1 ; }
	public final long NSUTF16BigEndianStringEncoding(){ return 2415919360l; }
	public final long NSUTF16LittleEndianStringEncoding(){ return 2483028224l; }
	public final int NSUTF16StringEncoding(){ return 10 ; }
	public final long NSUTF32BigEndianStringEncoding(){ return 2550137088l; }
	public final long NSUTF32LittleEndianStringEncoding(){ return 2617245952l; }
	public final long NSUTF32StringEncoding(){ return 2348810496l; }
	public final int NSUTF8StringEncoding(){ return 4 ; }
	public final int NSUbiquitousKeyValueStoreAccountChange(){ return 3 ; }
	public final int NSUbiquitousKeyValueStoreInitialSyncChange(){ return 1 ; }
	public final int NSUbiquitousKeyValueStoreQuotaViolationChange(){ return 2 ; }
	public final int NSUbiquitousKeyValueStoreServerChange(){ return 0 ; }
	public final int NSUncachedRead(){ return 2 ; }
	public final long NSUndefinedDateComponent(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 9223372036854775807l : 2147483647l); }
	public final int NSUndoCloseGroupingRunLoopOrdering(){ return 350000 ; }
	public final int NSUnicodeStringEncoding(){ return 10 ; }
	public final int NSUnionSetExpressionType(){ return 5 ; }
	public final int NSUnknownKeyScriptError(){ return 7 ; }
	public final int NSUnknownKeySpecifierError(){ return 3 ; }
	public final int NSUserCancelledError(){ return 3072 ; }
	public final int NSUserDirectory(){ return 7 ; }
	public final int NSUserDomainMask(){ return 1 ; }
	public final int NSUserNotificationActivationTypeActionButtonClicked(){ return 2 ; }
	public final int NSUserNotificationActivationTypeContentsClicked(){ return 1 ; }
	public final int NSUserNotificationActivationTypeNone(){ return 0 ; }
	public final int NSValidationErrorMaximum(){ return 2047 ; }
	public final int NSValidationErrorMinimum(){ return 1024 ; }
	public final int NSVariableExpressionType(){ return 2 ; }
	public final int NSVolumeEnumerationProduceFileReferenceURLs(){ return 4 ; }
	public final int NSVolumeEnumerationSkipHiddenVolumes(){ return 2 ; }
	public final int NSWeekCalendarUnit(){ return 256 ; }
	public final int NSWeekOfMonthCalendarUnit(){ return 4096 ; }
	public final int NSWeekOfYearCalendarUnit(){ return 8192 ; }
	public final int NSWeekdayCalendarUnit(){ return 512 ; }
	public final int NSWeekdayOrdinalCalendarUnit(){ return 1024 ; }
	public final int NSWidthInsensitiveSearch(){ return 256 ; }
	public final int NSWindows95OperatingSystem(){ return 2 ; }
	public final int NSWindowsCP1250StringEncoding(){ return 15 ; }
	public final int NSWindowsCP1251StringEncoding(){ return 11 ; }
	public final int NSWindowsCP1252StringEncoding(){ return 12 ; }
	public final int NSWindowsCP1253StringEncoding(){ return 13 ; }
	public final int NSWindowsCP1254StringEncoding(){ return 14 ; }
	public final int NSWindowsNTOperatingSystem(){ return 1 ; }
	public final int NSWrapCalendarComponents(){ return 1 ; }
	public final int NSXMLAttributeCDATAKind(){ return 6 ; }
	public final int NSXMLAttributeDeclarationKind(){ return 10 ; }
	public final int NSXMLAttributeEntitiesKind(){ return 11 ; }
	public final int NSXMLAttributeEntityKind(){ return 10 ; }
	public final int NSXMLAttributeEnumerationKind(){ return 14 ; }
	public final int NSXMLAttributeIDKind(){ return 7 ; }
	public final int NSXMLAttributeIDRefKind(){ return 8 ; }
	public final int NSXMLAttributeIDRefsKind(){ return 9 ; }
	public final int NSXMLAttributeKind(){ return 3 ; }
	public final int NSXMLAttributeNMTokenKind(){ return 12 ; }
	public final int NSXMLAttributeNMTokensKind(){ return 13 ; }
	public final int NSXMLAttributeNotationKind(){ return 15 ; }
	public final int NSXMLCommentKind(){ return 6 ; }
	public final int NSXMLDTDKind(){ return 8 ; }
	public final int NSXMLDocumentHTMLKind(){ return 2 ; }
	public final int NSXMLDocumentIncludeContentTypeDeclaration(){ return 262144 ; }
	public final int NSXMLDocumentKind(){ return 1 ; }
	public final int NSXMLDocumentTextKind(){ return 3 ; }
	public final int NSXMLDocumentTidyHTML(){ return 512 ; }
	public final int NSXMLDocumentTidyXML(){ return 1024 ; }
	public final int NSXMLDocumentValidate(){ return 8192 ; }
	public final int NSXMLDocumentXHTMLKind(){ return 1 ; }
	public final int NSXMLDocumentXInclude(){ return 65536 ; }
	public final int NSXMLDocumentXMLKind(){ return 0 ; }
	public final int NSXMLElementDeclarationAnyKind(){ return 18 ; }
	public final int NSXMLElementDeclarationElementKind(){ return 20 ; }
	public final int NSXMLElementDeclarationEmptyKind(){ return 17 ; }
	public final int NSXMLElementDeclarationKind(){ return 11 ; }
	public final int NSXMLElementDeclarationMixedKind(){ return 19 ; }
	public final int NSXMLElementDeclarationUndefinedKind(){ return 16 ; }
	public final int NSXMLElementKind(){ return 2 ; }
	public final int NSXMLEntityDeclarationKind(){ return 9 ; }
	public final int NSXMLEntityGeneralKind(){ return 1 ; }
	public final int NSXMLEntityParameterKind(){ return 4 ; }
	public final int NSXMLEntityParsedKind(){ return 2 ; }
	public final int NSXMLEntityPredefined(){ return 5 ; }
	public final int NSXMLEntityUnparsedKind(){ return 3 ; }
	public final int NSXMLInvalidKind(){ return 0 ; }
	public final int NSXMLNamespaceKind(){ return 4 ; }
	public final int NSXMLNodeCompactEmptyElement(){ return 4 ; }
	public final int NSXMLNodeExpandEmptyElement(){ return 2 ; }
	public final int NSXMLNodeIsCDATA(){ return 1 ; }
	public final int NSXMLNodeLoadExternalEntitiesAlways(){ return 16384 ; }
	public final int NSXMLNodeLoadExternalEntitiesNever(){ return 524288 ; }
	public final int NSXMLNodeLoadExternalEntitiesSameOriginOnly(){ return 32768 ; }
	public final int NSXMLNodeOptionsNone(){ return 0 ; }
	public final long NSXMLNodePreserveAll(){ return 4293918750l; }
	public final int NSXMLNodePreserveAttributeOrder(){ return 2097152 ; }
	public final int NSXMLNodePreserveCDATA(){ return 16777216 ; }
	public final int NSXMLNodePreserveCharacterReferences(){ return 134217728 ; }
	public final int NSXMLNodePreserveDTD(){ return 67108864 ; }
	public final int NSXMLNodePreserveEmptyElements(){ return 6 ; }
	public final int NSXMLNodePreserveEntities(){ return 4194304 ; }
	public final int NSXMLNodePreserveNamespaceOrder(){ return 1048576 ; }
	public final int NSXMLNodePreservePrefixes(){ return 8388608 ; }
	public final int NSXMLNodePreserveQuotes(){ return 24 ; }
	public final int NSXMLNodePreserveWhitespace(){ return 33554432 ; }
	public final int NSXMLNodePrettyPrint(){ return 131072 ; }
	public final int NSXMLNodeUseDoubleQuotes(){ return 16 ; }
	public final int NSXMLNodeUseSingleQuotes(){ return 8 ; }
	public final int NSXMLNotationDeclarationKind(){ return 12 ; }
	public final int NSXMLParserAttributeHasNoValueError(){ return 41 ; }
	public final int NSXMLParserAttributeListNotFinishedError(){ return 51 ; }
	public final int NSXMLParserAttributeListNotStartedError(){ return 50 ; }
	public final int NSXMLParserAttributeNotFinishedError(){ return 40 ; }
	public final int NSXMLParserAttributeNotStartedError(){ return 39 ; }
	public final int NSXMLParserAttributeRedefinedError(){ return 42 ; }
	public final int NSXMLParserCDATANotFinishedError(){ return 63 ; }
	public final int NSXMLParserCharacterRefAtEOFError(){ return 10 ; }
	public final int NSXMLParserCharacterRefInDTDError(){ return 13 ; }
	public final int NSXMLParserCharacterRefInEpilogError(){ return 12 ; }
	public final int NSXMLParserCharacterRefInPrologError(){ return 11 ; }
	public final int NSXMLParserCommentContainsDoubleHyphenError(){ return 80 ; }
	public final int NSXMLParserCommentNotFinishedError(){ return 45 ; }
	public final int NSXMLParserConditionalSectionNotFinishedError(){ return 59 ; }
	public final int NSXMLParserConditionalSectionNotStartedError(){ return 58 ; }
	public final int NSXMLParserDOCTYPEDeclNotFinishedError(){ return 61 ; }
	public final int NSXMLParserDelegateAbortedParseError(){ return 512 ; }
	public final int NSXMLParserDocumentStartError(){ return 3 ; }
	public final int NSXMLParserElementContentDeclNotFinishedError(){ return 55 ; }
	public final int NSXMLParserElementContentDeclNotStartedError(){ return 54 ; }
	public final int NSXMLParserEmptyDocumentError(){ return 4 ; }
	public final int NSXMLParserEncodingNotSupportedError(){ return 32 ; }
	public final int NSXMLParserEntityBoundaryError(){ return 90 ; }
	public final int NSXMLParserEntityIsExternalError(){ return 29 ; }
	public final int NSXMLParserEntityIsParameterError(){ return 30 ; }
	public final int NSXMLParserEntityNotFinishedError(){ return 37 ; }
	public final int NSXMLParserEntityNotStartedError(){ return 36 ; }
	public final int NSXMLParserEntityRefAtEOFError(){ return 14 ; }
	public final int NSXMLParserEntityRefInDTDError(){ return 17 ; }
	public final int NSXMLParserEntityRefInEpilogError(){ return 16 ; }
	public final int NSXMLParserEntityRefInPrologError(){ return 15 ; }
	public final int NSXMLParserEntityRefLoopError(){ return 89 ; }
	public final int NSXMLParserEntityReferenceMissingSemiError(){ return 23 ; }
	public final int NSXMLParserEntityReferenceWithoutNameError(){ return 22 ; }
	public final int NSXMLParserEntityValueRequiredError(){ return 84 ; }
	public final int NSXMLParserEqualExpectedError(){ return 75 ; }
	public final int NSXMLParserExternalStandaloneEntityError(){ return 82 ; }
	public final int NSXMLParserExternalSubsetNotFinishedError(){ return 60 ; }
	public final int NSXMLParserExtraContentError(){ return 86 ; }
	public final int NSXMLParserGTRequiredError(){ return 73 ; }
	public final int NSXMLParserInternalError(){ return 1 ; }
	public final int NSXMLParserInvalidCharacterError(){ return 9 ; }
	public final int NSXMLParserInvalidCharacterInEntityError(){ return 87 ; }
	public final int NSXMLParserInvalidCharacterRefError(){ return 8 ; }
	public final int NSXMLParserInvalidConditionalSectionError(){ return 83 ; }
	public final int NSXMLParserInvalidDecimalCharacterRefError(){ return 7 ; }
	public final int NSXMLParserInvalidEncodingError(){ return 81 ; }
	public final int NSXMLParserInvalidEncodingNameError(){ return 79 ; }
	public final int NSXMLParserInvalidHexCharacterRefError(){ return 6 ; }
	public final int NSXMLParserInvalidURIError(){ return 91 ; }
	public final int NSXMLParserLTRequiredError(){ return 72 ; }
	public final int NSXMLParserLTSlashRequiredError(){ return 74 ; }
	public final int NSXMLParserLessThanSymbolInAttributeError(){ return 38 ; }
	public final int NSXMLParserLiteralNotFinishedError(){ return 44 ; }
	public final int NSXMLParserLiteralNotStartedError(){ return 43 ; }
	public final int NSXMLParserMisplacedCDATAEndStringError(){ return 62 ; }
	public final int NSXMLParserMisplacedXMLDeclarationError(){ return 64 ; }
	public final int NSXMLParserMixedContentDeclNotFinishedError(){ return 53 ; }
	public final int NSXMLParserMixedContentDeclNotStartedError(){ return 52 ; }
	public final int NSXMLParserNAMERequiredError(){ return 68 ; }
	public final int NSXMLParserNMTOKENRequiredError(){ return 67 ; }
	public final int NSXMLParserNamespaceDeclarationError(){ return 35 ; }
	public final int NSXMLParserNoDTDError(){ return 94 ; }
	public final int NSXMLParserNotWellBalancedError(){ return 85 ; }
	public final int NSXMLParserNotationNotFinishedError(){ return 49 ; }
	public final int NSXMLParserNotationNotStartedError(){ return 48 ; }
	public final int NSXMLParserOutOfMemoryError(){ return 2 ; }
	public final int NSXMLParserPCDATARequiredError(){ return 69 ; }
	public final int NSXMLParserParsedEntityRefAtEOFError(){ return 18 ; }
	public final int NSXMLParserParsedEntityRefInEpilogError(){ return 20 ; }
	public final int NSXMLParserParsedEntityRefInInternalError(){ return 88 ; }
	public final int NSXMLParserParsedEntityRefInInternalSubsetError(){ return 21 ; }
	public final int NSXMLParserParsedEntityRefInPrologError(){ return 19 ; }
	public final int NSXMLParserParsedEntityRefMissingSemiError(){ return 25 ; }
	public final int NSXMLParserParsedEntityRefNoNameError(){ return 24 ; }
	public final int NSXMLParserPrematureDocumentEndError(){ return 5 ; }
	public final int NSXMLParserProcessingInstructionNotFinishedError(){ return 47 ; }
	public final int NSXMLParserProcessingInstructionNotStartedError(){ return 46 ; }
	public final int NSXMLParserPublicIdentifierRequiredError(){ return 71 ; }
	public final int NSXMLParserSeparatorRequiredError(){ return 66 ; }
	public final int NSXMLParserSpaceRequiredError(){ return 65 ; }
	public final int NSXMLParserStandaloneValueError(){ return 78 ; }
	public final int NSXMLParserStringNotClosedError(){ return 34 ; }
	public final int NSXMLParserStringNotStartedError(){ return 33 ; }
	public final int NSXMLParserTagNameMismatchError(){ return 76 ; }
	public final int NSXMLParserURIFragmentError(){ return 92 ; }
	public final int NSXMLParserURIRequiredError(){ return 70 ; }
	public final int NSXMLParserUndeclaredEntityError(){ return 26 ; }
	public final int NSXMLParserUnfinishedTagError(){ return 77 ; }
	public final int NSXMLParserUnknownEncodingError(){ return 31 ; }
	public final int NSXMLParserUnparsedEntityError(){ return 28 ; }
	public final int NSXMLParserXMLDeclNotFinishedError(){ return 57 ; }
	public final int NSXMLParserXMLDeclNotStartedError(){ return 56 ; }
	public final int NSXMLProcessingInstructionKind(){ return 5 ; }
	public final int NSXMLTextKind(){ return 7 ; }
	public final int NSXPCConnectionErrorMaximum(){ return 4224 ; }
	public final int NSXPCConnectionErrorMinimum(){ return 4096 ; }
	public final int NSXPCConnectionInterrupted(){ return 4097 ; }
	public final int NSXPCConnectionInvalid(){ return 4099 ; }
	public final int NSXPCConnectionPrivileged(){ return 4096 ; }
	public final int NSXPCConnectionReplyInvalid(){ return 4101 ; }
	public final int NSYearCalendarUnit(){ return 4 ; }
	public final int NSYearForWeekOfYearCalendarUnit(){ return 16384 ; }
	public final int NS_BLOCKS_AVAILABLE(){ return 1 ; }
	public final int NS_BigEndian(){ return 2 ; }
	public final int NS_LittleEndian(){ return 1 ; }
	public final int NS_UNICHAR_IS_EIGHT_BIT(){ return 0 ; }
	public final int NS_UnknownByteOrder(){ return 0 ; }

	private com.apple.jobjc.foundation.NSString _NSAMPMDesignation = null;
	 final public com.apple.jobjc.foundation.NSString NSAMPMDesignation(){
		if(_NSAMPMDesignation != null) return _NSAMPMDesignation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAMPMDesignation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAMPMDesignation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleEventManagerWillProcessFirstEventNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleEventManagerWillProcessFirstEventNotification(){
		if(_NSAppleEventManagerWillProcessFirstEventNotification != null) return _NSAppleEventManagerWillProcessFirstEventNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleEventManagerWillProcessFirstEventNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleEventManagerWillProcessFirstEventNotification = returnValue;
		return returnValue;
	}

	private double _NSAppleEventTimeOutDefault = 0;
	 final public double NSAppleEventTimeOutDefault(){
		if(_NSAppleEventTimeOutDefault != 0) return _NSAppleEventTimeOutDefault;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleEventTimeOutDefault", nativeBuffer, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.sizeof());
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		_NSAppleEventTimeOutDefault = returnValue;
		return returnValue;
	}

	private double _NSAppleEventTimeOutNone = 0;
	 final public double NSAppleEventTimeOutNone(){
		if(_NSAppleEventTimeOutNone != 0) return _NSAppleEventTimeOutNone;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleEventTimeOutNone", nativeBuffer, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.sizeof());
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		_NSAppleEventTimeOutNone = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleScriptErrorAppName = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleScriptErrorAppName(){
		if(_NSAppleScriptErrorAppName != null) return _NSAppleScriptErrorAppName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleScriptErrorAppName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleScriptErrorAppName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleScriptErrorBriefMessage = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleScriptErrorBriefMessage(){
		if(_NSAppleScriptErrorBriefMessage != null) return _NSAppleScriptErrorBriefMessage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleScriptErrorBriefMessage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleScriptErrorBriefMessage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleScriptErrorMessage = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleScriptErrorMessage(){
		if(_NSAppleScriptErrorMessage != null) return _NSAppleScriptErrorMessage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleScriptErrorMessage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleScriptErrorMessage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleScriptErrorNumber = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleScriptErrorNumber(){
		if(_NSAppleScriptErrorNumber != null) return _NSAppleScriptErrorNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleScriptErrorNumber", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleScriptErrorNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppleScriptErrorRange = null;
	 final public com.apple.jobjc.foundation.NSString NSAppleScriptErrorRange(){
		if(_NSAppleScriptErrorRange != null) return _NSAppleScriptErrorRange;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppleScriptErrorRange", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppleScriptErrorRange = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSArgumentDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSArgumentDomain(){
		if(_NSArgumentDomain != null) return _NSArgumentDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSArgumentDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSArgumentDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAssertionHandlerKey = null;
	 final public com.apple.jobjc.foundation.NSString NSAssertionHandlerKey(){
		if(_NSAssertionHandlerKey != null) return _NSAssertionHandlerKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAssertionHandlerKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAssertionHandlerKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAverageKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSAverageKeyValueOperator(){
		if(_NSAverageKeyValueOperator != null) return _NSAverageKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAverageKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAverageKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBuddhistCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSBuddhistCalendar(){
		if(_NSBuddhistCalendar != null) return _NSBuddhistCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBuddhistCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBuddhistCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBundleDidLoadNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSBundleDidLoadNotification(){
		if(_NSBundleDidLoadNotification != null) return _NSBundleDidLoadNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBundleDidLoadNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBundleDidLoadNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCharacterConversionException = null;
	 final public com.apple.jobjc.foundation.NSString NSCharacterConversionException(){
		if(_NSCharacterConversionException != null) return _NSCharacterConversionException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCharacterConversionException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCharacterConversionException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSChineseCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSChineseCalendar(){
		if(_NSChineseCalendar != null) return _NSChineseCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSChineseCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSChineseCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSClassDescriptionNeededForClassNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSClassDescriptionNeededForClassNotification(){
		if(_NSClassDescriptionNeededForClassNotification != null) return _NSClassDescriptionNeededForClassNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSClassDescriptionNeededForClassNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSClassDescriptionNeededForClassNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCocoaErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSCocoaErrorDomain(){
		if(_NSCocoaErrorDomain != null) return _NSCocoaErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCocoaErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCocoaErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConnectionDidDieNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSConnectionDidDieNotification(){
		if(_NSConnectionDidDieNotification != null) return _NSConnectionDidDieNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConnectionDidDieNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConnectionDidDieNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConnectionDidInitializeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSConnectionDidInitializeNotification(){
		if(_NSConnectionDidInitializeNotification != null) return _NSConnectionDidInitializeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConnectionDidInitializeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConnectionDidInitializeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConnectionReplyMode = null;
	 final public com.apple.jobjc.foundation.NSString NSConnectionReplyMode(){
		if(_NSConnectionReplyMode != null) return _NSConnectionReplyMode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConnectionReplyMode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConnectionReplyMode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCountKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSCountKeyValueOperator(){
		if(_NSCountKeyValueOperator != null) return _NSCountKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCountKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCountKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCurrencySymbol = null;
	 final public com.apple.jobjc.foundation.NSString NSCurrencySymbol(){
		if(_NSCurrencySymbol != null) return _NSCurrencySymbol;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCurrencySymbol", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCurrencySymbol = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCurrentLocaleDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSCurrentLocaleDidChangeNotification(){
		if(_NSCurrentLocaleDidChangeNotification != null) return _NSCurrentLocaleDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCurrentLocaleDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCurrentLocaleDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDateFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSDateFormatString(){
		if(_NSDateFormatString != null) return _NSDateFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDateFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDateFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDateTimeOrdering = null;
	 final public com.apple.jobjc.foundation.NSString NSDateTimeOrdering(){
		if(_NSDateTimeOrdering != null) return _NSDateTimeOrdering;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDateTimeOrdering", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDateTimeOrdering = returnValue;
		return returnValue;
	}

	private boolean _NSDeallocateZombies = false;
	 final public boolean NSDeallocateZombies(){
		if(_NSDeallocateZombies != false) return _NSDeallocateZombies;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeallocateZombies", nativeBuffer, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.sizeof());
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		_NSDeallocateZombies = returnValue;
		return returnValue;
	}

	private boolean _NSDebugEnabled = false;
	 final public boolean NSDebugEnabled(){
		if(_NSDebugEnabled != false) return _NSDebugEnabled;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDebugEnabled", nativeBuffer, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.sizeof());
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		_NSDebugEnabled = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalDigits = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalDigits(){
		if(_NSDecimalDigits != null) return _NSDecimalDigits;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalDigits", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalDigits = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalNumberDivideByZeroException = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalNumberDivideByZeroException(){
		if(_NSDecimalNumberDivideByZeroException != null) return _NSDecimalNumberDivideByZeroException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalNumberDivideByZeroException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalNumberDivideByZeroException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalNumberExactnessException = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalNumberExactnessException(){
		if(_NSDecimalNumberExactnessException != null) return _NSDecimalNumberExactnessException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalNumberExactnessException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalNumberExactnessException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalNumberOverflowException = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalNumberOverflowException(){
		if(_NSDecimalNumberOverflowException != null) return _NSDecimalNumberOverflowException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalNumberOverflowException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalNumberOverflowException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalNumberUnderflowException = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalNumberUnderflowException(){
		if(_NSDecimalNumberUnderflowException != null) return _NSDecimalNumberUnderflowException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalNumberUnderflowException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalNumberUnderflowException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDecimalSeparator = null;
	 final public com.apple.jobjc.foundation.NSString NSDecimalSeparator(){
		if(_NSDecimalSeparator != null) return _NSDecimalSeparator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDecimalSeparator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDecimalSeparator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefaultRunLoopMode = null;
	 final public com.apple.jobjc.foundation.NSString NSDefaultRunLoopMode(){
		if(_NSDefaultRunLoopMode != null) return _NSDefaultRunLoopMode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefaultRunLoopMode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefaultRunLoopMode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDestinationInvalidException = null;
	 final public com.apple.jobjc.foundation.NSString NSDestinationInvalidException(){
		if(_NSDestinationInvalidException != null) return _NSDestinationInvalidException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDestinationInvalidException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDestinationInvalidException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDidBecomeSingleThreadedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSDidBecomeSingleThreadedNotification(){
		if(_NSDidBecomeSingleThreadedNotification != null) return _NSDidBecomeSingleThreadedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDidBecomeSingleThreadedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDidBecomeSingleThreadedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDistinctUnionOfArraysKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSDistinctUnionOfArraysKeyValueOperator(){
		if(_NSDistinctUnionOfArraysKeyValueOperator != null) return _NSDistinctUnionOfArraysKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDistinctUnionOfArraysKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDistinctUnionOfArraysKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDistinctUnionOfObjectsKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSDistinctUnionOfObjectsKeyValueOperator(){
		if(_NSDistinctUnionOfObjectsKeyValueOperator != null) return _NSDistinctUnionOfObjectsKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDistinctUnionOfObjectsKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDistinctUnionOfObjectsKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDistinctUnionOfSetsKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSDistinctUnionOfSetsKeyValueOperator(){
		if(_NSDistinctUnionOfSetsKeyValueOperator != null) return _NSDistinctUnionOfSetsKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDistinctUnionOfSetsKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDistinctUnionOfSetsKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSEarlierTimeDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSEarlierTimeDesignations(){
		if(_NSEarlierTimeDesignations != null) return _NSEarlierTimeDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSEarlierTimeDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSEarlierTimeDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSErrorFailingURLStringKey = null;
	 final public com.apple.jobjc.foundation.NSString NSErrorFailingURLStringKey(){
		if(_NSErrorFailingURLStringKey != null) return _NSErrorFailingURLStringKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSErrorFailingURLStringKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSErrorFailingURLStringKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFTPPropertyActiveTransferModeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFTPPropertyActiveTransferModeKey(){
		if(_NSFTPPropertyActiveTransferModeKey != null) return _NSFTPPropertyActiveTransferModeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFTPPropertyActiveTransferModeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFTPPropertyActiveTransferModeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFTPPropertyFTPProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSFTPPropertyFTPProxy(){
		if(_NSFTPPropertyFTPProxy != null) return _NSFTPPropertyFTPProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFTPPropertyFTPProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFTPPropertyFTPProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFTPPropertyFileOffsetKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFTPPropertyFileOffsetKey(){
		if(_NSFTPPropertyFileOffsetKey != null) return _NSFTPPropertyFileOffsetKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFTPPropertyFileOffsetKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFTPPropertyFileOffsetKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFTPPropertyUserLoginKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFTPPropertyUserLoginKey(){
		if(_NSFTPPropertyUserLoginKey != null) return _NSFTPPropertyUserLoginKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFTPPropertyUserLoginKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFTPPropertyUserLoginKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFTPPropertyUserPasswordKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFTPPropertyUserPasswordKey(){
		if(_NSFTPPropertyUserPasswordKey != null) return _NSFTPPropertyUserPasswordKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFTPPropertyUserPasswordKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFTPPropertyUserPasswordKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFailedAuthenticationException = null;
	 final public com.apple.jobjc.foundation.NSString NSFailedAuthenticationException(){
		if(_NSFailedAuthenticationException != null) return _NSFailedAuthenticationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFailedAuthenticationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFailedAuthenticationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileAppendOnly = null;
	 final public com.apple.jobjc.foundation.NSString NSFileAppendOnly(){
		if(_NSFileAppendOnly != null) return _NSFileAppendOnly;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileAppendOnly", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileAppendOnly = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileBusy = null;
	 final public com.apple.jobjc.foundation.NSString NSFileBusy(){
		if(_NSFileBusy != null) return _NSFileBusy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileBusy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileBusy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileCreationDate = null;
	 final public com.apple.jobjc.foundation.NSString NSFileCreationDate(){
		if(_NSFileCreationDate != null) return _NSFileCreationDate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileCreationDate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileCreationDate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileDeviceIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSFileDeviceIdentifier(){
		if(_NSFileDeviceIdentifier != null) return _NSFileDeviceIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileDeviceIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileDeviceIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileExtensionHidden = null;
	 final public com.apple.jobjc.foundation.NSString NSFileExtensionHidden(){
		if(_NSFileExtensionHidden != null) return _NSFileExtensionHidden;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileExtensionHidden", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileExtensionHidden = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileGroupOwnerAccountID = null;
	 final public com.apple.jobjc.foundation.NSString NSFileGroupOwnerAccountID(){
		if(_NSFileGroupOwnerAccountID != null) return _NSFileGroupOwnerAccountID;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileGroupOwnerAccountID", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileGroupOwnerAccountID = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileGroupOwnerAccountName = null;
	 final public com.apple.jobjc.foundation.NSString NSFileGroupOwnerAccountName(){
		if(_NSFileGroupOwnerAccountName != null) return _NSFileGroupOwnerAccountName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileGroupOwnerAccountName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileGroupOwnerAccountName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHFSCreatorCode = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHFSCreatorCode(){
		if(_NSFileHFSCreatorCode != null) return _NSFileHFSCreatorCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHFSCreatorCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHFSCreatorCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHFSTypeCode = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHFSTypeCode(){
		if(_NSFileHFSTypeCode != null) return _NSFileHFSTypeCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHFSTypeCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHFSTypeCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleConnectionAcceptedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleConnectionAcceptedNotification(){
		if(_NSFileHandleConnectionAcceptedNotification != null) return _NSFileHandleConnectionAcceptedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleConnectionAcceptedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleConnectionAcceptedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleDataAvailableNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleDataAvailableNotification(){
		if(_NSFileHandleDataAvailableNotification != null) return _NSFileHandleDataAvailableNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleDataAvailableNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleDataAvailableNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleNotificationDataItem = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleNotificationDataItem(){
		if(_NSFileHandleNotificationDataItem != null) return _NSFileHandleNotificationDataItem;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleNotificationDataItem", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleNotificationDataItem = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleNotificationFileHandleItem = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleNotificationFileHandleItem(){
		if(_NSFileHandleNotificationFileHandleItem != null) return _NSFileHandleNotificationFileHandleItem;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleNotificationFileHandleItem", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleNotificationFileHandleItem = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleNotificationMonitorModes = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleNotificationMonitorModes(){
		if(_NSFileHandleNotificationMonitorModes != null) return _NSFileHandleNotificationMonitorModes;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleNotificationMonitorModes", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleNotificationMonitorModes = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleOperationException = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleOperationException(){
		if(_NSFileHandleOperationException != null) return _NSFileHandleOperationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleOperationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleOperationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleReadCompletionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleReadCompletionNotification(){
		if(_NSFileHandleReadCompletionNotification != null) return _NSFileHandleReadCompletionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleReadCompletionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleReadCompletionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileHandleReadToEndOfFileCompletionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFileHandleReadToEndOfFileCompletionNotification(){
		if(_NSFileHandleReadToEndOfFileCompletionNotification != null) return _NSFileHandleReadToEndOfFileCompletionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileHandleReadToEndOfFileCompletionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileHandleReadToEndOfFileCompletionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileImmutable = null;
	 final public com.apple.jobjc.foundation.NSString NSFileImmutable(){
		if(_NSFileImmutable != null) return _NSFileImmutable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileImmutable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileImmutable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileModificationDate = null;
	 final public com.apple.jobjc.foundation.NSString NSFileModificationDate(){
		if(_NSFileModificationDate != null) return _NSFileModificationDate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileModificationDate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileModificationDate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileOwnerAccountID = null;
	 final public com.apple.jobjc.foundation.NSString NSFileOwnerAccountID(){
		if(_NSFileOwnerAccountID != null) return _NSFileOwnerAccountID;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileOwnerAccountID", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileOwnerAccountID = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileOwnerAccountName = null;
	 final public com.apple.jobjc.foundation.NSString NSFileOwnerAccountName(){
		if(_NSFileOwnerAccountName != null) return _NSFileOwnerAccountName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileOwnerAccountName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileOwnerAccountName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilePathErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFilePathErrorKey(){
		if(_NSFilePathErrorKey != null) return _NSFilePathErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilePathErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilePathErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilePosixPermissions = null;
	 final public com.apple.jobjc.foundation.NSString NSFilePosixPermissions(){
		if(_NSFilePosixPermissions != null) return _NSFilePosixPermissions;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilePosixPermissions", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilePosixPermissions = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileReferenceCount = null;
	 final public com.apple.jobjc.foundation.NSString NSFileReferenceCount(){
		if(_NSFileReferenceCount != null) return _NSFileReferenceCount;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileReferenceCount", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileReferenceCount = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSize = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSize(){
		if(_NSFileSize != null) return _NSFileSize;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSize", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSize = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemFileNumber = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemFileNumber(){
		if(_NSFileSystemFileNumber != null) return _NSFileSystemFileNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemFileNumber", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemFileNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemFreeNodes = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemFreeNodes(){
		if(_NSFileSystemFreeNodes != null) return _NSFileSystemFreeNodes;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemFreeNodes", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemFreeNodes = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemFreeSize = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemFreeSize(){
		if(_NSFileSystemFreeSize != null) return _NSFileSystemFreeSize;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemFreeSize", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemFreeSize = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemNodes = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemNodes(){
		if(_NSFileSystemNodes != null) return _NSFileSystemNodes;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemNodes", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemNodes = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemNumber = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemNumber(){
		if(_NSFileSystemNumber != null) return _NSFileSystemNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemNumber", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileSystemSize = null;
	 final public com.apple.jobjc.foundation.NSString NSFileSystemSize(){
		if(_NSFileSystemSize != null) return _NSFileSystemSize;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileSystemSize", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileSystemSize = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSFileType(){
		if(_NSFileType != null) return _NSFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeBlockSpecial = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeBlockSpecial(){
		if(_NSFileTypeBlockSpecial != null) return _NSFileTypeBlockSpecial;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeBlockSpecial", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeBlockSpecial = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeCharacterSpecial = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeCharacterSpecial(){
		if(_NSFileTypeCharacterSpecial != null) return _NSFileTypeCharacterSpecial;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeCharacterSpecial", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeCharacterSpecial = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeDirectory = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeDirectory(){
		if(_NSFileTypeDirectory != null) return _NSFileTypeDirectory;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeDirectory", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeDirectory = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeRegular = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeRegular(){
		if(_NSFileTypeRegular != null) return _NSFileTypeRegular;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeRegular", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeRegular = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeSocket = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeSocket(){
		if(_NSFileTypeSocket != null) return _NSFileTypeSocket;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeSocket", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeSocket = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeSymbolicLink = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeSymbolicLink(){
		if(_NSFileTypeSymbolicLink != null) return _NSFileTypeSymbolicLink;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeSymbolicLink", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeSymbolicLink = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeUnknown = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeUnknown(){
		if(_NSFileTypeUnknown != null) return _NSFileTypeUnknown;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeUnknown", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeUnknown = returnValue;
		return returnValue;
	}

	private double _NSFoundationVersionNumber = 0;
	 final public double NSFoundationVersionNumber(){
		if(_NSFoundationVersionNumber != 0) return _NSFoundationVersionNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFoundationVersionNumber", nativeBuffer, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.sizeof());
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		_NSFoundationVersionNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGenericException = null;
	 final public com.apple.jobjc.foundation.NSString NSGenericException(){
		if(_NSGenericException != null) return _NSGenericException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGenericException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGenericException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGlobalDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSGlobalDomain(){
		if(_NSGlobalDomain != null) return _NSGlobalDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGlobalDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGlobalDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGrammarCorrections = null;
	 final public com.apple.jobjc.foundation.NSString NSGrammarCorrections(){
		if(_NSGrammarCorrections != null) return _NSGrammarCorrections;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGrammarCorrections", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGrammarCorrections = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGrammarRange = null;
	 final public com.apple.jobjc.foundation.NSString NSGrammarRange(){
		if(_NSGrammarRange != null) return _NSGrammarRange;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGrammarRange", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGrammarRange = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGrammarUserDescription = null;
	 final public com.apple.jobjc.foundation.NSString NSGrammarUserDescription(){
		if(_NSGrammarUserDescription != null) return _NSGrammarUserDescription;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGrammarUserDescription", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGrammarUserDescription = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGregorianCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSGregorianCalendar(){
		if(_NSGregorianCalendar != null) return _NSGregorianCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGregorianCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGregorianCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieComment = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieComment(){
		if(_NSHTTPCookieComment != null) return _NSHTTPCookieComment;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieComment", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieComment = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieCommentURL = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieCommentURL(){
		if(_NSHTTPCookieCommentURL != null) return _NSHTTPCookieCommentURL;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieCommentURL", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieCommentURL = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieDiscard = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieDiscard(){
		if(_NSHTTPCookieDiscard != null) return _NSHTTPCookieDiscard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieDiscard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieDiscard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieDomain(){
		if(_NSHTTPCookieDomain != null) return _NSHTTPCookieDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieExpires = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieExpires(){
		if(_NSHTTPCookieExpires != null) return _NSHTTPCookieExpires;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieExpires", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieExpires = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieManagerAcceptPolicyChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieManagerAcceptPolicyChangedNotification(){
		if(_NSHTTPCookieManagerAcceptPolicyChangedNotification != null) return _NSHTTPCookieManagerAcceptPolicyChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieManagerAcceptPolicyChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieManagerAcceptPolicyChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieManagerCookiesChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieManagerCookiesChangedNotification(){
		if(_NSHTTPCookieManagerCookiesChangedNotification != null) return _NSHTTPCookieManagerCookiesChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieManagerCookiesChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieManagerCookiesChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieMaximumAge = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieMaximumAge(){
		if(_NSHTTPCookieMaximumAge != null) return _NSHTTPCookieMaximumAge;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieMaximumAge", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieMaximumAge = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieName = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieName(){
		if(_NSHTTPCookieName != null) return _NSHTTPCookieName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieOriginURL = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieOriginURL(){
		if(_NSHTTPCookieOriginURL != null) return _NSHTTPCookieOriginURL;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieOriginURL", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieOriginURL = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookiePath = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookiePath(){
		if(_NSHTTPCookiePath != null) return _NSHTTPCookiePath;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookiePath", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookiePath = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookiePort = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookiePort(){
		if(_NSHTTPCookiePort != null) return _NSHTTPCookiePort;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookiePort", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookiePort = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieSecure = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieSecure(){
		if(_NSHTTPCookieSecure != null) return _NSHTTPCookieSecure;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieSecure", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieSecure = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieValue = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieValue(){
		if(_NSHTTPCookieValue != null) return _NSHTTPCookieValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPCookieVersion = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPCookieVersion(){
		if(_NSHTTPCookieVersion != null) return _NSHTTPCookieVersion;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPCookieVersion", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPCookieVersion = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyErrorPageDataKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyErrorPageDataKey(){
		if(_NSHTTPPropertyErrorPageDataKey != null) return _NSHTTPPropertyErrorPageDataKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyErrorPageDataKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyErrorPageDataKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyHTTPProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyHTTPProxy(){
		if(_NSHTTPPropertyHTTPProxy != null) return _NSHTTPPropertyHTTPProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyHTTPProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyHTTPProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyRedirectionHeadersKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyRedirectionHeadersKey(){
		if(_NSHTTPPropertyRedirectionHeadersKey != null) return _NSHTTPPropertyRedirectionHeadersKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyRedirectionHeadersKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyRedirectionHeadersKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyServerHTTPVersionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyServerHTTPVersionKey(){
		if(_NSHTTPPropertyServerHTTPVersionKey != null) return _NSHTTPPropertyServerHTTPVersionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyServerHTTPVersionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyServerHTTPVersionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyStatusCodeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyStatusCodeKey(){
		if(_NSHTTPPropertyStatusCodeKey != null) return _NSHTTPPropertyStatusCodeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyStatusCodeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyStatusCodeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTTPPropertyStatusReasonKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHTTPPropertyStatusReasonKey(){
		if(_NSHTTPPropertyStatusReasonKey != null) return _NSHTTPPropertyStatusReasonKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTTPPropertyStatusReasonKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTTPPropertyStatusReasonKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHebrewCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSHebrewCalendar(){
		if(_NSHebrewCalendar != null) return _NSHebrewCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHebrewCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHebrewCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHelpAnchorErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSHelpAnchorErrorKey(){
		if(_NSHelpAnchorErrorKey != null) return _NSHelpAnchorErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHelpAnchorErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHelpAnchorErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHourNameDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSHourNameDesignations(){
		if(_NSHourNameDesignations != null) return _NSHourNameDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHourNameDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHourNameDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSISO8601Calendar = null;
	 final public com.apple.jobjc.foundation.NSString NSISO8601Calendar(){
		if(_NSISO8601Calendar != null) return _NSISO8601Calendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSISO8601Calendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSISO8601Calendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInconsistentArchiveException = null;
	 final public com.apple.jobjc.foundation.NSString NSInconsistentArchiveException(){
		if(_NSInconsistentArchiveException != null) return _NSInconsistentArchiveException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInconsistentArchiveException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInconsistentArchiveException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIndianCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSIndianCalendar(){
		if(_NSIndianCalendar != null) return _NSIndianCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIndianCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIndianCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSIntHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSIntHashCallBacks(){
		if(_NSIntHashCallBacks != null) return _NSIntHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSIntHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSIntHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSIntMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSIntMapKeyCallBacks(){
		if(_NSIntMapKeyCallBacks != null) return _NSIntMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSIntMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSIntMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSIntMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSIntMapValueCallBacks(){
		if(_NSIntMapValueCallBacks != null) return _NSIntMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSIntMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSIntMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSIntegerHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSIntegerHashCallBacks(){
		if(_NSIntegerHashCallBacks != null) return _NSIntegerHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSIntegerHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSIntegerHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSIntegerMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSIntegerMapKeyCallBacks(){
		if(_NSIntegerMapKeyCallBacks != null) return _NSIntegerMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSIntegerMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSIntegerMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSIntegerMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSIntegerMapValueCallBacks(){
		if(_NSIntegerMapValueCallBacks != null) return _NSIntegerMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSIntegerMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSIntegerMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInternalInconsistencyException = null;
	 final public com.apple.jobjc.foundation.NSString NSInternalInconsistencyException(){
		if(_NSInternalInconsistencyException != null) return _NSInternalInconsistencyException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInternalInconsistencyException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInternalInconsistencyException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInternationalCurrencyString = null;
	 final public com.apple.jobjc.foundation.NSString NSInternationalCurrencyString(){
		if(_NSInternationalCurrencyString != null) return _NSInternationalCurrencyString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInternationalCurrencyString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInternationalCurrencyString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvalidArchiveOperationException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvalidArchiveOperationException(){
		if(_NSInvalidArchiveOperationException != null) return _NSInvalidArchiveOperationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvalidArchiveOperationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvalidArchiveOperationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvalidArgumentException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvalidArgumentException(){
		if(_NSInvalidArgumentException != null) return _NSInvalidArgumentException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvalidArgumentException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvalidArgumentException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvalidReceivePortException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvalidReceivePortException(){
		if(_NSInvalidReceivePortException != null) return _NSInvalidReceivePortException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvalidReceivePortException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvalidReceivePortException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvalidSendPortException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvalidSendPortException(){
		if(_NSInvalidSendPortException != null) return _NSInvalidSendPortException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvalidSendPortException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvalidSendPortException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvalidUnarchiveOperationException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvalidUnarchiveOperationException(){
		if(_NSInvalidUnarchiveOperationException != null) return _NSInvalidUnarchiveOperationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvalidUnarchiveOperationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvalidUnarchiveOperationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvocationOperationCancelledException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvocationOperationCancelledException(){
		if(_NSInvocationOperationCancelledException != null) return _NSInvocationOperationCancelledException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvocationOperationCancelledException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvocationOperationCancelledException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvocationOperationVoidResultException = null;
	 final public com.apple.jobjc.foundation.NSString NSInvocationOperationVoidResultException(){
		if(_NSInvocationOperationVoidResultException != null) return _NSInvocationOperationVoidResultException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvocationOperationVoidResultException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvocationOperationVoidResultException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIsNilTransformerName = null;
	 final public com.apple.jobjc.foundation.NSString NSIsNilTransformerName(){
		if(_NSIsNilTransformerName != null) return _NSIsNilTransformerName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIsNilTransformerName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIsNilTransformerName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIsNotNilTransformerName = null;
	 final public com.apple.jobjc.foundation.NSString NSIsNotNilTransformerName(){
		if(_NSIsNotNilTransformerName != null) return _NSIsNotNilTransformerName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIsNotNilTransformerName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIsNotNilTransformerName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIslamicCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSIslamicCalendar(){
		if(_NSIslamicCalendar != null) return _NSIslamicCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIslamicCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIslamicCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIslamicCivilCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSIslamicCivilCalendar(){
		if(_NSIslamicCivilCalendar != null) return _NSIslamicCivilCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIslamicCivilCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIslamicCivilCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSJapaneseCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSJapaneseCalendar(){
		if(_NSJapaneseCalendar != null) return _NSJapaneseCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSJapaneseCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSJapaneseCalendar = returnValue;
		return returnValue;
	}

	private boolean _NSKeepAllocationStatistics = false;
	 final public boolean NSKeepAllocationStatistics(){
		if(_NSKeepAllocationStatistics != false) return _NSKeepAllocationStatistics;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeepAllocationStatistics", nativeBuffer, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.sizeof());
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		_NSKeepAllocationStatistics = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyValueChangeIndexesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyValueChangeIndexesKey(){
		if(_NSKeyValueChangeIndexesKey != null) return _NSKeyValueChangeIndexesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyValueChangeIndexesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyValueChangeIndexesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyValueChangeKindKey = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyValueChangeKindKey(){
		if(_NSKeyValueChangeKindKey != null) return _NSKeyValueChangeKindKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyValueChangeKindKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyValueChangeKindKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyValueChangeNewKey = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyValueChangeNewKey(){
		if(_NSKeyValueChangeNewKey != null) return _NSKeyValueChangeNewKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyValueChangeNewKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyValueChangeNewKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyValueChangeNotificationIsPriorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyValueChangeNotificationIsPriorKey(){
		if(_NSKeyValueChangeNotificationIsPriorKey != null) return _NSKeyValueChangeNotificationIsPriorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyValueChangeNotificationIsPriorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyValueChangeNotificationIsPriorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyValueChangeOldKey = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyValueChangeOldKey(){
		if(_NSKeyValueChangeOldKey != null) return _NSKeyValueChangeOldKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyValueChangeOldKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyValueChangeOldKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeyedUnarchiveFromDataTransformerName = null;
	 final public com.apple.jobjc.foundation.NSString NSKeyedUnarchiveFromDataTransformerName(){
		if(_NSKeyedUnarchiveFromDataTransformerName != null) return _NSKeyedUnarchiveFromDataTransformerName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeyedUnarchiveFromDataTransformerName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeyedUnarchiveFromDataTransformerName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLaterTimeDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSLaterTimeDesignations(){
		if(_NSLaterTimeDesignations != null) return _NSLaterTimeDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLaterTimeDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLaterTimeDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagAdjective = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagAdjective(){
		if(_NSLinguisticTagAdjective != null) return _NSLinguisticTagAdjective;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagAdjective", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagAdjective = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagAdverb = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagAdverb(){
		if(_NSLinguisticTagAdverb != null) return _NSLinguisticTagAdverb;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagAdverb", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagAdverb = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagClassifier = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagClassifier(){
		if(_NSLinguisticTagClassifier != null) return _NSLinguisticTagClassifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagClassifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagClassifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagCloseParenthesis = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagCloseParenthesis(){
		if(_NSLinguisticTagCloseParenthesis != null) return _NSLinguisticTagCloseParenthesis;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagCloseParenthesis", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagCloseParenthesis = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagCloseQuote = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagCloseQuote(){
		if(_NSLinguisticTagCloseQuote != null) return _NSLinguisticTagCloseQuote;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagCloseQuote", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagCloseQuote = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagConjunction = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagConjunction(){
		if(_NSLinguisticTagConjunction != null) return _NSLinguisticTagConjunction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagConjunction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagConjunction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagDash = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagDash(){
		if(_NSLinguisticTagDash != null) return _NSLinguisticTagDash;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagDash", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagDash = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagDeterminer = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagDeterminer(){
		if(_NSLinguisticTagDeterminer != null) return _NSLinguisticTagDeterminer;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagDeterminer", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagDeterminer = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagIdiom = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagIdiom(){
		if(_NSLinguisticTagIdiom != null) return _NSLinguisticTagIdiom;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagIdiom", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagIdiom = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagInterjection = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagInterjection(){
		if(_NSLinguisticTagInterjection != null) return _NSLinguisticTagInterjection;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagInterjection", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagInterjection = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagNoun = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagNoun(){
		if(_NSLinguisticTagNoun != null) return _NSLinguisticTagNoun;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagNoun", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagNoun = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagNumber = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagNumber(){
		if(_NSLinguisticTagNumber != null) return _NSLinguisticTagNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagNumber", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOpenParenthesis = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOpenParenthesis(){
		if(_NSLinguisticTagOpenParenthesis != null) return _NSLinguisticTagOpenParenthesis;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOpenParenthesis", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOpenParenthesis = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOpenQuote = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOpenQuote(){
		if(_NSLinguisticTagOpenQuote != null) return _NSLinguisticTagOpenQuote;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOpenQuote", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOpenQuote = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOrganizationName = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOrganizationName(){
		if(_NSLinguisticTagOrganizationName != null) return _NSLinguisticTagOrganizationName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOrganizationName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOrganizationName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOther = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOther(){
		if(_NSLinguisticTagOther != null) return _NSLinguisticTagOther;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOther", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOther = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOtherPunctuation = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOtherPunctuation(){
		if(_NSLinguisticTagOtherPunctuation != null) return _NSLinguisticTagOtherPunctuation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOtherPunctuation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOtherPunctuation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOtherWhitespace = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOtherWhitespace(){
		if(_NSLinguisticTagOtherWhitespace != null) return _NSLinguisticTagOtherWhitespace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOtherWhitespace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOtherWhitespace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagOtherWord = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagOtherWord(){
		if(_NSLinguisticTagOtherWord != null) return _NSLinguisticTagOtherWord;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagOtherWord", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagOtherWord = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagParagraphBreak = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagParagraphBreak(){
		if(_NSLinguisticTagParagraphBreak != null) return _NSLinguisticTagParagraphBreak;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagParagraphBreak", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagParagraphBreak = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagParticle = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagParticle(){
		if(_NSLinguisticTagParticle != null) return _NSLinguisticTagParticle;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagParticle", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagParticle = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagPersonalName = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagPersonalName(){
		if(_NSLinguisticTagPersonalName != null) return _NSLinguisticTagPersonalName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagPersonalName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagPersonalName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagPlaceName = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagPlaceName(){
		if(_NSLinguisticTagPlaceName != null) return _NSLinguisticTagPlaceName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagPlaceName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagPlaceName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagPreposition = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagPreposition(){
		if(_NSLinguisticTagPreposition != null) return _NSLinguisticTagPreposition;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagPreposition", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagPreposition = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagPronoun = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagPronoun(){
		if(_NSLinguisticTagPronoun != null) return _NSLinguisticTagPronoun;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagPronoun", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagPronoun = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagPunctuation = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagPunctuation(){
		if(_NSLinguisticTagPunctuation != null) return _NSLinguisticTagPunctuation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagPunctuation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagPunctuation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeLanguage = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeLanguage(){
		if(_NSLinguisticTagSchemeLanguage != null) return _NSLinguisticTagSchemeLanguage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeLanguage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeLanguage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeLemma = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeLemma(){
		if(_NSLinguisticTagSchemeLemma != null) return _NSLinguisticTagSchemeLemma;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeLemma", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeLemma = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeLexicalClass = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeLexicalClass(){
		if(_NSLinguisticTagSchemeLexicalClass != null) return _NSLinguisticTagSchemeLexicalClass;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeLexicalClass", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeLexicalClass = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeNameType = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeNameType(){
		if(_NSLinguisticTagSchemeNameType != null) return _NSLinguisticTagSchemeNameType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeNameType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeNameType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeNameTypeOrLexicalClass = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeNameTypeOrLexicalClass(){
		if(_NSLinguisticTagSchemeNameTypeOrLexicalClass != null) return _NSLinguisticTagSchemeNameTypeOrLexicalClass;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeNameTypeOrLexicalClass", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeNameTypeOrLexicalClass = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeScript = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeScript(){
		if(_NSLinguisticTagSchemeScript != null) return _NSLinguisticTagSchemeScript;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeScript", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeScript = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSchemeTokenType = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSchemeTokenType(){
		if(_NSLinguisticTagSchemeTokenType != null) return _NSLinguisticTagSchemeTokenType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSchemeTokenType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSchemeTokenType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagSentenceTerminator = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagSentenceTerminator(){
		if(_NSLinguisticTagSentenceTerminator != null) return _NSLinguisticTagSentenceTerminator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagSentenceTerminator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagSentenceTerminator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagVerb = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagVerb(){
		if(_NSLinguisticTagVerb != null) return _NSLinguisticTagVerb;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagVerb", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagVerb = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagWhitespace = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagWhitespace(){
		if(_NSLinguisticTagWhitespace != null) return _NSLinguisticTagWhitespace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagWhitespace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagWhitespace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagWord = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagWord(){
		if(_NSLinguisticTagWord != null) return _NSLinguisticTagWord;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagWord", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagWord = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinguisticTagWordJoiner = null;
	 final public com.apple.jobjc.foundation.NSString NSLinguisticTagWordJoiner(){
		if(_NSLinguisticTagWordJoiner != null) return _NSLinguisticTagWordJoiner;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinguisticTagWordJoiner", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinguisticTagWordJoiner = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLoadedClasses = null;
	 final public com.apple.jobjc.foundation.NSString NSLoadedClasses(){
		if(_NSLoadedClasses != null) return _NSLoadedClasses;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLoadedClasses", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLoadedClasses = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalNotificationCenterType = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalNotificationCenterType(){
		if(_NSLocalNotificationCenterType != null) return _NSLocalNotificationCenterType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalNotificationCenterType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalNotificationCenterType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleAlternateQuotationBeginDelimiterKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleAlternateQuotationBeginDelimiterKey(){
		if(_NSLocaleAlternateQuotationBeginDelimiterKey != null) return _NSLocaleAlternateQuotationBeginDelimiterKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleAlternateQuotationBeginDelimiterKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleAlternateQuotationBeginDelimiterKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleAlternateQuotationEndDelimiterKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleAlternateQuotationEndDelimiterKey(){
		if(_NSLocaleAlternateQuotationEndDelimiterKey != null) return _NSLocaleAlternateQuotationEndDelimiterKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleAlternateQuotationEndDelimiterKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleAlternateQuotationEndDelimiterKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCalendar(){
		if(_NSLocaleCalendar != null) return _NSLocaleCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCollationIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCollationIdentifier(){
		if(_NSLocaleCollationIdentifier != null) return _NSLocaleCollationIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCollationIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCollationIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCollatorIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCollatorIdentifier(){
		if(_NSLocaleCollatorIdentifier != null) return _NSLocaleCollatorIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCollatorIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCollatorIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCountryCode = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCountryCode(){
		if(_NSLocaleCountryCode != null) return _NSLocaleCountryCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCountryCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCountryCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCurrencyCode = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCurrencyCode(){
		if(_NSLocaleCurrencyCode != null) return _NSLocaleCurrencyCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCurrencyCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCurrencyCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleCurrencySymbol = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleCurrencySymbol(){
		if(_NSLocaleCurrencySymbol != null) return _NSLocaleCurrencySymbol;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleCurrencySymbol", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleCurrencySymbol = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleDecimalSeparator = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleDecimalSeparator(){
		if(_NSLocaleDecimalSeparator != null) return _NSLocaleDecimalSeparator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleDecimalSeparator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleDecimalSeparator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleExemplarCharacterSet = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleExemplarCharacterSet(){
		if(_NSLocaleExemplarCharacterSet != null) return _NSLocaleExemplarCharacterSet;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleExemplarCharacterSet", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleExemplarCharacterSet = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleGroupingSeparator = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleGroupingSeparator(){
		if(_NSLocaleGroupingSeparator != null) return _NSLocaleGroupingSeparator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleGroupingSeparator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleGroupingSeparator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleIdentifier(){
		if(_NSLocaleIdentifier != null) return _NSLocaleIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleLanguageCode = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleLanguageCode(){
		if(_NSLocaleLanguageCode != null) return _NSLocaleLanguageCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleLanguageCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleLanguageCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleMeasurementSystem = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleMeasurementSystem(){
		if(_NSLocaleMeasurementSystem != null) return _NSLocaleMeasurementSystem;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleMeasurementSystem", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleMeasurementSystem = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleQuotationBeginDelimiterKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleQuotationBeginDelimiterKey(){
		if(_NSLocaleQuotationBeginDelimiterKey != null) return _NSLocaleQuotationBeginDelimiterKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleQuotationBeginDelimiterKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleQuotationBeginDelimiterKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleQuotationEndDelimiterKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleQuotationEndDelimiterKey(){
		if(_NSLocaleQuotationEndDelimiterKey != null) return _NSLocaleQuotationEndDelimiterKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleQuotationEndDelimiterKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleQuotationEndDelimiterKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleScriptCode = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleScriptCode(){
		if(_NSLocaleScriptCode != null) return _NSLocaleScriptCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleScriptCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleScriptCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleUsesMetricSystem = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleUsesMetricSystem(){
		if(_NSLocaleUsesMetricSystem != null) return _NSLocaleUsesMetricSystem;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleUsesMetricSystem", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleUsesMetricSystem = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocaleVariantCode = null;
	 final public com.apple.jobjc.foundation.NSString NSLocaleVariantCode(){
		if(_NSLocaleVariantCode != null) return _NSLocaleVariantCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocaleVariantCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocaleVariantCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalizedDescriptionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalizedDescriptionKey(){
		if(_NSLocalizedDescriptionKey != null) return _NSLocalizedDescriptionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalizedDescriptionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalizedDescriptionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalizedFailureReasonErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalizedFailureReasonErrorKey(){
		if(_NSLocalizedFailureReasonErrorKey != null) return _NSLocalizedFailureReasonErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalizedFailureReasonErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalizedFailureReasonErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalizedRecoveryOptionsErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalizedRecoveryOptionsErrorKey(){
		if(_NSLocalizedRecoveryOptionsErrorKey != null) return _NSLocalizedRecoveryOptionsErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalizedRecoveryOptionsErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalizedRecoveryOptionsErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalizedRecoverySuggestionErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalizedRecoverySuggestionErrorKey(){
		if(_NSLocalizedRecoverySuggestionErrorKey != null) return _NSLocalizedRecoverySuggestionErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalizedRecoverySuggestionErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalizedRecoverySuggestionErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMachErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSMachErrorDomain(){
		if(_NSMachErrorDomain != null) return _NSMachErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMachErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMachErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMallocException = null;
	 final public com.apple.jobjc.foundation.NSString NSMallocException(){
		if(_NSMallocException != null) return _NSMallocException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMallocException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMallocException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMaximumKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSMaximumKeyValueOperator(){
		if(_NSMaximumKeyValueOperator != null) return _NSMaximumKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMaximumKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMaximumKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemDisplayNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemDisplayNameKey(){
		if(_NSMetadataItemDisplayNameKey != null) return _NSMetadataItemDisplayNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemDisplayNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemDisplayNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemFSContentChangeDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemFSContentChangeDateKey(){
		if(_NSMetadataItemFSContentChangeDateKey != null) return _NSMetadataItemFSContentChangeDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemFSContentChangeDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemFSContentChangeDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemFSCreationDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemFSCreationDateKey(){
		if(_NSMetadataItemFSCreationDateKey != null) return _NSMetadataItemFSCreationDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemFSCreationDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemFSCreationDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemFSNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemFSNameKey(){
		if(_NSMetadataItemFSNameKey != null) return _NSMetadataItemFSNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemFSNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemFSNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemFSSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemFSSizeKey(){
		if(_NSMetadataItemFSSizeKey != null) return _NSMetadataItemFSSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemFSSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemFSSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemIsUbiquitousKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemIsUbiquitousKey(){
		if(_NSMetadataItemIsUbiquitousKey != null) return _NSMetadataItemIsUbiquitousKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemIsUbiquitousKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemIsUbiquitousKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemPathKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemPathKey(){
		if(_NSMetadataItemPathKey != null) return _NSMetadataItemPathKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemPathKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemPathKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataItemURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataItemURLKey(){
		if(_NSMetadataItemURLKey != null) return _NSMetadataItemURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataItemURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataItemURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryDidFinishGatheringNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryDidFinishGatheringNotification(){
		if(_NSMetadataQueryDidFinishGatheringNotification != null) return _NSMetadataQueryDidFinishGatheringNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryDidFinishGatheringNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryDidFinishGatheringNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryDidStartGatheringNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryDidStartGatheringNotification(){
		if(_NSMetadataQueryDidStartGatheringNotification != null) return _NSMetadataQueryDidStartGatheringNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryDidStartGatheringNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryDidStartGatheringNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryDidUpdateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryDidUpdateNotification(){
		if(_NSMetadataQueryDidUpdateNotification != null) return _NSMetadataQueryDidUpdateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryDidUpdateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryDidUpdateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryGatheringProgressNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryGatheringProgressNotification(){
		if(_NSMetadataQueryGatheringProgressNotification != null) return _NSMetadataQueryGatheringProgressNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryGatheringProgressNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryGatheringProgressNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryLocalComputerScope = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryLocalComputerScope(){
		if(_NSMetadataQueryLocalComputerScope != null) return _NSMetadataQueryLocalComputerScope;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryLocalComputerScope", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryLocalComputerScope = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryNetworkScope = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryNetworkScope(){
		if(_NSMetadataQueryNetworkScope != null) return _NSMetadataQueryNetworkScope;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryNetworkScope", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryNetworkScope = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryResultContentRelevanceAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryResultContentRelevanceAttribute(){
		if(_NSMetadataQueryResultContentRelevanceAttribute != null) return _NSMetadataQueryResultContentRelevanceAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryResultContentRelevanceAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryResultContentRelevanceAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryUbiquitousDataScope = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryUbiquitousDataScope(){
		if(_NSMetadataQueryUbiquitousDataScope != null) return _NSMetadataQueryUbiquitousDataScope;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryUbiquitousDataScope", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryUbiquitousDataScope = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryUbiquitousDocumentsScope = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryUbiquitousDocumentsScope(){
		if(_NSMetadataQueryUbiquitousDocumentsScope != null) return _NSMetadataQueryUbiquitousDocumentsScope;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryUbiquitousDocumentsScope", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryUbiquitousDocumentsScope = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataQueryUserHomeScope = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataQueryUserHomeScope(){
		if(_NSMetadataQueryUserHomeScope != null) return _NSMetadataQueryUserHomeScope;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataQueryUserHomeScope", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataQueryUserHomeScope = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemHasUnresolvedConflictsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemHasUnresolvedConflictsKey(){
		if(_NSMetadataUbiquitousItemHasUnresolvedConflictsKey != null) return _NSMetadataUbiquitousItemHasUnresolvedConflictsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemHasUnresolvedConflictsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemHasUnresolvedConflictsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemIsDownloadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemIsDownloadedKey(){
		if(_NSMetadataUbiquitousItemIsDownloadedKey != null) return _NSMetadataUbiquitousItemIsDownloadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemIsDownloadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemIsDownloadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemIsDownloadingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemIsDownloadingKey(){
		if(_NSMetadataUbiquitousItemIsDownloadingKey != null) return _NSMetadataUbiquitousItemIsDownloadingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemIsDownloadingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemIsDownloadingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemIsUploadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemIsUploadedKey(){
		if(_NSMetadataUbiquitousItemIsUploadedKey != null) return _NSMetadataUbiquitousItemIsUploadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemIsUploadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemIsUploadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemIsUploadingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemIsUploadingKey(){
		if(_NSMetadataUbiquitousItemIsUploadingKey != null) return _NSMetadataUbiquitousItemIsUploadingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemIsUploadingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemIsUploadingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemPercentDownloadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemPercentDownloadedKey(){
		if(_NSMetadataUbiquitousItemPercentDownloadedKey != null) return _NSMetadataUbiquitousItemPercentDownloadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemPercentDownloadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemPercentDownloadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMetadataUbiquitousItemPercentUploadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSMetadataUbiquitousItemPercentUploadedKey(){
		if(_NSMetadataUbiquitousItemPercentUploadedKey != null) return _NSMetadataUbiquitousItemPercentUploadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMetadataUbiquitousItemPercentUploadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMetadataUbiquitousItemPercentUploadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMinimumKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSMinimumKeyValueOperator(){
		if(_NSMinimumKeyValueOperator != null) return _NSMinimumKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMinimumKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMinimumKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMonthNameArray = null;
	 final public com.apple.jobjc.foundation.NSString NSMonthNameArray(){
		if(_NSMonthNameArray != null) return _NSMonthNameArray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMonthNameArray", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMonthNameArray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNegateBooleanTransformerName = null;
	 final public com.apple.jobjc.foundation.NSString NSNegateBooleanTransformerName(){
		if(_NSNegateBooleanTransformerName != null) return _NSNegateBooleanTransformerName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNegateBooleanTransformerName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNegateBooleanTransformerName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNegativeCurrencyFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSNegativeCurrencyFormatString(){
		if(_NSNegativeCurrencyFormatString != null) return _NSNegativeCurrencyFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNegativeCurrencyFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNegativeCurrencyFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNetServicesErrorCode = null;
	 final public com.apple.jobjc.foundation.NSString NSNetServicesErrorCode(){
		if(_NSNetServicesErrorCode != null) return _NSNetServicesErrorCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNetServicesErrorCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNetServicesErrorCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNetServicesErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSNetServicesErrorDomain(){
		if(_NSNetServicesErrorDomain != null) return _NSNetServicesErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNetServicesErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNetServicesErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNextDayDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSNextDayDesignations(){
		if(_NSNextDayDesignations != null) return _NSNextDayDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNextDayDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNextDayDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNextNextDayDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSNextNextDayDesignations(){
		if(_NSNextNextDayDesignations != null) return _NSNextNextDayDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNextNextDayDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNextNextDayDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSNonOwnedPointerHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSNonOwnedPointerHashCallBacks(){
		if(_NSNonOwnedPointerHashCallBacks != null) return _NSNonOwnedPointerHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSNonOwnedPointerHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSNonOwnedPointerHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSNonOwnedPointerMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSNonOwnedPointerMapKeyCallBacks(){
		if(_NSNonOwnedPointerMapKeyCallBacks != null) return _NSNonOwnedPointerMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSNonOwnedPointerMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSNonOwnedPointerMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSNonOwnedPointerMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSNonOwnedPointerMapValueCallBacks(){
		if(_NSNonOwnedPointerMapValueCallBacks != null) return _NSNonOwnedPointerMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSNonOwnedPointerMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSNonOwnedPointerMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSNonOwnedPointerOrNullMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSNonOwnedPointerOrNullMapKeyCallBacks(){
		if(_NSNonOwnedPointerOrNullMapKeyCallBacks != null) return _NSNonOwnedPointerOrNullMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSNonOwnedPointerOrNullMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSNonOwnedPointerOrNullMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSNonRetainedObjectHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSNonRetainedObjectHashCallBacks(){
		if(_NSNonRetainedObjectHashCallBacks != null) return _NSNonRetainedObjectHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSNonRetainedObjectHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSNonRetainedObjectHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSNonRetainedObjectMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSNonRetainedObjectMapKeyCallBacks(){
		if(_NSNonRetainedObjectMapKeyCallBacks != null) return _NSNonRetainedObjectMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSNonRetainedObjectMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSNonRetainedObjectMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSNonRetainedObjectMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSNonRetainedObjectMapValueCallBacks(){
		if(_NSNonRetainedObjectMapValueCallBacks != null) return _NSNonRetainedObjectMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSNonRetainedObjectMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSNonRetainedObjectMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOSStatusErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSOSStatusErrorDomain(){
		if(_NSOSStatusErrorDomain != null) return _NSOSStatusErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOSStatusErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOSStatusErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSObjectHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSObjectHashCallBacks(){
		if(_NSObjectHashCallBacks != null) return _NSObjectHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSObjectHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSObjectHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSObjectInaccessibleException = null;
	 final public com.apple.jobjc.foundation.NSString NSObjectInaccessibleException(){
		if(_NSObjectInaccessibleException != null) return _NSObjectInaccessibleException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSObjectInaccessibleException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSObjectInaccessibleException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSObjectMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSObjectMapKeyCallBacks(){
		if(_NSObjectMapKeyCallBacks != null) return _NSObjectMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSObjectMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSObjectMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSObjectMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSObjectMapValueCallBacks(){
		if(_NSObjectMapValueCallBacks != null) return _NSObjectMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSObjectMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSObjectMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSObjectNotAvailableException = null;
	 final public com.apple.jobjc.foundation.NSString NSObjectNotAvailableException(){
		if(_NSObjectNotAvailableException != null) return _NSObjectNotAvailableException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSObjectNotAvailableException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSObjectNotAvailableException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOldStyleException = null;
	 final public com.apple.jobjc.foundation.NSString NSOldStyleException(){
		if(_NSOldStyleException != null) return _NSOldStyleException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOldStyleException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOldStyleException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOperationNotSupportedForKeyException = null;
	 final public com.apple.jobjc.foundation.NSString NSOperationNotSupportedForKeyException(){
		if(_NSOperationNotSupportedForKeyException != null) return _NSOperationNotSupportedForKeyException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOperationNotSupportedForKeyException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOperationNotSupportedForKeyException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSOwnedObjectIdentityHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSOwnedObjectIdentityHashCallBacks(){
		if(_NSOwnedObjectIdentityHashCallBacks != null) return _NSOwnedObjectIdentityHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSOwnedObjectIdentityHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSOwnedObjectIdentityHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSOwnedPointerHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSOwnedPointerHashCallBacks(){
		if(_NSOwnedPointerHashCallBacks != null) return _NSOwnedPointerHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSOwnedPointerHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSOwnedPointerHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableKeyCallBacks _NSOwnedPointerMapKeyCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableKeyCallBacks NSOwnedPointerMapKeyCallBacks(){
		if(_NSOwnedPointerMapKeyCallBacks != null) return _NSOwnedPointerMapKeyCallBacks;
				com.apple.jobjc.foundation.NSMapTableKeyCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableKeyCallBacks();
		getConstant("NSOwnedPointerMapKeyCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().sizeof());
		
		_NSOwnedPointerMapKeyCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSMapTableValueCallBacks _NSOwnedPointerMapValueCallBacks = null;
	 final public com.apple.jobjc.foundation.NSMapTableValueCallBacks NSOwnedPointerMapValueCallBacks(){
		if(_NSOwnedPointerMapValueCallBacks != null) return _NSOwnedPointerMapValueCallBacks;
				com.apple.jobjc.foundation.NSMapTableValueCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapTableValueCallBacks();
		getConstant("NSOwnedPointerMapValueCallBacks", returnValue, com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().sizeof());
		
		_NSOwnedPointerMapValueCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPOSIXErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSPOSIXErrorDomain(){
		if(_NSPOSIXErrorDomain != null) return _NSPOSIXErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPOSIXErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPOSIXErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSParseErrorException = null;
	 final public com.apple.jobjc.foundation.NSString NSParseErrorException(){
		if(_NSParseErrorException != null) return _NSParseErrorException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSParseErrorException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSParseErrorException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPersianCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSPersianCalendar(){
		if(_NSPersianCalendar != null) return _NSPersianCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPersianCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPersianCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSHashTableCallBacks _NSPointerToStructHashCallBacks = null;
	 final public com.apple.jobjc.foundation.NSHashTableCallBacks NSPointerToStructHashCallBacks(){
		if(_NSPointerToStructHashCallBacks != null) return _NSPointerToStructHashCallBacks;
				com.apple.jobjc.foundation.NSHashTableCallBacks returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashTableCallBacks();
		getConstant("NSPointerToStructHashCallBacks", returnValue, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().sizeof());
		
		_NSPointerToStructHashCallBacks = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPortDidBecomeInvalidNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPortDidBecomeInvalidNotification(){
		if(_NSPortDidBecomeInvalidNotification != null) return _NSPortDidBecomeInvalidNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPortDidBecomeInvalidNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPortDidBecomeInvalidNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPortReceiveException = null;
	 final public com.apple.jobjc.foundation.NSString NSPortReceiveException(){
		if(_NSPortReceiveException != null) return _NSPortReceiveException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPortReceiveException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPortReceiveException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPortSendException = null;
	 final public com.apple.jobjc.foundation.NSString NSPortSendException(){
		if(_NSPortSendException != null) return _NSPortSendException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPortSendException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPortSendException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPortTimeoutException = null;
	 final public com.apple.jobjc.foundation.NSString NSPortTimeoutException(){
		if(_NSPortTimeoutException != null) return _NSPortTimeoutException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPortTimeoutException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPortTimeoutException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPositiveCurrencyFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSPositiveCurrencyFormatString(){
		if(_NSPositiveCurrencyFormatString != null) return _NSPositiveCurrencyFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPositiveCurrencyFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPositiveCurrencyFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPriorDayDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSPriorDayDesignations(){
		if(_NSPriorDayDesignations != null) return _NSPriorDayDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPriorDayDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPriorDayDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRangeException = null;
	 final public com.apple.jobjc.foundation.NSString NSRangeException(){
		if(_NSRangeException != null) return _NSRangeException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRangeException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRangeException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRecoveryAttempterErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSRecoveryAttempterErrorKey(){
		if(_NSRecoveryAttempterErrorKey != null) return _NSRecoveryAttempterErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRecoveryAttempterErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRecoveryAttempterErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRegistrationDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSRegistrationDomain(){
		if(_NSRegistrationDomain != null) return _NSRegistrationDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRegistrationDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRegistrationDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRepublicOfChinaCalendar = null;
	 final public com.apple.jobjc.foundation.NSString NSRepublicOfChinaCalendar(){
		if(_NSRepublicOfChinaCalendar != null) return _NSRepublicOfChinaCalendar;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRepublicOfChinaCalendar", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRepublicOfChinaCalendar = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRunLoopCommonModes = null;
	 final public com.apple.jobjc.foundation.NSString NSRunLoopCommonModes(){
		if(_NSRunLoopCommonModes != null) return _NSRunLoopCommonModes;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRunLoopCommonModes", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRunLoopCommonModes = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShortDateFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSShortDateFormatString(){
		if(_NSShortDateFormatString != null) return _NSShortDateFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShortDateFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShortDateFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShortMonthNameArray = null;
	 final public com.apple.jobjc.foundation.NSString NSShortMonthNameArray(){
		if(_NSShortMonthNameArray != null) return _NSShortMonthNameArray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShortMonthNameArray", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShortMonthNameArray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShortTimeDateFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSShortTimeDateFormatString(){
		if(_NSShortTimeDateFormatString != null) return _NSShortTimeDateFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShortTimeDateFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShortTimeDateFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShortWeekDayNameArray = null;
	 final public com.apple.jobjc.foundation.NSString NSShortWeekDayNameArray(){
		if(_NSShortWeekDayNameArray != null) return _NSShortWeekDayNameArray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShortWeekDayNameArray", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShortWeekDayNameArray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamDataWrittenToMemoryStreamKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamDataWrittenToMemoryStreamKey(){
		if(_NSStreamDataWrittenToMemoryStreamKey != null) return _NSStreamDataWrittenToMemoryStreamKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamDataWrittenToMemoryStreamKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamDataWrittenToMemoryStreamKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamFileCurrentOffsetKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamFileCurrentOffsetKey(){
		if(_NSStreamFileCurrentOffsetKey != null) return _NSStreamFileCurrentOffsetKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamFileCurrentOffsetKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamFileCurrentOffsetKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamNetworkServiceType = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamNetworkServiceType(){
		if(_NSStreamNetworkServiceType != null) return _NSStreamNetworkServiceType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamNetworkServiceType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamNetworkServiceType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamNetworkServiceTypeBackground = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamNetworkServiceTypeBackground(){
		if(_NSStreamNetworkServiceTypeBackground != null) return _NSStreamNetworkServiceTypeBackground;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamNetworkServiceTypeBackground", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamNetworkServiceTypeBackground = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamNetworkServiceTypeVideo = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamNetworkServiceTypeVideo(){
		if(_NSStreamNetworkServiceTypeVideo != null) return _NSStreamNetworkServiceTypeVideo;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamNetworkServiceTypeVideo", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamNetworkServiceTypeVideo = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamNetworkServiceTypeVoIP = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamNetworkServiceTypeVoIP(){
		if(_NSStreamNetworkServiceTypeVoIP != null) return _NSStreamNetworkServiceTypeVoIP;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamNetworkServiceTypeVoIP", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamNetworkServiceTypeVoIP = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamNetworkServiceTypeVoice = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamNetworkServiceTypeVoice(){
		if(_NSStreamNetworkServiceTypeVoice != null) return _NSStreamNetworkServiceTypeVoice;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamNetworkServiceTypeVoice", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamNetworkServiceTypeVoice = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSErrorDomain(){
		if(_NSStreamSOCKSErrorDomain != null) return _NSStreamSOCKSErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyConfigurationKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyConfigurationKey(){
		if(_NSStreamSOCKSProxyConfigurationKey != null) return _NSStreamSOCKSProxyConfigurationKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyConfigurationKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyConfigurationKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyHostKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyHostKey(){
		if(_NSStreamSOCKSProxyHostKey != null) return _NSStreamSOCKSProxyHostKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyHostKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyHostKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyPasswordKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyPasswordKey(){
		if(_NSStreamSOCKSProxyPasswordKey != null) return _NSStreamSOCKSProxyPasswordKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyPasswordKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyPasswordKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyPortKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyPortKey(){
		if(_NSStreamSOCKSProxyPortKey != null) return _NSStreamSOCKSProxyPortKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyPortKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyPortKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyUserKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyUserKey(){
		if(_NSStreamSOCKSProxyUserKey != null) return _NSStreamSOCKSProxyUserKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyUserKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyUserKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyVersion4 = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyVersion4(){
		if(_NSStreamSOCKSProxyVersion4 != null) return _NSStreamSOCKSProxyVersion4;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyVersion4", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyVersion4 = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyVersion5 = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyVersion5(){
		if(_NSStreamSOCKSProxyVersion5 != null) return _NSStreamSOCKSProxyVersion5;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyVersion5", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyVersion5 = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSOCKSProxyVersionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSOCKSProxyVersionKey(){
		if(_NSStreamSOCKSProxyVersionKey != null) return _NSStreamSOCKSProxyVersionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSOCKSProxyVersionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSOCKSProxyVersionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSSLErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSSLErrorDomain(){
		if(_NSStreamSocketSSLErrorDomain != null) return _NSStreamSocketSSLErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSSLErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSSLErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelKey(){
		if(_NSStreamSocketSecurityLevelKey != null) return _NSStreamSocketSecurityLevelKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelNegotiatedSSL = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelNegotiatedSSL(){
		if(_NSStreamSocketSecurityLevelNegotiatedSSL != null) return _NSStreamSocketSecurityLevelNegotiatedSSL;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelNegotiatedSSL", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelNegotiatedSSL = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelNone = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelNone(){
		if(_NSStreamSocketSecurityLevelNone != null) return _NSStreamSocketSecurityLevelNone;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelNone", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelNone = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelSSLv2 = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelSSLv2(){
		if(_NSStreamSocketSecurityLevelSSLv2 != null) return _NSStreamSocketSecurityLevelSSLv2;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelSSLv2", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelSSLv2 = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelSSLv3 = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelSSLv3(){
		if(_NSStreamSocketSecurityLevelSSLv3 != null) return _NSStreamSocketSecurityLevelSSLv3;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelSSLv3", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelSSLv3 = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStreamSocketSecurityLevelTLSv1 = null;
	 final public com.apple.jobjc.foundation.NSString NSStreamSocketSecurityLevelTLSv1(){
		if(_NSStreamSocketSecurityLevelTLSv1 != null) return _NSStreamSocketSecurityLevelTLSv1;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStreamSocketSecurityLevelTLSv1", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStreamSocketSecurityLevelTLSv1 = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStringEncodingErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSStringEncodingErrorKey(){
		if(_NSStringEncodingErrorKey != null) return _NSStringEncodingErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStringEncodingErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStringEncodingErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSumKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSSumKeyValueOperator(){
		if(_NSSumKeyValueOperator != null) return _NSSumKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSumKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSumKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSystemClockDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSystemClockDidChangeNotification(){
		if(_NSSystemClockDidChangeNotification != null) return _NSSystemClockDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSystemClockDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSystemClockDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSystemTimeZoneDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSystemTimeZoneDidChangeNotification(){
		if(_NSSystemTimeZoneDidChangeNotification != null) return _NSSystemTimeZoneDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSystemTimeZoneDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSystemTimeZoneDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTaskDidTerminateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTaskDidTerminateNotification(){
		if(_NSTaskDidTerminateNotification != null) return _NSTaskDidTerminateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTaskDidTerminateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTaskDidTerminateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingAirlineKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingAirlineKey(){
		if(_NSTextCheckingAirlineKey != null) return _NSTextCheckingAirlineKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingAirlineKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingAirlineKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingCityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingCityKey(){
		if(_NSTextCheckingCityKey != null) return _NSTextCheckingCityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingCityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingCityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingCountryKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingCountryKey(){
		if(_NSTextCheckingCountryKey != null) return _NSTextCheckingCountryKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingCountryKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingCountryKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingFlightKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingFlightKey(){
		if(_NSTextCheckingFlightKey != null) return _NSTextCheckingFlightKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingFlightKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingFlightKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingJobTitleKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingJobTitleKey(){
		if(_NSTextCheckingJobTitleKey != null) return _NSTextCheckingJobTitleKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingJobTitleKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingJobTitleKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingNameKey(){
		if(_NSTextCheckingNameKey != null) return _NSTextCheckingNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingOrganizationKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingOrganizationKey(){
		if(_NSTextCheckingOrganizationKey != null) return _NSTextCheckingOrganizationKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingOrganizationKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingOrganizationKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingPhoneKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingPhoneKey(){
		if(_NSTextCheckingPhoneKey != null) return _NSTextCheckingPhoneKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingPhoneKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingPhoneKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingStateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingStateKey(){
		if(_NSTextCheckingStateKey != null) return _NSTextCheckingStateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingStateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingStateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingStreetKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingStreetKey(){
		if(_NSTextCheckingStreetKey != null) return _NSTextCheckingStreetKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingStreetKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingStreetKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingZIPKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingZIPKey(){
		if(_NSTextCheckingZIPKey != null) return _NSTextCheckingZIPKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingZIPKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingZIPKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSThisDayDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSThisDayDesignations(){
		if(_NSThisDayDesignations != null) return _NSThisDayDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSThisDayDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSThisDayDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSThousandsSeparator = null;
	 final public com.apple.jobjc.foundation.NSString NSThousandsSeparator(){
		if(_NSThousandsSeparator != null) return _NSThousandsSeparator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSThousandsSeparator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSThousandsSeparator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSThreadWillExitNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSThreadWillExitNotification(){
		if(_NSThreadWillExitNotification != null) return _NSThreadWillExitNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSThreadWillExitNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSThreadWillExitNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTimeDateFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSTimeDateFormatString(){
		if(_NSTimeDateFormatString != null) return _NSTimeDateFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTimeDateFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTimeDateFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTimeFormatString = null;
	 final public com.apple.jobjc.foundation.NSString NSTimeFormatString(){
		if(_NSTimeFormatString != null) return _NSTimeFormatString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTimeFormatString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTimeFormatString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAttributeModificationDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAttributeModificationDateKey(){
		if(_NSURLAttributeModificationDateKey != null) return _NSURLAttributeModificationDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAttributeModificationDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAttributeModificationDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodClientCertificate = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodClientCertificate(){
		if(_NSURLAuthenticationMethodClientCertificate != null) return _NSURLAuthenticationMethodClientCertificate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodClientCertificate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodClientCertificate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodDefault = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodDefault(){
		if(_NSURLAuthenticationMethodDefault != null) return _NSURLAuthenticationMethodDefault;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodDefault", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodDefault = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodHTMLForm = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodHTMLForm(){
		if(_NSURLAuthenticationMethodHTMLForm != null) return _NSURLAuthenticationMethodHTMLForm;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodHTMLForm", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodHTMLForm = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodHTTPBasic = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodHTTPBasic(){
		if(_NSURLAuthenticationMethodHTTPBasic != null) return _NSURLAuthenticationMethodHTTPBasic;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodHTTPBasic", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodHTTPBasic = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodHTTPDigest = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodHTTPDigest(){
		if(_NSURLAuthenticationMethodHTTPDigest != null) return _NSURLAuthenticationMethodHTTPDigest;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodHTTPDigest", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodHTTPDigest = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodNTLM = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodNTLM(){
		if(_NSURLAuthenticationMethodNTLM != null) return _NSURLAuthenticationMethodNTLM;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodNTLM", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodNTLM = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodNegotiate = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodNegotiate(){
		if(_NSURLAuthenticationMethodNegotiate != null) return _NSURLAuthenticationMethodNegotiate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodNegotiate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodNegotiate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLAuthenticationMethodServerTrust = null;
	 final public com.apple.jobjc.foundation.NSString NSURLAuthenticationMethodServerTrust(){
		if(_NSURLAuthenticationMethodServerTrust != null) return _NSURLAuthenticationMethodServerTrust;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLAuthenticationMethodServerTrust", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLAuthenticationMethodServerTrust = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLContentAccessDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLContentAccessDateKey(){
		if(_NSURLContentAccessDateKey != null) return _NSURLContentAccessDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLContentAccessDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLContentAccessDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLContentModificationDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLContentModificationDateKey(){
		if(_NSURLContentModificationDateKey != null) return _NSURLContentModificationDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLContentModificationDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLContentModificationDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLCreationDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLCreationDateKey(){
		if(_NSURLCreationDateKey != null) return _NSURLCreationDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLCreationDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLCreationDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLCredentialStorageChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSURLCredentialStorageChangedNotification(){
		if(_NSURLCredentialStorageChangedNotification != null) return _NSURLCredentialStorageChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLCredentialStorageChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLCredentialStorageChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLCustomIconKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLCustomIconKey(){
		if(_NSURLCustomIconKey != null) return _NSURLCustomIconKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLCustomIconKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLCustomIconKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLEffectiveIconKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLEffectiveIconKey(){
		if(_NSURLEffectiveIconKey != null) return _NSURLEffectiveIconKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLEffectiveIconKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLEffectiveIconKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSURLErrorDomain(){
		if(_NSURLErrorDomain != null) return _NSURLErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLErrorFailingURLErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLErrorFailingURLErrorKey(){
		if(_NSURLErrorFailingURLErrorKey != null) return _NSURLErrorFailingURLErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLErrorFailingURLErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLErrorFailingURLErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLErrorFailingURLPeerTrustErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLErrorFailingURLPeerTrustErrorKey(){
		if(_NSURLErrorFailingURLPeerTrustErrorKey != null) return _NSURLErrorFailingURLPeerTrustErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLErrorFailingURLPeerTrustErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLErrorFailingURLPeerTrustErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLErrorFailingURLStringErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLErrorFailingURLStringErrorKey(){
		if(_NSURLErrorFailingURLStringErrorKey != null) return _NSURLErrorFailingURLStringErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLErrorFailingURLStringErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLErrorFailingURLStringErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLErrorKey(){
		if(_NSURLErrorKey != null) return _NSURLErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileAllocatedSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileAllocatedSizeKey(){
		if(_NSURLFileAllocatedSizeKey != null) return _NSURLFileAllocatedSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileAllocatedSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileAllocatedSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceIdentifierKey(){
		if(_NSURLFileResourceIdentifierKey != null) return _NSURLFileResourceIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeBlockSpecial = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeBlockSpecial(){
		if(_NSURLFileResourceTypeBlockSpecial != null) return _NSURLFileResourceTypeBlockSpecial;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeBlockSpecial", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeBlockSpecial = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeCharacterSpecial = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeCharacterSpecial(){
		if(_NSURLFileResourceTypeCharacterSpecial != null) return _NSURLFileResourceTypeCharacterSpecial;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeCharacterSpecial", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeCharacterSpecial = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeDirectory = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeDirectory(){
		if(_NSURLFileResourceTypeDirectory != null) return _NSURLFileResourceTypeDirectory;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeDirectory", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeDirectory = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeKey(){
		if(_NSURLFileResourceTypeKey != null) return _NSURLFileResourceTypeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeNamedPipe = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeNamedPipe(){
		if(_NSURLFileResourceTypeNamedPipe != null) return _NSURLFileResourceTypeNamedPipe;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeNamedPipe", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeNamedPipe = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeRegular = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeRegular(){
		if(_NSURLFileResourceTypeRegular != null) return _NSURLFileResourceTypeRegular;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeRegular", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeRegular = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeSocket = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeSocket(){
		if(_NSURLFileResourceTypeSocket != null) return _NSURLFileResourceTypeSocket;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeSocket", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeSocket = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeSymbolicLink = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeSymbolicLink(){
		if(_NSURLFileResourceTypeSymbolicLink != null) return _NSURLFileResourceTypeSymbolicLink;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeSymbolicLink", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeSymbolicLink = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileResourceTypeUnknown = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileResourceTypeUnknown(){
		if(_NSURLFileResourceTypeUnknown != null) return _NSURLFileResourceTypeUnknown;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileResourceTypeUnknown", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileResourceTypeUnknown = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileScheme = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileScheme(){
		if(_NSURLFileScheme != null) return _NSURLFileScheme;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileScheme", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileScheme = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileSecurityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileSecurityKey(){
		if(_NSURLFileSecurityKey != null) return _NSURLFileSecurityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileSecurityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileSecurityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLFileSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLFileSizeKey(){
		if(_NSURLFileSizeKey != null) return _NSURLFileSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLFileSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLFileSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLHasHiddenExtensionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLHasHiddenExtensionKey(){
		if(_NSURLHasHiddenExtensionKey != null) return _NSURLHasHiddenExtensionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLHasHiddenExtensionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLHasHiddenExtensionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsAliasFileKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsAliasFileKey(){
		if(_NSURLIsAliasFileKey != null) return _NSURLIsAliasFileKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsAliasFileKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsAliasFileKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsDirectoryKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsDirectoryKey(){
		if(_NSURLIsDirectoryKey != null) return _NSURLIsDirectoryKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsDirectoryKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsDirectoryKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsExcludedFromBackupKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsExcludedFromBackupKey(){
		if(_NSURLIsExcludedFromBackupKey != null) return _NSURLIsExcludedFromBackupKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsExcludedFromBackupKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsExcludedFromBackupKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsExecutableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsExecutableKey(){
		if(_NSURLIsExecutableKey != null) return _NSURLIsExecutableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsExecutableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsExecutableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsHiddenKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsHiddenKey(){
		if(_NSURLIsHiddenKey != null) return _NSURLIsHiddenKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsHiddenKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsHiddenKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsMountTriggerKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsMountTriggerKey(){
		if(_NSURLIsMountTriggerKey != null) return _NSURLIsMountTriggerKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsMountTriggerKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsMountTriggerKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsPackageKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsPackageKey(){
		if(_NSURLIsPackageKey != null) return _NSURLIsPackageKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsPackageKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsPackageKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsReadableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsReadableKey(){
		if(_NSURLIsReadableKey != null) return _NSURLIsReadableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsReadableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsReadableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsRegularFileKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsRegularFileKey(){
		if(_NSURLIsRegularFileKey != null) return _NSURLIsRegularFileKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsRegularFileKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsRegularFileKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsSymbolicLinkKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsSymbolicLinkKey(){
		if(_NSURLIsSymbolicLinkKey != null) return _NSURLIsSymbolicLinkKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsSymbolicLinkKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsSymbolicLinkKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsSystemImmutableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsSystemImmutableKey(){
		if(_NSURLIsSystemImmutableKey != null) return _NSURLIsSystemImmutableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsSystemImmutableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsSystemImmutableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsUbiquitousItemKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsUbiquitousItemKey(){
		if(_NSURLIsUbiquitousItemKey != null) return _NSURLIsUbiquitousItemKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsUbiquitousItemKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsUbiquitousItemKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsUserImmutableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsUserImmutableKey(){
		if(_NSURLIsUserImmutableKey != null) return _NSURLIsUserImmutableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsUserImmutableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsUserImmutableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsVolumeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsVolumeKey(){
		if(_NSURLIsVolumeKey != null) return _NSURLIsVolumeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsVolumeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsVolumeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLIsWritableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLIsWritableKey(){
		if(_NSURLIsWritableKey != null) return _NSURLIsWritableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLIsWritableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLIsWritableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLKeysOfUnsetValuesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLKeysOfUnsetValuesKey(){
		if(_NSURLKeysOfUnsetValuesKey != null) return _NSURLKeysOfUnsetValuesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLKeysOfUnsetValuesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLKeysOfUnsetValuesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLabelColorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLabelColorKey(){
		if(_NSURLLabelColorKey != null) return _NSURLLabelColorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLabelColorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLabelColorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLabelNumberKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLabelNumberKey(){
		if(_NSURLLabelNumberKey != null) return _NSURLLabelNumberKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLabelNumberKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLabelNumberKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLinkCountKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLinkCountKey(){
		if(_NSURLLinkCountKey != null) return _NSURLLinkCountKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLinkCountKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLinkCountKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLocalizedLabelKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLocalizedLabelKey(){
		if(_NSURLLocalizedLabelKey != null) return _NSURLLocalizedLabelKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLocalizedLabelKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLocalizedLabelKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLocalizedNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLocalizedNameKey(){
		if(_NSURLLocalizedNameKey != null) return _NSURLLocalizedNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLocalizedNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLocalizedNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLLocalizedTypeDescriptionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLLocalizedTypeDescriptionKey(){
		if(_NSURLLocalizedTypeDescriptionKey != null) return _NSURLLocalizedTypeDescriptionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLLocalizedTypeDescriptionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLLocalizedTypeDescriptionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLNameKey(){
		if(_NSURLNameKey != null) return _NSURLNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLParentDirectoryURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLParentDirectoryURLKey(){
		if(_NSURLParentDirectoryURLKey != null) return _NSURLParentDirectoryURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLParentDirectoryURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLParentDirectoryURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLPathKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLPathKey(){
		if(_NSURLPathKey != null) return _NSURLPathKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLPathKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLPathKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLPreferredIOBlockSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLPreferredIOBlockSizeKey(){
		if(_NSURLPreferredIOBlockSizeKey != null) return _NSURLPreferredIOBlockSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLPreferredIOBlockSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLPreferredIOBlockSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceFTP = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceFTP(){
		if(_NSURLProtectionSpaceFTP != null) return _NSURLProtectionSpaceFTP;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceFTP", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceFTP = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceFTPProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceFTPProxy(){
		if(_NSURLProtectionSpaceFTPProxy != null) return _NSURLProtectionSpaceFTPProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceFTPProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceFTPProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceHTTP = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceHTTP(){
		if(_NSURLProtectionSpaceHTTP != null) return _NSURLProtectionSpaceHTTP;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceHTTP", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceHTTP = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceHTTPProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceHTTPProxy(){
		if(_NSURLProtectionSpaceHTTPProxy != null) return _NSURLProtectionSpaceHTTPProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceHTTPProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceHTTPProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceHTTPS = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceHTTPS(){
		if(_NSURLProtectionSpaceHTTPS != null) return _NSURLProtectionSpaceHTTPS;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceHTTPS", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceHTTPS = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceHTTPSProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceHTTPSProxy(){
		if(_NSURLProtectionSpaceHTTPSProxy != null) return _NSURLProtectionSpaceHTTPSProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceHTTPSProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceHTTPSProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLProtectionSpaceSOCKSProxy = null;
	 final public com.apple.jobjc.foundation.NSString NSURLProtectionSpaceSOCKSProxy(){
		if(_NSURLProtectionSpaceSOCKSProxy != null) return _NSURLProtectionSpaceSOCKSProxy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLProtectionSpaceSOCKSProxy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLProtectionSpaceSOCKSProxy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLTotalFileAllocatedSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLTotalFileAllocatedSizeKey(){
		if(_NSURLTotalFileAllocatedSizeKey != null) return _NSURLTotalFileAllocatedSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLTotalFileAllocatedSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLTotalFileAllocatedSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLTotalFileSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLTotalFileSizeKey(){
		if(_NSURLTotalFileSizeKey != null) return _NSURLTotalFileSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLTotalFileSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLTotalFileSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLTypeIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLTypeIdentifierKey(){
		if(_NSURLTypeIdentifierKey != null) return _NSURLTypeIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLTypeIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLTypeIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemHasUnresolvedConflictsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemHasUnresolvedConflictsKey(){
		if(_NSURLUbiquitousItemHasUnresolvedConflictsKey != null) return _NSURLUbiquitousItemHasUnresolvedConflictsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemHasUnresolvedConflictsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemHasUnresolvedConflictsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemIsDownloadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemIsDownloadedKey(){
		if(_NSURLUbiquitousItemIsDownloadedKey != null) return _NSURLUbiquitousItemIsDownloadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemIsDownloadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemIsDownloadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemIsDownloadingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemIsDownloadingKey(){
		if(_NSURLUbiquitousItemIsDownloadingKey != null) return _NSURLUbiquitousItemIsDownloadingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemIsDownloadingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemIsDownloadingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemIsUploadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemIsUploadedKey(){
		if(_NSURLUbiquitousItemIsUploadedKey != null) return _NSURLUbiquitousItemIsUploadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemIsUploadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemIsUploadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemIsUploadingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemIsUploadingKey(){
		if(_NSURLUbiquitousItemIsUploadingKey != null) return _NSURLUbiquitousItemIsUploadingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemIsUploadingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemIsUploadingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemPercentDownloadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemPercentDownloadedKey(){
		if(_NSURLUbiquitousItemPercentDownloadedKey != null) return _NSURLUbiquitousItemPercentDownloadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemPercentDownloadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemPercentDownloadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLUbiquitousItemPercentUploadedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLUbiquitousItemPercentUploadedKey(){
		if(_NSURLUbiquitousItemPercentUploadedKey != null) return _NSURLUbiquitousItemPercentUploadedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLUbiquitousItemPercentUploadedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLUbiquitousItemPercentUploadedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeAvailableCapacityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeAvailableCapacityKey(){
		if(_NSURLVolumeAvailableCapacityKey != null) return _NSURLVolumeAvailableCapacityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeAvailableCapacityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeAvailableCapacityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeCreationDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeCreationDateKey(){
		if(_NSURLVolumeCreationDateKey != null) return _NSURLVolumeCreationDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeCreationDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeCreationDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIdentifierKey(){
		if(_NSURLVolumeIdentifierKey != null) return _NSURLVolumeIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsAutomountedKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsAutomountedKey(){
		if(_NSURLVolumeIsAutomountedKey != null) return _NSURLVolumeIsAutomountedKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsAutomountedKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsAutomountedKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsBrowsableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsBrowsableKey(){
		if(_NSURLVolumeIsBrowsableKey != null) return _NSURLVolumeIsBrowsableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsBrowsableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsBrowsableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsEjectableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsEjectableKey(){
		if(_NSURLVolumeIsEjectableKey != null) return _NSURLVolumeIsEjectableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsEjectableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsEjectableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsInternalKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsInternalKey(){
		if(_NSURLVolumeIsInternalKey != null) return _NSURLVolumeIsInternalKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsInternalKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsInternalKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsJournalingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsJournalingKey(){
		if(_NSURLVolumeIsJournalingKey != null) return _NSURLVolumeIsJournalingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsJournalingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsJournalingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsLocalKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsLocalKey(){
		if(_NSURLVolumeIsLocalKey != null) return _NSURLVolumeIsLocalKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsLocalKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsLocalKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsReadOnlyKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsReadOnlyKey(){
		if(_NSURLVolumeIsReadOnlyKey != null) return _NSURLVolumeIsReadOnlyKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsReadOnlyKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsReadOnlyKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeIsRemovableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeIsRemovableKey(){
		if(_NSURLVolumeIsRemovableKey != null) return _NSURLVolumeIsRemovableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeIsRemovableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeIsRemovableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeLocalizedFormatDescriptionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeLocalizedFormatDescriptionKey(){
		if(_NSURLVolumeLocalizedFormatDescriptionKey != null) return _NSURLVolumeLocalizedFormatDescriptionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeLocalizedFormatDescriptionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeLocalizedFormatDescriptionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeLocalizedNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeLocalizedNameKey(){
		if(_NSURLVolumeLocalizedNameKey != null) return _NSURLVolumeLocalizedNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeLocalizedNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeLocalizedNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeMaximumFileSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeMaximumFileSizeKey(){
		if(_NSURLVolumeMaximumFileSizeKey != null) return _NSURLVolumeMaximumFileSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeMaximumFileSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeMaximumFileSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeNameKey(){
		if(_NSURLVolumeNameKey != null) return _NSURLVolumeNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeResourceCountKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeResourceCountKey(){
		if(_NSURLVolumeResourceCountKey != null) return _NSURLVolumeResourceCountKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeResourceCountKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeResourceCountKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsAdvisoryFileLockingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsAdvisoryFileLockingKey(){
		if(_NSURLVolumeSupportsAdvisoryFileLockingKey != null) return _NSURLVolumeSupportsAdvisoryFileLockingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsAdvisoryFileLockingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsAdvisoryFileLockingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsCasePreservedNamesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsCasePreservedNamesKey(){
		if(_NSURLVolumeSupportsCasePreservedNamesKey != null) return _NSURLVolumeSupportsCasePreservedNamesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsCasePreservedNamesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsCasePreservedNamesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsCaseSensitiveNamesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsCaseSensitiveNamesKey(){
		if(_NSURLVolumeSupportsCaseSensitiveNamesKey != null) return _NSURLVolumeSupportsCaseSensitiveNamesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsCaseSensitiveNamesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsCaseSensitiveNamesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsExtendedSecurityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsExtendedSecurityKey(){
		if(_NSURLVolumeSupportsExtendedSecurityKey != null) return _NSURLVolumeSupportsExtendedSecurityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsExtendedSecurityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsExtendedSecurityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsHardLinksKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsHardLinksKey(){
		if(_NSURLVolumeSupportsHardLinksKey != null) return _NSURLVolumeSupportsHardLinksKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsHardLinksKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsHardLinksKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsJournalingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsJournalingKey(){
		if(_NSURLVolumeSupportsJournalingKey != null) return _NSURLVolumeSupportsJournalingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsJournalingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsJournalingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsPersistentIDsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsPersistentIDsKey(){
		if(_NSURLVolumeSupportsPersistentIDsKey != null) return _NSURLVolumeSupportsPersistentIDsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsPersistentIDsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsPersistentIDsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsRenamingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsRenamingKey(){
		if(_NSURLVolumeSupportsRenamingKey != null) return _NSURLVolumeSupportsRenamingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsRenamingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsRenamingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsRootDirectoryDatesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsRootDirectoryDatesKey(){
		if(_NSURLVolumeSupportsRootDirectoryDatesKey != null) return _NSURLVolumeSupportsRootDirectoryDatesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsRootDirectoryDatesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsRootDirectoryDatesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsSparseFilesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsSparseFilesKey(){
		if(_NSURLVolumeSupportsSparseFilesKey != null) return _NSURLVolumeSupportsSparseFilesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsSparseFilesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsSparseFilesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsSymbolicLinksKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsSymbolicLinksKey(){
		if(_NSURLVolumeSupportsSymbolicLinksKey != null) return _NSURLVolumeSupportsSymbolicLinksKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsSymbolicLinksKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsSymbolicLinksKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsVolumeSizesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsVolumeSizesKey(){
		if(_NSURLVolumeSupportsVolumeSizesKey != null) return _NSURLVolumeSupportsVolumeSizesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsVolumeSizesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsVolumeSizesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeSupportsZeroRunsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeSupportsZeroRunsKey(){
		if(_NSURLVolumeSupportsZeroRunsKey != null) return _NSURLVolumeSupportsZeroRunsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeSupportsZeroRunsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeSupportsZeroRunsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeTotalCapacityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeTotalCapacityKey(){
		if(_NSURLVolumeTotalCapacityKey != null) return _NSURLVolumeTotalCapacityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeTotalCapacityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeTotalCapacityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeURLForRemountingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeURLForRemountingKey(){
		if(_NSURLVolumeURLForRemountingKey != null) return _NSURLVolumeURLForRemountingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeURLForRemountingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeURLForRemountingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeURLKey(){
		if(_NSURLVolumeURLKey != null) return _NSURLVolumeURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLVolumeUUIDStringKey = null;
	 final public com.apple.jobjc.foundation.NSString NSURLVolumeUUIDStringKey(){
		if(_NSURLVolumeUUIDStringKey != null) return _NSURLVolumeUUIDStringKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLVolumeUUIDStringKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLVolumeUUIDStringKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUbiquitousKeyValueStoreChangeReasonKey = null;
	 final public com.apple.jobjc.foundation.NSString NSUbiquitousKeyValueStoreChangeReasonKey(){
		if(_NSUbiquitousKeyValueStoreChangeReasonKey != null) return _NSUbiquitousKeyValueStoreChangeReasonKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUbiquitousKeyValueStoreChangeReasonKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUbiquitousKeyValueStoreChangeReasonKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUbiquitousKeyValueStoreChangedKeysKey = null;
	 final public com.apple.jobjc.foundation.NSString NSUbiquitousKeyValueStoreChangedKeysKey(){
		if(_NSUbiquitousKeyValueStoreChangedKeysKey != null) return _NSUbiquitousKeyValueStoreChangedKeysKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUbiquitousKeyValueStoreChangedKeysKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUbiquitousKeyValueStoreChangedKeysKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUbiquitousKeyValueStoreDidChangeExternallyNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUbiquitousKeyValueStoreDidChangeExternallyNotification(){
		if(_NSUbiquitousKeyValueStoreDidChangeExternallyNotification != null) return _NSUbiquitousKeyValueStoreDidChangeExternallyNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUbiquitousKeyValueStoreDidChangeExternallyNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUbiquitousKeyValueStoreDidChangeExternallyNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUbiquityIdentityDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUbiquityIdentityDidChangeNotification(){
		if(_NSUbiquityIdentityDidChangeNotification != null) return _NSUbiquityIdentityDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUbiquityIdentityDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUbiquityIdentityDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnarchiveFromDataTransformerName = null;
	 final public com.apple.jobjc.foundation.NSString NSUnarchiveFromDataTransformerName(){
		if(_NSUnarchiveFromDataTransformerName != null) return _NSUnarchiveFromDataTransformerName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnarchiveFromDataTransformerName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnarchiveFromDataTransformerName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndefinedKeyException = null;
	 final public com.apple.jobjc.foundation.NSString NSUndefinedKeyException(){
		if(_NSUndefinedKeyException != null) return _NSUndefinedKeyException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndefinedKeyException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndefinedKeyException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnderlyingErrorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSUnderlyingErrorKey(){
		if(_NSUnderlyingErrorKey != null) return _NSUnderlyingErrorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnderlyingErrorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnderlyingErrorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerCheckpointNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerCheckpointNotification(){
		if(_NSUndoManagerCheckpointNotification != null) return _NSUndoManagerCheckpointNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerCheckpointNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerCheckpointNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerDidCloseUndoGroupNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerDidCloseUndoGroupNotification(){
		if(_NSUndoManagerDidCloseUndoGroupNotification != null) return _NSUndoManagerDidCloseUndoGroupNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerDidCloseUndoGroupNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerDidCloseUndoGroupNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerDidOpenUndoGroupNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerDidOpenUndoGroupNotification(){
		if(_NSUndoManagerDidOpenUndoGroupNotification != null) return _NSUndoManagerDidOpenUndoGroupNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerDidOpenUndoGroupNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerDidOpenUndoGroupNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerDidRedoChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerDidRedoChangeNotification(){
		if(_NSUndoManagerDidRedoChangeNotification != null) return _NSUndoManagerDidRedoChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerDidRedoChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerDidRedoChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerDidUndoChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerDidUndoChangeNotification(){
		if(_NSUndoManagerDidUndoChangeNotification != null) return _NSUndoManagerDidUndoChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerDidUndoChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerDidUndoChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerGroupIsDiscardableKey = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerGroupIsDiscardableKey(){
		if(_NSUndoManagerGroupIsDiscardableKey != null) return _NSUndoManagerGroupIsDiscardableKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerGroupIsDiscardableKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerGroupIsDiscardableKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerWillCloseUndoGroupNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerWillCloseUndoGroupNotification(){
		if(_NSUndoManagerWillCloseUndoGroupNotification != null) return _NSUndoManagerWillCloseUndoGroupNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerWillCloseUndoGroupNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerWillCloseUndoGroupNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerWillRedoChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerWillRedoChangeNotification(){
		if(_NSUndoManagerWillRedoChangeNotification != null) return _NSUndoManagerWillRedoChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerWillRedoChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerWillRedoChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUndoManagerWillUndoChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUndoManagerWillUndoChangeNotification(){
		if(_NSUndoManagerWillUndoChangeNotification != null) return _NSUndoManagerWillUndoChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUndoManagerWillUndoChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUndoManagerWillUndoChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnionOfArraysKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSUnionOfArraysKeyValueOperator(){
		if(_NSUnionOfArraysKeyValueOperator != null) return _NSUnionOfArraysKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnionOfArraysKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnionOfArraysKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnionOfObjectsKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSUnionOfObjectsKeyValueOperator(){
		if(_NSUnionOfObjectsKeyValueOperator != null) return _NSUnionOfObjectsKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnionOfObjectsKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnionOfObjectsKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnionOfSetsKeyValueOperator = null;
	 final public com.apple.jobjc.foundation.NSString NSUnionOfSetsKeyValueOperator(){
		if(_NSUnionOfSetsKeyValueOperator != null) return _NSUnionOfSetsKeyValueOperator;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnionOfSetsKeyValueOperator", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnionOfSetsKeyValueOperator = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUserDefaultsDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSUserDefaultsDidChangeNotification(){
		if(_NSUserDefaultsDidChangeNotification != null) return _NSUserDefaultsDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUserDefaultsDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUserDefaultsDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUserNotificationDefaultSoundName = null;
	 final public com.apple.jobjc.foundation.NSString NSUserNotificationDefaultSoundName(){
		if(_NSUserNotificationDefaultSoundName != null) return _NSUserNotificationDefaultSoundName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUserNotificationDefaultSoundName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUserNotificationDefaultSoundName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWeekDayNameArray = null;
	 final public com.apple.jobjc.foundation.NSString NSWeekDayNameArray(){
		if(_NSWeekDayNameArray != null) return _NSWeekDayNameArray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWeekDayNameArray", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWeekDayNameArray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWillBecomeMultiThreadedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWillBecomeMultiThreadedNotification(){
		if(_NSWillBecomeMultiThreadedNotification != null) return _NSWillBecomeMultiThreadedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWillBecomeMultiThreadedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWillBecomeMultiThreadedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSXMLParserErrorDomain = null;
	 final public com.apple.jobjc.foundation.NSString NSXMLParserErrorDomain(){
		if(_NSXMLParserErrorDomain != null) return _NSXMLParserErrorDomain;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSXMLParserErrorDomain", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSXMLParserErrorDomain = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSYearMonthWeekDesignations = null;
	 final public com.apple.jobjc.foundation.NSString NSYearMonthWeekDesignations(){
		if(_NSYearMonthWeekDesignations != null) return _NSYearMonthWeekDesignations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSYearMonthWeekDesignations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSYearMonthWeekDesignations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSPoint _NSZeroPoint = null;
	 final public com.apple.jobjc.foundation.NSPoint NSZeroPoint(){
		if(_NSZeroPoint != null) return _NSZeroPoint;
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		getConstant("NSZeroPoint", returnValue, com.apple.jobjc.foundation.NSPoint.getStructCoder().sizeof());
		
		_NSZeroPoint = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSRect _NSZeroRect = null;
	 final public com.apple.jobjc.foundation.NSRect NSZeroRect(){
		if(_NSZeroRect != null) return _NSZeroRect;
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		getConstant("NSZeroRect", returnValue, com.apple.jobjc.foundation.NSRect.getStructCoder().sizeof());
		
		_NSZeroRect = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSSize _NSZeroSize = null;
	 final public com.apple.jobjc.foundation.NSSize NSZeroSize(){
		if(_NSZeroSize != null) return _NSZeroSize;
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		getConstant("NSZeroSize", returnValue, com.apple.jobjc.foundation.NSSize.getStructCoder().sizeof());
		
		_NSZeroSize = returnValue;
		return returnValue;
	}

	private boolean _NSZombieEnabled = false;
	 final public boolean NSZombieEnabled(){
		if(_NSZombieEnabled != false) return _NSZombieEnabled;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSZombieEnabled", nativeBuffer, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.sizeof());
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		_NSZombieEnabled = returnValue;
		return returnValue;
	}
	private NSPortNameServerClass _NSPortNameServerClass = null;
	public NSPortNameServerClass NSPortNameServer() {
		return _NSPortNameServerClass != null ? _NSPortNameServerClass : (_NSPortNameServerClass = new NSPortNameServerClass(getRuntime()));
	}

	private NSDateClass _NSDateClass = null;
	public NSDateClass NSDate() {
		return _NSDateClass != null ? _NSDateClass : (_NSDateClass = new NSDateClass(getRuntime()));
	}

	private NSMutableCharacterSetClass _NSMutableCharacterSetClass = null;
	public NSMutableCharacterSetClass NSMutableCharacterSet() {
		return _NSMutableCharacterSetClass != null ? _NSMutableCharacterSetClass : (_NSMutableCharacterSetClass = new NSMutableCharacterSetClass(getRuntime()));
	}

	private NSPredicateClass _NSPredicateClass = null;
	public NSPredicateClass NSPredicate() {
		return _NSPredicateClass != null ? _NSPredicateClass : (_NSPredicateClass = new NSPredicateClass(getRuntime()));
	}

	private NSMutableArrayClass _NSMutableArrayClass = null;
	public NSMutableArrayClass NSMutableArray() {
		return _NSMutableArrayClass != null ? _NSMutableArrayClass : (_NSMutableArrayClass = new NSMutableArrayClass(getRuntime()));
	}

	private NSMachPortClass _NSMachPortClass = null;
	public NSMachPortClass NSMachPort() {
		return _NSMachPortClass != null ? _NSMachPortClass : (_NSMachPortClass = new NSMachPortClass(getRuntime()));
	}

	private NSCharacterSetClass _NSCharacterSetClass = null;
	public NSCharacterSetClass NSCharacterSet() {
		return _NSCharacterSetClass != null ? _NSCharacterSetClass : (_NSCharacterSetClass = new NSCharacterSetClass(getRuntime()));
	}

	private NSDataClass _NSDataClass = null;
	public NSDataClass NSData() {
		return _NSDataClass != null ? _NSDataClass : (_NSDataClass = new NSDataClass(getRuntime()));
	}

	private NSSpellServerClass _NSSpellServerClass = null;
	public NSSpellServerClass NSSpellServer() {
		return _NSSpellServerClass != null ? _NSSpellServerClass : (_NSSpellServerClass = new NSSpellServerClass(getRuntime()));
	}

	private NSCountedSetClass _NSCountedSetClass = null;
	public NSCountedSetClass NSCountedSet() {
		return _NSCountedSetClass != null ? _NSCountedSetClass : (_NSCountedSetClass = new NSCountedSetClass(getRuntime()));
	}

	private NSDictionaryClass _NSDictionaryClass = null;
	public NSDictionaryClass NSDictionary() {
		return _NSDictionaryClass != null ? _NSDictionaryClass : (_NSDictionaryClass = new NSDictionaryClass(getRuntime()));
	}

	private NSCoderClass _NSCoderClass = null;
	public NSCoderClass NSCoder() {
		return _NSCoderClass != null ? _NSCoderClass : (_NSCoderClass = new NSCoderClass(getRuntime()));
	}

	private NSNumberFormatterClass _NSNumberFormatterClass = null;
	public NSNumberFormatterClass NSNumberFormatter() {
		return _NSNumberFormatterClass != null ? _NSNumberFormatterClass : (_NSNumberFormatterClass = new NSNumberFormatterClass(getRuntime()));
	}

	private NSMetadataQueryResultGroupClass _NSMetadataQueryResultGroupClass = null;
	public NSMetadataQueryResultGroupClass NSMetadataQueryResultGroup() {
		return _NSMetadataQueryResultGroupClass != null ? _NSMetadataQueryResultGroupClass : (_NSMetadataQueryResultGroupClass = new NSMetadataQueryResultGroupClass(getRuntime()));
	}

	private NSMetadataQueryClass _NSMetadataQueryClass = null;
	public NSMetadataQueryClass NSMetadataQuery() {
		return _NSMetadataQueryClass != null ? _NSMetadataQueryClass : (_NSMetadataQueryClass = new NSMetadataQueryClass(getRuntime()));
	}

	private NSObjectClass _NSObjectClass = null;
	public NSObjectClass NSObject() {
		return _NSObjectClass != null ? _NSObjectClass : (_NSObjectClass = new NSObjectClass(getRuntime()));
	}

	private NSFileHandleClass _NSFileHandleClass = null;
	public NSFileHandleClass NSFileHandle() {
		return _NSFileHandleClass != null ? _NSFileHandleClass : (_NSFileHandleClass = new NSFileHandleClass(getRuntime()));
	}

	private NSUnarchiverClass _NSUnarchiverClass = null;
	public NSUnarchiverClass NSUnarchiver() {
		return _NSUnarchiverClass != null ? _NSUnarchiverClass : (_NSUnarchiverClass = new NSUnarchiverClass(getRuntime()));
	}

	private NSValueClass _NSValueClass = null;
	public NSValueClass NSValue() {
		return _NSValueClass != null ? _NSValueClass : (_NSValueClass = new NSValueClass(getRuntime()));
	}

	private NSPortCoderClass _NSPortCoderClass = null;
	public NSPortCoderClass NSPortCoder() {
		return _NSPortCoderClass != null ? _NSPortCoderClass : (_NSPortCoderClass = new NSPortCoderClass(getRuntime()));
	}

	private NSDistributedLockClass _NSDistributedLockClass = null;
	public NSDistributedLockClass NSDistributedLock() {
		return _NSDistributedLockClass != null ? _NSDistributedLockClass : (_NSDistributedLockClass = new NSDistributedLockClass(getRuntime()));
	}

	private NSScriptExecutionContextClass _NSScriptExecutionContextClass = null;
	public NSScriptExecutionContextClass NSScriptExecutionContext() {
		return _NSScriptExecutionContextClass != null ? _NSScriptExecutionContextClass : (_NSScriptExecutionContextClass = new NSScriptExecutionContextClass(getRuntime()));
	}

	private NSUserAutomatorTaskClass _NSUserAutomatorTaskClass = null;
	public NSUserAutomatorTaskClass NSUserAutomatorTask() {
		return _NSUserAutomatorTaskClass != null ? _NSUserAutomatorTaskClass : (_NSUserAutomatorTaskClass = new NSUserAutomatorTaskClass(getRuntime()));
	}

	private NSDecimalNumberHandlerClass _NSDecimalNumberHandlerClass = null;
	public NSDecimalNumberHandlerClass NSDecimalNumberHandler() {
		return _NSDecimalNumberHandlerClass != null ? _NSDecimalNumberHandlerClass : (_NSDecimalNumberHandlerClass = new NSDecimalNumberHandlerClass(getRuntime()));
	}

	private NSCachedURLResponseClass _NSCachedURLResponseClass = null;
	public NSCachedURLResponseClass NSCachedURLResponse() {
		return _NSCachedURLResponseClass != null ? _NSCachedURLResponseClass : (_NSCachedURLResponseClass = new NSCachedURLResponseClass(getRuntime()));
	}

	private NSValueTransformerClass _NSValueTransformerClass = null;
	public NSValueTransformerClass NSValueTransformer() {
		return _NSValueTransformerClass != null ? _NSValueTransformerClass : (_NSValueTransformerClass = new NSValueTransformerClass(getRuntime()));
	}

	private NSAppleScriptClass _NSAppleScriptClass = null;
	public NSAppleScriptClass NSAppleScript() {
		return _NSAppleScriptClass != null ? _NSAppleScriptClass : (_NSAppleScriptClass = new NSAppleScriptClass(getRuntime()));
	}

	private NSSetClass _NSSetClass = null;
	public NSSetClass NSSet() {
		return _NSSetClass != null ? _NSSetClass : (_NSSetClass = new NSSetClass(getRuntime()));
	}

	private NSLockClass _NSLockClass = null;
	public NSLockClass NSLock() {
		return _NSLockClass != null ? _NSLockClass : (_NSLockClass = new NSLockClass(getRuntime()));
	}

	private NSThreadClass _NSThreadClass = null;
	public NSThreadClass NSThread() {
		return _NSThreadClass != null ? _NSThreadClass : (_NSThreadClass = new NSThreadClass(getRuntime()));
	}

	private NSNullClass _NSNullClass = null;
	public NSNullClass NSNull() {
		return _NSNullClass != null ? _NSNullClass : (_NSNullClass = new NSNullClass(getRuntime()));
	}

	private NSSetCommandClass _NSSetCommandClass = null;
	public NSSetCommandClass NSSetCommand() {
		return _NSSetCommandClass != null ? _NSSetCommandClass : (_NSSetCommandClass = new NSSetCommandClass(getRuntime()));
	}

	private NSPositionalSpecifierClass _NSPositionalSpecifierClass = null;
	public NSPositionalSpecifierClass NSPositionalSpecifier() {
		return _NSPositionalSpecifierClass != null ? _NSPositionalSpecifierClass : (_NSPositionalSpecifierClass = new NSPositionalSpecifierClass(getRuntime()));
	}

	private NSRelativeSpecifierClass _NSRelativeSpecifierClass = null;
	public NSRelativeSpecifierClass NSRelativeSpecifier() {
		return _NSRelativeSpecifierClass != null ? _NSRelativeSpecifierClass : (_NSRelativeSpecifierClass = new NSRelativeSpecifierClass(getRuntime()));
	}

	private NSPortMessageClass _NSPortMessageClass = null;
	public NSPortMessageClass NSPortMessage() {
		return _NSPortMessageClass != null ? _NSPortMessageClass : (_NSPortMessageClass = new NSPortMessageClass(getRuntime()));
	}

	private NSMutableIndexSetClass _NSMutableIndexSetClass = null;
	public NSMutableIndexSetClass NSMutableIndexSet() {
		return _NSMutableIndexSetClass != null ? _NSMutableIndexSetClass : (_NSMutableIndexSetClass = new NSMutableIndexSetClass(getRuntime()));
	}

	private NSSpecifierTestClass _NSSpecifierTestClass = null;
	public NSSpecifierTestClass NSSpecifierTest() {
		return _NSSpecifierTestClass != null ? _NSSpecifierTestClass : (_NSSpecifierTestClass = new NSSpecifierTestClass(getRuntime()));
	}

	private NSLinguisticTaggerClass _NSLinguisticTaggerClass = null;
	public NSLinguisticTaggerClass NSLinguisticTagger() {
		return _NSLinguisticTaggerClass != null ? _NSLinguisticTaggerClass : (_NSLinguisticTaggerClass = new NSLinguisticTaggerClass(getRuntime()));
	}

	private NSNetServiceClass _NSNetServiceClass = null;
	public NSNetServiceClass NSNetService() {
		return _NSNetServiceClass != null ? _NSNetServiceClass : (_NSNetServiceClass = new NSNetServiceClass(getRuntime()));
	}

	private NSUserAppleScriptTaskClass _NSUserAppleScriptTaskClass = null;
	public NSUserAppleScriptTaskClass NSUserAppleScriptTask() {
		return _NSUserAppleScriptTaskClass != null ? _NSUserAppleScriptTaskClass : (_NSUserAppleScriptTaskClass = new NSUserAppleScriptTaskClass(getRuntime()));
	}

	private NSMutableOrderedSetClass _NSMutableOrderedSetClass = null;
	public NSMutableOrderedSetClass NSMutableOrderedSet() {
		return _NSMutableOrderedSetClass != null ? _NSMutableOrderedSetClass : (_NSMutableOrderedSetClass = new NSMutableOrderedSetClass(getRuntime()));
	}

	private NSCloneCommandClass _NSCloneCommandClass = null;
	public NSCloneCommandClass NSCloneCommand() {
		return _NSCloneCommandClass != null ? _NSCloneCommandClass : (_NSCloneCommandClass = new NSCloneCommandClass(getRuntime()));
	}

	private NSArchiverClass _NSArchiverClass = null;
	public NSArchiverClass NSArchiver() {
		return _NSArchiverClass != null ? _NSArchiverClass : (_NSArchiverClass = new NSArchiverClass(getRuntime()));
	}

	private NSAttributedStringClass _NSAttributedStringClass = null;
	public NSAttributedStringClass NSAttributedString() {
		return _NSAttributedStringClass != null ? _NSAttributedStringClass : (_NSAttributedStringClass = new NSAttributedStringClass(getRuntime()));
	}

	private NSLocaleClass _NSLocaleClass = null;
	public NSLocaleClass NSLocale() {
		return _NSLocaleClass != null ? _NSLocaleClass : (_NSLocaleClass = new NSLocaleClass(getRuntime()));
	}

	private NSXPCConnectionClass _NSXPCConnectionClass = null;
	public NSXPCConnectionClass NSXPCConnection() {
		return _NSXPCConnectionClass != null ? _NSXPCConnectionClass : (_NSXPCConnectionClass = new NSXPCConnectionClass(getRuntime()));
	}

	private NSDistributedNotificationCenterClass _NSDistributedNotificationCenterClass = null;
	public NSDistributedNotificationCenterClass NSDistributedNotificationCenter() {
		return _NSDistributedNotificationCenterClass != null ? _NSDistributedNotificationCenterClass : (_NSDistributedNotificationCenterClass = new NSDistributedNotificationCenterClass(getRuntime()));
	}

	private NSEnumeratorClass _NSEnumeratorClass = null;
	public NSEnumeratorClass NSEnumerator() {
		return _NSEnumeratorClass != null ? _NSEnumeratorClass : (_NSEnumeratorClass = new NSEnumeratorClass(getRuntime()));
	}

	private NSPointerArrayClass _NSPointerArrayClass = null;
	public NSPointerArrayClass NSPointerArray() {
		return _NSPointerArrayClass != null ? _NSPointerArrayClass : (_NSPointerArrayClass = new NSPointerArrayClass(getRuntime()));
	}

	private NSURLCredentialStorageClass _NSURLCredentialStorageClass = null;
	public NSURLCredentialStorageClass NSURLCredentialStorage() {
		return _NSURLCredentialStorageClass != null ? _NSURLCredentialStorageClass : (_NSURLCredentialStorageClass = new NSURLCredentialStorageClass(getRuntime()));
	}

	private NSOperationQueueClass _NSOperationQueueClass = null;
	public NSOperationQueueClass NSOperationQueue() {
		return _NSOperationQueueClass != null ? _NSOperationQueueClass : (_NSOperationQueueClass = new NSOperationQueueClass(getRuntime()));
	}

	private NSBlockOperationClass _NSBlockOperationClass = null;
	public NSBlockOperationClass NSBlockOperation() {
		return _NSBlockOperationClass != null ? _NSBlockOperationClass : (_NSBlockOperationClass = new NSBlockOperationClass(getRuntime()));
	}

	private NSOrthographyClass _NSOrthographyClass = null;
	public NSOrthographyClass NSOrthography() {
		return _NSOrthographyClass != null ? _NSOrthographyClass : (_NSOrthographyClass = new NSOrthographyClass(getRuntime()));
	}

	private NSTextCheckingResultClass _NSTextCheckingResultClass = null;
	public NSTextCheckingResultClass NSTextCheckingResult() {
		return _NSTextCheckingResultClass != null ? _NSTextCheckingResultClass : (_NSTextCheckingResultClass = new NSTextCheckingResultClass(getRuntime()));
	}

	private NSCacheClass _NSCacheClass = null;
	public NSCacheClass NSCache() {
		return _NSCacheClass != null ? _NSCacheClass : (_NSCacheClass = new NSCacheClass(getRuntime()));
	}

	private NSUserUnixTaskClass _NSUserUnixTaskClass = null;
	public NSUserUnixTaskClass NSUserUnixTask() {
		return _NSUserUnixTaskClass != null ? _NSUserUnixTaskClass : (_NSUserUnixTaskClass = new NSUserUnixTaskClass(getRuntime()));
	}

	private NSStringClass _NSStringClass = null;
	public NSStringClass NSString() {
		return _NSStringClass != null ? _NSStringClass : (_NSStringClass = new NSStringClass(getRuntime()));
	}

	private NSMethodSignatureClass _NSMethodSignatureClass = null;
	public NSMethodSignatureClass NSMethodSignature() {
		return _NSMethodSignatureClass != null ? _NSMethodSignatureClass : (_NSMethodSignatureClass = new NSMethodSignatureClass(getRuntime()));
	}

	private NSUndoManagerClass _NSUndoManagerClass = null;
	public NSUndoManagerClass NSUndoManager() {
		return _NSUndoManagerClass != null ? _NSUndoManagerClass : (_NSUndoManagerClass = new NSUndoManagerClass(getRuntime()));
	}

	private NSScannerClass _NSScannerClass = null;
	public NSScannerClass NSScanner() {
		return _NSScannerClass != null ? _NSScannerClass : (_NSScannerClass = new NSScannerClass(getRuntime()));
	}

	private NSMessagePortNameServerClass _NSMessagePortNameServerClass = null;
	public NSMessagePortNameServerClass NSMessagePortNameServer() {
		return _NSMessagePortNameServerClass != null ? _NSMessagePortNameServerClass : (_NSMessagePortNameServerClass = new NSMessagePortNameServerClass(getRuntime()));
	}

	private NSDataDetectorClass _NSDataDetectorClass = null;
	public NSDataDetectorClass NSDataDetector() {
		return _NSDataDetectorClass != null ? _NSDataDetectorClass : (_NSDataDetectorClass = new NSDataDetectorClass(getRuntime()));
	}

	private NSHTTPCookieStorageClass _NSHTTPCookieStorageClass = null;
	public NSHTTPCookieStorageClass NSHTTPCookieStorage() {
		return _NSHTTPCookieStorageClass != null ? _NSHTTPCookieStorageClass : (_NSHTTPCookieStorageClass = new NSHTTPCookieStorageClass(getRuntime()));
	}

	private NSProcessInfoClass _NSProcessInfoClass = null;
	public NSProcessInfoClass NSProcessInfo() {
		return _NSProcessInfoClass != null ? _NSProcessInfoClass : (_NSProcessInfoClass = new NSProcessInfoClass(getRuntime()));
	}

	private NSSocketPortClass _NSSocketPortClass = null;
	public NSSocketPortClass NSSocketPort() {
		return _NSSocketPortClass != null ? _NSSocketPortClass : (_NSSocketPortClass = new NSSocketPortClass(getRuntime()));
	}

	private NSCalendarDateClass _NSCalendarDateClass = null;
	public NSCalendarDateClass NSCalendarDate() {
		return _NSCalendarDateClass != null ? _NSCalendarDateClass : (_NSCalendarDateClass = new NSCalendarDateClass(getRuntime()));
	}

	private NSRunLoopClass _NSRunLoopClass = null;
	public NSRunLoopClass NSRunLoop() {
		return _NSRunLoopClass != null ? _NSRunLoopClass : (_NSRunLoopClass = new NSRunLoopClass(getRuntime()));
	}

	private NSNotificationClass _NSNotificationClass = null;
	public NSNotificationClass NSNotification() {
		return _NSNotificationClass != null ? _NSNotificationClass : (_NSNotificationClass = new NSNotificationClass(getRuntime()));
	}

	private NSUserDefaultsClass _NSUserDefaultsClass = null;
	public NSUserDefaultsClass NSUserDefaults() {
		return _NSUserDefaultsClass != null ? _NSUserDefaultsClass : (_NSUserDefaultsClass = new NSUserDefaultsClass(getRuntime()));
	}

	private NSCalendarClass _NSCalendarClass = null;
	public NSCalendarClass NSCalendar() {
		return _NSCalendarClass != null ? _NSCalendarClass : (_NSCalendarClass = new NSCalendarClass(getRuntime()));
	}

	private NSConnectionClass _NSConnectionClass = null;
	public NSConnectionClass NSConnection() {
		return _NSConnectionClass != null ? _NSConnectionClass : (_NSConnectionClass = new NSConnectionClass(getRuntime()));
	}

	private NSNotificationCenterClass _NSNotificationCenterClass = null;
	public NSNotificationCenterClass NSNotificationCenter() {
		return _NSNotificationCenterClass != null ? _NSNotificationCenterClass : (_NSNotificationCenterClass = new NSNotificationCenterClass(getRuntime()));
	}

	private NSPipeClass _NSPipeClass = null;
	public NSPipeClass NSPipe() {
		return _NSPipeClass != null ? _NSPipeClass : (_NSPipeClass = new NSPipeClass(getRuntime()));
	}

	private NSIndexSpecifierClass _NSIndexSpecifierClass = null;
	public NSIndexSpecifierClass NSIndexSpecifier() {
		return _NSIndexSpecifierClass != null ? _NSIndexSpecifierClass : (_NSIndexSpecifierClass = new NSIndexSpecifierClass(getRuntime()));
	}

	private NSConditionClass _NSConditionClass = null;
	public NSConditionClass NSCondition() {
		return _NSConditionClass != null ? _NSConditionClass : (_NSConditionClass = new NSConditionClass(getRuntime()));
	}

	private NSCloseCommandClass _NSCloseCommandClass = null;
	public NSCloseCommandClass NSCloseCommand() {
		return _NSCloseCommandClass != null ? _NSCloseCommandClass : (_NSCloseCommandClass = new NSCloseCommandClass(getRuntime()));
	}

	private NSDistantObjectClass _NSDistantObjectClass = null;
	public NSDistantObjectClass NSDistantObject() {
		return _NSDistantObjectClass != null ? _NSDistantObjectClass : (_NSDistantObjectClass = new NSDistantObjectClass(getRuntime()));
	}

	private NSMutableDataClass _NSMutableDataClass = null;
	public NSMutableDataClass NSMutableData() {
		return _NSMutableDataClass != null ? _NSMutableDataClass : (_NSMutableDataClass = new NSMutableDataClass(getRuntime()));
	}

	private NSExceptionClass _NSExceptionClass = null;
	public NSExceptionClass NSException() {
		return _NSExceptionClass != null ? _NSExceptionClass : (_NSExceptionClass = new NSExceptionClass(getRuntime()));
	}

	private NSProtocolCheckerClass _NSProtocolCheckerClass = null;
	public NSProtocolCheckerClass NSProtocolChecker() {
		return _NSProtocolCheckerClass != null ? _NSProtocolCheckerClass : (_NSProtocolCheckerClass = new NSProtocolCheckerClass(getRuntime()));
	}

	private NSMutableStringClass _NSMutableStringClass = null;
	public NSMutableStringClass NSMutableString() {
		return _NSMutableStringClass != null ? _NSMutableStringClass : (_NSMutableStringClass = new NSMutableStringClass(getRuntime()));
	}

	private NSKeyedArchiverClass _NSKeyedArchiverClass = null;
	public NSKeyedArchiverClass NSKeyedArchiver() {
		return _NSKeyedArchiverClass != null ? _NSKeyedArchiverClass : (_NSKeyedArchiverClass = new NSKeyedArchiverClass(getRuntime()));
	}

	private NSConditionLockClass _NSConditionLockClass = null;
	public NSConditionLockClass NSConditionLock() {
		return _NSConditionLockClass != null ? _NSConditionLockClass : (_NSConditionLockClass = new NSConditionLockClass(getRuntime()));
	}

	private NSXMLDTDClass _NSXMLDTDClass = null;
	public NSXMLDTDClass NSXMLDTD() {
		return _NSXMLDTDClass != null ? _NSXMLDTDClass : (_NSXMLDTDClass = new NSXMLDTDClass(getRuntime()));
	}

	private NSScriptCoercionHandlerClass _NSScriptCoercionHandlerClass = null;
	public NSScriptCoercionHandlerClass NSScriptCoercionHandler() {
		return _NSScriptCoercionHandlerClass != null ? _NSScriptCoercionHandlerClass : (_NSScriptCoercionHandlerClass = new NSScriptCoercionHandlerClass(getRuntime()));
	}

	private NSGarbageCollectorClass _NSGarbageCollectorClass = null;
	public NSGarbageCollectorClass NSGarbageCollector() {
		return _NSGarbageCollectorClass != null ? _NSGarbageCollectorClass : (_NSGarbageCollectorClass = new NSGarbageCollectorClass(getRuntime()));
	}

	private NSHashTableClass _NSHashTableClass = null;
	public NSHashTableClass NSHashTable() {
		return _NSHashTableClass != null ? _NSHashTableClass : (_NSHashTableClass = new NSHashTableClass(getRuntime()));
	}

	private NSQuitCommandClass _NSQuitCommandClass = null;
	public NSQuitCommandClass NSQuitCommand() {
		return _NSQuitCommandClass != null ? _NSQuitCommandClass : (_NSQuitCommandClass = new NSQuitCommandClass(getRuntime()));
	}

	private NSMoveCommandClass _NSMoveCommandClass = null;
	public NSMoveCommandClass NSMoveCommand() {
		return _NSMoveCommandClass != null ? _NSMoveCommandClass : (_NSMoveCommandClass = new NSMoveCommandClass(getRuntime()));
	}

	private NSRecursiveLockClass _NSRecursiveLockClass = null;
	public NSRecursiveLockClass NSRecursiveLock() {
		return _NSRecursiveLockClass != null ? _NSRecursiveLockClass : (_NSRecursiveLockClass = new NSRecursiveLockClass(getRuntime()));
	}

	private NSURLConnectionClass _NSURLConnectionClass = null;
	public NSURLConnectionClass NSURLConnection() {
		return _NSURLConnectionClass != null ? _NSURLConnectionClass : (_NSURLConnectionClass = new NSURLConnectionClass(getRuntime()));
	}

	private NSClassDescriptionClass _NSClassDescriptionClass = null;
	public NSClassDescriptionClass NSClassDescription() {
		return _NSClassDescriptionClass != null ? _NSClassDescriptionClass : (_NSClassDescriptionClass = new NSClassDescriptionClass(getRuntime()));
	}

	private NSLogicalTestClass _NSLogicalTestClass = null;
	public NSLogicalTestClass NSLogicalTest() {
		return _NSLogicalTestClass != null ? _NSLogicalTestClass : (_NSLogicalTestClass = new NSLogicalTestClass(getRuntime()));
	}

	private NSExpressionClass _NSExpressionClass = null;
	public NSExpressionClass NSExpression() {
		return _NSExpressionClass != null ? _NSExpressionClass : (_NSExpressionClass = new NSExpressionClass(getRuntime()));
	}

	private NSCreateCommandClass _NSCreateCommandClass = null;
	public NSCreateCommandClass NSCreateCommand() {
		return _NSCreateCommandClass != null ? _NSCreateCommandClass : (_NSCreateCommandClass = new NSCreateCommandClass(getRuntime()));
	}

	private NSUbiquitousKeyValueStoreClass _NSUbiquitousKeyValueStoreClass = null;
	public NSUbiquitousKeyValueStoreClass NSUbiquitousKeyValueStore() {
		return _NSUbiquitousKeyValueStoreClass != null ? _NSUbiquitousKeyValueStoreClass : (_NSUbiquitousKeyValueStoreClass = new NSUbiquitousKeyValueStoreClass(getRuntime()));
	}

	private NSAutoreleasePoolClass _NSAutoreleasePoolClass = null;
	public NSAutoreleasePoolClass NSAutoreleasePool() {
		return _NSAutoreleasePoolClass != null ? _NSAutoreleasePoolClass : (_NSAutoreleasePoolClass = new NSAutoreleasePoolClass(getRuntime()));
	}

	private NSMetadataItemClass _NSMetadataItemClass = null;
	public NSMetadataItemClass NSMetadataItem() {
		return _NSMetadataItemClass != null ? _NSMetadataItemClass : (_NSMetadataItemClass = new NSMetadataItemClass(getRuntime()));
	}

	private NSSortDescriptorClass _NSSortDescriptorClass = null;
	public NSSortDescriptorClass NSSortDescriptor() {
		return _NSSortDescriptorClass != null ? _NSSortDescriptorClass : (_NSSortDescriptorClass = new NSSortDescriptorClass(getRuntime()));
	}

	private NSTaskClass _NSTaskClass = null;
	public NSTaskClass NSTask() {
		return _NSTaskClass != null ? _NSTaskClass : (_NSTaskClass = new NSTaskClass(getRuntime()));
	}

	private NSNotificationQueueClass _NSNotificationQueueClass = null;
	public NSNotificationQueueClass NSNotificationQueue() {
		return _NSNotificationQueueClass != null ? _NSNotificationQueueClass : (_NSNotificationQueueClass = new NSNotificationQueueClass(getRuntime()));
	}

	private NSOperationClass _NSOperationClass = null;
	public NSOperationClass NSOperation() {
		return _NSOperationClass != null ? _NSOperationClass : (_NSOperationClass = new NSOperationClass(getRuntime()));
	}

	private NSJSONSerializationClass _NSJSONSerializationClass = null;
	public NSJSONSerializationClass NSJSONSerialization() {
		return _NSJSONSerializationClass != null ? _NSJSONSerializationClass : (_NSJSONSerializationClass = new NSJSONSerializationClass(getRuntime()));
	}

	private NSNameSpecifierClass _NSNameSpecifierClass = null;
	public NSNameSpecifierClass NSNameSpecifier() {
		return _NSNameSpecifierClass != null ? _NSNameSpecifierClass : (_NSNameSpecifierClass = new NSNameSpecifierClass(getRuntime()));
	}

	private NSTimerClass _NSTimerClass = null;
	public NSTimerClass NSTimer() {
		return _NSTimerClass != null ? _NSTimerClass : (_NSTimerClass = new NSTimerClass(getRuntime()));
	}

	private NSMutableSetClass _NSMutableSetClass = null;
	public NSMutableSetClass NSMutableSet() {
		return _NSMutableSetClass != null ? _NSMutableSetClass : (_NSMutableSetClass = new NSMutableSetClass(getRuntime()));
	}

	private NSScriptWhoseTestClass _NSScriptWhoseTestClass = null;
	public NSScriptWhoseTestClass NSScriptWhoseTest() {
		return _NSScriptWhoseTestClass != null ? _NSScriptWhoseTestClass : (_NSScriptWhoseTestClass = new NSScriptWhoseTestClass(getRuntime()));
	}

	private NSCompoundPredicateClass _NSCompoundPredicateClass = null;
	public NSCompoundPredicateClass NSCompoundPredicate() {
		return _NSCompoundPredicateClass != null ? _NSCompoundPredicateClass : (_NSCompoundPredicateClass = new NSCompoundPredicateClass(getRuntime()));
	}

	private NSErrorClass _NSErrorClass = null;
	public NSErrorClass NSError() {
		return _NSErrorClass != null ? _NSErrorClass : (_NSErrorClass = new NSErrorClass(getRuntime()));
	}

	private NSMapTableClass _NSMapTableClass = null;
	public NSMapTableClass NSMapTable() {
		return _NSMapTableClass != null ? _NSMapTableClass : (_NSMapTableClass = new NSMapTableClass(getRuntime()));
	}

	private NSDirectoryEnumeratorClass _NSDirectoryEnumeratorClass = null;
	public NSDirectoryEnumeratorClass NSDirectoryEnumerator() {
		return _NSDirectoryEnumeratorClass != null ? _NSDirectoryEnumeratorClass : (_NSDirectoryEnumeratorClass = new NSDirectoryEnumeratorClass(getRuntime()));
	}

	private NSHTTPCookieClass _NSHTTPCookieClass = null;
	public NSHTTPCookieClass NSHTTPCookie() {
		return _NSHTTPCookieClass != null ? _NSHTTPCookieClass : (_NSHTTPCookieClass = new NSHTTPCookieClass(getRuntime()));
	}

	private NSProxyClass _NSProxyClass = null;
	public NSProxyClass NSProxy() {
		return _NSProxyClass != null ? _NSProxyClass : (_NSProxyClass = new NSProxyClass(getRuntime()));
	}

	private NSXMLDocumentClass _NSXMLDocumentClass = null;
	public NSXMLDocumentClass NSXMLDocument() {
		return _NSXMLDocumentClass != null ? _NSXMLDocumentClass : (_NSXMLDocumentClass = new NSXMLDocumentClass(getRuntime()));
	}

	private NSOutputStreamClass _NSOutputStreamClass = null;
	public NSOutputStreamClass NSOutputStream() {
		return _NSOutputStreamClass != null ? _NSOutputStreamClass : (_NSOutputStreamClass = new NSOutputStreamClass(getRuntime()));
	}

	private NSXMLNodeClass _NSXMLNodeClass = null;
	public NSXMLNodeClass NSXMLNode() {
		return _NSXMLNodeClass != null ? _NSXMLNodeClass : (_NSXMLNodeClass = new NSXMLNodeClass(getRuntime()));
	}

	private NSXMLElementClass _NSXMLElementClass = null;
	public NSXMLElementClass NSXMLElement() {
		return _NSXMLElementClass != null ? _NSXMLElementClass : (_NSXMLElementClass = new NSXMLElementClass(getRuntime()));
	}

	private NSAssertionHandlerClass _NSAssertionHandlerClass = null;
	public NSAssertionHandlerClass NSAssertionHandler() {
		return _NSAssertionHandlerClass != null ? _NSAssertionHandlerClass : (_NSAssertionHandlerClass = new NSAssertionHandlerClass(getRuntime()));
	}

	private NSURLAuthenticationChallengeClass _NSURLAuthenticationChallengeClass = null;
	public NSURLAuthenticationChallengeClass NSURLAuthenticationChallenge() {
		return _NSURLAuthenticationChallengeClass != null ? _NSURLAuthenticationChallengeClass : (_NSURLAuthenticationChallengeClass = new NSURLAuthenticationChallengeClass(getRuntime()));
	}

	private NSXMLDTDNodeClass _NSXMLDTDNodeClass = null;
	public NSXMLDTDNodeClass NSXMLDTDNode() {
		return _NSXMLDTDNodeClass != null ? _NSXMLDTDNodeClass : (_NSXMLDTDNodeClass = new NSXMLDTDNodeClass(getRuntime()));
	}

	private NSComparisonPredicateClass _NSComparisonPredicateClass = null;
	public NSComparisonPredicateClass NSComparisonPredicate() {
		return _NSComparisonPredicateClass != null ? _NSComparisonPredicateClass : (_NSComparisonPredicateClass = new NSComparisonPredicateClass(getRuntime()));
	}

	private NSXMLParserClass _NSXMLParserClass = null;
	public NSXMLParserClass NSXMLParser() {
		return _NSXMLParserClass != null ? _NSXMLParserClass : (_NSXMLParserClass = new NSXMLParserClass(getRuntime()));
	}

	private NSDateFormatterClass _NSDateFormatterClass = null;
	public NSDateFormatterClass NSDateFormatter() {
		return _NSDateFormatterClass != null ? _NSDateFormatterClass : (_NSDateFormatterClass = new NSDateFormatterClass(getRuntime()));
	}

	private NSPortClass _NSPortClass = null;
	public NSPortClass NSPort() {
		return _NSPortClass != null ? _NSPortClass : (_NSPortClass = new NSPortClass(getRuntime()));
	}

	private NSUUIDClass _NSUUIDClass = null;
	public NSUUIDClass NSUUID() {
		return _NSUUIDClass != null ? _NSUUIDClass : (_NSUUIDClass = new NSUUIDClass(getRuntime()));
	}

	private NSInputStreamClass _NSInputStreamClass = null;
	public NSInputStreamClass NSInputStream() {
		return _NSInputStreamClass != null ? _NSInputStreamClass : (_NSInputStreamClass = new NSInputStreamClass(getRuntime()));
	}

	private NSArrayClass _NSArrayClass = null;
	public NSArrayClass NSArray() {
		return _NSArrayClass != null ? _NSArrayClass : (_NSArrayClass = new NSArrayClass(getRuntime()));
	}

	private NSHTTPURLResponseClass _NSHTTPURLResponseClass = null;
	public NSHTTPURLResponseClass NSHTTPURLResponse() {
		return _NSHTTPURLResponseClass != null ? _NSHTTPURLResponseClass : (_NSHTTPURLResponseClass = new NSHTTPURLResponseClass(getRuntime()));
	}

	private NSByteCountFormatterClass _NSByteCountFormatterClass = null;
	public NSByteCountFormatterClass NSByteCountFormatter() {
		return _NSByteCountFormatterClass != null ? _NSByteCountFormatterClass : (_NSByteCountFormatterClass = new NSByteCountFormatterClass(getRuntime()));
	}

	private NSFileManagerClass _NSFileManagerClass = null;
	public NSFileManagerClass NSFileManager() {
		return _NSFileManagerClass != null ? _NSFileManagerClass : (_NSFileManagerClass = new NSFileManagerClass(getRuntime()));
	}

	private NSFileCoordinatorClass _NSFileCoordinatorClass = null;
	public NSFileCoordinatorClass NSFileCoordinator() {
		return _NSFileCoordinatorClass != null ? _NSFileCoordinatorClass : (_NSFileCoordinatorClass = new NSFileCoordinatorClass(getRuntime()));
	}

	private NSMetadataQueryAttributeValueTupleClass _NSMetadataQueryAttributeValueTupleClass = null;
	public NSMetadataQueryAttributeValueTupleClass NSMetadataQueryAttributeValueTuple() {
		return _NSMetadataQueryAttributeValueTupleClass != null ? _NSMetadataQueryAttributeValueTupleClass : (_NSMetadataQueryAttributeValueTupleClass = new NSMetadataQueryAttributeValueTupleClass(getRuntime()));
	}

	private NSWhoseSpecifierClass _NSWhoseSpecifierClass = null;
	public NSWhoseSpecifierClass NSWhoseSpecifier() {
		return _NSWhoseSpecifierClass != null ? _NSWhoseSpecifierClass : (_NSWhoseSpecifierClass = new NSWhoseSpecifierClass(getRuntime()));
	}

	private NSURLProtocolClass _NSURLProtocolClass = null;
	public NSURLProtocolClass NSURLProtocol() {
		return _NSURLProtocolClass != null ? _NSURLProtocolClass : (_NSURLProtocolClass = new NSURLProtocolClass(getRuntime()));
	}

	private NSBundleClass _NSBundleClass = null;
	public NSBundleClass NSBundle() {
		return _NSBundleClass != null ? _NSBundleClass : (_NSBundleClass = new NSBundleClass(getRuntime()));
	}

	private NSAffineTransformClass _NSAffineTransformClass = null;
	public NSAffineTransformClass NSAffineTransform() {
		return _NSAffineTransformClass != null ? _NSAffineTransformClass : (_NSAffineTransformClass = new NSAffineTransformClass(getRuntime()));
	}

	private NSScriptSuiteRegistryClass _NSScriptSuiteRegistryClass = null;
	public NSScriptSuiteRegistryClass NSScriptSuiteRegistry() {
		return _NSScriptSuiteRegistryClass != null ? _NSScriptSuiteRegistryClass : (_NSScriptSuiteRegistryClass = new NSScriptSuiteRegistryClass(getRuntime()));
	}

	private NSURLCacheClass _NSURLCacheClass = null;
	public NSURLCacheClass NSURLCache() {
		return _NSURLCacheClass != null ? _NSURLCacheClass : (_NSURLCacheClass = new NSURLCacheClass(getRuntime()));
	}

	private NSURLHandleClass _NSURLHandleClass = null;
	public NSURLHandleClass NSURLHandle() {
		return _NSURLHandleClass != null ? _NSURLHandleClass : (_NSURLHandleClass = new NSURLHandleClass(getRuntime()));
	}

	private NSFileVersionClass _NSFileVersionClass = null;
	public NSFileVersionClass NSFileVersion() {
		return _NSFileVersionClass != null ? _NSFileVersionClass : (_NSFileVersionClass = new NSFileVersionClass(getRuntime()));
	}

	private NSFormatterClass _NSFormatterClass = null;
	public NSFormatterClass NSFormatter() {
		return _NSFormatterClass != null ? _NSFormatterClass : (_NSFormatterClass = new NSFormatterClass(getRuntime()));
	}

	private NSRangeSpecifierClass _NSRangeSpecifierClass = null;
	public NSRangeSpecifierClass NSRangeSpecifier() {
		return _NSRangeSpecifierClass != null ? _NSRangeSpecifierClass : (_NSRangeSpecifierClass = new NSRangeSpecifierClass(getRuntime()));
	}

	private NSInvocationOperationClass _NSInvocationOperationClass = null;
	public NSInvocationOperationClass NSInvocationOperation() {
		return _NSInvocationOperationClass != null ? _NSInvocationOperationClass : (_NSInvocationOperationClass = new NSInvocationOperationClass(getRuntime()));
	}

	private NSXPCListenerClass _NSXPCListenerClass = null;
	public NSXPCListenerClass NSXPCListener() {
		return _NSXPCListenerClass != null ? _NSXPCListenerClass : (_NSXPCListenerClass = new NSXPCListenerClass(getRuntime()));
	}

	private NSUserNotificationCenterClass _NSUserNotificationCenterClass = null;
	public NSUserNotificationCenterClass NSUserNotificationCenter() {
		return _NSUserNotificationCenterClass != null ? _NSUserNotificationCenterClass : (_NSUserNotificationCenterClass = new NSUserNotificationCenterClass(getRuntime()));
	}

	private NSKeyedUnarchiverClass _NSKeyedUnarchiverClass = null;
	public NSKeyedUnarchiverClass NSKeyedUnarchiver() {
		return _NSKeyedUnarchiverClass != null ? _NSKeyedUnarchiverClass : (_NSKeyedUnarchiverClass = new NSKeyedUnarchiverClass(getRuntime()));
	}

	private NSMutableURLRequestClass _NSMutableURLRequestClass = null;
	public NSMutableURLRequestClass NSMutableURLRequest() {
		return _NSMutableURLRequestClass != null ? _NSMutableURLRequestClass : (_NSMutableURLRequestClass = new NSMutableURLRequestClass(getRuntime()));
	}

	private NSStreamClass _NSStreamClass = null;
	public NSStreamClass NSStream() {
		return _NSStreamClass != null ? _NSStreamClass : (_NSStreamClass = new NSStreamClass(getRuntime()));
	}

	private NSScriptCommandDescriptionClass _NSScriptCommandDescriptionClass = null;
	public NSScriptCommandDescriptionClass NSScriptCommandDescription() {
		return _NSScriptCommandDescriptionClass != null ? _NSScriptCommandDescriptionClass : (_NSScriptCommandDescriptionClass = new NSScriptCommandDescriptionClass(getRuntime()));
	}

	private NSPropertyListSerializationClass _NSPropertyListSerializationClass = null;
	public NSPropertyListSerializationClass NSPropertyListSerialization() {
		return _NSPropertyListSerializationClass != null ? _NSPropertyListSerializationClass : (_NSPropertyListSerializationClass = new NSPropertyListSerializationClass(getRuntime()));
	}

	private NSDateComponentsClass _NSDateComponentsClass = null;
	public NSDateComponentsClass NSDateComponents() {
		return _NSDateComponentsClass != null ? _NSDateComponentsClass : (_NSDateComponentsClass = new NSDateComponentsClass(getRuntime()));
	}

	private NSURLCredentialClass _NSURLCredentialClass = null;
	public NSURLCredentialClass NSURLCredential() {
		return _NSURLCredentialClass != null ? _NSURLCredentialClass : (_NSURLCredentialClass = new NSURLCredentialClass(getRuntime()));
	}

	private NSFileWrapperClass _NSFileWrapperClass = null;
	public NSFileWrapperClass NSFileWrapper() {
		return _NSFileWrapperClass != null ? _NSFileWrapperClass : (_NSFileWrapperClass = new NSFileWrapperClass(getRuntime()));
	}

	private NSHostClass _NSHostClass = null;
	public NSHostClass NSHost() {
		return _NSHostClass != null ? _NSHostClass : (_NSHostClass = new NSHostClass(getRuntime()));
	}

	private NSNumberClass _NSNumberClass = null;
	public NSNumberClass NSNumber() {
		return _NSNumberClass != null ? _NSNumberClass : (_NSNumberClass = new NSNumberClass(getRuntime()));
	}

	private NSScriptCommandClass _NSScriptCommandClass = null;
	public NSScriptCommandClass NSScriptCommand() {
		return _NSScriptCommandClass != null ? _NSScriptCommandClass : (_NSScriptCommandClass = new NSScriptCommandClass(getRuntime()));
	}

	private NSUserNotificationClass _NSUserNotificationClass = null;
	public NSUserNotificationClass NSUserNotification() {
		return _NSUserNotificationClass != null ? _NSUserNotificationClass : (_NSUserNotificationClass = new NSUserNotificationClass(getRuntime()));
	}

	private NSNetServiceBrowserClass _NSNetServiceBrowserClass = null;
	public NSNetServiceBrowserClass NSNetServiceBrowser() {
		return _NSNetServiceBrowserClass != null ? _NSNetServiceBrowserClass : (_NSNetServiceBrowserClass = new NSNetServiceBrowserClass(getRuntime()));
	}

	private NSIndexSetClass _NSIndexSetClass = null;
	public NSIndexSetClass NSIndexSet() {
		return _NSIndexSetClass != null ? _NSIndexSetClass : (_NSIndexSetClass = new NSIndexSetClass(getRuntime()));
	}

	private NSInvocationClass _NSInvocationClass = null;
	public NSInvocationClass NSInvocation() {
		return _NSInvocationClass != null ? _NSInvocationClass : (_NSInvocationClass = new NSInvocationClass(getRuntime()));
	}

	private NSXPCInterfaceClass _NSXPCInterfaceClass = null;
	public NSXPCInterfaceClass NSXPCInterface() {
		return _NSXPCInterfaceClass != null ? _NSXPCInterfaceClass : (_NSXPCInterfaceClass = new NSXPCInterfaceClass(getRuntime()));
	}

	private NSMutableAttributedStringClass _NSMutableAttributedStringClass = null;
	public NSMutableAttributedStringClass NSMutableAttributedString() {
		return _NSMutableAttributedStringClass != null ? _NSMutableAttributedStringClass : (_NSMutableAttributedStringClass = new NSMutableAttributedStringClass(getRuntime()));
	}

	private NSMachBootstrapServerClass _NSMachBootstrapServerClass = null;
	public NSMachBootstrapServerClass NSMachBootstrapServer() {
		return _NSMachBootstrapServerClass != null ? _NSMachBootstrapServerClass : (_NSMachBootstrapServerClass = new NSMachBootstrapServerClass(getRuntime()));
	}

	private NSScriptClassDescriptionClass _NSScriptClassDescriptionClass = null;
	public NSScriptClassDescriptionClass NSScriptClassDescription() {
		return _NSScriptClassDescriptionClass != null ? _NSScriptClassDescriptionClass : (_NSScriptClassDescriptionClass = new NSScriptClassDescriptionClass(getRuntime()));
	}

	private NSUserScriptTaskClass _NSUserScriptTaskClass = null;
	public NSUserScriptTaskClass NSUserScriptTask() {
		return _NSUserScriptTaskClass != null ? _NSUserScriptTaskClass : (_NSUserScriptTaskClass = new NSUserScriptTaskClass(getRuntime()));
	}

	private NSURLRequestClass _NSURLRequestClass = null;
	public NSURLRequestClass NSURLRequest() {
		return _NSURLRequestClass != null ? _NSURLRequestClass : (_NSURLRequestClass = new NSURLRequestClass(getRuntime()));
	}

	private NSUniqueIDSpecifierClass _NSUniqueIDSpecifierClass = null;
	public NSUniqueIDSpecifierClass NSUniqueIDSpecifier() {
		return _NSUniqueIDSpecifierClass != null ? _NSUniqueIDSpecifierClass : (_NSUniqueIDSpecifierClass = new NSUniqueIDSpecifierClass(getRuntime()));
	}

	private NSAppleEventManagerClass _NSAppleEventManagerClass = null;
	public NSAppleEventManagerClass NSAppleEventManager() {
		return _NSAppleEventManagerClass != null ? _NSAppleEventManagerClass : (_NSAppleEventManagerClass = new NSAppleEventManagerClass(getRuntime()));
	}

	private NSDistantObjectRequestClass _NSDistantObjectRequestClass = null;
	public NSDistantObjectRequestClass NSDistantObjectRequest() {
		return _NSDistantObjectRequestClass != null ? _NSDistantObjectRequestClass : (_NSDistantObjectRequestClass = new NSDistantObjectRequestClass(getRuntime()));
	}

	private NSPointerFunctionsClass _NSPointerFunctionsClass = null;
	public NSPointerFunctionsClass NSPointerFunctions() {
		return _NSPointerFunctionsClass != null ? _NSPointerFunctionsClass : (_NSPointerFunctionsClass = new NSPointerFunctionsClass(getRuntime()));
	}

	private NSURLResponseClass _NSURLResponseClass = null;
	public NSURLResponseClass NSURLResponse() {
		return _NSURLResponseClass != null ? _NSURLResponseClass : (_NSURLResponseClass = new NSURLResponseClass(getRuntime()));
	}

	private NSOrderedSetClass _NSOrderedSetClass = null;
	public NSOrderedSetClass NSOrderedSet() {
		return _NSOrderedSetClass != null ? _NSOrderedSetClass : (_NSOrderedSetClass = new NSOrderedSetClass(getRuntime()));
	}

	private NSURLProtectionSpaceClass _NSURLProtectionSpaceClass = null;
	public NSURLProtectionSpaceClass NSURLProtectionSpace() {
		return _NSURLProtectionSpaceClass != null ? _NSURLProtectionSpaceClass : (_NSURLProtectionSpaceClass = new NSURLProtectionSpaceClass(getRuntime()));
	}

	private NSSocketPortNameServerClass _NSSocketPortNameServerClass = null;
	public NSSocketPortNameServerClass NSSocketPortNameServer() {
		return _NSSocketPortNameServerClass != null ? _NSSocketPortNameServerClass : (_NSSocketPortNameServerClass = new NSSocketPortNameServerClass(getRuntime()));
	}

	private NSURLDownloadClass _NSURLDownloadClass = null;
	public NSURLDownloadClass NSURLDownload() {
		return _NSURLDownloadClass != null ? _NSURLDownloadClass : (_NSURLDownloadClass = new NSURLDownloadClass(getRuntime()));
	}

	private NSRegularExpressionClass _NSRegularExpressionClass = null;
	public NSRegularExpressionClass NSRegularExpression() {
		return _NSRegularExpressionClass != null ? _NSRegularExpressionClass : (_NSRegularExpressionClass = new NSRegularExpressionClass(getRuntime()));
	}

	private NSDecimalNumberClass _NSDecimalNumberClass = null;
	public NSDecimalNumberClass NSDecimalNumber() {
		return _NSDecimalNumberClass != null ? _NSDecimalNumberClass : (_NSDecimalNumberClass = new NSDecimalNumberClass(getRuntime()));
	}

	private NSURLClass _NSURLClass = null;
	public NSURLClass NSURL() {
		return _NSURLClass != null ? _NSURLClass : (_NSURLClass = new NSURLClass(getRuntime()));
	}

	private NSIndexPathClass _NSIndexPathClass = null;
	public NSIndexPathClass NSIndexPath() {
		return _NSIndexPathClass != null ? _NSIndexPathClass : (_NSIndexPathClass = new NSIndexPathClass(getRuntime()));
	}

	private NSScriptObjectSpecifierClass _NSScriptObjectSpecifierClass = null;
	public NSScriptObjectSpecifierClass NSScriptObjectSpecifier() {
		return _NSScriptObjectSpecifierClass != null ? _NSScriptObjectSpecifierClass : (_NSScriptObjectSpecifierClass = new NSScriptObjectSpecifierClass(getRuntime()));
	}

	private NSTimeZoneClass _NSTimeZoneClass = null;
	public NSTimeZoneClass NSTimeZone() {
		return _NSTimeZoneClass != null ? _NSTimeZoneClass : (_NSTimeZoneClass = new NSTimeZoneClass(getRuntime()));
	}

	private NSAppleEventDescriptorClass _NSAppleEventDescriptorClass = null;
	public NSAppleEventDescriptorClass NSAppleEventDescriptor() {
		return _NSAppleEventDescriptorClass != null ? _NSAppleEventDescriptorClass : (_NSAppleEventDescriptorClass = new NSAppleEventDescriptorClass(getRuntime()));
	}

	private NSDeleteCommandClass _NSDeleteCommandClass = null;
	public NSDeleteCommandClass NSDeleteCommand() {
		return _NSDeleteCommandClass != null ? _NSDeleteCommandClass : (_NSDeleteCommandClass = new NSDeleteCommandClass(getRuntime()));
	}

	private NSMutableDictionaryClass _NSMutableDictionaryClass = null;
	public NSMutableDictionaryClass NSMutableDictionary() {
		return _NSMutableDictionaryClass != null ? _NSMutableDictionaryClass : (_NSMutableDictionaryClass = new NSMutableDictionaryClass(getRuntime()));
	}

	private static com.apple.jobjc.Invoke.FunCall CFBridgingRelease_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_CFBridgingRelease_FxnInst(){
		return ((CFBridgingRelease_FxnInst != null)
	? (CFBridgingRelease_FxnInst)
	: (CFBridgingRelease_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "CFBridgingRelease", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T CFBridgingRelease(final com.apple.jobjc.corefoundation.CFTypeRefCFType X){
			final com.apple.jobjc.Invoke.FunCall CFBridgingRelease_FxnInst = get_CFBridgingRelease_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CFBridgingRelease_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, X);
		CFBridgingRelease_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall CFBridgingRetain_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_CFBridgingRetain_FxnInst(){
		return ((CFBridgingRetain_FxnInst != null)
	? (CFBridgingRetain_FxnInst)
	: (CFBridgingRetain_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "CFBridgingRetain", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.corefoundation.CFTypeRefCFType CFBridgingRetain(final com.apple.jobjc.ID X){
			final com.apple.jobjc.Invoke.FunCall CFBridgingRetain_FxnInst = get_CFBridgingRetain_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CFBridgingRetain_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, X);
		CFBridgingRetain_FxnInst.invoke(nativeBuffer);
				final com.apple.jobjc.corefoundation.CFTypeRefCFType returnValue = (com.apple.jobjc.corefoundation.CFTypeRefCFType) new com.apple.jobjc.corefoundation.CFTypeRefCFType(com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllHashTableObjects_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllHashTableObjects_FxnInst(){
		return ((NSAllHashTableObjects_FxnInst != null)
	? (NSAllHashTableObjects_FxnInst)
	: (NSAllHashTableObjects_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllHashTableObjects", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSAllHashTableObjects(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSAllHashTableObjects_FxnInst = get_NSAllHashTableObjects_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllHashTableObjects_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSAllHashTableObjects_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllMapTableKeys_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllMapTableKeys_FxnInst(){
		return ((NSAllMapTableKeys_FxnInst != null)
	? (NSAllMapTableKeys_FxnInst)
	: (NSAllMapTableKeys_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllMapTableKeys", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSAllMapTableKeys(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSAllMapTableKeys_FxnInst = get_NSAllMapTableKeys_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllMapTableKeys_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSAllMapTableKeys_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllMapTableValues_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllMapTableValues_FxnInst(){
		return ((NSAllMapTableValues_FxnInst != null)
	? (NSAllMapTableValues_FxnInst)
	: (NSAllMapTableValues_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllMapTableValues", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSAllMapTableValues(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSAllMapTableValues_FxnInst = get_NSAllMapTableValues_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllMapTableValues_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSAllMapTableValues_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllocateCollectable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllocateCollectable_FxnInst(){
		return ((NSAllocateCollectable_FxnInst != null)
	? (NSAllocateCollectable_FxnInst)
	: (NSAllocateCollectable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllocateCollectable", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSAllocateCollectable(final long size, final long options){
			final com.apple.jobjc.Invoke.FunCall NSAllocateCollectable_FxnInst = get_NSAllocateCollectable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllocateCollectable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		NSAllocateCollectable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllocateMemoryPages_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllocateMemoryPages_FxnInst(){
		return ((NSAllocateMemoryPages_FxnInst != null)
	? (NSAllocateMemoryPages_FxnInst)
	: (NSAllocateMemoryPages_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllocateMemoryPages", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSAllocateMemoryPages(final long bytes){
			final com.apple.jobjc.Invoke.FunCall NSAllocateMemoryPages_FxnInst = get_NSAllocateMemoryPages_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllocateMemoryPages_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bytes);
		NSAllocateMemoryPages_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAllocateObject_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAllocateObject_FxnInst(){
		return ((NSAllocateObject_FxnInst != null)
	? (NSAllocateObject_FxnInst)
	: (NSAllocateObject_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAllocateObject", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T NSAllocateObject(final com.apple.jobjc.NSClass aClass, final long extraBytes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSAllocateObject_FxnInst = get_NSAllocateObject_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAllocateObject_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, extraBytes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSAllocateObject_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSClassFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSClassFromString_FxnInst(){
		return ((NSClassFromString_FxnInst != null)
	? (NSClassFromString_FxnInst)
	: (NSClassFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSClassFromString", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T NSClassFromString(final com.apple.jobjc.foundation.NSString aClassName){
			final com.apple.jobjc.Invoke.FunCall NSClassFromString_FxnInst = get_NSClassFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSClassFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aClassName);
		NSClassFromString_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCompareHashTables_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCompareHashTables_FxnInst(){
		return ((NSCompareHashTables_FxnInst != null)
	? (NSCompareHashTables_FxnInst)
	: (NSCompareHashTables_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCompareHashTables", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSCompareHashTables(final com.apple.jobjc.foundation.NSHashTable table1, final com.apple.jobjc.foundation.NSHashTable table2){
			final com.apple.jobjc.Invoke.FunCall NSCompareHashTables_FxnInst = get_NSCompareHashTables_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCompareHashTables_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table2);
		NSCompareHashTables_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCompareMapTables_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCompareMapTables_FxnInst(){
		return ((NSCompareMapTables_FxnInst != null)
	? (NSCompareMapTables_FxnInst)
	: (NSCompareMapTables_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCompareMapTables", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSCompareMapTables(final com.apple.jobjc.foundation.NSMapTable table1, final com.apple.jobjc.foundation.NSMapTable table2){
			final com.apple.jobjc.Invoke.FunCall NSCompareMapTables_FxnInst = get_NSCompareMapTables_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCompareMapTables_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table2);
		NSCompareMapTables_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSContainsRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSContainsRect_FxnInst(){
		return ((NSContainsRect_FxnInst != null)
	? (NSContainsRect_FxnInst)
	: (NSContainsRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSContainsRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean NSContainsRect(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect bRect){
			final com.apple.jobjc.Invoke.FunCall NSContainsRect_FxnInst = get_NSContainsRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSContainsRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bRect);
		NSContainsRect_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSConvertHostDoubleToSwapped_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSConvertHostDoubleToSwapped_FxnInst(){
		return ((NSConvertHostDoubleToSwapped_FxnInst != null)
	? (NSConvertHostDoubleToSwapped_FxnInst)
	: (NSConvertHostDoubleToSwapped_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSConvertHostDoubleToSwapped", com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder(), com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedDouble NSConvertHostDoubleToSwapped(final double x){
			final com.apple.jobjc.Invoke.FunCall NSConvertHostDoubleToSwapped_FxnInst = get_NSConvertHostDoubleToSwapped_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSConvertHostDoubleToSwapped_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedDouble returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedDouble();
		NSConvertHostDoubleToSwapped_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSConvertHostFloatToSwapped_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSConvertHostFloatToSwapped_FxnInst(){
		return ((NSConvertHostFloatToSwapped_FxnInst != null)
	? (NSConvertHostFloatToSwapped_FxnInst)
	: (NSConvertHostFloatToSwapped_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSConvertHostFloatToSwapped", com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder(), com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedFloat NSConvertHostFloatToSwapped(final float x){
			final com.apple.jobjc.Invoke.FunCall NSConvertHostFloatToSwapped_FxnInst = get_NSConvertHostFloatToSwapped_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSConvertHostFloatToSwapped_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedFloat returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedFloat();
		NSConvertHostFloatToSwapped_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSConvertSwappedDoubleToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSConvertSwappedDoubleToHost_FxnInst(){
		return ((NSConvertSwappedDoubleToHost_FxnInst != null)
	? (NSConvertSwappedDoubleToHost_FxnInst)
	: (NSConvertSwappedDoubleToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSConvertSwappedDoubleToHost", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder())));
	}

	 public double NSConvertSwappedDoubleToHost(final com.apple.jobjc.foundation.NSSwappedDouble x){
			final com.apple.jobjc.Invoke.FunCall NSConvertSwappedDoubleToHost_FxnInst = get_NSConvertSwappedDoubleToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSConvertSwappedDoubleToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder().push(nativeBuffer, x);
		NSConvertSwappedDoubleToHost_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSConvertSwappedFloatToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSConvertSwappedFloatToHost_FxnInst(){
		return ((NSConvertSwappedFloatToHost_FxnInst != null)
	? (NSConvertSwappedFloatToHost_FxnInst)
	: (NSConvertSwappedFloatToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSConvertSwappedFloatToHost", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder())));
	}

	 public float NSConvertSwappedFloatToHost(final com.apple.jobjc.foundation.NSSwappedFloat x){
			final com.apple.jobjc.Invoke.FunCall NSConvertSwappedFloatToHost_FxnInst = get_NSConvertSwappedFloatToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSConvertSwappedFloatToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder().push(nativeBuffer, x);
		NSConvertSwappedFloatToHost_FxnInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCopyHashTableWithZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCopyHashTableWithZone_FxnInst(){
		return ((NSCopyHashTableWithZone_FxnInst != null)
	? (NSCopyHashTableWithZone_FxnInst)
	: (NSCopyHashTableWithZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCopyHashTableWithZone", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHashTable NSCopyHashTableWithZone(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSCopyHashTableWithZone_FxnInst = get_NSCopyHashTableWithZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCopyHashTableWithZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSCopyHashTableWithZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHashTable returnValue = (com.apple.jobjc.foundation.NSHashTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCopyMapTableWithZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCopyMapTableWithZone_FxnInst(){
		return ((NSCopyMapTableWithZone_FxnInst != null)
	? (NSCopyMapTableWithZone_FxnInst)
	: (NSCopyMapTableWithZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCopyMapTableWithZone", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMapTable NSCopyMapTableWithZone(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSCopyMapTableWithZone_FxnInst = get_NSCopyMapTableWithZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCopyMapTableWithZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSCopyMapTableWithZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMapTable returnValue = (com.apple.jobjc.foundation.NSMapTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCopyMemoryPages_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCopyMemoryPages_FxnInst(){
		return ((NSCopyMemoryPages_FxnInst != null)
	? (NSCopyMemoryPages_FxnInst)
	: (NSCopyMemoryPages_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCopyMemoryPages", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSCopyMemoryPages(final com.apple.jobjc.Pointer<Void> source, final com.apple.jobjc.Pointer<Void> dest, final long bytes){
			final com.apple.jobjc.Invoke.FunCall NSCopyMemoryPages_FxnInst = get_NSCopyMemoryPages_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCopyMemoryPages_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, source);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dest);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bytes);
		NSCopyMemoryPages_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSCopyObject_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCopyObject_FxnInst(){
		return ((NSCopyObject_FxnInst != null)
	? (NSCopyObject_FxnInst)
	: (NSCopyObject_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCopyObject", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T NSCopyObject(final com.apple.jobjc.ID object, final long extraBytes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSCopyObject_FxnInst = get_NSCopyObject_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCopyObject_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, extraBytes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSCopyObject_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCountFrames_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCountFrames_FxnInst(){
		return ((NSCountFrames_FxnInst != null)
	? (NSCountFrames_FxnInst)
	: (NSCountFrames_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCountFrames", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSCountFrames(){
			final com.apple.jobjc.Invoke.FunCall NSCountFrames_FxnInst = get_NSCountFrames_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCountFrames_FxnInst.init(nativeBuffer);
		NSCountFrames_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCountHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCountHashTable_FxnInst(){
		return ((NSCountHashTable_FxnInst != null)
	? (NSCountHashTable_FxnInst)
	: (NSCountHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCountHashTable", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long NSCountHashTable(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSCountHashTable_FxnInst = get_NSCountHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCountHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSCountHashTable_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCountMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCountMapTable_FxnInst(){
		return ((NSCountMapTable_FxnInst != null)
	? (NSCountMapTable_FxnInst)
	: (NSCountMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCountMapTable", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long NSCountMapTable(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSCountMapTable_FxnInst = get_NSCountMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCountMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSCountMapTable_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateHashTable_FxnInst(){
		return ((NSCreateHashTable_FxnInst != null)
	? (NSCreateHashTable_FxnInst)
	: (NSCreateHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateHashTable", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSHashTable NSCreateHashTable(final com.apple.jobjc.foundation.NSHashTableCallBacks callBacks, final long capacity){
			final com.apple.jobjc.Invoke.FunCall NSCreateHashTable_FxnInst = get_NSCreateHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().push(nativeBuffer, callBacks);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		NSCreateHashTable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHashTable returnValue = (com.apple.jobjc.foundation.NSHashTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateHashTableWithZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateHashTableWithZone_FxnInst(){
		return ((NSCreateHashTableWithZone_FxnInst != null)
	? (NSCreateHashTableWithZone_FxnInst)
	: (NSCreateHashTableWithZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateHashTableWithZone", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHashTable NSCreateHashTableWithZone(final com.apple.jobjc.foundation.NSHashTableCallBacks callBacks, final long capacity, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSCreateHashTableWithZone_FxnInst = get_NSCreateHashTableWithZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateHashTableWithZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSHashTableCallBacks.getStructCoder().push(nativeBuffer, callBacks);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSCreateHashTableWithZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHashTable returnValue = (com.apple.jobjc.foundation.NSHashTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateMapTable_FxnInst(){
		return ((NSCreateMapTable_FxnInst != null)
	? (NSCreateMapTable_FxnInst)
	: (NSCreateMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateMapTable", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder(), com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSMapTable NSCreateMapTable(final com.apple.jobjc.foundation.NSMapTableKeyCallBacks keyCallBacks, final com.apple.jobjc.foundation.NSMapTableValueCallBacks valueCallBacks, final long capacity){
			final com.apple.jobjc.Invoke.FunCall NSCreateMapTable_FxnInst = get_NSCreateMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().push(nativeBuffer, keyCallBacks);
		com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().push(nativeBuffer, valueCallBacks);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		NSCreateMapTable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMapTable returnValue = (com.apple.jobjc.foundation.NSMapTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateMapTableWithZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateMapTableWithZone_FxnInst(){
		return ((NSCreateMapTableWithZone_FxnInst != null)
	? (NSCreateMapTableWithZone_FxnInst)
	: (NSCreateMapTableWithZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateMapTableWithZone", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder(), com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMapTable NSCreateMapTableWithZone(final com.apple.jobjc.foundation.NSMapTableKeyCallBacks keyCallBacks, final com.apple.jobjc.foundation.NSMapTableValueCallBacks valueCallBacks, final long capacity, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSCreateMapTableWithZone_FxnInst = get_NSCreateMapTableWithZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateMapTableWithZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSMapTableKeyCallBacks.getStructCoder().push(nativeBuffer, keyCallBacks);
		com.apple.jobjc.foundation.NSMapTableValueCallBacks.getStructCoder().push(nativeBuffer, valueCallBacks);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSCreateMapTableWithZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMapTable returnValue = (com.apple.jobjc.foundation.NSMapTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateZone_FxnInst(){
		return ((NSCreateZone_FxnInst != null)
	? (NSCreateZone_FxnInst)
	: (NSCreateZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateZone", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> NSCreateZone(final long startSize, final long granularity, final boolean canFree){
			final com.apple.jobjc.Invoke.FunCall NSCreateZone_FxnInst = get_NSCreateZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, startSize);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, granularity);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, canFree);
		NSCreateZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDeallocateMemoryPages_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDeallocateMemoryPages_FxnInst(){
		return ((NSDeallocateMemoryPages_FxnInst != null)
	? (NSDeallocateMemoryPages_FxnInst)
	: (NSDeallocateMemoryPages_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDeallocateMemoryPages", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSDeallocateMemoryPages(final com.apple.jobjc.Pointer<Void> ptr, final long bytes){
			final com.apple.jobjc.Invoke.FunCall NSDeallocateMemoryPages_FxnInst = get_NSDeallocateMemoryPages_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDeallocateMemoryPages_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bytes);
		NSDeallocateMemoryPages_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDeallocateObject_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDeallocateObject_FxnInst(){
		return ((NSDeallocateObject_FxnInst != null)
	? (NSDeallocateObject_FxnInst)
	: (NSDeallocateObject_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDeallocateObject", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSDeallocateObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSDeallocateObject_FxnInst = get_NSDeallocateObject_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDeallocateObject_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSDeallocateObject_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalAdd_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalAdd_FxnInst(){
		return ((NSDecimalAdd_FxnInst != null)
	? (NSDecimalAdd_FxnInst)
	: (NSDecimalAdd_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalAdd", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalAdd(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> leftOperand, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> rightOperand, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalAdd_FxnInst = get_NSDecimalAdd_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalAdd_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rightOperand);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalAdd_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalCompact_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalCompact_FxnInst(){
		return ((NSDecimalCompact_FxnInst != null)
	? (NSDecimalCompact_FxnInst)
	: (NSDecimalCompact_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalCompact", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSDecimalCompact(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number){
			final com.apple.jobjc.Invoke.FunCall NSDecimalCompact_FxnInst = get_NSDecimalCompact_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalCompact_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number);
		NSDecimalCompact_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalCompare_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalCompare_FxnInst(){
		return ((NSDecimalCompare_FxnInst != null)
	? (NSDecimalCompare_FxnInst)
	: (NSDecimalCompare_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalCompare", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long NSDecimalCompare(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> leftOperand, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> rightOperand){
			final com.apple.jobjc.Invoke.FunCall NSDecimalCompare_FxnInst = get_NSDecimalCompare_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalCompare_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rightOperand);
		NSDecimalCompare_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalCopy_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalCopy_FxnInst(){
		return ((NSDecimalCopy_FxnInst != null)
	? (NSDecimalCopy_FxnInst)
	: (NSDecimalCopy_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalCopy", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSDecimalCopy(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> destination, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> source){
			final com.apple.jobjc.Invoke.FunCall NSDecimalCopy_FxnInst = get_NSDecimalCopy_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalCopy_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, destination);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, source);
		NSDecimalCopy_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalDivide_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalDivide_FxnInst(){
		return ((NSDecimalDivide_FxnInst != null)
	? (NSDecimalDivide_FxnInst)
	: (NSDecimalDivide_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalDivide", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalDivide(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> leftOperand, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> rightOperand, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalDivide_FxnInst = get_NSDecimalDivide_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalDivide_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rightOperand);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalDivide_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalIsNotANumber_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalIsNotANumber_FxnInst(){
		return ((NSDecimalIsNotANumber_FxnInst != null)
	? (NSDecimalIsNotANumber_FxnInst)
	: (NSDecimalIsNotANumber_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalIsNotANumber", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean NSDecimalIsNotANumber(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> dcm){
			final com.apple.jobjc.Invoke.FunCall NSDecimalIsNotANumber_FxnInst = get_NSDecimalIsNotANumber_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalIsNotANumber_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dcm);
		NSDecimalIsNotANumber_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalMultiply_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalMultiply_FxnInst(){
		return ((NSDecimalMultiply_FxnInst != null)
	? (NSDecimalMultiply_FxnInst)
	: (NSDecimalMultiply_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalMultiply", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalMultiply(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> leftOperand, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> rightOperand, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalMultiply_FxnInst = get_NSDecimalMultiply_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalMultiply_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rightOperand);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalMultiply_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalMultiplyByPowerOf10_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalMultiplyByPowerOf10_FxnInst(){
		return ((NSDecimalMultiplyByPowerOf10_FxnInst != null)
	? (NSDecimalMultiplyByPowerOf10_FxnInst)
	: (NSDecimalMultiplyByPowerOf10_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalMultiplyByPowerOf10", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalMultiplyByPowerOf10(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number, final short power, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalMultiplyByPowerOf10_FxnInst = get_NSDecimalMultiplyByPowerOf10_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalMultiplyByPowerOf10_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, power);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalMultiplyByPowerOf10_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalNormalize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalNormalize_FxnInst(){
		return ((NSDecimalNormalize_FxnInst != null)
	? (NSDecimalNormalize_FxnInst)
	: (NSDecimalNormalize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalNormalize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalNormalize(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number1, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number2, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalNormalize_FxnInst = get_NSDecimalNormalize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalNormalize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number1);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number2);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalNormalize_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalPower_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalPower_FxnInst(){
		return ((NSDecimalPower_FxnInst != null)
	? (NSDecimalPower_FxnInst)
	: (NSDecimalPower_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalPower", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalPower(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number, final long power, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalPower_FxnInst = get_NSDecimalPower_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalPower_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, power);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalPower_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalRound_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalRound_FxnInst(){
		return ((NSDecimalRound_FxnInst != null)
	? (NSDecimalRound_FxnInst)
	: (NSDecimalRound_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalRound", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSDecimalRound(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> number, final long scale, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalRound_FxnInst = get_NSDecimalRound_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalRound_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, number);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, scale);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalRound_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalString_FxnInst(){
		return ((NSDecimalString_FxnInst != null)
	? (NSDecimalString_FxnInst)
	: (NSDecimalString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalString", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSDecimalString(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> dcm, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.FunCall NSDecimalString_FxnInst = get_NSDecimalString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dcm);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		NSDecimalString_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecimalSubtract_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecimalSubtract_FxnInst(){
		return ((NSDecimalSubtract_FxnInst != null)
	? (NSDecimalSubtract_FxnInst)
	: (NSDecimalSubtract_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecimalSubtract", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSDecimalSubtract(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> result, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> leftOperand, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> rightOperand, final long roundingMode){
			final com.apple.jobjc.Invoke.FunCall NSDecimalSubtract_FxnInst = get_NSDecimalSubtract_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecimalSubtract_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rightOperand);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		NSDecimalSubtract_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDecrementExtraRefCountWasZero_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDecrementExtraRefCountWasZero_FxnInst(){
		return ((NSDecrementExtraRefCountWasZero_FxnInst != null)
	? (NSDecrementExtraRefCountWasZero_FxnInst)
	: (NSDecrementExtraRefCountWasZero_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDecrementExtraRefCountWasZero", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSDecrementExtraRefCountWasZero(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSDecrementExtraRefCountWasZero_FxnInst = get_NSDecrementExtraRefCountWasZero_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDecrementExtraRefCountWasZero_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSDecrementExtraRefCountWasZero_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDefaultMallocZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDefaultMallocZone_FxnInst(){
		return ((NSDefaultMallocZone_FxnInst != null)
	? (NSDefaultMallocZone_FxnInst)
	: (NSDefaultMallocZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDefaultMallocZone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> NSDefaultMallocZone(){
			final com.apple.jobjc.Invoke.FunCall NSDefaultMallocZone_FxnInst = get_NSDefaultMallocZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDefaultMallocZone_FxnInst.init(nativeBuffer);
		NSDefaultMallocZone_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDivideRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDivideRect_FxnInst(){
		return ((NSDivideRect_FxnInst != null)
	? (NSDivideRect_FxnInst)
	: (NSDivideRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDivideRect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void NSDivideRect(final com.apple.jobjc.foundation.NSRect inRect, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> slice, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rem, final double amount, final long edge){
			final com.apple.jobjc.Invoke.FunCall NSDivideRect_FxnInst = get_NSDivideRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDivideRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, inRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, slice);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rem);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, amount);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		NSDivideRect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEndHashTableEnumeration_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEndHashTableEnumeration_FxnInst(){
		return ((NSEndHashTableEnumeration_FxnInst != null)
	? (NSEndHashTableEnumeration_FxnInst)
	: (NSEndHashTableEnumeration_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEndHashTableEnumeration", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSEndHashTableEnumeration(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSHashEnumerator> enumerator){
			final com.apple.jobjc.Invoke.FunCall NSEndHashTableEnumeration_FxnInst = get_NSEndHashTableEnumeration_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEndHashTableEnumeration_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enumerator);
		NSEndHashTableEnumeration_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEndMapTableEnumeration_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEndMapTableEnumeration_FxnInst(){
		return ((NSEndMapTableEnumeration_FxnInst != null)
	? (NSEndMapTableEnumeration_FxnInst)
	: (NSEndMapTableEnumeration_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEndMapTableEnumeration", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSEndMapTableEnumeration(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSMapEnumerator> enumerator){
			final com.apple.jobjc.Invoke.FunCall NSEndMapTableEnumeration_FxnInst = get_NSEndMapTableEnumeration_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEndMapTableEnumeration_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enumerator);
		NSEndMapTableEnumeration_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEnumerateHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEnumerateHashTable_FxnInst(){
		return ((NSEnumerateHashTable_FxnInst != null)
	? (NSEnumerateHashTable_FxnInst)
	: (NSEnumerateHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEnumerateHashTable", com.apple.jobjc.foundation.NSHashEnumerator.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHashEnumerator NSEnumerateHashTable(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSEnumerateHashTable_FxnInst = get_NSEnumerateHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEnumerateHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
				com.apple.jobjc.foundation.NSHashEnumerator returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSHashEnumerator();
		NSEnumerateHashTable_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEnumerateMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEnumerateMapTable_FxnInst(){
		return ((NSEnumerateMapTable_FxnInst != null)
	? (NSEnumerateMapTable_FxnInst)
	: (NSEnumerateMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEnumerateMapTable", com.apple.jobjc.foundation.NSMapEnumerator.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMapEnumerator NSEnumerateMapTable(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSEnumerateMapTable_FxnInst = get_NSEnumerateMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEnumerateMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
				com.apple.jobjc.foundation.NSMapEnumerator returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSMapEnumerator();
		NSEnumerateMapTable_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEqualPoints_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEqualPoints_FxnInst(){
		return ((NSEqualPoints_FxnInst != null)
	? (NSEqualPoints_FxnInst)
	: (NSEqualPoints_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEqualPoints", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean NSEqualPoints(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.foundation.NSPoint bPoint){
			final com.apple.jobjc.Invoke.FunCall NSEqualPoints_FxnInst = get_NSEqualPoints_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEqualPoints_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, bPoint);
		NSEqualPoints_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEqualRanges_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEqualRanges_FxnInst(){
		return ((NSEqualRanges_FxnInst != null)
	? (NSEqualRanges_FxnInst)
	: (NSEqualRanges_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEqualRanges", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public boolean NSEqualRanges(final com.apple.jobjc.foundation.NSRange range1, final com.apple.jobjc.foundation.NSRange range2){
			final com.apple.jobjc.Invoke.FunCall NSEqualRanges_FxnInst = get_NSEqualRanges_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEqualRanges_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range1);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range2);
		NSEqualRanges_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEqualRects_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEqualRects_FxnInst(){
		return ((NSEqualRects_FxnInst != null)
	? (NSEqualRects_FxnInst)
	: (NSEqualRects_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEqualRects", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean NSEqualRects(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect bRect){
			final com.apple.jobjc.Invoke.FunCall NSEqualRects_FxnInst = get_NSEqualRects_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEqualRects_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bRect);
		NSEqualRects_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEqualSizes_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEqualSizes_FxnInst(){
		return ((NSEqualSizes_FxnInst != null)
	? (NSEqualSizes_FxnInst)
	: (NSEqualSizes_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEqualSizes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public boolean NSEqualSizes(final com.apple.jobjc.foundation.NSSize aSize, final com.apple.jobjc.foundation.NSSize bSize){
			final com.apple.jobjc.Invoke.FunCall NSEqualSizes_FxnInst = get_NSEqualSizes_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEqualSizes_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, bSize);
		NSEqualSizes_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSExtraRefCount_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSExtraRefCount_FxnInst(){
		return ((NSExtraRefCount_FxnInst != null)
	? (NSExtraRefCount_FxnInst)
	: (NSExtraRefCount_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSExtraRefCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long NSExtraRefCount(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSExtraRefCount_FxnInst = get_NSExtraRefCount_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSExtraRefCount_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSExtraRefCount_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSFileTypeForHFSTypeCode_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFileTypeForHFSTypeCode_FxnInst(){
		return ((NSFileTypeForHFSTypeCode_FxnInst != null)
	? (NSFileTypeForHFSTypeCode_FxnInst)
	: (NSFileTypeForHFSTypeCode_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFileTypeForHFSTypeCode", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSString NSFileTypeForHFSTypeCode(final int hfsFileTypeCode){
			final com.apple.jobjc.Invoke.FunCall NSFileTypeForHFSTypeCode_FxnInst = get_NSFileTypeForHFSTypeCode_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFileTypeForHFSTypeCode_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, hfsFileTypeCode);
		NSFileTypeForHFSTypeCode_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSFrameAddress_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFrameAddress_FxnInst(){
		return ((NSFrameAddress_FxnInst != null)
	? (NSFrameAddress_FxnInst)
	: (NSFrameAddress_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFrameAddress", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSFrameAddress(final long frame){
			final com.apple.jobjc.Invoke.FunCall NSFrameAddress_FxnInst = get_NSFrameAddress_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFrameAddress_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, frame);
		NSFrameAddress_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSFreeHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFreeHashTable_FxnInst(){
		return ((NSFreeHashTable_FxnInst != null)
	? (NSFreeHashTable_FxnInst)
	: (NSFreeHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFreeHashTable", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSFreeHashTable(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSFreeHashTable_FxnInst = get_NSFreeHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFreeHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSFreeHashTable_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSFreeMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFreeMapTable_FxnInst(){
		return ((NSFreeMapTable_FxnInst != null)
	? (NSFreeMapTable_FxnInst)
	: (NSFreeMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFreeMapTable", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSFreeMapTable(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSFreeMapTable_FxnInst = get_NSFreeMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFreeMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSFreeMapTable_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSFullUserName_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFullUserName_FxnInst(){
		return ((NSFullUserName_FxnInst != null)
	? (NSFullUserName_FxnInst)
	: (NSFullUserName_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFullUserName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSFullUserName(){
			final com.apple.jobjc.Invoke.FunCall NSFullUserName_FxnInst = get_NSFullUserName_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFullUserName_FxnInst.init(nativeBuffer);
		NSFullUserName_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSGetSizeAndAlignment_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSGetSizeAndAlignment_FxnInst(){
		return ((NSGetSizeAndAlignment_FxnInst != null)
	? (NSGetSizeAndAlignment_FxnInst)
	: (NSGetSizeAndAlignment_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetSizeAndAlignment", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> NSGetSizeAndAlignment(final com.apple.jobjc.Pointer<java.lang.Byte> typePtr, final com.apple.jobjc.Pointer<java.lang.Long> sizep, final com.apple.jobjc.Pointer<java.lang.Long> alignp){
			final com.apple.jobjc.Invoke.FunCall NSGetSizeAndAlignment_FxnInst = get_NSGetSizeAndAlignment_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetSizeAndAlignment_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, typePtr);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, sizep);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, alignp);
		NSGetSizeAndAlignment_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSGetUncaughtExceptionHandler_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSGetUncaughtExceptionHandler_FxnInst(){
		return ((NSGetUncaughtExceptionHandler_FxnInst != null)
	? (NSGetUncaughtExceptionHandler_FxnInst)
	: (NSGetUncaughtExceptionHandler_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetUncaughtExceptionHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSUncaughtExceptionHandler* (^?, ^?) */ NSGetUncaughtExceptionHandler(){
			final com.apple.jobjc.Invoke.FunCall NSGetUncaughtExceptionHandler_FxnInst = get_NSGetUncaughtExceptionHandler_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetUncaughtExceptionHandler_FxnInst.init(nativeBuffer);
		NSGetUncaughtExceptionHandler_FxnInst.invoke(nativeBuffer);
		final Object /* NSUncaughtExceptionHandler* (^?, ^?) */ returnValue = (Object /* NSUncaughtExceptionHandler* (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHFSTypeCodeFromFileType_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHFSTypeCodeFromFileType_FxnInst(){
		return ((NSHFSTypeCodeFromFileType_FxnInst != null)
	? (NSHFSTypeCodeFromFileType_FxnInst)
	: (NSHFSTypeCodeFromFileType_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHFSTypeCodeFromFileType", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int NSHFSTypeCodeFromFileType(final com.apple.jobjc.foundation.NSString fileTypeString){
			final com.apple.jobjc.Invoke.FunCall NSHFSTypeCodeFromFileType_FxnInst = get_NSHFSTypeCodeFromFileType_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHFSTypeCodeFromFileType_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileTypeString);
		NSHFSTypeCodeFromFileType_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHFSTypeOfFile_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHFSTypeOfFile_FxnInst(){
		return ((NSHFSTypeOfFile_FxnInst != null)
	? (NSHFSTypeOfFile_FxnInst)
	: (NSHFSTypeOfFile_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHFSTypeOfFile", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSHFSTypeOfFile(final com.apple.jobjc.foundation.NSString fullFilePath){
			final com.apple.jobjc.Invoke.FunCall NSHFSTypeOfFile_FxnInst = get_NSHFSTypeOfFile_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHFSTypeOfFile_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullFilePath);
		NSHFSTypeOfFile_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHashGet_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHashGet_FxnInst(){
		return ((NSHashGet_FxnInst != null)
	? (NSHashGet_FxnInst)
	: (NSHashGet_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHashGet", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> NSHashGet(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.FunCall NSHashGet_FxnInst = get_NSHashGet_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHashGet_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		NSHashGet_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHashInsert_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHashInsert_FxnInst(){
		return ((NSHashInsert_FxnInst != null)
	? (NSHashInsert_FxnInst)
	: (NSHashInsert_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHashInsert", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSHashInsert(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.FunCall NSHashInsert_FxnInst = get_NSHashInsert_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHashInsert_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		NSHashInsert_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSHashInsertIfAbsent_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHashInsertIfAbsent_FxnInst(){
		return ((NSHashInsertIfAbsent_FxnInst != null)
	? (NSHashInsertIfAbsent_FxnInst)
	: (NSHashInsertIfAbsent_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHashInsertIfAbsent", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> NSHashInsertIfAbsent(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.FunCall NSHashInsertIfAbsent_FxnInst = get_NSHashInsertIfAbsent_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHashInsertIfAbsent_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		NSHashInsertIfAbsent_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHashInsertKnownAbsent_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHashInsertKnownAbsent_FxnInst(){
		return ((NSHashInsertKnownAbsent_FxnInst != null)
	? (NSHashInsertKnownAbsent_FxnInst)
	: (NSHashInsertKnownAbsent_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHashInsertKnownAbsent", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSHashInsertKnownAbsent(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.FunCall NSHashInsertKnownAbsent_FxnInst = get_NSHashInsertKnownAbsent_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHashInsertKnownAbsent_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		NSHashInsertKnownAbsent_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSHashRemove_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHashRemove_FxnInst(){
		return ((NSHashRemove_FxnInst != null)
	? (NSHashRemove_FxnInst)
	: (NSHashRemove_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHashRemove", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSHashRemove(final com.apple.jobjc.foundation.NSHashTable table, final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.FunCall NSHashRemove_FxnInst = get_NSHashRemove_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHashRemove_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		NSHashRemove_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSHeight_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHeight_FxnInst(){
		return ((NSHeight_FxnInst != null)
	? (NSHeight_FxnInst)
	: (NSHeight_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSHeight(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSHeight_FxnInst = get_NSHeight_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHeight_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSHeight_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHomeDirectory_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHomeDirectory_FxnInst(){
		return ((NSHomeDirectory_FxnInst != null)
	? (NSHomeDirectory_FxnInst)
	: (NSHomeDirectory_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHomeDirectory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSHomeDirectory(){
			final com.apple.jobjc.Invoke.FunCall NSHomeDirectory_FxnInst = get_NSHomeDirectory_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHomeDirectory_FxnInst.init(nativeBuffer);
		NSHomeDirectory_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHomeDirectoryForUser_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHomeDirectoryForUser_FxnInst(){
		return ((NSHomeDirectoryForUser_FxnInst != null)
	? (NSHomeDirectoryForUser_FxnInst)
	: (NSHomeDirectoryForUser_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHomeDirectoryForUser", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSHomeDirectoryForUser(final com.apple.jobjc.foundation.NSString userName){
			final com.apple.jobjc.Invoke.FunCall NSHomeDirectoryForUser_FxnInst = get_NSHomeDirectoryForUser_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHomeDirectoryForUser_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userName);
		NSHomeDirectoryForUser_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHostByteOrder_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHostByteOrder_FxnInst(){
		return ((NSHostByteOrder_FxnInst != null)
	? (NSHostByteOrder_FxnInst)
	: (NSHostByteOrder_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHostByteOrder", com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder)));
	}

	 public long NSHostByteOrder(){
			final com.apple.jobjc.Invoke.FunCall NSHostByteOrder_FxnInst = get_NSHostByteOrder_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHostByteOrder_FxnInst.init(nativeBuffer);
		NSHostByteOrder_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIncrementExtraRefCount_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIncrementExtraRefCount_FxnInst(){
		return ((NSIncrementExtraRefCount_FxnInst != null)
	? (NSIncrementExtraRefCount_FxnInst)
	: (NSIncrementExtraRefCount_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIncrementExtraRefCount", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSIncrementExtraRefCount(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSIncrementExtraRefCount_FxnInst = get_NSIncrementExtraRefCount_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIncrementExtraRefCount_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSIncrementExtraRefCount_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSInsetRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSInsetRect_FxnInst(){
		return ((NSInsetRect_FxnInst != null)
	? (NSInsetRect_FxnInst)
	: (NSInsetRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSInsetRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect NSInsetRect(final com.apple.jobjc.foundation.NSRect aRect, final double dX, final double dY){
			final com.apple.jobjc.Invoke.FunCall NSInsetRect_FxnInst = get_NSInsetRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSInsetRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, dX);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, dY);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSInsetRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIntegralRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIntegralRect_FxnInst(){
		return ((NSIntegralRect_FxnInst != null)
	? (NSIntegralRect_FxnInst)
	: (NSIntegralRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIntegralRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect NSIntegralRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSIntegralRect_FxnInst = get_NSIntegralRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIntegralRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSIntegralRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIntegralRectWithOptions_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIntegralRectWithOptions_FxnInst(){
		return ((NSIntegralRectWithOptions_FxnInst != null)
	? (NSIntegralRectWithOptions_FxnInst)
	: (NSIntegralRectWithOptions_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIntegralRectWithOptions", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect NSIntegralRectWithOptions(final com.apple.jobjc.foundation.NSRect aRect, final long opts){
			final com.apple.jobjc.Invoke.FunCall NSIntegralRectWithOptions_FxnInst = get_NSIntegralRectWithOptions_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIntegralRectWithOptions_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, opts);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSIntegralRectWithOptions_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIntersectionRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIntersectionRange_FxnInst(){
		return ((NSIntersectionRange_FxnInst != null)
	? (NSIntersectionRange_FxnInst)
	: (NSIntersectionRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIntersectionRange", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange NSIntersectionRange(final com.apple.jobjc.foundation.NSRange range1, final com.apple.jobjc.foundation.NSRange range2){
			final com.apple.jobjc.Invoke.FunCall NSIntersectionRange_FxnInst = get_NSIntersectionRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIntersectionRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range1);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range2);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		NSIntersectionRange_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIntersectionRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIntersectionRect_FxnInst(){
		return ((NSIntersectionRect_FxnInst != null)
	? (NSIntersectionRect_FxnInst)
	: (NSIntersectionRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIntersectionRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect NSIntersectionRect(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect bRect){
			final com.apple.jobjc.Invoke.FunCall NSIntersectionRect_FxnInst = get_NSIntersectionRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIntersectionRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSIntersectionRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIntersectsRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIntersectsRect_FxnInst(){
		return ((NSIntersectsRect_FxnInst != null)
	? (NSIntersectsRect_FxnInst)
	: (NSIntersectsRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIntersectsRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean NSIntersectsRect(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect bRect){
			final com.apple.jobjc.Invoke.FunCall NSIntersectsRect_FxnInst = get_NSIntersectsRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIntersectsRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bRect);
		NSIntersectsRect_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIsEmptyRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIsEmptyRect_FxnInst(){
		return ((NSIsEmptyRect_FxnInst != null)
	? (NSIsEmptyRect_FxnInst)
	: (NSIsEmptyRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIsEmptyRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean NSIsEmptyRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSIsEmptyRect_FxnInst = get_NSIsEmptyRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIsEmptyRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSIsEmptyRect_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIsFreedObject_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIsFreedObject_FxnInst(){
		return ((NSIsFreedObject_FxnInst != null)
	? (NSIsFreedObject_FxnInst)
	: (NSIsFreedObject_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIsFreedObject", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSIsFreedObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.FunCall NSIsFreedObject_FxnInst = get_NSIsFreedObject_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIsFreedObject_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		NSIsFreedObject_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSLocationInRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSLocationInRange_FxnInst(){
		return ((NSLocationInRange_FxnInst != null)
	? (NSLocationInRange_FxnInst)
	: (NSLocationInRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSLocationInRange", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public boolean NSLocationInRange(final long loc, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.FunCall NSLocationInRange_FxnInst = get_NSLocationInRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSLocationInRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, loc);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		NSLocationInRange_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	 public void NSLog(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.FunCall NSLog_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSLog", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSLog_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		NSLog_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSLogPageSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSLogPageSize_FxnInst(){
		return ((NSLogPageSize_FxnInst != null)
	? (NSLogPageSize_FxnInst)
	: (NSLogPageSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSLogPageSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSLogPageSize(){
			final com.apple.jobjc.Invoke.FunCall NSLogPageSize_FxnInst = get_NSLogPageSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSLogPageSize_FxnInst.init(nativeBuffer);
		NSLogPageSize_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSLogv_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSLogv_FxnInst(){
		return ((NSLogv_FxnInst != null)
	? (NSLogv_FxnInst)
	: (NSLogv_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSLogv", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void NSLogv(final com.apple.jobjc.foundation.NSString format, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ args){
			final com.apple.jobjc.Invoke.FunCall NSLogv_FxnInst = get_NSLogv_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSLogv_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, args);
		NSLogv_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSMakeCollectable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMakeCollectable_FxnInst(){
		return ((NSMakeCollectable_FxnInst != null)
	? (NSMakeCollectable_FxnInst)
	: (NSMakeCollectable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMakeCollectable", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T NSMakeCollectable(final com.apple.jobjc.corefoundation.CFTypeRefCFType cf){
			final com.apple.jobjc.Invoke.FunCall NSMakeCollectable_FxnInst = get_NSMakeCollectable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMakeCollectable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, cf);
		NSMakeCollectable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMakePoint_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMakePoint_FxnInst(){
		return ((NSMakePoint_FxnInst != null)
	? (NSMakePoint_FxnInst)
	: (NSMakePoint_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMakePoint", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSPoint NSMakePoint(final double x, final double y){
			final com.apple.jobjc.Invoke.FunCall NSMakePoint_FxnInst = get_NSMakePoint_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMakePoint_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, y);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		NSMakePoint_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMakeRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMakeRange_FxnInst(){
		return ((NSMakeRange_FxnInst != null)
	? (NSMakeRange_FxnInst)
	: (NSMakeRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMakeRange", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange NSMakeRange(final long loc, final long len){
			final com.apple.jobjc.Invoke.FunCall NSMakeRange_FxnInst = get_NSMakeRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMakeRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, loc);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		NSMakeRange_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMakeRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMakeRect_FxnInst(){
		return ((NSMakeRect_FxnInst != null)
	? (NSMakeRect_FxnInst)
	: (NSMakeRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMakeRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect NSMakeRect(final double x, final double y, final double w, final double h){
			final com.apple.jobjc.Invoke.FunCall NSMakeRect_FxnInst = get_NSMakeRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMakeRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, x);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, y);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, w);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, h);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSMakeRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMakeSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMakeSize_FxnInst(){
		return ((NSMakeSize_FxnInst != null)
	? (NSMakeSize_FxnInst)
	: (NSMakeSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMakeSize", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize NSMakeSize(final double w, final double h){
			final com.apple.jobjc.Invoke.FunCall NSMakeSize_FxnInst = get_NSMakeSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMakeSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, w);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, h);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		NSMakeSize_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapGet_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapGet_FxnInst(){
		return ((NSMapGet_FxnInst != null)
	? (NSMapGet_FxnInst)
	: (NSMapGet_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapGet", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> NSMapGet(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key){
			final com.apple.jobjc.Invoke.FunCall NSMapGet_FxnInst = get_NSMapGet_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapGet_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		NSMapGet_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapInsert_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapInsert_FxnInst(){
		return ((NSMapInsert_FxnInst != null)
	? (NSMapInsert_FxnInst)
	: (NSMapInsert_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapInsert", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSMapInsert(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key, final com.apple.jobjc.Pointer<Void> value){
			final com.apple.jobjc.Invoke.FunCall NSMapInsert_FxnInst = get_NSMapInsert_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapInsert_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		NSMapInsert_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapInsertIfAbsent_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapInsertIfAbsent_FxnInst(){
		return ((NSMapInsertIfAbsent_FxnInst != null)
	? (NSMapInsertIfAbsent_FxnInst)
	: (NSMapInsertIfAbsent_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapInsertIfAbsent", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> NSMapInsertIfAbsent(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key, final com.apple.jobjc.Pointer<Void> value){
			final com.apple.jobjc.Invoke.FunCall NSMapInsertIfAbsent_FxnInst = get_NSMapInsertIfAbsent_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapInsertIfAbsent_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		NSMapInsertIfAbsent_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapInsertKnownAbsent_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapInsertKnownAbsent_FxnInst(){
		return ((NSMapInsertKnownAbsent_FxnInst != null)
	? (NSMapInsertKnownAbsent_FxnInst)
	: (NSMapInsertKnownAbsent_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapInsertKnownAbsent", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSMapInsertKnownAbsent(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key, final com.apple.jobjc.Pointer<Void> value){
			final com.apple.jobjc.Invoke.FunCall NSMapInsertKnownAbsent_FxnInst = get_NSMapInsertKnownAbsent_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapInsertKnownAbsent_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		NSMapInsertKnownAbsent_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapMember_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapMember_FxnInst(){
		return ((NSMapMember_FxnInst != null)
	? (NSMapMember_FxnInst)
	: (NSMapMember_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapMember", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean NSMapMember(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<Void>> originalKey, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<Void>> value){
			final com.apple.jobjc.Invoke.FunCall NSMapMember_FxnInst = get_NSMapMember_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapMember_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, originalKey);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		NSMapMember_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMapRemove_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMapRemove_FxnInst(){
		return ((NSMapRemove_FxnInst != null)
	? (NSMapRemove_FxnInst)
	: (NSMapRemove_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMapRemove", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSMapRemove(final com.apple.jobjc.foundation.NSMapTable table, final com.apple.jobjc.Pointer<Void> key){
			final com.apple.jobjc.Invoke.FunCall NSMapRemove_FxnInst = get_NSMapRemove_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMapRemove_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		NSMapRemove_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSMaxRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMaxRange_FxnInst(){
		return ((NSMaxRange_FxnInst != null)
	? (NSMaxRange_FxnInst)
	: (NSMaxRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMaxRange", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long NSMaxRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.FunCall NSMaxRange_FxnInst = get_NSMaxRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMaxRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		NSMaxRange_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMaxX_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMaxX_FxnInst(){
		return ((NSMaxX_FxnInst != null)
	? (NSMaxX_FxnInst)
	: (NSMaxX_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMaxX", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMaxX(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMaxX_FxnInst = get_NSMaxX_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMaxX_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMaxX_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMaxY_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMaxY_FxnInst(){
		return ((NSMaxY_FxnInst != null)
	? (NSMaxY_FxnInst)
	: (NSMaxY_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMaxY", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMaxY(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMaxY_FxnInst = get_NSMaxY_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMaxY_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMaxY_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMidX_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMidX_FxnInst(){
		return ((NSMidX_FxnInst != null)
	? (NSMidX_FxnInst)
	: (NSMidX_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMidX", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMidX(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMidX_FxnInst = get_NSMidX_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMidX_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMidX_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMidY_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMidY_FxnInst(){
		return ((NSMidY_FxnInst != null)
	? (NSMidY_FxnInst)
	: (NSMidY_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMidY", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMidY(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMidY_FxnInst = get_NSMidY_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMidY_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMidY_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMinX_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMinX_FxnInst(){
		return ((NSMinX_FxnInst != null)
	? (NSMinX_FxnInst)
	: (NSMinX_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMinX", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMinX(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMinX_FxnInst = get_NSMinX_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMinX_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMinX_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMinY_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMinY_FxnInst(){
		return ((NSMinY_FxnInst != null)
	? (NSMinY_FxnInst)
	: (NSMinY_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMinY", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSMinY(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSMinY_FxnInst = get_NSMinY_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMinY_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSMinY_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSMouseInRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSMouseInRect_FxnInst(){
		return ((NSMouseInRect_FxnInst != null)
	? (NSMouseInRect_FxnInst)
	: (NSMouseInRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSMouseInRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean NSMouseInRect(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.foundation.NSRect aRect, final boolean flipped){
			final com.apple.jobjc.Invoke.FunCall NSMouseInRect_FxnInst = get_NSMouseInRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSMouseInRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		NSMouseInRect_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSNextHashEnumeratorItem_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSNextHashEnumeratorItem_FxnInst(){
		return ((NSNextHashEnumeratorItem_FxnInst != null)
	? (NSNextHashEnumeratorItem_FxnInst)
	: (NSNextHashEnumeratorItem_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSNextHashEnumeratorItem", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> NSNextHashEnumeratorItem(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSHashEnumerator> enumerator){
			final com.apple.jobjc.Invoke.FunCall NSNextHashEnumeratorItem_FxnInst = get_NSNextHashEnumeratorItem_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSNextHashEnumeratorItem_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enumerator);
		NSNextHashEnumeratorItem_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSNextMapEnumeratorPair_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSNextMapEnumeratorPair_FxnInst(){
		return ((NSNextMapEnumeratorPair_FxnInst != null)
	? (NSNextMapEnumeratorPair_FxnInst)
	: (NSNextMapEnumeratorPair_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSNextMapEnumeratorPair", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean NSNextMapEnumeratorPair(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSMapEnumerator> enumerator, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<Void>> key, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<Void>> value){
			final com.apple.jobjc.Invoke.FunCall NSNextMapEnumeratorPair_FxnInst = get_NSNextMapEnumeratorPair_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSNextMapEnumeratorPair_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enumerator);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		NSNextMapEnumeratorPair_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSOffsetRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSOffsetRect_FxnInst(){
		return ((NSOffsetRect_FxnInst != null)
	? (NSOffsetRect_FxnInst)
	: (NSOffsetRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSOffsetRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect NSOffsetRect(final com.apple.jobjc.foundation.NSRect aRect, final double dX, final double dY){
			final com.apple.jobjc.Invoke.FunCall NSOffsetRect_FxnInst = get_NSOffsetRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSOffsetRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, dX);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, dY);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSOffsetRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSOpenStepRootDirectory_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSOpenStepRootDirectory_FxnInst(){
		return ((NSOpenStepRootDirectory_FxnInst != null)
	? (NSOpenStepRootDirectory_FxnInst)
	: (NSOpenStepRootDirectory_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSOpenStepRootDirectory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSOpenStepRootDirectory(){
			final com.apple.jobjc.Invoke.FunCall NSOpenStepRootDirectory_FxnInst = get_NSOpenStepRootDirectory_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSOpenStepRootDirectory_FxnInst.init(nativeBuffer);
		NSOpenStepRootDirectory_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPageSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPageSize_FxnInst(){
		return ((NSPageSize_FxnInst != null)
	? (NSPageSize_FxnInst)
	: (NSPageSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPageSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSPageSize(){
			final com.apple.jobjc.Invoke.FunCall NSPageSize_FxnInst = get_NSPageSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPageSize_FxnInst.init(nativeBuffer);
		NSPageSize_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPointFromCGPoint_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPointFromCGPoint_FxnInst(){
		return ((NSPointFromCGPoint_FxnInst != null)
	? (NSPointFromCGPoint_FxnInst)
	: (NSPointFromCGPoint_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPointFromCGPoint", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint NSPointFromCGPoint(final Object /* CGPoint ({CGPoint=ff}, {CGPoint=dd}) */ cgpoint){
			final com.apple.jobjc.Invoke.FunCall NSPointFromCGPoint_FxnInst = get_NSPointFromCGPoint_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPointFromCGPoint_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgpoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		NSPointFromCGPoint_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPointFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPointFromString_FxnInst(){
		return ((NSPointFromString_FxnInst != null)
	? (NSPointFromString_FxnInst)
	: (NSPointFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPointFromString", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint NSPointFromString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.FunCall NSPointFromString_FxnInst = get_NSPointFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPointFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		NSPointFromString_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPointInRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPointInRect_FxnInst(){
		return ((NSPointInRect_FxnInst != null)
	? (NSPointInRect_FxnInst)
	: (NSPointInRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPointInRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean NSPointInRect(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSPointInRect_FxnInst = get_NSPointInRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPointInRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSPointInRect_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPointToCGPoint_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPointToCGPoint_FxnInst(){
		return ((NSPointToCGPoint_FxnInst != null)
	? (NSPointToCGPoint_FxnInst)
	: (NSPointToCGPoint_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPointToCGPoint", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public Object /* CGPoint ({CGPoint=ff}, {CGPoint=dd}) */ NSPointToCGPoint(final com.apple.jobjc.foundation.NSPoint nspoint){
			final com.apple.jobjc.Invoke.FunCall NSPointToCGPoint_FxnInst = get_NSPointToCGPoint_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPointToCGPoint_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, nspoint);
		NSPointToCGPoint_FxnInst.invoke(nativeBuffer);
		final Object /* CGPoint ({CGPoint=ff}, {CGPoint=dd}) */ returnValue = (Object /* CGPoint ({CGPoint=ff}, {CGPoint=dd}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSProtocolFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSProtocolFromString_FxnInst(){
		return ((NSProtocolFromString_FxnInst != null)
	? (NSProtocolFromString_FxnInst)
	: (NSProtocolFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSProtocolFromString", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public Object /* Protocol* (@, @) */ NSProtocolFromString(final com.apple.jobjc.foundation.NSString namestr){
			final com.apple.jobjc.Invoke.FunCall NSProtocolFromString_FxnInst = get_NSProtocolFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSProtocolFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namestr);
		NSProtocolFromString_FxnInst.invoke(nativeBuffer);
		final Object /* Protocol* (@, @) */ returnValue = (Object /* Protocol* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRangeFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRangeFromString_FxnInst(){
		return ((NSRangeFromString_FxnInst != null)
	? (NSRangeFromString_FxnInst)
	: (NSRangeFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRangeFromString", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange NSRangeFromString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.FunCall NSRangeFromString_FxnInst = get_NSRangeFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRangeFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		NSRangeFromString_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRealMemoryAvailable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRealMemoryAvailable_FxnInst(){
		return ((NSRealMemoryAvailable_FxnInst != null)
	? (NSRealMemoryAvailable_FxnInst)
	: (NSRealMemoryAvailable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRealMemoryAvailable", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSRealMemoryAvailable(){
			final com.apple.jobjc.Invoke.FunCall NSRealMemoryAvailable_FxnInst = get_NSRealMemoryAvailable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRealMemoryAvailable_FxnInst.init(nativeBuffer);
		NSRealMemoryAvailable_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSReallocateCollectable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSReallocateCollectable_FxnInst(){
		return ((NSReallocateCollectable_FxnInst != null)
	? (NSReallocateCollectable_FxnInst)
	: (NSReallocateCollectable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSReallocateCollectable", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSReallocateCollectable(final com.apple.jobjc.Pointer<Void> ptr, final long size, final long options){
			final com.apple.jobjc.Invoke.FunCall NSReallocateCollectable_FxnInst = get_NSReallocateCollectable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSReallocateCollectable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		NSReallocateCollectable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRecordAllocationEvent_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRecordAllocationEvent_FxnInst(){
		return ((NSRecordAllocationEvent_FxnInst != null)
	? (NSRecordAllocationEvent_FxnInst)
	: (NSRecordAllocationEvent_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRecordAllocationEvent", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSRecordAllocationEvent(final int eventType, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSRecordAllocationEvent_FxnInst = get_NSRecordAllocationEvent_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRecordAllocationEvent_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, eventType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSRecordAllocationEvent_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFromCGRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFromCGRect_FxnInst(){
		return ((NSRectFromCGRect_FxnInst != null)
	? (NSRectFromCGRect_FxnInst)
	: (NSRectFromCGRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFromCGRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect NSRectFromCGRect(final Object /* CGRect ({CGRect={CGPoint=ff}{CGSize=ff}}, {CGRect={CGPoint=dd}{CGSize=dd}}) */ cgrect){
			final com.apple.jobjc.Invoke.FunCall NSRectFromCGRect_FxnInst = get_NSRectFromCGRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFromCGRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgrect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSRectFromCGRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFromString_FxnInst(){
		return ((NSRectFromString_FxnInst != null)
	? (NSRectFromString_FxnInst)
	: (NSRectFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFromString", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect NSRectFromString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.FunCall NSRectFromString_FxnInst = get_NSRectFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSRectFromString_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectToCGRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectToCGRect_FxnInst(){
		return ((NSRectToCGRect_FxnInst != null)
	? (NSRectToCGRect_FxnInst)
	: (NSRectToCGRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectToCGRect", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public Object /* CGRect ({CGRect={CGPoint=ff}{CGSize=ff}}, {CGRect={CGPoint=dd}{CGSize=dd}}) */ NSRectToCGRect(final com.apple.jobjc.foundation.NSRect nsrect){
			final com.apple.jobjc.Invoke.FunCall NSRectToCGRect_FxnInst = get_NSRectToCGRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectToCGRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, nsrect);
		NSRectToCGRect_FxnInst.invoke(nativeBuffer);
		final Object /* CGRect ({CGRect={CGPoint=ff}{CGSize=ff}}, {CGRect={CGPoint=dd}{CGSize=dd}}) */ returnValue = (Object /* CGRect ({CGRect={CGPoint=ff}{CGSize=ff}}, {CGRect={CGPoint=dd}{CGSize=dd}}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRecycleZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRecycleZone_FxnInst(){
		return ((NSRecycleZone_FxnInst != null)
	? (NSRecycleZone_FxnInst)
	: (NSRecycleZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRecycleZone", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSRecycleZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSRecycleZone_FxnInst = get_NSRecycleZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRecycleZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSRecycleZone_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSResetHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSResetHashTable_FxnInst(){
		return ((NSResetHashTable_FxnInst != null)
	? (NSResetHashTable_FxnInst)
	: (NSResetHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSResetHashTable", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSResetHashTable(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSResetHashTable_FxnInst = get_NSResetHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSResetHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSResetHashTable_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSResetMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSResetMapTable_FxnInst(){
		return ((NSResetMapTable_FxnInst != null)
	? (NSResetMapTable_FxnInst)
	: (NSResetMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSResetMapTable", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSResetMapTable(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSResetMapTable_FxnInst = get_NSResetMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSResetMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSResetMapTable_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSReturnAddress_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSReturnAddress_FxnInst(){
		return ((NSReturnAddress_FxnInst != null)
	? (NSReturnAddress_FxnInst)
	: (NSReturnAddress_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSReturnAddress", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSReturnAddress(final long frame){
			final com.apple.jobjc.Invoke.FunCall NSReturnAddress_FxnInst = get_NSReturnAddress_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSReturnAddress_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, frame);
		NSReturnAddress_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRoundDownToMultipleOfPageSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRoundDownToMultipleOfPageSize_FxnInst(){
		return ((NSRoundDownToMultipleOfPageSize_FxnInst != null)
	? (NSRoundDownToMultipleOfPageSize_FxnInst)
	: (NSRoundDownToMultipleOfPageSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRoundDownToMultipleOfPageSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSRoundDownToMultipleOfPageSize(final long bytes){
			final com.apple.jobjc.Invoke.FunCall NSRoundDownToMultipleOfPageSize_FxnInst = get_NSRoundDownToMultipleOfPageSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRoundDownToMultipleOfPageSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bytes);
		NSRoundDownToMultipleOfPageSize_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRoundUpToMultipleOfPageSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRoundUpToMultipleOfPageSize_FxnInst(){
		return ((NSRoundUpToMultipleOfPageSize_FxnInst != null)
	? (NSRoundUpToMultipleOfPageSize_FxnInst)
	: (NSRoundUpToMultipleOfPageSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRoundUpToMultipleOfPageSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSRoundUpToMultipleOfPageSize(final long bytes){
			final com.apple.jobjc.Invoke.FunCall NSRoundUpToMultipleOfPageSize_FxnInst = get_NSRoundUpToMultipleOfPageSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRoundUpToMultipleOfPageSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bytes);
		NSRoundUpToMultipleOfPageSize_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSearchPathForDirectoriesInDomains_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSearchPathForDirectoriesInDomains_FxnInst(){
		return ((NSSearchPathForDirectoriesInDomains_FxnInst != null)
	? (NSSearchPathForDirectoriesInDomains_FxnInst)
	: (NSSearchPathForDirectoriesInDomains_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSearchPathForDirectoriesInDomains", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSSearchPathForDirectoriesInDomains(final long directory, final long domainMask, final boolean expandTilde){
			final com.apple.jobjc.Invoke.FunCall NSSearchPathForDirectoriesInDomains_FxnInst = get_NSSearchPathForDirectoriesInDomains_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSearchPathForDirectoriesInDomains_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, directory);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, domainMask);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, expandTilde);
		NSSearchPathForDirectoriesInDomains_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSelectorFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSelectorFromString_FxnInst(){
		return ((NSSelectorFromString_FxnInst != null)
	? (NSSelectorFromString_FxnInst)
	: (NSSelectorFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSelectorFromString", com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.SEL NSSelectorFromString(final com.apple.jobjc.foundation.NSString aSelectorName){
			final com.apple.jobjc.Invoke.FunCall NSSelectorFromString_FxnInst = get_NSSelectorFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSelectorFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSelectorName);
		NSSelectorFromString_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSetUncaughtExceptionHandler_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSetUncaughtExceptionHandler_FxnInst(){
		return ((NSSetUncaughtExceptionHandler_FxnInst != null)
	? (NSSetUncaughtExceptionHandler_FxnInst)
	: (NSSetUncaughtExceptionHandler_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSetUncaughtExceptionHandler", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void NSSetUncaughtExceptionHandler(final Object /* NSUncaughtExceptionHandler* (^?, ^?) */ arg1){
			final com.apple.jobjc.Invoke.FunCall NSSetUncaughtExceptionHandler_FxnInst = get_NSSetUncaughtExceptionHandler_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSetUncaughtExceptionHandler_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, arg1);
		NSSetUncaughtExceptionHandler_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSSetZoneName_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSetZoneName_FxnInst(){
		return ((NSSetZoneName_FxnInst != null)
	? (NSSetZoneName_FxnInst)
	: (NSSetZoneName_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSetZoneName", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSSetZoneName(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.FunCall NSSetZoneName_FxnInst = get_NSSetZoneName_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSetZoneName_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		NSSetZoneName_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSShouldRetainWithZone_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSShouldRetainWithZone_FxnInst(){
		return ((NSShouldRetainWithZone_FxnInst != null)
	? (NSShouldRetainWithZone_FxnInst)
	: (NSShouldRetainWithZone_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSShouldRetainWithZone", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean NSShouldRetainWithZone(final com.apple.jobjc.ID anObject, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> requestedZone){
			final com.apple.jobjc.Invoke.FunCall NSShouldRetainWithZone_FxnInst = get_NSShouldRetainWithZone_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSShouldRetainWithZone_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, requestedZone);
		NSShouldRetainWithZone_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSizeFromCGSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSizeFromCGSize_FxnInst(){
		return ((NSSizeFromCGSize_FxnInst != null)
	? (NSSizeFromCGSize_FxnInst)
	: (NSSizeFromCGSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSizeFromCGSize", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize NSSizeFromCGSize(final Object /* CGSize ({CGSize=ff}, {CGSize=dd}) */ cgsize){
			final com.apple.jobjc.Invoke.FunCall NSSizeFromCGSize_FxnInst = get_NSSizeFromCGSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSizeFromCGSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgsize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		NSSizeFromCGSize_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSizeFromString_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSizeFromString_FxnInst(){
		return ((NSSizeFromString_FxnInst != null)
	? (NSSizeFromString_FxnInst)
	: (NSSizeFromString_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSizeFromString", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize NSSizeFromString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.FunCall NSSizeFromString_FxnInst = get_NSSizeFromString_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSizeFromString_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		NSSizeFromString_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSizeToCGSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSizeToCGSize_FxnInst(){
		return ((NSSizeToCGSize_FxnInst != null)
	? (NSSizeToCGSize_FxnInst)
	: (NSSizeToCGSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSizeToCGSize", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public Object /* CGSize ({CGSize=ff}, {CGSize=dd}) */ NSSizeToCGSize(final com.apple.jobjc.foundation.NSSize nssize){
			final com.apple.jobjc.Invoke.FunCall NSSizeToCGSize_FxnInst = get_NSSizeToCGSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSizeToCGSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, nssize);
		NSSizeToCGSize_FxnInst.invoke(nativeBuffer);
		final Object /* CGSize ({CGSize=ff}, {CGSize=dd}) */ returnValue = (Object /* CGSize ({CGSize=ff}, {CGSize=dd}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromClass_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromClass_FxnInst(){
		return ((NSStringFromClass_FxnInst != null)
	? (NSStringFromClass_FxnInst)
	: (NSStringFromClass_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromClass", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.FunCall NSStringFromClass_FxnInst = get_NSStringFromClass_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromClass_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		NSStringFromClass_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromHashTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromHashTable_FxnInst(){
		return ((NSStringFromHashTable_FxnInst != null)
	? (NSStringFromHashTable_FxnInst)
	: (NSStringFromHashTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromHashTable", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromHashTable(final com.apple.jobjc.foundation.NSHashTable table){
			final com.apple.jobjc.Invoke.FunCall NSStringFromHashTable_FxnInst = get_NSStringFromHashTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromHashTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSStringFromHashTable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromMapTable_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromMapTable_FxnInst(){
		return ((NSStringFromMapTable_FxnInst != null)
	? (NSStringFromMapTable_FxnInst)
	: (NSStringFromMapTable_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromMapTable", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromMapTable(final com.apple.jobjc.foundation.NSMapTable table){
			final com.apple.jobjc.Invoke.FunCall NSStringFromMapTable_FxnInst = get_NSStringFromMapTable_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromMapTable_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		NSStringFromMapTable_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromPoint_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromPoint_FxnInst(){
		return ((NSStringFromPoint_FxnInst != null)
	? (NSStringFromPoint_FxnInst)
	: (NSStringFromPoint_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromPoint", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromPoint(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.FunCall NSStringFromPoint_FxnInst = get_NSStringFromPoint_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromPoint_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		NSStringFromPoint_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromProtocol_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromProtocol_FxnInst(){
		return ((NSStringFromProtocol_FxnInst != null)
	? (NSStringFromProtocol_FxnInst)
	: (NSStringFromProtocol_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromProtocol", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromProtocol(final Object /* Protocol* (@, @) */ proto){
			final com.apple.jobjc.Invoke.FunCall NSStringFromProtocol_FxnInst = get_NSStringFromProtocol_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromProtocol_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, proto);
		NSStringFromProtocol_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromRange_FxnInst(){
		return ((NSStringFromRange_FxnInst != null)
	? (NSStringFromRange_FxnInst)
	: (NSStringFromRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromRange", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.FunCall NSStringFromRange_FxnInst = get_NSStringFromRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		NSStringFromRange_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromRect_FxnInst(){
		return ((NSStringFromRect_FxnInst != null)
	? (NSStringFromRect_FxnInst)
	: (NSStringFromRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromRect", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSStringFromRect_FxnInst = get_NSStringFromRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSStringFromRect_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromSelector_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromSelector_FxnInst(){
		return ((NSStringFromSelector_FxnInst != null)
	? (NSStringFromSelector_FxnInst)
	: (NSStringFromSelector_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromSelector", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.FunCall NSStringFromSelector_FxnInst = get_NSStringFromSelector_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromSelector_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		NSStringFromSelector_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSStringFromSize_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSStringFromSize_FxnInst(){
		return ((NSStringFromSize_FxnInst != null)
	? (NSStringFromSize_FxnInst)
	: (NSStringFromSize_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSStringFromSize", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString NSStringFromSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.FunCall NSStringFromSize_FxnInst = get_NSStringFromSize_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSStringFromSize_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		NSStringFromSize_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigDoubleToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigDoubleToHost_FxnInst(){
		return ((NSSwapBigDoubleToHost_FxnInst != null)
	? (NSSwapBigDoubleToHost_FxnInst)
	: (NSSwapBigDoubleToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigDoubleToHost", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder())));
	}

	 public double NSSwapBigDoubleToHost(final com.apple.jobjc.foundation.NSSwappedDouble x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigDoubleToHost_FxnInst = get_NSSwapBigDoubleToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigDoubleToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder().push(nativeBuffer, x);
		NSSwapBigDoubleToHost_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigFloatToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigFloatToHost_FxnInst(){
		return ((NSSwapBigFloatToHost_FxnInst != null)
	? (NSSwapBigFloatToHost_FxnInst)
	: (NSSwapBigFloatToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigFloatToHost", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder())));
	}

	 public float NSSwapBigFloatToHost(final com.apple.jobjc.foundation.NSSwappedFloat x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigFloatToHost_FxnInst = get_NSSwapBigFloatToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigFloatToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder().push(nativeBuffer, x);
		NSSwapBigFloatToHost_FxnInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigIntToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigIntToHost_FxnInst(){
		return ((NSSwapBigIntToHost_FxnInst != null)
	? (NSSwapBigIntToHost_FxnInst)
	: (NSSwapBigIntToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigIntToHost", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int NSSwapBigIntToHost(final int x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigIntToHost_FxnInst = get_NSSwapBigIntToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigIntToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, x);
		NSSwapBigIntToHost_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigLongLongToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigLongLongToHost_FxnInst(){
		return ((NSSwapBigLongLongToHost_FxnInst != null)
	? (NSSwapBigLongLongToHost_FxnInst)
	: (NSSwapBigLongLongToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigLongLongToHost", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long NSSwapBigLongLongToHost(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigLongLongToHost_FxnInst = get_NSSwapBigLongLongToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigLongLongToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, x);
		NSSwapBigLongLongToHost_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigLongToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigLongToHost_FxnInst(){
		return ((NSSwapBigLongToHost_FxnInst != null)
	? (NSSwapBigLongToHost_FxnInst)
	: (NSSwapBigLongToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigLongToHost", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long NSSwapBigLongToHost(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigLongToHost_FxnInst = get_NSSwapBigLongToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigLongToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, x);
		NSSwapBigLongToHost_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapBigShortToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapBigShortToHost_FxnInst(){
		return ((NSSwapBigShortToHost_FxnInst != null)
	? (NSSwapBigShortToHost_FxnInst)
	: (NSSwapBigShortToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapBigShortToHost", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short NSSwapBigShortToHost(final short x){
			final com.apple.jobjc.Invoke.FunCall NSSwapBigShortToHost_FxnInst = get_NSSwapBigShortToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapBigShortToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, x);
		NSSwapBigShortToHost_FxnInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapDouble_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapDouble_FxnInst(){
		return ((NSSwapDouble_FxnInst != null)
	? (NSSwapDouble_FxnInst)
	: (NSSwapDouble_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapDouble", com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder(), com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSwappedDouble NSSwapDouble(final com.apple.jobjc.foundation.NSSwappedDouble x){
			final com.apple.jobjc.Invoke.FunCall NSSwapDouble_FxnInst = get_NSSwapDouble_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapDouble_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder().push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedDouble returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedDouble();
		NSSwapDouble_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapFloat_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapFloat_FxnInst(){
		return ((NSSwapFloat_FxnInst != null)
	? (NSSwapFloat_FxnInst)
	: (NSSwapFloat_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapFloat", com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder(), com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSwappedFloat NSSwapFloat(final com.apple.jobjc.foundation.NSSwappedFloat x){
			final com.apple.jobjc.Invoke.FunCall NSSwapFloat_FxnInst = get_NSSwapFloat_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapFloat_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder().push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedFloat returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedFloat();
		NSSwapFloat_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostDoubleToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostDoubleToBig_FxnInst(){
		return ((NSSwapHostDoubleToBig_FxnInst != null)
	? (NSSwapHostDoubleToBig_FxnInst)
	: (NSSwapHostDoubleToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostDoubleToBig", com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder(), com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedDouble NSSwapHostDoubleToBig(final double x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostDoubleToBig_FxnInst = get_NSSwapHostDoubleToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostDoubleToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedDouble returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedDouble();
		NSSwapHostDoubleToBig_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostDoubleToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostDoubleToLittle_FxnInst(){
		return ((NSSwapHostDoubleToLittle_FxnInst != null)
	? (NSSwapHostDoubleToLittle_FxnInst)
	: (NSSwapHostDoubleToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostDoubleToLittle", com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder(), com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedDouble NSSwapHostDoubleToLittle(final double x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostDoubleToLittle_FxnInst = get_NSSwapHostDoubleToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostDoubleToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedDouble returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedDouble();
		NSSwapHostDoubleToLittle_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostFloatToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostFloatToBig_FxnInst(){
		return ((NSSwapHostFloatToBig_FxnInst != null)
	? (NSSwapHostFloatToBig_FxnInst)
	: (NSSwapHostFloatToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostFloatToBig", com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder(), com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedFloat NSSwapHostFloatToBig(final float x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostFloatToBig_FxnInst = get_NSSwapHostFloatToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostFloatToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedFloat returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedFloat();
		NSSwapHostFloatToBig_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostFloatToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostFloatToLittle_FxnInst(){
		return ((NSSwapHostFloatToLittle_FxnInst != null)
	? (NSSwapHostFloatToLittle_FxnInst)
	: (NSSwapHostFloatToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostFloatToLittle", com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder(), com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSwappedFloat NSSwapHostFloatToLittle(final float x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostFloatToLittle_FxnInst = get_NSSwapHostFloatToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostFloatToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, x);
				com.apple.jobjc.foundation.NSSwappedFloat returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSwappedFloat();
		NSSwapHostFloatToLittle_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostIntToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostIntToBig_FxnInst(){
		return ((NSSwapHostIntToBig_FxnInst != null)
	? (NSSwapHostIntToBig_FxnInst)
	: (NSSwapHostIntToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostIntToBig", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int NSSwapHostIntToBig(final int x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostIntToBig_FxnInst = get_NSSwapHostIntToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostIntToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, x);
		NSSwapHostIntToBig_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostIntToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostIntToLittle_FxnInst(){
		return ((NSSwapHostIntToLittle_FxnInst != null)
	? (NSSwapHostIntToLittle_FxnInst)
	: (NSSwapHostIntToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostIntToLittle", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int NSSwapHostIntToLittle(final int x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostIntToLittle_FxnInst = get_NSSwapHostIntToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostIntToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, x);
		NSSwapHostIntToLittle_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostLongLongToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostLongLongToBig_FxnInst(){
		return ((NSSwapHostLongLongToBig_FxnInst != null)
	? (NSSwapHostLongLongToBig_FxnInst)
	: (NSSwapHostLongLongToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostLongLongToBig", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long NSSwapHostLongLongToBig(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostLongLongToBig_FxnInst = get_NSSwapHostLongLongToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostLongLongToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, x);
		NSSwapHostLongLongToBig_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostLongLongToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostLongLongToLittle_FxnInst(){
		return ((NSSwapHostLongLongToLittle_FxnInst != null)
	? (NSSwapHostLongLongToLittle_FxnInst)
	: (NSSwapHostLongLongToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostLongLongToLittle", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long NSSwapHostLongLongToLittle(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostLongLongToLittle_FxnInst = get_NSSwapHostLongLongToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostLongLongToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, x);
		NSSwapHostLongLongToLittle_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostLongToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostLongToBig_FxnInst(){
		return ((NSSwapHostLongToBig_FxnInst != null)
	? (NSSwapHostLongToBig_FxnInst)
	: (NSSwapHostLongToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostLongToBig", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long NSSwapHostLongToBig(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostLongToBig_FxnInst = get_NSSwapHostLongToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostLongToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, x);
		NSSwapHostLongToBig_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostLongToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostLongToLittle_FxnInst(){
		return ((NSSwapHostLongToLittle_FxnInst != null)
	? (NSSwapHostLongToLittle_FxnInst)
	: (NSSwapHostLongToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostLongToLittle", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long NSSwapHostLongToLittle(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostLongToLittle_FxnInst = get_NSSwapHostLongToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostLongToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, x);
		NSSwapHostLongToLittle_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostShortToBig_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostShortToBig_FxnInst(){
		return ((NSSwapHostShortToBig_FxnInst != null)
	? (NSSwapHostShortToBig_FxnInst)
	: (NSSwapHostShortToBig_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostShortToBig", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short NSSwapHostShortToBig(final short x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostShortToBig_FxnInst = get_NSSwapHostShortToBig_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostShortToBig_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, x);
		NSSwapHostShortToBig_FxnInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapHostShortToLittle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapHostShortToLittle_FxnInst(){
		return ((NSSwapHostShortToLittle_FxnInst != null)
	? (NSSwapHostShortToLittle_FxnInst)
	: (NSSwapHostShortToLittle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapHostShortToLittle", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short NSSwapHostShortToLittle(final short x){
			final com.apple.jobjc.Invoke.FunCall NSSwapHostShortToLittle_FxnInst = get_NSSwapHostShortToLittle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapHostShortToLittle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, x);
		NSSwapHostShortToLittle_FxnInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapInt_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapInt_FxnInst(){
		return ((NSSwapInt_FxnInst != null)
	? (NSSwapInt_FxnInst)
	: (NSSwapInt_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapInt", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int NSSwapInt(final int inv){
			final com.apple.jobjc.Invoke.FunCall NSSwapInt_FxnInst = get_NSSwapInt_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapInt_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, inv);
		NSSwapInt_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleDoubleToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleDoubleToHost_FxnInst(){
		return ((NSSwapLittleDoubleToHost_FxnInst != null)
	? (NSSwapLittleDoubleToHost_FxnInst)
	: (NSSwapLittleDoubleToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleDoubleToHost", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder())));
	}

	 public double NSSwapLittleDoubleToHost(final com.apple.jobjc.foundation.NSSwappedDouble x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleDoubleToHost_FxnInst = get_NSSwapLittleDoubleToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleDoubleToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedDouble.getStructCoder().push(nativeBuffer, x);
		NSSwapLittleDoubleToHost_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleFloatToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleFloatToHost_FxnInst(){
		return ((NSSwapLittleFloatToHost_FxnInst != null)
	? (NSSwapLittleFloatToHost_FxnInst)
	: (NSSwapLittleFloatToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleFloatToHost", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder())));
	}

	 public float NSSwapLittleFloatToHost(final com.apple.jobjc.foundation.NSSwappedFloat x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleFloatToHost_FxnInst = get_NSSwapLittleFloatToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleFloatToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSSwappedFloat.getStructCoder().push(nativeBuffer, x);
		NSSwapLittleFloatToHost_FxnInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleIntToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleIntToHost_FxnInst(){
		return ((NSSwapLittleIntToHost_FxnInst != null)
	? (NSSwapLittleIntToHost_FxnInst)
	: (NSSwapLittleIntToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleIntToHost", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int NSSwapLittleIntToHost(final int x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleIntToHost_FxnInst = get_NSSwapLittleIntToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleIntToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, x);
		NSSwapLittleIntToHost_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleLongLongToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleLongLongToHost_FxnInst(){
		return ((NSSwapLittleLongLongToHost_FxnInst != null)
	? (NSSwapLittleLongLongToHost_FxnInst)
	: (NSSwapLittleLongLongToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleLongLongToHost", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long NSSwapLittleLongLongToHost(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleLongLongToHost_FxnInst = get_NSSwapLittleLongLongToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleLongLongToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, x);
		NSSwapLittleLongLongToHost_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleLongToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleLongToHost_FxnInst(){
		return ((NSSwapLittleLongToHost_FxnInst != null)
	? (NSSwapLittleLongToHost_FxnInst)
	: (NSSwapLittleLongToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleLongToHost", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long NSSwapLittleLongToHost(final long x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleLongToHost_FxnInst = get_NSSwapLittleLongToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleLongToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, x);
		NSSwapLittleLongToHost_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLittleShortToHost_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLittleShortToHost_FxnInst(){
		return ((NSSwapLittleShortToHost_FxnInst != null)
	? (NSSwapLittleShortToHost_FxnInst)
	: (NSSwapLittleShortToHost_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLittleShortToHost", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short NSSwapLittleShortToHost(final short x){
			final com.apple.jobjc.Invoke.FunCall NSSwapLittleShortToHost_FxnInst = get_NSSwapLittleShortToHost_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLittleShortToHost_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, x);
		NSSwapLittleShortToHost_FxnInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLong_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLong_FxnInst(){
		return ((NSSwapLong_FxnInst != null)
	? (NSSwapLong_FxnInst)
	: (NSSwapLong_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLong", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long NSSwapLong(final long inv){
			final com.apple.jobjc.Invoke.FunCall NSSwapLong_FxnInst = get_NSSwapLong_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLong_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, inv);
		NSSwapLong_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapLongLong_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapLongLong_FxnInst(){
		return ((NSSwapLongLong_FxnInst != null)
	? (NSSwapLongLong_FxnInst)
	: (NSSwapLongLong_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapLongLong", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long NSSwapLongLong(final long inv){
			final com.apple.jobjc.Invoke.FunCall NSSwapLongLong_FxnInst = get_NSSwapLongLong_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapLongLong_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, inv);
		NSSwapLongLong_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSwapShort_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSwapShort_FxnInst(){
		return ((NSSwapShort_FxnInst != null)
	? (NSSwapShort_FxnInst)
	: (NSSwapShort_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSwapShort", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short NSSwapShort(final short inv){
			final com.apple.jobjc.Invoke.FunCall NSSwapShort_FxnInst = get_NSSwapShort_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSwapShort_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, inv);
		NSSwapShort_FxnInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSTemporaryDirectory_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSTemporaryDirectory_FxnInst(){
		return ((NSTemporaryDirectory_FxnInst != null)
	? (NSTemporaryDirectory_FxnInst)
	: (NSTemporaryDirectory_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSTemporaryDirectory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSTemporaryDirectory(){
			final com.apple.jobjc.Invoke.FunCall NSTemporaryDirectory_FxnInst = get_NSTemporaryDirectory_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSTemporaryDirectory_FxnInst.init(nativeBuffer);
		NSTemporaryDirectory_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSUnionRange_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSUnionRange_FxnInst(){
		return ((NSUnionRange_FxnInst != null)
	? (NSUnionRange_FxnInst)
	: (NSUnionRange_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSUnionRange", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange NSUnionRange(final com.apple.jobjc.foundation.NSRange range1, final com.apple.jobjc.foundation.NSRange range2){
			final com.apple.jobjc.Invoke.FunCall NSUnionRange_FxnInst = get_NSUnionRange_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSUnionRange_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range1);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range2);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		NSUnionRange_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSUnionRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSUnionRect_FxnInst(){
		return ((NSUnionRect_FxnInst != null)
	? (NSUnionRect_FxnInst)
	: (NSUnionRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSUnionRect", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect NSUnionRect(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect bRect){
			final com.apple.jobjc.Invoke.FunCall NSUnionRect_FxnInst = get_NSUnionRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSUnionRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSUnionRect_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSUserName_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSUserName_FxnInst(){
		return ((NSUserName_FxnInst != null)
	? (NSUserName_FxnInst)
	: (NSUserName_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSUserName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSUserName(){
			final com.apple.jobjc.Invoke.FunCall NSUserName_FxnInst = get_NSUserName_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSUserName_FxnInst.init(nativeBuffer);
		NSUserName_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSWidth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSWidth_FxnInst(){
		return ((NSWidth_FxnInst != null)
	? (NSWidth_FxnInst)
	: (NSWidth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double NSWidth(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSWidth_FxnInst = get_NSWidth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSWidth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSWidth_FxnInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneCalloc_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneCalloc_FxnInst(){
		return ((NSZoneCalloc_FxnInst != null)
	? (NSZoneCalloc_FxnInst)
	: (NSZoneCalloc_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneCalloc", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSZoneCalloc(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone, final long numElems, final long byteSize){
			final com.apple.jobjc.Invoke.FunCall NSZoneCalloc_FxnInst = get_NSZoneCalloc_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneCalloc_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numElems);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, byteSize);
		NSZoneCalloc_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneFree_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneFree_FxnInst(){
		return ((NSZoneFree_FxnInst != null)
	? (NSZoneFree_FxnInst)
	: (NSZoneFree_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneFree", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSZoneFree(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone, final com.apple.jobjc.Pointer<Void> ptr){
			final com.apple.jobjc.Invoke.FunCall NSZoneFree_FxnInst = get_NSZoneFree_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneFree_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		NSZoneFree_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneFromPointer_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneFromPointer_FxnInst(){
		return ((NSZoneFromPointer_FxnInst != null)
	? (NSZoneFromPointer_FxnInst)
	: (NSZoneFromPointer_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneFromPointer", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> NSZoneFromPointer(final com.apple.jobjc.Pointer<Void> ptr){
			final com.apple.jobjc.Invoke.FunCall NSZoneFromPointer_FxnInst = get_NSZoneFromPointer_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneFromPointer_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		NSZoneFromPointer_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneMalloc_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneMalloc_FxnInst(){
		return ((NSZoneMalloc_FxnInst != null)
	? (NSZoneMalloc_FxnInst)
	: (NSZoneMalloc_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneMalloc", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSZoneMalloc(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone, final long size){
			final com.apple.jobjc.Invoke.FunCall NSZoneMalloc_FxnInst = get_NSZoneMalloc_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneMalloc_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		NSZoneMalloc_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneName_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneName_FxnInst(){
		return ((NSZoneName_FxnInst != null)
	? (NSZoneName_FxnInst)
	: (NSZoneName_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneName", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSZoneName(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.FunCall NSZoneName_FxnInst = get_NSZoneName_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneName_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		NSZoneName_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSZoneRealloc_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSZoneRealloc_FxnInst(){
		return ((NSZoneRealloc_FxnInst != null)
	? (NSZoneRealloc_FxnInst)
	: (NSZoneRealloc_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSZoneRealloc", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> NSZoneRealloc(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone, final com.apple.jobjc.Pointer<Void> ptr, final long size){
			final com.apple.jobjc.Invoke.FunCall NSZoneRealloc_FxnInst = get_NSZoneRealloc_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSZoneRealloc_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		NSZoneRealloc_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NXReadNSObjectFromCoder_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NXReadNSObjectFromCoder_FxnInst(){
		return ((NXReadNSObjectFromCoder_FxnInst != null)
	? (NXReadNSObjectFromCoder_FxnInst)
	: (NXReadNSObjectFromCoder_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NXReadNSObjectFromCoder", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSObject NXReadNSObjectFromCoder(final com.apple.jobjc.foundation.NSCoder decoder){
			final com.apple.jobjc.Invoke.FunCall NXReadNSObjectFromCoder_FxnInst = get_NXReadNSObjectFromCoder_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NXReadNSObjectFromCoder_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decoder);
		NXReadNSObjectFromCoder_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSObject returnValue = (com.apple.jobjc.foundation.NSObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
