package model;

public enum SessionStatus {
    PENDING, // Initial state when a session is created but not yet scheduled
    SCHEDULED, // Session is scheduled but not yet open for sale
    ON_SALE, // Tickets are available for purchase
    SOLD_OUT, // All tickets have been sold
    CLOSED, // Session sale closed, no more tickets can be sold
    CANCELLED // Session has been cancelled
}