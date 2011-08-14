package net.radzebra.itTalent.dao;

import java.util.ArrayList;
import java.util.List;

public class TalentStoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public TalentStoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTalentIdIsNull() {
            addCriterion("talent_ID is null");
            return (Criteria) this;
        }

        public Criteria andTalentIdIsNotNull() {
            addCriterion("talent_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTalentIdEqualTo(String value) {
            addCriterion("talent_ID =", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdNotEqualTo(String value) {
            addCriterion("talent_ID <>", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdGreaterThan(String value) {
            addCriterion("talent_ID >", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdGreaterThanOrEqualTo(String value) {
            addCriterion("talent_ID >=", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdLessThan(String value) {
            addCriterion("talent_ID <", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdLessThanOrEqualTo(String value) {
            addCriterion("talent_ID <=", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdLike(String value) {
            addCriterion("talent_ID like", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdNotLike(String value) {
            addCriterion("talent_ID not like", value, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdIn(List<String> values) {
            addCriterion("talent_ID in", values, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdNotIn(List<String> values) {
            addCriterion("talent_ID not in", values, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdBetween(String value1, String value2) {
            addCriterion("talent_ID between", value1, value2, "talentId");
            return (Criteria) this;
        }

        public Criteria andTalentIdNotBetween(String value1, String value2) {
            addCriterion("talent_ID not between", value1, value2, "talentId");
            return (Criteria) this;
        }

        public Criteria andStoryIdIsNull() {
            addCriterion("story_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoryIdIsNotNull() {
            addCriterion("story_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoryIdEqualTo(String value) {
            addCriterion("story_ID =", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotEqualTo(String value) {
            addCriterion("story_ID <>", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdGreaterThan(String value) {
            addCriterion("story_ID >", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("story_ID >=", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdLessThan(String value) {
            addCriterion("story_ID <", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdLessThanOrEqualTo(String value) {
            addCriterion("story_ID <=", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdLike(String value) {
            addCriterion("story_ID like", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotLike(String value) {
            addCriterion("story_ID not like", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdIn(List<String> values) {
            addCriterion("story_ID in", values, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotIn(List<String> values) {
            addCriterion("story_ID not in", values, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdBetween(String value1, String value2) {
            addCriterion("story_ID between", value1, value2, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotBetween(String value1, String value2) {
            addCriterion("story_ID not between", value1, value2, "storyId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdIsNull() {
            addCriterion("confident_level_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdIsNotNull() {
            addCriterion("confident_level_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdEqualTo(String value) {
            addCriterion("confident_level_ID =", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdNotEqualTo(String value) {
            addCriterion("confident_level_ID <>", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdGreaterThan(String value) {
            addCriterion("confident_level_ID >", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("confident_level_ID >=", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdLessThan(String value) {
            addCriterion("confident_level_ID <", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdLessThanOrEqualTo(String value) {
            addCriterion("confident_level_ID <=", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdLike(String value) {
            addCriterion("confident_level_ID like", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdNotLike(String value) {
            addCriterion("confident_level_ID not like", value, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdIn(List<String> values) {
            addCriterion("confident_level_ID in", values, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdNotIn(List<String> values) {
            addCriterion("confident_level_ID not in", values, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdBetween(String value1, String value2) {
            addCriterion("confident_level_ID between", value1, value2, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andConfidentLevelIdNotBetween(String value1, String value2) {
            addCriterion("confident_level_ID not between", value1, value2, "confidentLevelId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_ID like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_ID not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table talent_story
     *
     * @mbggenerated do_not_delete_during_merge Sun Aug 14 20:25:37 CST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table talent_story
     *
     * @mbggenerated Sun Aug 14 20:25:37 CST 2011
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}