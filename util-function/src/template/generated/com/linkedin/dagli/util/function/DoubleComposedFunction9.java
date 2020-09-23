// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/ComposedFunction.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import java.util.Objects;


/**
 * A function class implementing {@link DoubleFunction9.Serializable} that composes
 * {@link DoubleFunction9} with a {@link Function1}.  The function is only <strong>actually</strong> serializable
 * if its constituent composed functions are serializable, of course.
 */
class DoubleComposedFunction9<A, B, C, D, E, F, G, H, I, Q> implements
    DoubleFunction9.Serializable<A, B, C, D, E, F, G, H, I> {
  private static final long serialVersionUID = 1;

  private final Function9<A, B, C, D, E, F, G, H, I, Q> _first;
  private final DoubleFunction1<? super Q> _andThen;

  /**
   * Creates a new instance that composes two functions, i.e. {@code andThen(first(inputs))}.
   *
   * @param first the first function to be called in the composition
   * @param andThen the second function to be called in the composition, accepting the {@code first} functions result
   *                as input
   */
  DoubleComposedFunction9(Function9<A, B, C, D, E, F, G, H, I, Q> first, DoubleFunction1<? super Q> andThen) {
    _first = first;
    _andThen = andThen;
  }

  @Override
  @SuppressWarnings("unchecked")
  public DoubleComposedFunction9<A, B, C, D, E, F, G, H, I, Q> safelySerializable() {
    return new DoubleComposedFunction9<>(
        ((Function9.Serializable<A, B, C, D, E, F, G, H, I, Q>) _first).safelySerializable(),
        ((DoubleFunction1.Serializable<? super Q>) _andThen).safelySerializable());
  }

  @Override
  public double apply(A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8, I value9) {
    return _andThen.apply(_first.apply(value1, value2, value3, value4, value5, value6, value7, value8, value9));
  }

  @Override
  public int hashCode() {
    return Objects.hash(DoubleComposedFunction9.class, _first, _andThen);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof DoubleComposedFunction9) {
      return this._first.equals(((DoubleComposedFunction9) obj)._first)
          && this._andThen.equals(((DoubleComposedFunction9) obj)._andThen);
    }
    return false;
  }
}