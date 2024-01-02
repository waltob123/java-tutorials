# Java Maps

## Introduction
A Map is an interface in Java that represents a collection of key-value pairs. It is used to store and retrieve data based on keys. Each key in a Map must be unique, and it can be used to retrieve the corresponding value.

## Types of Maps
Java provides several implementations of the Map interface, including:
- HashMap: It provides constant-time performance for basic operations and allows null values and null keys.
- TreeMap: It maintains the keys in sorted order and provides log(n) time complexity for basic operations.
- LinkedHashMap: It maintains the insertion order of keys and provides constant-time performance for basic operations.
- ConcurrentHashMap: It is a thread-safe version of HashMap and provides high concurrency.

## Basic Operations
Some common operations performed on a Map include:
- Adding a key-value pair: Use the `put(key, value)` method to add a new key-value pair to the map.
- Retrieving a value: Use the `get(key)` method to retrieve the value associated with a specific key.
- Checking if a key exists: Use the `containsKey(key)` method to check if a key exists in the map.
- Removing a key-value pair: Use the `remove(key)` method to remove a key-value pair from the map.

## Iterating over a Map
To iterate over the key-value pairs in a Map, you can use various methods such as `keySet()`, `entrySet()`, or `values()`. Here's an example of iterating over a Map using the `entrySet()` method:
