package com.puch.domain.services;

public interface Command {
    public void set(String key, String value); // sets the key and value
    public String get(String key); // gets the value of the key
    public String ping(); // returns "Pong"
    public String client(); // returns client connection
    void delete(String key); // deletes the key
    boolean exists(String key); // checks if the key exists
    void expire(String key, long seconds); // sets the key to expire in seconds
    long ttl(String key); // gets the time to live of the key
    void lPush(String key, String value);
    void rPush(String key, String value);
    String lPop(String key);
    String rPop(String key);
    void sAdd(String key, String value);
    void sMembers(String key);
    void sRem(String key, String value);
    void zAdd(String key, double score, String value);
    void zRange(String key);
    void incr(String key);
    void decr(String key);
    void hSet(String key, String field, String value);
    String hGet(String key, String field);
    void hDel(String key, String field);
    boolean hExists(String key, String field);
    void hKeys(String key);
    void hVals(String key);
    int hLen(String key);

}
