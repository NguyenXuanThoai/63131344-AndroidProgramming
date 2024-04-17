package ntu.nxt_63131344.recyclerview_examlist;

public class ExamData {
    String name;
    String date;
    String message;

    ExamData(String name,
             String date,
             String message)
    {
        this.name = name;
        this.date = date;
        this.message = message;
    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMassage() {
        return message;
    }
}
