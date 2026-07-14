package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.RefundStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "refunds")
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id")
    private Long refundId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cancellation_id", nullable = false, unique = true)
    private Cancellation cancellation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "processed_by_operator_user_id")
    private BusOperator processedByOperator;

    @Column(name = "refund_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal refundAmount;

    @Column(name = "refund_transaction_id", unique = true, length = 100)
    private String refundTransactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "refund_status", nullable = false)
    private RefundStatus refundStatus = RefundStatus.PENDING;

    @Column(name = "processed_at")
    private LocalDateTime processedAt;
}
