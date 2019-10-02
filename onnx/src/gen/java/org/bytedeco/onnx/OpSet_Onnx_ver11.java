// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


// Iterate over schema from ai.onnx version 11
@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSet_Onnx_ver11 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OpSet_Onnx_ver11() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpSet_Onnx_ver11(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSet_Onnx_ver11(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OpSet_Onnx_ver11 position(long position) {
        return (OpSet_Onnx_ver11)super.position(position);
    }

}
