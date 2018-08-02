#include <iostream>
#include "Staff.h"

Staff::Staff()
{
    cout << "Object Created ...." << endl;
}

Staff::~Staff()
{
    cout << endl << "Object Destroyed ...." << endl;
}

Staff::Staff(string firstName, string lastName)
{
    this->firstName = firstName;
    this->lastName = lastName;
    cout << endl << "Object Created:" << firstName << " " << lastName << endl;
}

string Staff::getFullName()
{
    return this->firstName + " " + this->lastName;
}
