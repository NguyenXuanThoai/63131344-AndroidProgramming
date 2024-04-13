package ntu.nxt_63131344.recyclerview;

public class LandScape {
    String LandImageFileName;
    String LandCaption;

    public LandScape(String landImageFileName, String landCaption) {
        LandImageFileName = landImageFileName;
        LandCaption = landCaption;
    }

    public String getLandImageFileName() {
        return LandImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        LandImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return LandCaption;
    }

    public void setLandCaption(String landCaption) {
        LandCaption = landCaption;
    }
}
