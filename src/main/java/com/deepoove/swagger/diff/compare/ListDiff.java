package com.deepoove.swagger.diff.compare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.BiFunction;
import com.google.common.collect.Lists;

/**
 * compare two Lists
 *
 * @author Sayi
 * @version
 */
public class ListDiff<K> {

    private List<K> increased;

    private List<K> missing;

    private Map<K, K> shared;

    private ListDiff() {
        this.shared = new HashMap<>();
    }

    public static <K> ListDiff<K> diff(List<K> left, List<K> right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param left
     * @param right
     * @param biFunc
     *            if right List contains left element
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <K> ListDiff<K> diff(List<K> left, List<K> right, BiFunction<List<K>, K, K> biFunc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<K> getIncreased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<K> getMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<K, K> getShared() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
