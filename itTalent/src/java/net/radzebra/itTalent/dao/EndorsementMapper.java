package net.radzebra.itTalent.dao;

import java.util.List;
import net.radzebra.itTalent.dao.Endorsement;
import net.radzebra.itTalent.dao.EndorsementExample;
import org.apache.ibatis.annotations.Param;

public interface EndorsementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int countByExample(EndorsementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int deleteByExample(EndorsementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int insert(Endorsement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int insertSelective(Endorsement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    List<Endorsement> selectByExample(EndorsementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    Endorsement selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int updateByExampleSelective(@Param("record") Endorsement record, @Param("example") EndorsementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int updateByExample(@Param("record") Endorsement record, @Param("example") EndorsementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int updateByPrimaryKeySelective(Endorsement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endorsement
     *
     * @mbggenerated Sun Aug 14 15:39:50 CST 2011
     */
    int updateByPrimaryKey(Endorsement record);
}