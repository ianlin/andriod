package net.radzebra.itTalent.dao;

public class Type {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.ID
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.desc
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.ID
     *
     * @return the value of type.ID
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.ID
     *
     * @param id the value for type.ID
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.desc
     *
     * @return the value of type.desc
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.desc
     *
     * @param desc the value for type.desc
     *
     * @mbggenerated Thu Sep 01 16:14:24 CST 2011
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}