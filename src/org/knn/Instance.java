package org.knn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project K-Nearest-Neighbors
 * Created by Francis on 20/03/15.
 * <p/>
 * A Instance<T> represents a list of Features which are used
 * to categorise the instance.
 */
public class Instance<T> {

    /**
     * The category which has been assigned to this instance after analysis
     */
    public T category = null;

    /**
     * The sum of the features with the same @category
     */
    public int distance = 0;

    /**
     * A list of {@link Feature} which are associated with this {@link Instance}
     */
    public final List<Feature<T>> features = new ArrayList<>();

    /**
     * a {@link HashMap} of attributes that represent this {@link Instance}
     */
    public final Map<String, Double> attributes;

    /**
     * Constructs a new {@link Instance}
     *
     * @param attributes the attributes that represent this feature
     */
    public Instance(final Map<String, Double> attributes) {
        this.attributes = attributes;
    }
}
