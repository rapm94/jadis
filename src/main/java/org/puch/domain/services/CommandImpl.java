package com.puch.domain.services;

import com.puch.domain.repository.KeyValueStoreRepository;

public class CommandImpl implements Command {

    private final KeyValueStoreRepository keyValueStoreRepository;

    public CommandImpl(KeyValueStoreRepository keyValueStoreRepository) {
        this.keyValueStoreRepository = keyValueStoreRepository;
    }

    @Override
    public void set(String key, String value) {
        keyValueStoreRepository.set(key, value.getBytes());
    }

    @Override
    public String get(String key) {
        return new String(keyValueStoreRepository.get(key));
    }

    @Override
    public String ping() {
        return "Pong";
    }

    @Override
    public String client() {
        //TODO: Implement this method
        return "Connected";
    }

    @Override
    public void delete(String key) {
        keyValueStoreRepository.remove(key);
    }

    @Override
    public boolean exists(String key) {
        return keyValueStoreRepository.containsKey(key);
    }

    @Override
    public void expire(String key, long seconds) {

    }

    @Override
    public long ttl(String key) {
        return 0;
    }

    @Override
    public void lPush(String key, String value) {

    }

    @Override
    public void rPush(String key, String value) {

    }

    @Override
    public String lPop(String key) {
        return "";
    }

    @Override
    public String rPop(String key) {
        return "";
    }

    @Override
    public void sAdd(String key, String value) {

    }

    @Override
    public void sMembers(String key) {

    }

    @Override
    public void sRem(String key, String value) {

    }

    @Override
    public void zAdd(String key, double score, String value) {

    }

    @Override
    public void zRange(String key) {

    }

    @Override
    public void incr(String key) {

    }

    @Override
    public void decr(String key) {

    }

    @Override
    public void hSet(String key, String field, String value) {

    }

    @Override
    public String hGet(String key, String field) {
        return "";
    }

    @Override
    public void hDel(String key, String field) {

    }

    @Override
    public boolean hExists(String key, String field) {
        return false;
    }

    @Override
    public void hKeys(String key) {

    }

    @Override
    public void hVals(String key) {

    }

    @Override
    public int hLen(String key) {
        return 0;
    }
}
