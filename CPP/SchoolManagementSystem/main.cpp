#include <iostream>

#include "Student.h"
using namespace std;

int main()
{
    Student s1("12");
    s1.setFirstName("Dattesh");
    s1.setLastName("Naik");
    s1.setCurrentSem(3);
    s1.setCpi(5.6);

    s1.displayDetails();
    return 0;
}
