# COMP3100 Stage 2
Stage 2 for COMP3100 by Michael Thygesen - `45207275`

See [DCS Report] for further documentation.

### Implemented Algorithims
- Simple First Fit
- Custom Algorithm

### Demo Instructions:

1. Download/Clone Git repo

3. Extract/unzip downloaded file if need be

4. First go to the `src` folder: `COMP3100Stage2/src/` 


    We want to make sure the files have correct permissions 
    
    
      Run the command `sudo chmod u+rwx [filename]` for the following files:
      
      
      E.g. `sudo chmod u+rwx ds-server` 
      
      
         ds-server
         test_results
         Client.java
         Might need to for these too: 
            Server.java
            Job.java


      Essentially this gives the file read, write, and run permissions...
   
        
5. Once files have appropriate permissions:

    - run the command: `javac Client.java`, this compiles the java Client code
    - might need to do the same for `Job.java` & `Server.java`
    
6. Whilst still in `src` folder, we can now run the test-script:
    * `./test_results java Client" -o co -c configs/other/`
    
7. That should be it.

 
### Group Members for Stage 1
- Anthony Allan - ` (45634963) `
- Chaz Lambrechtsen - `(45426317)`
