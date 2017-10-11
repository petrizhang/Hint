// Generated from /home/zeta/IdeaProjects/hint/antlr/Hint.g4 by ANTLR 4.7
package com.pc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HintParser}.
 */
public interface HintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HintParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HintParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HintParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HintParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HintParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(HintParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(HintParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(HintParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(HintParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(HintParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(HintParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(HintParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(HintParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(HintParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(HintParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(HintParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(HintParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(HintParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(HintParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(HintParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(HintParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(HintParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(HintParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(HintParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(HintParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(HintParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(HintParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(HintParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(HintParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(HintParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(HintParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(HintParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(HintParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(HintParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(HintParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(HintParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(HintParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(HintParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(HintParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(HintParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(HintParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(HintParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(HintParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(HintParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(HintParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(HintParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(HintParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(HintParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(HintParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(HintParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(HintParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(HintParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(HintParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(HintParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(HintParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(HintParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(HintParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(HintParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(HintParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(HintParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(HintParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(HintParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(HintParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(HintParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(HintParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(HintParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(HintParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(HintParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(HintParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(HintParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(HintParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(HintParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(HintParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(HintParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(HintParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(HintParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(HintParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(HintParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(HintParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(HintParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(HintParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(HintParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(HintParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(HintParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(HintParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(HintParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(HintParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(HintParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(HintParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(HintParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(HintParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(HintParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(HintParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(HintParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(HintParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(HintParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(HintParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(HintParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(HintParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(HintParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(HintParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(HintParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(HintParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(HintParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(HintParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(HintParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(HintParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(HintParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(HintParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(HintParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(HintParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(HintParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(HintParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(HintParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(HintParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(HintParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(HintParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(HintParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(HintParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(HintParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(HintParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(HintParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(HintParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(HintParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(HintParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(HintParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(HintParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(HintParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(HintParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(HintParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(HintParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(HintParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(HintParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(HintParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(HintParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(HintParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(HintParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(HintParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(HintParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(HintParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(HintParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(HintParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(HintParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(HintParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(HintParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(HintParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(HintParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(HintParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(HintParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(HintParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(HintParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(HintParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(HintParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(HintParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(HintParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(HintParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(HintParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(HintParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(HintParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(HintParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(HintParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(HintParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(HintParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(HintParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(HintParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(HintParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(HintParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(HintParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(HintParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(HintParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(HintParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(HintParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(HintParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(HintParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(HintParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(HintParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(HintParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(HintParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(HintParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(HintParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(HintParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(HintParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(HintParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(HintParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(HintParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(HintParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(HintParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(HintParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(HintParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(HintParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(HintParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(HintParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(HintParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(HintParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(HintParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(HintParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(HintParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(HintParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(HintParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(HintParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(HintParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(HintParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(HintParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(HintParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(HintParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(HintParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(HintParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(HintParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(HintParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(HintParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(HintParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(HintParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(HintParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(HintParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(HintParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(HintParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(HintParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(HintParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(HintParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(HintParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(HintParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(HintParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(HintParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(HintParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(HintParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(HintParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(HintParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(HintParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(HintParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(HintParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(HintParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(HintParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(HintParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(HintParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(HintParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(HintParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(HintParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(HintParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(HintParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(HintParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(HintParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(HintParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(HintParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(HintParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(HintParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(HintParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(HintParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(HintParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(HintParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HintParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HintParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(HintParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(HintParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(HintParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(HintParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(HintParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(HintParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(HintParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(HintParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HintParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HintParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(HintParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(HintParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(HintParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(HintParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(HintParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(HintParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(HintParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(HintParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(HintParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(HintParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(HintParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(HintParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(HintParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(HintParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(HintParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(HintParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(HintParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(HintParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(HintParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(HintParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(HintParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(HintParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(HintParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(HintParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(HintParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(HintParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(HintParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(HintParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(HintParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(HintParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(HintParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(HintParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(HintParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(HintParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(HintParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(HintParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(HintParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(HintParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(HintParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(HintParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(HintParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(HintParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(HintParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(HintParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(HintParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(HintParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(HintParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(HintParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(HintParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(HintParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(HintParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(HintParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(HintParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(HintParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(HintParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(HintParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(HintParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(HintParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(HintParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(HintParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(HintParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(HintParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(HintParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(HintParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(HintParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(HintParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(HintParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(HintParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(HintParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(HintParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(HintParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(HintParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(HintParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(HintParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(HintParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(HintParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(HintParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(HintParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(HintParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(HintParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(HintParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(HintParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(HintParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(HintParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(HintParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(HintParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(HintParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(HintParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HintParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HintParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(HintParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(HintParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(HintParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(HintParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(HintParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(HintParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(HintParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(HintParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(HintParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(HintParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(HintParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(HintParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(HintParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(HintParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(HintParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(HintParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(HintParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(HintParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(HintParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(HintParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(HintParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(HintParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(HintParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(HintParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(HintParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(HintParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(HintParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(HintParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(HintParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(HintParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(HintParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(HintParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(HintParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(HintParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(HintParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(HintParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(HintParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(HintParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(HintParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(HintParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(HintParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(HintParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(HintParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(HintParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(HintParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(HintParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(HintParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(HintParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(HintParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(HintParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HintParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HintParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#linqExpression}.
	 * @param ctx the parse tree
	 */
	void enterLinqExpression(HintParser.LinqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#linqExpression}.
	 * @param ctx the parse tree
	 */
	void exitLinqExpression(HintParser.LinqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(HintParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(HintParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(HintParser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(HintParser.Query_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(HintParser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(HintParser.Query_body_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(HintParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(HintParser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(HintParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(HintParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(HintParser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(HintParser.Combined_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(HintParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(HintParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(HintParser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(HintParser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(HintParser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(HintParser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(HintParser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(HintParser.Query_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(HintParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(HintParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(HintParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(HintParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(HintParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(HintParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(HintParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(HintParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(HintParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(HintParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HintParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HintParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(HintParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(HintParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(HintParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(HintParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(HintParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(HintParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(HintParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(HintParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(HintParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(HintParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(HintParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(HintParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(HintParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(HintParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(HintParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(HintParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(HintParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(HintParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(HintParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(HintParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(HintParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(HintParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(HintParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(HintParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(HintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(HintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(HintParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(HintParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(HintParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(HintParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(HintParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(HintParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(HintParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(HintParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(HintParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(HintParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(HintParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(HintParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(HintParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(HintParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(HintParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(HintParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(HintParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(HintParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HintParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(HintParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HintParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(HintParser.CastExpressionContext ctx);
}