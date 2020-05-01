// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Perform a quantized matrix multiplication of  {@code a} by the matrix {@code b} with bias
 *  add and relu and requantize fusion.
 * 
 *  The inputs must be two-dimensional matrices and 1D bias vector. And the inner
 *  dimension of {@code a} (after being transposed if {@code transpose_a} is non-zero) must
 *  match the outer dimension of {@code b} (after being transposed if {@code transposed_b} is
 *  non-zero). Then do broadcast add operation with bias values on the matrix
 *  mulplication result. The bias size must match inner dimension of {@code b}.  Then do
 *  relu activation to get non-negative result. Then do requantize operation to get
 *  final uint8 result.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * a: A matrix to be multiplied. Must be a two-dimensional tensor of type {@code quint8}.
 *  * b: A matrix to be multiplied and must be a two-dimensional tensor of type {@code qint8}.
 *  * bias: A 1D bias tensor with size matching with inner dimension of {@code b} (after being
 *  transposed if {@code transposed_b} is non-zero).
 *  * min_a: The float value that the lowest quantized {@code a} value represents.
 *  * max_a: The float value that the highest quantized {@code a} value represents.
 *  * min_b: The float value that the lowest quantized {@code b} value represents.
 *  * max_b: The float value that the highest quantized {@code b} value represents.
 *  * min_freezed_output: The float value that the highest quantized output value after requantize.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * transpose_a: If true, {@code a} is transposed before multiplication.
 *  * transpose_b: If true, {@code b} is transposed before multiplication.
 *  * input_quant_mode: Input data quantization mode. Either MIN_FIRST(default) or SCALED.
 * 
 *  Returns:
 *  * {@code Output} out
 *  * {@code Output} min_out: The float value that the lowest quantized output value represents.
 *  * {@code Output} max_out: The float value that the highest quantized output value represents. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedMatMulWithBiasAndReluAndRequantize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedMatMulWithBiasAndReluAndRequantize(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedMatMulWithBiasAndReluAndRequantize */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to DT_QUINT8 */
    
    ///
    public native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);

    /** If true, {@code a} is transposed before multiplication.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TransposeA(@Cast("bool") boolean x);

    /** If true, {@code b} is transposed before multiplication.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs TransposeB(@Cast("bool") boolean x);

    /** Input data quantization mode. Either MIN_FIRST(default) or SCALED.
     * 
     *  Defaults to "MIN_FIRST" */
    public native @ByVal Attrs InputQuantMode(@StringPiece BytePointer x);
    public native @ByVal Attrs InputQuantMode(@StringPiece String x);

    public native @Cast("tensorflow::DataType") int Toutput_(); public native Attrs Toutput_(int setter);
    public native @Cast("bool") boolean transpose_a_(); public native Attrs transpose_a_(boolean setter);
    public native @Cast("bool") boolean transpose_b_(); public native Attrs transpose_b_(boolean setter);
    public native @StringPiece BytePointer input_quant_mode_(); public native Attrs input_quant_mode_(BytePointer setter);
  }
  public QuantizedMatMulWithBiasAndReluAndRequantize(@Const @ByRef Scope scope,
                                              @ByVal Input a,
                                              @ByVal Input b,
                                              @ByVal Input bias,
                                              @ByVal Input min_a,
                                              @ByVal Input max_a,
                                              @ByVal Input min_b,
                                              @ByVal Input max_b,
                                              @ByVal Input min_freezed_output,
                                              @ByVal Input max_freezed_output) { super((Pointer)null); allocate(scope, a, b, bias, min_a, max_a, min_b, max_b, min_freezed_output, max_freezed_output); }
  private native void allocate(@Const @ByRef Scope scope,
                                              @ByVal Input a,
                                              @ByVal Input b,
                                              @ByVal Input bias,
                                              @ByVal Input min_a,
                                              @ByVal Input max_a,
                                              @ByVal Input min_b,
                                              @ByVal Input max_b,
                                              @ByVal Input min_freezed_output,
                                              @ByVal Input max_freezed_output);
  public QuantizedMatMulWithBiasAndReluAndRequantize(@Const @ByRef Scope scope,
                                              @ByVal Input a,
                                              @ByVal Input b,
                                              @ByVal Input bias,
                                              @ByVal Input min_a,
                                              @ByVal Input max_a,
                                              @ByVal Input min_b,
                                              @ByVal Input max_b,
                                              @ByVal Input min_freezed_output,
                                              @ByVal Input max_freezed_output, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, a, b, bias, min_a, max_a, min_b, max_b, min_freezed_output, max_freezed_output, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                              @ByVal Input a,
                                              @ByVal Input b,
                                              @ByVal Input bias,
                                              @ByVal Input min_a,
                                              @ByVal Input max_a,
                                              @ByVal Input min_b,
                                              @ByVal Input max_b,
                                              @ByVal Input min_freezed_output,
                                              @ByVal Input max_freezed_output, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);
  public static native @ByVal Attrs TransposeA(@Cast("bool") boolean x);
  public static native @ByVal Attrs TransposeB(@Cast("bool") boolean x);
  public static native @ByVal Attrs InputQuantMode(@StringPiece BytePointer x);
  public static native @ByVal Attrs InputQuantMode(@StringPiece String x);

  public native @ByRef Operation operation(); public native QuantizedMatMulWithBiasAndReluAndRequantize operation(Operation setter);
  public native @ByRef Output out(); public native QuantizedMatMulWithBiasAndReluAndRequantize out(Output setter);
  public native @ByRef Output min_out(); public native QuantizedMatMulWithBiasAndReluAndRequantize min_out(Output setter);
  public native @ByRef Output max_out(); public native QuantizedMatMulWithBiasAndReluAndRequantize max_out(Output setter);
}