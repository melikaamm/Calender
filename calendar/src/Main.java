public class Main {
    public static void main(String args[]) {
        CalenderEntry myBirthDay = new CalenderEntry("BirthDay",4,10);
        CalenderEntry javaLessonEntry = new CalenderEntry("Java Lesson", 4, 11);
       boolean isValidEntry = javaLessonEntry.isValid();
        System.out.println("isValidEntry: " + isValidEntry);
        boolean isSameMonthEntry =  myBirthDay.inSameMonth(javaLessonEntry);
        System.out.println("isSameMonthEntry :" + isSameMonthEntry);
        //javaLessonEntry.inSameMonth(myBirthDay);
        boolean isBeforeEntry =  javaLessonEntry.isBefore(myBirthDay);
        System.out.println("isBeforeEntry :" + isBeforeEntry);
        int leftDays = javaLessonEntry.daysLeft(4,2);
        System.out.println("leftDays :" + leftDays);

    }
}