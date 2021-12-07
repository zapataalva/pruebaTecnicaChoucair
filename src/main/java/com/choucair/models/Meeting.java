package com.choucair.models;

public class Meeting {

    private String meeting_name;
    private String meeting_type;
    private String meeting_number;
    private String start_date;
    private String time_start;
    private String end_date;
    private String time_end;

    public Meeting(String meeting_name, String meeting_type, String meeting_number, String start_date, String time_start, String end_date, String time_end) {
        this.meeting_name = meeting_name;
        this.meeting_type = meeting_type;
        this.meeting_number = meeting_number;
        this.start_date = start_date;
        this.time_start = time_start;
        this.end_date = end_date;
        this.time_end = time_end;
    }

    public String getMeeting_name() {
        return meeting_name;
    }

    public String getMeeting_type() {
        return meeting_type;
    }

    public String getMeeting_number() {
        return meeting_number;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getTime_start() {
        return time_start;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getTime_end() {
        return time_end;
    }
}
