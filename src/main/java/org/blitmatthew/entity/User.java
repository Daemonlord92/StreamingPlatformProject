package org.blitmatthew.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a user of the streaming platform
 */
public class User {
    private String userId;
    private String username;
    private boolean isPremiumMember;
    private List<Content> watchlist;
    private Map<String, Double> contentRatings;  // Content ID -> Rating

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        this.isPremiumMember = false;
        this.watchlist = new ArrayList<>();
        this.contentRatings = new HashMap<>();
    }

    // Getters
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public boolean isPremiumMember() { return isPremiumMember; }
    public List<Content> getWatchlist() { return watchlist; }
    public Map<String, Double> getContentRatings() { return contentRatings; }

    // TODO Day 2: Implement methods to manage watchlist using Stream API
}
