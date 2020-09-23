// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the preparer/AbstractBatchPreparerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.preparer;

import com.linkedin.dagli.transformer.PreparedTransformer7;


/**
 * A common abstract base class that {@link Preparer}s prepared using {@link PreparerMode#BATCH} mode are highly
 * encouraged to extend.  Besides simplifying the code and improving readability, this also helps insulate the derived
 * class's implementation from future changes in the Dagli Framework.
 *
 * @param <A> the type of the first input
 * @param <B> the type of the second input
 * @param <C> the type of the third input
 * @param <D> the type of the fourth input
 * @param <E> the type of the fifth input
 * @param <F> the type of the sixth input
 * @param <G> the type of the seventh input
 * @param <R> result type of the transformer prepared by this preparer
 * @param <N> the type of {@link com.linkedin.dagli.transformer.PreparedTransformer} prepared by this preparer
 */
public abstract class AbstractBatchPreparer7<A, B, C, D, E, F, G, R, N extends PreparedTransformer7<A, B, C, D, E, F, G, R>>
    extends AbstractPreparer7<A, B, C, D, E, F, G, R, N> {

  @Override
  public final PreparerMode getMode() {
    return PreparerMode.BATCH;
  }
}