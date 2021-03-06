package com.mission.shop.order.dao.mapper;

import com.mission.shop.order.dao.model.OrderHistoryStatus;
import com.mission.shop.order.dao.model.OrderHistoryStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHistoryStatusMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int countByExample(OrderHistoryStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int deleteByExample(OrderHistoryStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int insert(OrderHistoryStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int insertSelective(OrderHistoryStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	List<OrderHistoryStatus> selectByExample(OrderHistoryStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	OrderHistoryStatus selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int updateByExampleSelective(@Param("record") OrderHistoryStatus record,
			@Param("example") OrderHistoryStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int updateByExample(@Param("record") OrderHistoryStatus record,
			@Param("example") OrderHistoryStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int updateByPrimaryKeySelective(OrderHistoryStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	int updateByPrimaryKey(OrderHistoryStatus record);
}