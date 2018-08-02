#include <iostream>
#include <string>

#include "Student.h"


Student::Student()
{
    cout <<endl << "Student Object created" <<endl;
}

Student::Student(string rollNo)
{
    this->rollNo = rollNo;
    cout <<endl << "Student Object created" <<endl;
}

Student::~Student()
{
    cout <<endl << "Student Object destroyed" <<endl;
}

void Student::setFirstName(string firstName)
{
    this->firstName = firstName;
}

void Student::setLastName(string lastName)
{
    this->lastName = lastName;
}


string Student::getFullName()
{
    return this->firstName + " " + this->lastName;
}

void Student::displayDetails()
{
    cout<<endl;
    cout<<"Name:"<<this->getFullName()<<endl;
    cout<<"Roll No:"<<this->rollNo<<endl;
    cout<<"Semester:"<<this->currentSem<<endl;
    cout<<"Cpi:"<<this->cpi<<endl;
}
