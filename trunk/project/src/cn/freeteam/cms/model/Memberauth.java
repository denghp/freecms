package cn.freeteam.cms.model;

public class Memberauth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberAuth.id
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberAuth.code
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberAuth.name
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_memberAuth.ordernum
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    private Integer ordernum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberAuth.id
     *
     * @return the value of freecms_memberAuth.id
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberAuth.id
     *
     * @param id the value for freecms_memberAuth.id
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberAuth.code
     *
     * @return the value of freecms_memberAuth.code
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberAuth.code
     *
     * @param code the value for freecms_memberAuth.code
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberAuth.name
     *
     * @return the value of freecms_memberAuth.name
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberAuth.name
     *
     * @param name the value for freecms_memberAuth.name
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_memberAuth.ordernum
     *
     * @return the value of freecms_memberAuth.ordernum
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_memberAuth.ordernum
     *
     * @param ordernum the value for freecms_memberAuth.ordernum
     *
     * @mbggenerated Wed Jan 30 18:59:19 CST 2013
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }
}