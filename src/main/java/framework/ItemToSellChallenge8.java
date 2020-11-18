package framework;

public class ItemToSellChallenge8 {
    private String _whatYouSell;
    private String _description;
    private String _startTime;
    private String _endTime;

    public ItemToSellChallenge8(String whatYouSell, String description, String startTime, String endTime){
        this._whatYouSell = whatYouSell;
        this._description = description;
        this._startTime = startTime;
        this._endTime = endTime;
    }


    public String get_whatYouSell() {
        return _whatYouSell;
    }

    public void set_whatYouSell(String whatYouSell) {
        this._whatYouSell = whatYouSell;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public String get_startTime() {
        return _startTime;
    }

    public void set_startTime(String startTime) {
        this._startTime = startTime;
    }

    public String get_endTime() {
        return _endTime;
    }

    public void set_endTime(String endTime) {
        this._endTime = endTime;
    }
}
