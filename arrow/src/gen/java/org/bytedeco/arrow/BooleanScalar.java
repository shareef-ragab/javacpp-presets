// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace internal

@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BooleanScalar extends Scalar {
    static { Loader.load(); }
    /** Default native constructor. */
    public BooleanScalar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BooleanScalar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BooleanScalar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BooleanScalar position(long position) {
        return (BooleanScalar)super.position(position);
    }

}