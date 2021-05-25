public class Server {
		
		// stage 1 & 2
		private String type; 
		private int limit; 
		private int bootTime;
		private float hourlyRate; 
		private int coreCount; 
		private int memory; 
		private int disk;

		// stage 2
		private int id;
		private String status;
		private int startTime;
		private int runJobs;
		private int waitJobs;

		/* 
		 	Constructor for stage 1.
			Based off of this definition:
			
				String		int			int			float			int				int			int
				serverType 	limit		boottime 	hourlyRate		corecount		memory		disk
		*/
		public Server(String type, int limit, int bootTime, float hourlyRate, int coreCount, int memory, int disk){
			this.type = type;
			this.limit = limit;
			this.bootTime = bootTime;
            this.hourlyRate = hourlyRate;
			this.coreCount = coreCount;
			this.memory = memory;
			this.disk = disk;
		}
		

		/* 
			Constructor for stage 2.
			Constructor based off of this definition:
			
				String		int			String		int			int		int		int		int		int
				serverType 	serverID 	state 	curStartTime 	core 	mem 	disk 	#wJobs 	#rJobs

		*/
		public Server(String type, int id, String state, int startT, int coreC, int mem, int disk, int wJ, int rJ ){
			
			// stage 1
			this.type = type;

			// stage 2
			this.id = id;
			this.status = state;
			this.startTime = startT;

			// stage 1
			this.coreCount = coreC;
			this.memory = mem;
			this.disk = disk;

			// stage 2
			this.waitJobs = wJ;
			this.runJobs = rJ;

		}


		
		public void printCapableData(){
			System.out.println(this.type + " " + this.id + " " + this.status + " " + this.startTime + " " + this.coreCount + " " + this.memory + " " + this.disk + " " + this.waitJobs + " " + this.runJobs);
		}



		//
		// BELOW ARE GETTERS FOR SERVER OBJECT
		//

		// returns int for server ID
		public int getID(){
			return this.id;
		}

		// returns a String for server state/status
		public String getState(){
			return this.status;
		}

		// returns an int for the start time
		public int getStartTime(){
			return this.startTime;
		}

		// returns an int for wait time for server
		public int getWaitJob(){
			return this.waitJobs;
		}

		// returns an int for run time for server
		public int getRunJob(){
			return this.runJobs;
		}


		//
		// type: an identifier of job category based on run time
		//
		public String getType() {
			return this.type;
		}

		//
		// Timing
		//
		// limit: the number of servers of a particular type
		public int getLimit() {
			return this.limit; // the number of servers of a particular type
		}

		//
		// bootupTime: the amount of time taken to boot a server of a particular type
		//
		public int getBootupTime() {
			return this.bootTime;
		}

		//
		// hourlyRate: the monetary cost for renting a server of a particular type per
		// 
		public Float getHourlyRate() {
			return this.hourlyRate;
		}

		//
		// Resource requirements
		//
		// core: the number of CPU cores
		public int getCores() {
			return this.coreCount;
		}

		//
		// memory: the amount of RAM (in MB)
		//
		public int getMemory() {
			return this.memory;
		}

		//
		// disk: the amount of disk space (in MB)
		//
		public int getDisk() {
			return this.disk;
		}

		//
		// This is a debug method to print all the fields of a given server object;
		// 	this is essentially a 'toString()'-like method.
		//
        public void printData(){
             System.out.println(this.type + " " + this.limit + " " + this.bootTime + " " + this.hourlyRate + " " + this.coreCount + " " + this.memory + " " + this.disk);
        }


}
