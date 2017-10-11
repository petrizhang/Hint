// Generated from /home/zeta/IdeaProjects/hint/antlr/Hint.g4 by ANTLR 4.7
package com.pc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HintParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HintParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HintParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HintParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(HintParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(HintParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(HintParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(HintParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(HintParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(HintParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(HintParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(HintParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(HintParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(HintParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(HintParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(HintParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(HintParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(HintParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(HintParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(HintParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(HintParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(HintParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(HintParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(HintParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(HintParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(HintParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(HintParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(HintParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(HintParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(HintParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(HintParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(HintParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(HintParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(HintParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(HintParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(HintParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(HintParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(HintParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(HintParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(HintParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(HintParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(HintParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(HintParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(HintParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(HintParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(HintParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(HintParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(HintParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(HintParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(HintParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(HintParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(HintParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(HintParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(HintParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(HintParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(HintParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(HintParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(HintParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(HintParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(HintParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(HintParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(HintParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(HintParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(HintParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(HintParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(HintParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(HintParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(HintParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(HintParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(HintParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(HintParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(HintParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(HintParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(HintParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(HintParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(HintParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(HintParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(HintParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(HintParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(HintParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(HintParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(HintParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(HintParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(HintParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(HintParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(HintParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(HintParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(HintParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(HintParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(HintParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(HintParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(HintParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(HintParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(HintParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(HintParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(HintParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(HintParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(HintParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(HintParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(HintParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(HintParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(HintParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(HintParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(HintParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(HintParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(HintParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(HintParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(HintParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(HintParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(HintParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(HintParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(HintParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(HintParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(HintParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(HintParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(HintParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(HintParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(HintParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(HintParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(HintParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(HintParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(HintParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(HintParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(HintParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(HintParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(HintParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(HintParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HintParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(HintParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(HintParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(HintParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(HintParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HintParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(HintParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(HintParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(HintParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(HintParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(HintParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(HintParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(HintParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(HintParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(HintParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(HintParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(HintParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(HintParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(HintParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(HintParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(HintParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(HintParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(HintParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(HintParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(HintParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(HintParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(HintParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(HintParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(HintParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(HintParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(HintParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(HintParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(HintParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(HintParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(HintParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(HintParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(HintParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(HintParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(HintParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(HintParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(HintParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(HintParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(HintParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(HintParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(HintParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(HintParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(HintParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(HintParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(HintParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(HintParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(HintParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(HintParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(HintParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(HintParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(HintParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(HintParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(HintParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(HintParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(HintParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(HintParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(HintParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(HintParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(HintParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(HintParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(HintParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(HintParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(HintParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(HintParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(HintParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(HintParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(HintParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(HintParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(HintParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(HintParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(HintParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(HintParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(HintParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(HintParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HintParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#linqExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinqExpression(HintParser.LinqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(HintParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#query_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body(HintParser.Query_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#query_body_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body_clause(HintParser.Query_body_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#let_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_clause(HintParser.Let_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(HintParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#combined_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_join_clause(HintParser.Combined_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(HintParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering(HintParser.OrderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#select_or_group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_group_clause(HintParser.Select_or_group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#query_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_continuation(HintParser.Query_continuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(HintParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(HintParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(HintParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(HintParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(HintParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HintParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(HintParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(HintParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(HintParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(HintParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(HintParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(HintParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(HintParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(HintParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(HintParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(HintParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(HintParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(HintParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(HintParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(HintParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(HintParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(HintParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(HintParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(HintParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(HintParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(HintParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(HintParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(HintParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HintParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(HintParser.CastExpressionContext ctx);
}