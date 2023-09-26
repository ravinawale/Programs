package code.scenariobased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByJobByItsStatus {

	public static void main(String[] args) {
		//Sort the job object in this order
		//- All INPROGRESS object first
		//- DONE objects
		//- CANCELLED objects
		//- FAILED objects
		List<Job> jobs = Arrays.asList(new Job(1,"J1",Status.DONE),
									  new Job(2,"J2",Status.FAILED),
									  new Job(3,"J3",Status.CANCELLED),
									  new Job(4,"J4",Status.INPROGRESS),
									  new Job(5,"J5",Status.DONE));
		//J3 , J1, J5 , J2 , J4
		Comparator<Job> cmp = (j1,j2) -> j2.getStatus().compareTo(j1.getStatus());
		System.out.println(jobs.stream()
			.sorted(cmp)
			.map(e -> e.jobName)
			.collect(Collectors.toList()));
	}
}

class Job{
	
	int jobid;
	String jobName;
	Status status;
	
	public Job(int jobid, String jobName, Status status) {
		super();
		this.jobid = jobid;
		this.jobName = jobName;
		this.status = status;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobName=" + jobName + ", status=" + status + "]";
	}
}

enum Status{
	FAILED(3), CANCELLED(2), DONE(1), INPROGRESS(0);
	private int priority;  
	private Status(int value){  
		this.priority=value;  
	}  
}