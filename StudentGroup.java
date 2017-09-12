import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */




 public static void main(String args[ ]) throws IOException
    {
        System.out.println("============" + "=================");
        System.out.println("Students " + "Personal Details");
        System.out.println("============" + "=================");

        String name;
        int age,length;

        List<Student> arraylist = new ArrayList<Student>(); 
for (int i = 0; i < 2; i++) 
        {

        int studentNumber = (i + 1);
InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(converter);

public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {


 System.out.println("Enter Student "+ studentNumber + " Name:"); 
        name = br.readLine();

		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {


		
	}

	@Override
	public Student getStudent(int index) {
		arraylist.getStudent();
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
this.index=index;
this.student=student;
arraylist.setStudent();	
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
arraylist.add(student_first[i]);
string first="David";
	}

	@Override
	public void addLast(Student student) {
		arraylist.add(student_last[i]);
string last="Lowis";
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
 Student student = new Student(name, index);

        studentsList.add(student);
	}

	@Override
	public void remove(int index) {
	arraylist.remove(index[i]);
;return remove();
	}

	@Override
	public void remove(Student student)
{
		arraylist.remove(student[i]);
return remove();
	}

	@Override
	public void removeFromIndex(int index) {
	arraylist.remove(index[i]);
return removeFromIndex();
	}

	@Override
	public void removeFromElement(Student student)
{
		// Add your implementation here
	arraylist.remove(student[i]);
return removeFromElement();	
}

	@Override
	public void removeToIndex(int index)
{
arraylist.remove(index[i]);		// Add your implementation here
return removeToIndex();	
}

	@Override
	public void removeToElement(Student student)	// Add your implementation here
arraylist.remove(student[i]);
return removeToElement();
	}

	@Override
	public void bubbleSort() {
	for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j=

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		return getByBirthDate();
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate)
{
		return BetweenBirthDates(firstDate);
		return BetweenBirthDates(lastDate);

		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)
{
		// Add your implementation here
		return NearBirthDate(days);
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent)
 {
		// Add your implementation here
return CurrentAgeByDate();
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age)
 {
		this.age=age;
return getStudentsByAge();
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark()
{
                  float average;
		  avg=sum/n;
		  if(avg>0)
		{
		maxi=max(avg);
		return maxi;
		}
	else
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		Student student=student.nextInt();
return getNextStudent();
		return null;
	}
}

