# **COMP3100 Stage 2**
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
    
    
      Run the command `sudo chmod u+rwx [filename]` for the necessary files:
      
      * Necessary:
        * ds-server
        * test_results
        * Client.java
      * Might need to for these too: 
           * Server.java
           * Job.java
            
       
      E.g. `sudo chmod u+rwx ds-server`


      Essentially this gives the file read, write, and run permissions...
   
        
5. Once files have appropriate permissions:

    - run the command: `javac Client.java`, this compiles the java Client code
    - might need to do the same for `Job.java` & `Server.java`
    
6. Whilst still in `src` folder, we can now run the test-script:
    * `./test_results "java Client" -o co -c configs/other/`
    
    The objective of this custom algorithm is cost optimisation (aka co)
    
    The usage of the test-script is:
    * `./test_results "java [Client-name] [optional paramters]" -o {tt,ru,co} [-c CONFIG_DIR] [-n] `
         * client_command_string is the name of the java Client class
            * In our case it will be "java Client"
            * This program does not accept any command-line paramters
         * -o is objective of algorithm: 
            * tt = turnaround time
            * ru = resource utilisation
            * co = cost optimisation (the objective this algorithm is optimised for)
         * -c is the configuration directory
            * The right config files can be found in `COMP3100Stage2/src/configs/other/` 
         * [-n] = newline mode - Ignore this
            * This is an optional parameter for test script...
            * **We do not want this enabled**
         


7. That should be it.

 
### Group Members for Stage 1
- Anthony Allan - ` (45634963) `
- Chaz Lambrechtsen - `(45426317)`
