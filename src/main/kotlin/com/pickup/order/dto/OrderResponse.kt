package com.pickup.order.dto

import com.pickup.order.entity.OrderItem
import com.pickup.order.entity.OrderStatus
import com.pickup.user.entity.User
import java.time.LocalDateTime

data class OrderResponse(
    val orderId: Long,
    val user: User,
    val restaurantId: Long,
    val orderItems: List<OrderItem>,
    val orderTime: LocalDateTime,
    val orderStatus: OrderStatus
)
