/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mahmoud Ashraf
 */
public class Review {
    private int reviewID;
    private User user;
    private Item item;
    private int rating;            // from 1 to 5
    private String comment;
    private static List<Review> reviews = new ArrayList<>(); // store all reviews
    
    public Review(int reviewID, User user, Item item, int rating, String comment) {
        this.reviewID = reviewID;
        this.user = user;
        this.item = item;
        this.rating = rating;
        this.comment = comment;
        this.reviews.add(this); // Add to the list of reviews
    }

    public int getReviewID() {
        return reviewID;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public static List<Review> getReviews() {
        return reviews;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static void setReviews(List<Review> reviews) {
        Review.reviews = reviews;
    }
    
     public static void addReview(int reviewID, User user, Item item, int rating, String comment) {
        Review newReview = new Review(reviewID, user, item, rating, comment);
        reviews.add(newReview);
    }
     
    public static double getAverageRatingForItem(Item item) {
        int totalRating = 0;
        int count = 0;
        for (Review review : reviews) {
            if (review.item.equals(item)) {
                totalRating += review.rating;
                count++;
            }
        }
        return count > 0 ? (double) totalRating / count : 0.0;
    }
}
