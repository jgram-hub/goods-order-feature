package kr.submit.goodsorderfeature.api.repository;

import kr.submit.goodsorderfeature.api.domain.entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsEntity, String> {
}