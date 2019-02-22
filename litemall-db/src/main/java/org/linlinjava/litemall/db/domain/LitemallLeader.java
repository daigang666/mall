package org.linlinjava.litemall.db.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallLeader {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_leader
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_leader
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.leader_name
     *
     * @mbg.generated
     */
    private String leaderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.store
     *
     * @mbg.generated
     */
    private String store;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.gender
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.birthday
     *
     * @mbg.generated
     */
    private LocalDate birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.user_level
     *
     * @mbg.generated
     */
    private Byte userLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.after_award
     *
     * @mbg.generated
     */
    private Float afterAward;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.before_award
     *
     * @mbg.generated
     */
    private Float beforeAward;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.province_id
     *
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.city_id
     *
     * @mbg.generated
     */
    private Integer cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.area_id
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.town_id
     *
     * @mbg.generated
     */
    private Integer townId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_leader.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.id
     *
     * @return the value of litemall_leader.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.id
     *
     * @param id the value for litemall_leader.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.leader_name
     *
     * @return the value of litemall_leader.leader_name
     *
     * @mbg.generated
     */
    public String getLeaderName() {
        return leaderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.leader_name
     *
     * @param leaderName the value for litemall_leader.leader_name
     *
     * @mbg.generated
     */
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.store
     *
     * @return the value of litemall_leader.store
     *
     * @mbg.generated
     */
    public String getStore() {
        return store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.store
     *
     * @param store the value for litemall_leader.store
     *
     * @mbg.generated
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.gender
     *
     * @return the value of litemall_leader.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.gender
     *
     * @param gender the value for litemall_leader.gender
     *
     * @mbg.generated
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.birthday
     *
     * @return the value of litemall_leader.birthday
     *
     * @mbg.generated
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.birthday
     *
     * @param birthday the value for litemall_leader.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.user_level
     *
     * @return the value of litemall_leader.user_level
     *
     * @mbg.generated
     */
    public Byte getUserLevel() {
        return userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.user_level
     *
     * @param userLevel the value for litemall_leader.user_level
     *
     * @mbg.generated
     */
    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.mobile
     *
     * @return the value of litemall_leader.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.mobile
     *
     * @param mobile the value for litemall_leader.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.after_award
     *
     * @return the value of litemall_leader.after_award
     *
     * @mbg.generated
     */
    public Float getAfterAward() {
        return afterAward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.after_award
     *
     * @param afterAward the value for litemall_leader.after_award
     *
     * @mbg.generated
     */
    public void setAfterAward(Float afterAward) {
        this.afterAward = afterAward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.before_award
     *
     * @return the value of litemall_leader.before_award
     *
     * @mbg.generated
     */
    public Float getBeforeAward() {
        return beforeAward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.before_award
     *
     * @param beforeAward the value for litemall_leader.before_award
     *
     * @mbg.generated
     */
    public void setBeforeAward(Float beforeAward) {
        this.beforeAward = beforeAward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.add_time
     *
     * @return the value of litemall_leader.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.add_time
     *
     * @param addTime the value for litemall_leader.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.update_time
     *
     * @return the value of litemall_leader.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.update_time
     *
     * @param updateTime the value for litemall_leader.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.province_id
     *
     * @return the value of litemall_leader.province_id
     *
     * @mbg.generated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.province_id
     *
     * @param provinceId the value for litemall_leader.province_id
     *
     * @mbg.generated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.city_id
     *
     * @return the value of litemall_leader.city_id
     *
     * @mbg.generated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.city_id
     *
     * @param cityId the value for litemall_leader.city_id
     *
     * @mbg.generated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.area_id
     *
     * @return the value of litemall_leader.area_id
     *
     * @mbg.generated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.area_id
     *
     * @param areaId the value for litemall_leader.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.town_id
     *
     * @return the value of litemall_leader.town_id
     *
     * @mbg.generated
     */
    public Integer getTownId() {
        return townId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.town_id
     *
     * @param townId the value for litemall_leader.town_id
     *
     * @mbg.generated
     */
    public void setTownId(Integer townId) {
        this.townId = townId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_leader.deleted
     *
     * @return the value of litemall_leader.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_leader.deleted
     *
     * @param deleted the value for litemall_leader.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_leader
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", leaderName=").append(leaderName);
        sb.append(", store=").append(store);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", mobile=").append(mobile);
        sb.append(", afterAward=").append(afterAward);
        sb.append(", beforeAward=").append(beforeAward);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", areaId=").append(areaId);
        sb.append(", townId=").append(townId);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_leader
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallLeader other = (LitemallLeader) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLeaderName() == null ? other.getLeaderName() == null : this.getLeaderName().equals(other.getLeaderName()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAfterAward() == null ? other.getAfterAward() == null : this.getAfterAward().equals(other.getAfterAward()))
            && (this.getBeforeAward() == null ? other.getBeforeAward() == null : this.getBeforeAward().equals(other.getBeforeAward()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getTownId() == null ? other.getTownId() == null : this.getTownId().equals(other.getTownId()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_leader
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLeaderName() == null) ? 0 : getLeaderName().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAfterAward() == null) ? 0 : getAfterAward().hashCode());
        result = prime * result + ((getBeforeAward() == null) ? 0 : getBeforeAward().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getTownId() == null) ? 0 : getTownId().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_leader
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_leader
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        leaderName("leader_name", "leaderName", "VARCHAR", false),
        store("store", "store", "VARCHAR", false),
        gender("gender", "gender", "TINYINT", false),
        birthday("birthday", "birthday", "DATE", false),
        userLevel("user_level", "userLevel", "TINYINT", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        afterAward("after_award", "afterAward", "REAL", false),
        beforeAward("before_award", "beforeAward", "REAL", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        provinceId("province_id", "provinceId", "INTEGER", false),
        cityId("city_id", "cityId", "INTEGER", false),
        areaId("area_id", "areaId", "INTEGER", false),
        townId("town_id", "townId", "INTEGER", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_leader
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}