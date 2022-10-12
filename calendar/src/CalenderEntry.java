public class CalenderEntry {
    String text;
    int month;
    int day;

    CalenderEntry(String text, int month, int day) {
        this.text = text;
        this.month = month;
        this.day = day;
    }

    public boolean isValid() {
        boolean isValidMonth = false;
        boolean isValidDay = false;
        if (month >= 1 && month <= 12) {
            isValidMonth = true;
        }
        if (day >= 1 && day <= 7) {
            isValidDay = true;
        }
        return isValidDay && isValidMonth;
    }

    boolean inSameMonth(CalenderEntry entry) {

        return this.month == entry.month;
    }

    boolean isBefore(CalenderEntry entry) {
        if (this.month < entry.month) {
            return true;
        }
        else if (this.month == entry.month) {
            if (this.day < entry.day) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }


    int daysLeft(int month, int day){
        int leftDays1 = this.month * 30 + this.day;
         int leftDays2 = month * 30 + day;
          int leftDays = leftDays2 - leftDays1;
           return leftDays;
    }
}
