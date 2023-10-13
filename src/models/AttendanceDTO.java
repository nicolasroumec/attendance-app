
package models;

import java.time.LocalDateTime;

public class AttendanceDTO {

    private int attendaceId;
    private LocalDateTime date;
    private int attendaceStatus;
    
   public AttendanceDTO(int attendaceId, LocalDateTime date, int attendaceState) {
        this.attendaceId = attendaceId;
        this.date = date;
        this.attendaceStatus = attendaceStatus;
    }
   
    public int getAttendaceId() {
        return attendaceId;
    }

    public void setAttendaceId(int attendaceId) {
        this.attendaceId = attendaceId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAttendaceState() {
        return attendaceStatus;
    }

    public void setAttendaceState(int attendaceState) {
        this.attendaceStatus = attendaceStatus;
    }
    
    public String getStatusString(){
                
        if (this.attendaceStatus == 1){
            return "Present";
        }
        else if(this.attendaceStatus == 2){
            return "Absent";
        }
        else if (this.attendaceStatus == 3){
            return "Justified";
        }
        return "Error";
    }
}
