/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.impl.barebone.test.FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.descriptors.test.KtFe10FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.impl.base.test.fir.AbstractResolveCallTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall")
@TestDataPath("$PROJECT_ROOT")
public class Fe10ResolveCallTestGenerated extends AbstractResolveCallTest {
    @NotNull
    @Override
    public FrontendApiTestConfiguratorService getConfigurator() {
        return KtFe10FrontendApiTestConfiguratorService.INSTANCE;
    }

    @Test
    public void testAllFilesPresentInResolveCall() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationEntry.kt")
    public void testAnnotationEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationEntry.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_arrayOf.kt")
    public void testAnnotationInAnnotation_arrayOf() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_arrayOf.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_collectionLiteral.kt")
    public void testAnnotationInAnnotation_collectionLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_collectionLiteral.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_multipleAnnotations_arrayOf.kt")
    public void testAnnotationInAnnotation_multipleAnnotations_arrayOf() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_multipleAnnotations_arrayOf.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_multipleAnnotations_collectionLiteral.kt")
    public void testAnnotationInAnnotation_multipleAnnotations_collectionLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_multipleAnnotations_collectionLiteral.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_noarg.kt")
    public void testAnnotationInAnnotation_noarg() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_noarg.kt");
    }

    @Test
    @TestMetadata("annotationInAnnotation_vararg.kt")
    public void testAnnotationInAnnotation_vararg() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationInAnnotation_vararg.kt");
    }

    @Test
    @TestMetadata("annotationOnDelegate.kt")
    public void testAnnotationOnDelegate() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnDelegate.kt");
    }

    @Test
    @TestMetadata("annotationOnExpression_asT.kt")
    public void testAnnotationOnExpression_asT() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnExpression_asT.kt");
    }

    @Test
    @TestMetadata("annotationOnExpression_destructuring.kt")
    public void testAnnotationOnExpression_destructuring() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnExpression_destructuring.kt");
    }

    @Test
    @TestMetadata("annotationOnExpression_if.kt")
    public void testAnnotationOnExpression_if() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnExpression_if.kt");
    }

    @Test
    @TestMetadata("annotationOnExpression_whenBranch.kt")
    public void testAnnotationOnExpression_whenBranch() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnExpression_whenBranch.kt");
    }

    @Test
    @TestMetadata("annotationOnFile.kt")
    public void testAnnotationOnFile() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnFile.kt");
    }

    @Test
    @TestMetadata("annotationOnParameter_param.kt")
    public void testAnnotationOnParameter_param() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnParameter_param.kt");
    }

    @Test
    @TestMetadata("annotationOnParameter_parameterProperty.kt")
    public void testAnnotationOnParameter_parameterProperty() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnParameter_parameterProperty.kt");
    }

    @Test
    @TestMetadata("annotationOnParameter_reified.kt")
    public void testAnnotationOnParameter_reified() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnParameter_reified.kt");
    }

    @Test
    @TestMetadata("annotationOnParameter_setparam.kt")
    public void testAnnotationOnParameter_setparam() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnParameter_setparam.kt");
    }

    @Test
    @TestMetadata("annotationOnProperty_field.kt")
    public void testAnnotationOnProperty_field() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnProperty_field.kt");
    }

    @Test
    @TestMetadata("annotationOnProperty_get.kt")
    public void testAnnotationOnProperty_get() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnProperty_get.kt");
    }

    @Test
    @TestMetadata("annotationOnProperty_property.kt")
    public void testAnnotationOnProperty_property() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnProperty_property.kt");
    }

    @Test
    @TestMetadata("annotationOnProperty_set.kt")
    public void testAnnotationOnProperty_set() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnProperty_set.kt");
    }

    @Test
    @TestMetadata("annotationOnReceiver.kt")
    public void testAnnotationOnReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/annotationOnReceiver.kt");
    }

    @Test
    @TestMetadata("arrayOfInAnnotation.kt")
    public void testArrayOfInAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/arrayOfInAnnotation.kt");
    }

    @Test
    @TestMetadata("builderInference.kt")
    public void testBuilderInference() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/builderInference.kt");
    }

    @Test
    @TestMetadata("calleeExpressionOfImplicitInvoke.kt")
    public void testCalleeExpressionOfImplicitInvoke() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/calleeExpressionOfImplicitInvoke.kt");
    }

    @Test
    @TestMetadata("checkNotNullCall.kt")
    public void testCheckNotNullCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/checkNotNullCall.kt");
    }

    @Test
    @TestMetadata("checkNotNullCallAsCallee.kt")
    public void testCheckNotNullCallAsCallee() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/checkNotNullCallAsCallee.kt");
    }

    @Test
    @TestMetadata("comparisonCall.kt")
    public void testComparisonCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/comparisonCall.kt");
    }

    @Test
    @TestMetadata("compoundAssignOnVal.kt")
    public void testCompoundAssignOnVal() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignOnVal.kt");
    }

    @Test
    @TestMetadata("compoundAssignOnVal_lhs.kt")
    public void testCompoundAssignOnVal_lhs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignOnVal_lhs.kt");
    }

    @Test
    @TestMetadata("compoundAssignOnVar.kt")
    public void testCompoundAssignOnVar() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignOnVar.kt");
    }

    @Test
    @TestMetadata("compoundAssignOnVar_lhs.kt")
    public void testCompoundAssignOnVar_lhs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignOnVar_lhs.kt");
    }

    @Test
    @TestMetadata("compoundAssignWithArrayAccessConvention.kt")
    public void testCompoundAssignWithArrayAccessConvention() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignWithArrayAccessConvention.kt");
    }

    @Test
    @TestMetadata("compoundAssignWithArrayAccessConvention_complexReceivers.kt")
    public void testCompoundAssignWithArrayAccessConvention_complexReceivers() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignWithArrayAccessConvention_complexReceivers.kt");
    }

    @Test
    @TestMetadata("compoundAssignWithArrayAccessConvention_lhs.kt")
    public void testCompoundAssignWithArrayAccessConvention_lhs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignWithArrayAccessConvention_lhs.kt");
    }

    @Test
    @TestMetadata("compoundAssignWithArrayGetConvention.kt")
    public void testCompoundAssignWithArrayGetConvention() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignWithArrayGetConvention.kt");
    }

    @Test
    @TestMetadata("compoundAssignWithArrayGetConvention_lhs.kt")
    public void testCompoundAssignWithArrayGetConvention_lhs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/compoundAssignWithArrayGetConvention_lhs.kt");
    }

    @Test
    @TestMetadata("consecutiveImplicitInvoke1.kt")
    public void testConsecutiveImplicitInvoke1() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/consecutiveImplicitInvoke1.kt");
    }

    @Test
    @TestMetadata("consecutiveImplicitInvoke2.kt")
    public void testConsecutiveImplicitInvoke2() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/consecutiveImplicitInvoke2.kt");
    }

    @Test
    @TestMetadata("consecutiveImplicitInvoke3.kt")
    public void testConsecutiveImplicitInvoke3() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/consecutiveImplicitInvoke3.kt");
    }

    @Test
    @TestMetadata("consecutiveImplicitInvoke_callee.kt")
    public void testConsecutiveImplicitInvoke_callee() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/consecutiveImplicitInvoke_callee.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super.kt")
    public void testDelegatedConstructorCall_super() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/delegatedConstructorCall_super.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super_unresolved.kt")
    public void testDelegatedConstructorCall_super_unresolved() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/delegatedConstructorCall_super_unresolved.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this.kt")
    public void testDelegatedConstructorCall_this() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/delegatedConstructorCall_this.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this_unresolved.kt")
    public void testDelegatedConstructorCall_this_unresolved() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/delegatedConstructorCall_this_unresolved.kt");
    }

    @Test
    @TestMetadata("enumAsAnnotationValue.kt")
    public void testEnumAsAnnotationValue() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/enumAsAnnotationValue.kt");
    }

    @Test
    @TestMetadata("eqEqCall_fromAny.kt")
    public void testEqEqCall_fromAny() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/eqEqCall_fromAny.kt");
    }

    @Test
    @TestMetadata("eqEqCall_fromSuperType.kt")
    public void testEqEqCall_fromSuperType() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/eqEqCall_fromSuperType.kt");
    }

    @Test
    @TestMetadata("eqEqCall_overridden.kt")
    public void testEqEqCall_overridden() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/eqEqCall_overridden.kt");
    }

    @Test
    @TestMetadata("functionCallInTheSameFile.kt")
    public void testFunctionCallInTheSameFile() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallInTheSameFile.kt");
    }

    @Test
    @TestMetadata("functionCallWithExtensionReceiverAndTypeArgument.kt")
    public void testFunctionCallWithExtensionReceiverAndTypeArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithExtensionReceiverAndTypeArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithLambdaArgument.kt")
    public void testFunctionCallWithLambdaArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithLambdaArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithNamedArgument.kt")
    public void testFunctionCallWithNamedArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithNamedArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithNonTrailingLambdaArgument.kt")
    public void testFunctionCallWithNonTrailingLambdaArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithNonTrailingLambdaArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithSpreadArgument.kt")
    public void testFunctionCallWithSpreadArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithSpreadArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithTypeArgument.kt")
    public void testFunctionCallWithTypeArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithTypeArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithVarargArgument.kt")
    public void testFunctionCallWithVarargArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionCallWithVarargArgument.kt");
    }

    @Test
    @TestMetadata("functionTypeVariableCall_dispatchReceiver.kt")
    public void testFunctionTypeVariableCall_dispatchReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionTypeVariableCall_dispatchReceiver.kt");
    }

    @Test
    @TestMetadata("functionTypeVariableCall_extensionReceiver.kt")
    public void testFunctionTypeVariableCall_extensionReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionTypeVariableCall_extensionReceiver.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverCall.kt")
    public void testFunctionWithReceiverCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionWithReceiverCall.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverSafeCall.kt")
    public void testFunctionWithReceiverSafeCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/functionWithReceiverSafeCall.kt");
    }

    @Test
    @TestMetadata("hiddenConstructor.kt")
    public void testHiddenConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/hiddenConstructor.kt");
    }

    @Test
    @TestMetadata("hiddenDeprecated.kt")
    public void testHiddenDeprecated() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/hiddenDeprecated.kt");
    }

    @Test
    @TestMetadata("implicitConstructorDelegationCall.kt")
    public void testImplicitConstructorDelegationCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/implicitConstructorDelegationCall.kt");
    }

    @Test
    @TestMetadata("implicitConstuctorCall.kt")
    public void testImplicitConstuctorCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/implicitConstuctorCall.kt");
    }

    @Test
    @TestMetadata("implicitJavaConstuctorCall.kt")
    public void testImplicitJavaConstuctorCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/implicitJavaConstuctorCall.kt");
    }

    @Test
    @TestMetadata("indexedGet.kt")
    public void testIndexedGet() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedGet.kt");
    }

    @Test
    @TestMetadata("indexedGetWithNotEnoughArgs.kt")
    public void testIndexedGetWithNotEnoughArgs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedGetWithNotEnoughArgs.kt");
    }

    @Test
    @TestMetadata("indexedGetWithTooManyArgs.kt")
    public void testIndexedGetWithTooManyArgs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedGetWithTooManyArgs.kt");
    }

    @Test
    @TestMetadata("indexedSet.kt")
    public void testIndexedSet() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedSet.kt");
    }

    @Test
    @TestMetadata("indexedSetWithNotEnoughArgs.kt")
    public void testIndexedSetWithNotEnoughArgs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedSetWithNotEnoughArgs.kt");
    }

    @Test
    @TestMetadata("indexedSetWithTooManyArgs.kt")
    public void testIndexedSetWithTooManyArgs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/indexedSetWithTooManyArgs.kt");
    }

    @Test
    @TestMetadata("intArrayOfInAnnotation.kt")
    public void testIntArrayOfInAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/intArrayOfInAnnotation.kt");
    }

    @Test
    @TestMetadata("javaFunctionCall.kt")
    public void testJavaFunctionCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaFunctionCall.kt");
    }

    @Test
    @TestMetadata("javaPropertyGetter.kt")
    public void testJavaPropertyGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertyGetter.kt");
    }

    @Test
    @TestMetadata("javaPropertyGetter_unqualified.kt")
    public void testJavaPropertyGetter_unqualified() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertyGetter_unqualified.kt");
    }

    @Test
    @TestMetadata("javaPropertyNestedGetter.kt")
    public void testJavaPropertyNestedGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertyNestedGetter.kt");
    }

    @Test
    @TestMetadata("javaPropertySetter.kt")
    public void testJavaPropertySetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertySetter.kt");
    }

    @Test
    @TestMetadata("javaPropertySetterIncomplete.kt")
    public void testJavaPropertySetterIncomplete() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertySetterIncomplete.kt");
    }

    @Test
    @TestMetadata("javaPropertySetter_unqualified.kt")
    public void testJavaPropertySetter_unqualified() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/javaPropertySetter_unqualified.kt");
    }

    @Test
    @TestMetadata("kotlinPropertyGetter.kt")
    public void testKotlinPropertyGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/kotlinPropertyGetter.kt");
    }

    @Test
    @TestMetadata("kotlinPropertyGetter_unqualified.kt")
    public void testKotlinPropertyGetter_unqualified() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/kotlinPropertyGetter_unqualified.kt");
    }

    @Test
    @TestMetadata("kotlinPropertyNestedGetter.kt")
    public void testKotlinPropertyNestedGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/kotlinPropertyNestedGetter.kt");
    }

    @Test
    @TestMetadata("kotlinPropertySetter.kt")
    public void testKotlinPropertySetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/kotlinPropertySetter.kt");
    }

    @Test
    @TestMetadata("kotlinPropertySetter_unqualified.kt")
    public void testKotlinPropertySetter_unqualified() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/kotlinPropertySetter_unqualified.kt");
    }

    @Test
    @TestMetadata("memberFunctionCallWithTypeArgument.kt")
    public void testMemberFunctionCallWithTypeArgument() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/memberFunctionCallWithTypeArgument.kt");
    }

    @Test
    @TestMetadata("postfixUnaryOperatorOnVar.kt")
    public void testPostfixUnaryOperatorOnVar() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/postfixUnaryOperatorOnVar.kt");
    }

    @Test
    @TestMetadata("postfixUnaryOperatorOnVar_base.kt")
    public void testPostfixUnaryOperatorOnVar_base() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/postfixUnaryOperatorOnVar_base.kt");
    }

    @Test
    @TestMetadata("postfixUnaryOperatorWithArrayAccessConvention.kt")
    public void testPostfixUnaryOperatorWithArrayAccessConvention() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/postfixUnaryOperatorWithArrayAccessConvention.kt");
    }

    @Test
    @TestMetadata("postfixUnaryOperatorWithArrayAccessConvention_base.kt")
    public void testPostfixUnaryOperatorWithArrayAccessConvention_base() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/postfixUnaryOperatorWithArrayAccessConvention_base.kt");
    }

    @Test
    @TestMetadata("postfixUnaryOperatorWithArrayAccessConvention_complexDispatcher.kt")
    public void testPostfixUnaryOperatorWithArrayAccessConvention_complexDispatcher() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/postfixUnaryOperatorWithArrayAccessConvention_complexDispatcher.kt");
    }

    @Test
    @TestMetadata("prefixUnaryOperatorOnVar.kt")
    public void testPrefixUnaryOperatorOnVar() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/prefixUnaryOperatorOnVar.kt");
    }

    @Test
    @TestMetadata("prefixUnaryOperatorOnVar_base.kt")
    public void testPrefixUnaryOperatorOnVar_base() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/prefixUnaryOperatorOnVar_base.kt");
    }

    @Test
    @TestMetadata("prefixUnaryOperatorWithArrayAccessConvention.kt")
    public void testPrefixUnaryOperatorWithArrayAccessConvention() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/prefixUnaryOperatorWithArrayAccessConvention.kt");
    }

    @Test
    @TestMetadata("prefixUnaryOperatorWithArrayAccessConvention_base.kt")
    public void testPrefixUnaryOperatorWithArrayAccessConvention_base() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/prefixUnaryOperatorWithArrayAccessConvention_base.kt");
    }

    @Test
    @TestMetadata("prefixUnaryOperatorWithArrayAccessConvention_complexDispatcher.kt")
    public void testPrefixUnaryOperatorWithArrayAccessConvention_complexDispatcher() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/prefixUnaryOperatorWithArrayAccessConvention_complexDispatcher.kt");
    }

    @Test
    @TestMetadata("privateMember.kt")
    public void testPrivateMember() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/privateMember.kt");
    }

    @Test
    @TestMetadata("qualifiedCalleeExpressionOfImplicitInvoke.kt")
    public void testQualifiedCalleeExpressionOfImplicitInvoke() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/qualifiedCalleeExpressionOfImplicitInvoke.kt");
    }

    @Test
    @TestMetadata("resolveCallInSuperConstructorParam.kt")
    public void testResolveCallInSuperConstructorParam() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/resolveCallInSuperConstructorParam.kt");
    }

    @Test
    @TestMetadata("samConstructorCall.kt")
    public void testSamConstructorCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/samConstructorCall.kt");
    }

    @Test
    @TestMetadata("simpleCallWithNonMatchingArgs.kt")
    public void testSimpleCallWithNonMatchingArgs() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/simpleCallWithNonMatchingArgs.kt");
    }

    @Test
    @TestMetadata("smartCastExplicitDispatchReceiver.kt")
    public void testSmartCastExplicitDispatchReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/smartCastExplicitDispatchReceiver.kt");
    }

    @Test
    @TestMetadata("smartCastExplicitExtensionReceiver.kt")
    public void testSmartCastExplicitExtensionReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/smartCastExplicitExtensionReceiver.kt");
    }

    @Test
    @TestMetadata("smartCastImplicitDispatchReceiver.kt")
    public void testSmartCastImplicitDispatchReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/smartCastImplicitDispatchReceiver.kt");
    }

    @Test
    @TestMetadata("smartCastImplicitExtensionReceiver.kt")
    public void testSmartCastImplicitExtensionReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/smartCastImplicitExtensionReceiver.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_elvis_1.kt")
    public void testUnresolvableOperator_elvis_1() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_elvis_1.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_elvis_2.kt")
    public void testUnresolvableOperator_elvis_2() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_elvis_2.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_eqeqeq_1.kt")
    public void testUnresolvableOperator_eqeqeq_1() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_eqeqeq_1.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_eqeqeq_2.kt")
    public void testUnresolvableOperator_eqeqeq_2() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_eqeqeq_2.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_excleqeq_1.kt")
    public void testUnresolvableOperator_excleqeq_1() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_excleqeq_1.kt");
    }

    @Test
    @TestMetadata("unresolvableOperator_excleqeq_2.kt")
    public void testUnresolvableOperator_excleqeq_2() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvableOperator_excleqeq_2.kt");
    }

    @Test
    @TestMetadata("unresolvedSuperReference.kt")
    public void testUnresolvedSuperReference() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/unresolvedSuperReference.kt");
    }

    @Test
    @TestMetadata("variableAsFunction.kt")
    public void testVariableAsFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunction.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionLikeCall.kt")
    public void testVariableAsFunctionLikeCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionLikeCall.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterName.kt")
    public void testVariableAsFunctionWithParameterName() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterName.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameAnnotation.kt")
    public void testVariableAsFunctionWithParameterNameAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameAnnotation.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameAnnotationConflict.kt")
    public void testVariableAsFunctionWithParameterNameAnnotationConflict() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameAnnotationConflict.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameAnnotationConflict2.kt")
    public void testVariableAsFunctionWithParameterNameAnnotationConflict2() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameAnnotationConflict2.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameGeneric.kt")
    public void testVariableAsFunctionWithParameterNameGeneric() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameGeneric.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameInNonFunctionType.kt")
    public void testVariableAsFunctionWithParameterNameInNonFunctionType() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameInNonFunctionType.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionWithParameterNameMixed.kt")
    public void testVariableAsFunctionWithParameterNameMixed() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableAsFunctionWithParameterNameMixed.kt");
    }

    @Test
    @TestMetadata("variableWithExtensionInvoke.kt")
    public void testVariableWithExtensionInvoke() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableWithExtensionInvoke.kt");
    }

    @Test
    @TestMetadata("variableWithInvokeFunctionCall_dispatchReceiver.kt")
    public void testVariableWithInvokeFunctionCall_dispatchReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableWithInvokeFunctionCall_dispatchReceiver.kt");
    }

    @Test
    @TestMetadata("variableWithInvokeFunctionCall_extensionReceiver.kt")
    public void testVariableWithInvokeFunctionCall_extensionReceiver() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableWithInvokeFunctionCall_extensionReceiver.kt");
    }

    @Test
    @TestMetadata("variableWithMemberInvoke.kt")
    public void testVariableWithMemberInvoke() throws Exception {
        runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/variableWithMemberInvoke.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/assignments")
    @TestDataPath("$PROJECT_ROOT")
    public class Assignments {
        @Test
        public void testAllFilesPresentInAssignments() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/assignments"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("insidePlusAssignTarget.kt")
        public void testInsidePlusAssignTarget() throws Exception {
            runTest("analysis/analysis-api/testData/components/callResolver/resolveCall/assignments/insidePlusAssignTarget.kt");
        }
    }
}
