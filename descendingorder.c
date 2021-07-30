#include <iostream>
using namespace std;
class Student{
    private:
    char name[20];
    int usn;
    int marks;
    public:
    void accept(){
        cout<<"Enter name, usn, marks in order"<<endl;
        cin>>name>>usn>>marks;
    }
    int markreturn(){
        return marks;
    }
    void display(){
        cout<<name<<"\t"<<usn<<"\t"<<marks<<endl;
    }
};

int main()
{
    int n=5;
    cout<<"Enter number of students"<<endl;
    cin>>n;
    Student *student=new Student[n] ;
    Student temp;
    cout<<"Enter Student Details"<<endl;
    for(int i=0;i<n;i++){
        student[i].accept();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i+1;j++){
            if(student[j].markreturn()<student[j+1].markreturn()){
                temp=student[j];
                student[j]=student[j+1];
                student[j+1]=temp;
            }
        }
    }
    cout<<"Details of Students"<<endl;
    for(int i=0;i<n;i++){
        student[i].display();
    }

    return 0;
}
