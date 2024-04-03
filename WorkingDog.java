public class WorkingDog extends Dog implements Worker {
	private int hoursOfTraining;
	
	public WorkingDog(String name) {
		super(name);
	}

	public void setHoursOfTraining(int hrs) {
	      hoursOfTraining = hrs;
	}

	public int getHoursOfTraining() {
		return hoursOfTraining; 
	}

	@Override
	public void work() {
      super.speak();
      System.out.println("It has " + hoursOfTraining +
         " hours of professional training!");
   	}	
}