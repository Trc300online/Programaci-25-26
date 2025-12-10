public class DateThree {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if (year > 1000 && year < 10000) {
            this.year = year;
        } else {
            System.out.println("invalid year");
            this.year = 0;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.month = month;
                if ( day > 0 && day < 32) {
                    this.day = day;
                } else {
                    System.out.println("invalid day");
                    this.day = 0;
                }
                break;
            case 2:
                this.month = month;
                if (day > 0 && day < 29) {
                    this.day = day;
                } else if (day == 29) {
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                        this.day = day;
                    } else {
                        System.out.println("invalid day");
                        this.day = 0;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.month = month;
                if (day > 0 && day < 31) {
                    this.day = day;
                } else {
                    System.out.println("invalid day");
                }
                break;
            default:
                System.out.println("invalid month");
                this.month = 0;
                break;
        }
    }

    public void displayDate() {
        if (day == 0 || month == 0 || year == 0) {
            System.out.println("invalid date");
        } else {
            System.out.println("Date is: " + day + "/" + month + "/" + year);
        }
    }
}
