
#include <iostream>
#include <vector>
#include <string>

using namespace std;
#define newline cout << endl;

/*
Sunday, September 3, 1606
Friday, February 7, 1913
*/

struct date {
public:
    /*
     Sunday -> 1
     Monday -> 2
     Tuesday -> 3
     Wednesday -> 4
     Thursday -> 5
     Friday -> 6
     Saturday -> 7


     */
    int dayOfTheWeek;
    int day;
    int month;
    int year;

    void setDates(string &isDayOfTheWeek, string &isDay, string &isMonth, string &isYear) {

        if (isDayOfTheWeek == "Sunday,") {
            dayOfTheWeek = 1;
        }
        dayOfTheWeek =
                isDayOfTheWeek == "Sunday," ? 1 : isDayOfTheWeek == "Monday," ? 2 : isDayOfTheWeek == "Tuesday," ? 3 :
                                                                                    isDayOfTheWeek == "Wednesday," ? 4 :
                                                                                    isDayOfTheWeek == "Thursday," ? 5 :
                                                                                    isDayOfTheWeek == "Friday," ? 6 : 7;

        isDay.pop_back();
        day = stoi(isDay);


        month = isMonth == "January" ? 1 : isMonth == "February" ? 2: isMonth == "March" ? 3 : isMonth == "April" ? 4 :
                                                                                            isMonth == "May" ? 4 :
                                                                                            isMonth == "June" ? 6 :
                                                                                            isMonth == "July" ? 7 :
                                                                                            isMonth == "August" ? 8 :
                                                                                            isMonth == "September" ? 9 :
                                                                                            isMonth == "October" ? 10 :
                                                                                            isMonth == "November" ? 11 :12 ;
        year = stoi(isYear);



    }
};


int main() {
    cin.tie(0);
    int numOfFridays = 0;

    string startDate[4];
    string endDate[4];

    for (int i = 0; i < 4; i++) {
        cin >> startDate[i];

    }

    for (int i = 0; i < 4; i++) {
        cin >> endDate[i];

    }

    date starting = date();
    starting.setDates(startDate[0], startDate[2], startDate[1], startDate[3]);

    date ending = date();
    ending.setDates(endDate[0], endDate[2], endDate[1], endDate[3]);

    // --- //

    if(starting.dayOfTheWeek==6 && starting.day==13) {
        numOfFridays++;
    }

    if(ending.dayOfTheWeek==6 && ending.day==13) {
        numOfFridays++;
    }

    date currentYear = date();
    currentYear.setDates(startDate[0], startDate[2], startDate[1], startDate[3]);

    currentYear.day += 1;
    currentYear.dayOfTheWeek += 1;

    if (currentYear.dayOfTheWeek == 8) {
        currentYear.dayOfTheWeek=1;
    }
/*
    January, March, May, July, August, October, December: 31 days
    April, June, September, November: 30 days
    February: 28 days, except on leap years
 */
    int limit = 0;
    switch (currentYear.month){
        case (1):
            limit = 31;
            break;
        case (2):
            limit = (currentYear.year % 400 == 0 && currentYear.year % 4 == 0 && currentYear.year % 100 != 0) ? 29: 28;
            break;
        case (3):
            limit = 31;
            break;
        case (4):
            limit=31;
            break;
        case (5):
            limit = 31;
            break;
        case (6):
            limit = 30;
            break;
        case (7):
            limit = 31;
            break;
        case (8):
            limit = 31;
            break;
        case (9):
            limit = 30;
            break;
        case (10):
            limit = 31;
            break;
        case (11):
            limit = 30;
            break;
        case (12):
            limit = 31;
            break;
        cout << limit << endl;
    }



    return 0;

}
