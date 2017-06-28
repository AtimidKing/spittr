package webtest;

import org.apache.commons.lang3.builder.EqualsBuilder;//Apache Common Lang
import org.apache.commons.lang3.builder.HashCodeBuilder;//Apache Common Lang

import java.util.Date;

/**
 * Created by king on 2017/6/27.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(String message,Date time){
        this(message ,time ,null,null);
    }
    public Spittle(String message,Date time ,Double longitude, Double latitude){
        this.id= null;
        this.message=message;
        this.time=time;
        this.longitude=longitude;
        this.latitude=latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj,"id","time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
