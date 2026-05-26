package com.deepoove.swagger.diff.compare;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * compare two Maps by key
 *
 * @author Sayi
 * @version
 */
public class MapKeyDiff<K, V> {

    private Map<K, V> increased;

    private Map<K, V> missing;

    private List<K> sharedKey;

    private MapKeyDiff() {
        this.sharedKey = new ArrayList<>();
    }

    public static <K, V> MapKeyDiff<K, V> diff(Map<K, V> mapLeft, Map<K, V> mapRight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<K, V> getIncreased() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<K, V> getMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<K> getSharedKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
