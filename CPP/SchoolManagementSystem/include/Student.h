#ifndef STUDENT_H
#define STUDENT_H

#include <string>
using namespace std;
class Student
{
    protected:
        string firstName;
        string lastName;
        string rollNo;
        string dob;
        int currentSem;
        float cpi;

    public:
        Student();
        ~Student();
        Student(string rollNo);

        void setFirstName(string firstName);
        void setLastName(string lastName);
        string getFullName();

        string getrollNo(){return this->rollNo; }

        string getDob(){return this->dob; }
        void setDob(string dob){ this->dob = dob; }

        int getCurrentSem(){return this->currentSem; }
        int setCurrentSem(int currentSem){ return this->currentSem = currentSem; }

        float getCpi(){return this->cpi;}
        void setCpi(float cpi){this->cpi = cpi;}

        void displayDetails();




};

#endif // STUDENT_H
