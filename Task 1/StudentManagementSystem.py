class Student:
    def __init__(self, name, rollno, marks):
        self.name = name
        self.rollno = rollno
        self.marks = marks
        self.subjects = ["Maths","Science","SocialScience","English","Hindi"]

    def Add(self, Name, Rollno, marks):
        obj = Student(Name, Rollno, marks )
        student.append(obj)

    def display(self, obj):
            print("Name   : ", obj.name)
            print("RollNo : ", obj.rollno)
            for i in range(5):
                print("%s : %s"%(obj.subjects[i],obj.marks[i]))

    def search(self, rn):
        for i in range(student.__len__()):
            if(student[i].rollno == rn):
                return i

    def delete(self, rn):
        i = obj.search(rn)
        del student[i]

    def update(self, rn, No):
        i = obj.search(rn)
        roll = No
        student[i].rollno = roll

student =[]
obj = Student('', 0, 0)

print("\nOperations used, ")
print("\n 1.Adding Student details\n 2.Display Student Details\n 3.Search Details of a Student\n 4.Delete Details of Student\n 5.Update Student Details\n 6.Exit")


obj.Add("Raman", 1, [100,100,100,100,100])
obj.Add("Priya", 2, [90,90,90,100,90])
obj.Add("Sarthak", 3, [80,80,80,80,80])

print("\n")
print("\nList of all Students\n")
for i in range(student.__len__()):
    obj.display(student[i])

print("\n searching student, ")
s = obj.search(2)
obj.display(student[s])

obj.delete(2)
print("Deleted roll no. : 2\n")
print("List of all students after deletion \n\n")
for i in range(student.__len__()):
    obj.display(student[i])

obj.update(3, 2)
print("Updating 3 to 2 \n")
print("List of all students after updating")
for i in range(student.__len__()):
    obj.display(student[i])
