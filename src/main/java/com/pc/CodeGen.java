package com.pc;




import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.*;


import org.objectweb.asm.Opcodes;
import org.objectweb.asm.*;

/**
 * The type Code gen.
 */
///
public class CodeGen implements Opcodes {

    /**
     * Gen binary op.
     *
     * @throws Exception the exception
     */
    public static void genBinaryOp() throws Exception {

        File file = new File("asm.class");
        FileOutputStream output = new FileOutputStream(file);
        output.write(dump());
        output.close();

    }


    /**
     * Dump byte [ ].
     *
     * @return the byte [ ]
     * @throws Exception the exception
     */
    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_SUPER, "com/pc/Test", null, "java/lang/Object", null);

        cw.visitSource("App.java", null);

        {
            mv = cw.visitMethod(0, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(15, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "Lcom/pc/Test;", null, l0, l1, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "hello", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(18, l0);
            mv.visitInsn(ICONST_1);
            mv.visitVarInsn(ISTORE, 0);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitInsn(ICONST_2);
            mv.visitVarInsn(ISTORE, 1);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(19, l2);
            mv.visitVarInsn(ILOAD, 0);
            mv.visitVarInsn(ILOAD, 1);
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLineNumber(20, l3);
            mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitLdcInsn("helloworld");
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            Label l4 = new Label();
            mv.visitLabel(l4);
            mv.visitLineNumber(21, l4);
            mv.visitInsn(RETURN);
            Label l5 = new Label();
            mv.visitLabel(l5);
            mv.visitLocalVariable("a", "I", null, l1, l5, 0);
            mv.visitLocalVariable("b", "I", null, l2, l5, 1);
            mv.visitLocalVariable("c", "I", null, l3, l5, 2);
            mv.visitMaxs(2, 3);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }


}
