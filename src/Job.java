public class Job {
    
    private int submitTime;
    private int  jobID;
    private int  estRunTime;
    private int  coreReq;
    private int  memoryReq;
    private int  diskReq;


    /* 
			Constructor for stage 2.
			Constructor based off of this definition:
			
				int             int     int         int         int             int
                submit Time 	jobID 	run Time 	core req 	memory req      disk req

		*/
    public Job(int subTime, int jID, int runT, int coreRq, int memReq, int dkReq){
        this.submitTime = subTime;
        this.jobID = jID;
        this.estRunTime = runT;
        this.coreReq = coreRq;
        this.memoryReq = memReq;
        this.diskReq = dkReq;
    }


    public void printJobData(){
        System.out.println("\n"+this.jobID + " " + this.coreReq + " " + this.memoryReq + " " + this.diskReq);
    }

    //
    //  BELOW ARE GETTERS FOR JOB OBJECT
    //
    public int getSubmitTime(){
        return this.submitTime;
    }

    public int getJobID(){
        return this.jobID;
    }

    public int getRunTime(){
        return this.estRunTime;
    }

    public int getCoreReq(){
        return this.coreReq;
    }
    
    public int getMemeoryReq(){
        return this.memoryReq;
    }

    public int getDiskReq(){
        return this.diskReq;
    }
}
