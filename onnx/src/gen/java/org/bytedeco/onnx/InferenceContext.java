// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class InferenceContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InferenceContext(Pointer p) { super(p); }

  public native @Const AttributeProto getAttribute(@StdString BytePointer name);
  public native @Const AttributeProto getAttribute(@StdString String name);
  public native @Cast("size_t") long getNumInputs();
  public native @Const TypeProto getInputType(@Cast("size_t") long index);
  public native @Const TensorProto getInputData(@Cast("size_t") long index);
  public native @Cast("size_t") long getNumOutputs();
  public native TypeProto getOutputType(@Cast("size_t") long index);
}
