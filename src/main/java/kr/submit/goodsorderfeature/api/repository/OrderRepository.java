package kr.submit.goodsorderfeature.api.repository;

import kr.submit.goodsorderfeature.api.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}