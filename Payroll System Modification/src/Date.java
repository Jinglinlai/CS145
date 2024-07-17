//Jing Lin and Vi
public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }

        if (day <= 0 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Day out of range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // check if month in range
    public int getMonth() {
        return month;
    }

    // check if day in range for month
    public int getDay() {
        return day;
    }

    // check for leap year if month is 2 and day is 29
    public int getYear() {
        return year;
    }

    // return day
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }
}
