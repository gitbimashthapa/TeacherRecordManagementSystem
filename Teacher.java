public class Teacher {
    
    // Creating attribute with acessor method
    private int     teacherID;
    private String  teacherName;
    private String  address;
    private String  workingType;
    private String  employmentStatus;
    private double  workingHours;
    
    //Constructor for the Teacher class with parameters to initialize attributes.
    Teacher(int teacherID, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherID =        teacherID;
        this.teacherName =      teacherName;
        this.address =          address;
        this.workingType =      workingType;
        this.employmentStatus = employmentStatus;
    }
       
    //Accessor method for retrieving attribute values.
    public int getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }
    
    public String getWorkingType() {
        return workingType;
    }
    
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public double getWorkingHours() {
        return workingHours;
    }
    
    // Mutator method for updating the 'workingHours' attribute.
    public void setWorkingHour(double workingHours) {
        this.workingHours = workingHours;
    }
    
    // Display method to print the information.
    public void display() {
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);

      // Verify if working hours have been assigned.
       if (workingHours > 0)  {
            System.out.println("Working Hours: " + workingHours); }
       else {
            System.out.println("Working Hours:  + Not assigned.");
      }
    }
  }
  
  
