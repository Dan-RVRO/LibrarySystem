package com.mycompany.librarySystem.model;

import java.time.Instant;
import java.util.Objects;

/**
 * Immutable model representing a user's request to borrow a book.
 * Implements Comparable so it can be ordered in a PriorityQueue by timestamp.
 */
public class Reservation implements Comparable<Reservation> {
    private final String bookIsbn;
    private final String userId;
    private final Instant timestamp;

    /**
     * Creates a reservation for the given book and user at the specified time.
     *
     * @param bookIsbn  the ISBN of the book to reserve (non‐null, non‐blank)
     * @param userId    the ID of the user making the reservation (non‐null, non‐blank)
     * @param timestamp the moment the reservation was made (non‐null)
     */
    public Reservation(String bookIsbn, String userId, Instant timestamp) {
        if (bookIsbn == null || bookIsbn.isBlank()) {
            throw new IllegalArgumentException("Book ISBN cannot be null or blank");
        }
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("User ID cannot be null or blank");
        }
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp cannot be null");
        }
 
        this.bookIsbn = bookIsbn.trim();
        this.userId    = userId.trim();
        this.timestamp = timestamp;
    }

    /**
     * Convenience constructor that timestamps the reservation at now.
     *
     * @param bookIsbn the ISBN of the book to reserve
     * @param userId   the ID of the user making the reservation
     */
    public Reservation(String bookIsbn, String userId) {
        this(bookIsbn, userId, Instant.now());
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public String getUserId() {
        return userId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Orders reservations by timestamp (earlier reservations have higher priority).
     */
    @Override
    public int compareTo(Reservation other) {
        return this.timestamp.compareTo(other.timestamp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return bookIsbn.equals(that.bookIsbn)
            && userId.equals(that.userId)
            && timestamp.equals(that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookIsbn, userId, timestamp);
    }

    @Override
    public String toString() {
        return String.format(
            "Reservation[bookIsbn=%s, userId=%s, timestamp=%s]",
            bookIsbn, userId, timestamp
        );
    }
}