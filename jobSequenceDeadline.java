package GreedyMethod;

import java.util.*;
class Job{
	int profit, deadline;
	
	public Job(int profit, int deadline) {
		this.profit=profit;
		this.deadline=deadline;
	}
}

public class jobSequenceDeadline {
	public static  List<Integer> countJob(int[] deadlines, int[] profits){
		int n=deadlines.length;
		List<Job> jobs=new ArrayList<>();
		for(int i=0; i<n; i++) {
			jobs.add(new Job(profits[i], deadlines[i]));
		}
		
		jobs.sort((a,b)-> b.profit - a.profit);
		
		int maxDeadline=0;
		
		for(Job job:jobs) {
			maxDeadline = Math.max(maxDeadline, job.deadline);
		}
		
		int[] timeSlot = new int[maxDeadline+1];
		Arrays.fill(timeSlot, -1);
		
		int countJobs=0;
		int totalProfit=0;
		
		for(Job job: jobs) {
			for(int t=job.deadline; t>0; t--) {
				if(timeSlot[t]==-1) {
					timeSlot[t]=job.profit;
					countJobs++;
					totalProfit+=job.profit;
					break;
				}
			}
		}
		return Arrays.asList(countJobs, totalProfit);
	}	
	public static void main(String[] args) {
		int[] deadlines= {2,1,2,1,1};
		int[] profits= {100,19,27,25,15};
		
		List<Integer> result=countJob(deadlines, profits);
		System.out.println("Total Jobs done =" + result.get(0));
		System.out.println("Total Profit =" + result.get(1));
	}
}
