package com.pc;

import java.util.HashMap;

interface ClassQualifiers {
    int ABSTRACT = 0b1;
    int FINAL = 0b10;
    int PUBLIC = 0b100;
    int DEFAULT = 0b1000;
}

/// 成员变量修饰符
interface FieldQualifiers {
    int STATIC = 0b10;
    int FINAL = 0b100;

    int PUBLIC = 0b1000;
    int PROTECTED = 0b10000;
    int DEFAULT = 0b100000;
    int PRIVATE = 0b1000000;


    int VOLATILE = 0b10000000;
    int TRANSIENT = 0b100000000;
}

/// 方法修饰符
interface MethodQualifiers {
    int STATIC = 0b1;
    int FINAL = 0b10;

    int PUBLIC = 0b100;
    int PROTECTED = 0b1000;
    int DEFAULT = 0b10000;
    int PRIVATE = 0b100000;

    int ABSTRACT = 0b1;

    int SYNCHRONIZE = 0b100000;
    int NATIVE = 0b1000000;
}

class ArgInfo {
    String name;
    String fullClassName;
}

enum MemberAccessLevel {
    PUBLIC, DEFAULT, PROTECTED, PRIVATE
}

abstract class MemberInfo {
    public MemberInfo(String name,
                      String fullClassName,
                      MemberAccessLevel accessLevel) {
        this.name = name;
        this.fullClassName = fullClassName;
        this.accessLevel = accessLevel;
    }

    protected String name = "<none>";
    /// class name, must be full path
    protected String fullClassName = "<none>";
    protected MemberAccessLevel accessLevel = MemberAccessLevel.DEFAULT;

    protected Boolean _isStatic = false;
    protected Boolean _isFinal = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullClassName() {
        return fullClassName;
    }

    public void setFullClassName(String fullClassName) {
        this.fullClassName = fullClassName;
    }

    public Boolean isStatic() {
        return _isStatic;
    }

    public void setStatic(Boolean _isStatic) {
        this._isStatic = _isStatic;
    }

    public Boolean isFinal() {
        return _isFinal;
    }

    public void setFinal(Boolean _isFinal) {
        this._isFinal = _isFinal;
    }

    public MemberAccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(MemberAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    abstract public Boolean isMethod();

    abstract public Boolean isField();
}

class FieldInfo extends MemberInfo {
    public FieldInfo(String name,
                     String fullClassName,
                     MemberAccessLevel accessLevel) {
        super(name, fullClassName, accessLevel);
    }

    private Boolean _isVolatile = false;
    private Boolean _isTransient = false;

    @Override
    public Boolean isMethod() {
        return false;
    }

    @Override
    public Boolean isField() {
        return true;
    }

    public Boolean isVolatile() {
        return _isVolatile;
    }

    public void setVolatile(Boolean _isVolatile) {
        this._isVolatile = _isVolatile;
    }

    public Boolean isTransient() {
        return _isTransient;
    }

    public void setTransient(Boolean _isTransient) {
        this._isTransient = _isTransient;
    }
}

class MethodInfo extends MemberInfo {
    public MethodInfo(String name,
                      String fullClassName,
                      MemberAccessLevel accessLevel,
                      ArgInfo[] args) {
        super(name, fullClassName, accessLevel);
        this.args = args;
    }

    private Boolean _isAbstract = false;
    private Boolean _isSynchronize = false;
    private Boolean _isNative = false;

    private ArgInfo[] args = {};

    @Override
    public Boolean isMethod() {
        return true;
    }

    @Override
    public Boolean isField() {
        return false;
    }

    public Boolean isAbstract() {
        return _isAbstract;
    }

    public void setAbstract(Boolean anAbstract) {
        _isAbstract = anAbstract;
    }

    public Boolean isSynchronize() {
        return _isSynchronize;
    }

    public void setSynchronize(Boolean synchronize) {
        _isSynchronize = synchronize;
    }

    public Boolean isNative() {
        return _isNative;
    }

    public void setNative(Boolean aNative) {
        _isNative = aNative;
    }

    public ArgInfo[] getArgs() {
        return args;
    }

    public void setArgs(ArgInfo[] args) {
        this.args = args;
    }

    public int argLength() {
        return args.length;
    }
}

/// used for compile time checking
public class ClassInfo {
    HashMap<String, FieldInfo> staticFields;
    HashMap<String, MethodInfo> staticMethods;
    HashMap<String, FieldInfo> normalFields;
    HashMap<String, MethodInfo> normalMethods;

    void addField(FieldInfo fieldInfo) {
        // 如果是静态成员
        if (fieldInfo.isStatic()) {
            staticFields.put(fieldInfo.getName(), fieldInfo);
            return;
        }
        // 非静态成员
        normalFields.put(fieldInfo.getName(), fieldInfo);
    }

    void addMethod(MethodInfo methodInfo) {
        // 如果是静态成员
        if (methodInfo.isStatic()) {
            staticMethods.put(methodInfo.getName(), methodInfo);
            return;
        }
        // 非静态成员
        normalMethods.put(methodInfo.getName(), methodInfo);
    }

    FieldInfo getStaticField(String name) {
        return staticFields.get(name);
    }

    FieldInfo getNornamlField(String name) {
        return normalFields.get(name);
    }

    FieldInfo getField(String name) {
        // 先寻找普通成员
        FieldInfo f = normalFields.get(name);
        if (f != null) {
            return f;
        }
        // 再寻找静态成员
        return staticFields.get(name);
    }

    MethodInfo getStaticMethod(String name) {
        return staticMethods.get(name);
    }

    MethodInfo getNormalMethod(String name) {
        return normalMethods.get(name);
    }

    MethodInfo getMethod(String name) {
        // 先寻找普通成员
        MethodInfo m = normalMethods.get(name);
        if (m != null) {
            return m;
        }
        // 再寻找静态成员
        return staticMethods.get(name);
    }

    MemberInfo getStaticMember(String name) {
        // 先寻找成员变量
        MemberInfo member = staticFields.get(name);
        if (member != null) {
            return member;
        }
        // 再寻找成员方法
        return staticMethods.get(name);
    }

    MemberInfo getNormalMember(String name) {
        // 先寻找成员变量
        MemberInfo member = normalFields.get(name);
        if (member != null) {
            return member;
        }
        // 再寻找成员方法
        return normalMethods.get(name);
    }

    MemberInfo getMember(String name) {
        // 先寻找非静态成员
        MemberInfo normalMember = getNormalMember(name);
        if (normalMember != null) {
            return normalMember;
        }
        // 再寻找静态成员
        return getStaticMember(name);
    }
}



