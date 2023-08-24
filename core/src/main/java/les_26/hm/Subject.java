package les_26.hm;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Subject {
    MATH("Math"), PHYSIC("physic"), MUSIC("Music"), SPORT("Sport");
    private String displaySubject;
    Subject(String displaySubject){
        this.displaySubject = displaySubject;
    }
    @JsonValue
    public  String getDisplaySubject(){
        return displaySubject;
    }
}
