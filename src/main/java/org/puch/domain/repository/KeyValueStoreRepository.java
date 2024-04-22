package com.puch.domain.repository;

import java.util.concurrent.ConcurrentHashMap;

public class KeyValueStoreRepository {

    private final ConcurrentHashMap<String, byte[]> data;
    private final ConcurrentHashMap<String, Long> expiry;

    public KeyValueStoreRepository() {
        this.data = new ConcurrentHashMap<>();
        this.expiry = new ConcurrentHashMap<>();
    }

    public synchronized void set(String key, byte[] val, long ttl) {
        this.data.put(key, val);
        if (ttl > 0) {
            this.expiry.put(key, System.currentTimeMillis() + ttl);
        } else {
            this.expiry.remove(key);
        }
    }

    public synchronized byte[] get(String key) {
        return this.data.get(key);
    }

    public synchronized boolean containsKey(String key) {
        return this.data.containsKey(key);
    }

    public boolean containsValue(byte[] value) {
        return data.containsValue(value);
    }

    public int size() {
        return data.size();
    }

    public void clear() {
        data.clear();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public ConcurrentHashMap<String, byte[]> getKeyValueStore() {
        return data;
    }

    public void remove(String key) {
        data.remove(key);
    }

    public void expire(String key, long seconds) {

    }

}
