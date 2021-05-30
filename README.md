# **COMP3100 Stage 2**
Stage 2 for COMP3100 by Michael Thygesen - `45207275`

The file "DJS Report.pdf" is the report for Stage 2.


The 'docs' folder contains: 

* Results pdf
* Results excel file
* ds-sim user guide


The 'results' files (pdf/excel, in the docs folder) have been provided so that you can see how the data for the report has been collected, and how the averages were calculated and so on.


### Sections in README:

* [Demo Instructions](README.md#demo-instructions)
* [Stage 1 Group Members](README.md#Group-Members-for-Stage-1)        



### Demo Instructions:


1. Make sure you are in Ubuntu and have a terminal open

2. Download/Clone this git repo by doing either:
    *  Download as zip and extract to suitable location; or
    *  Type the follwing in the command-line: 
    
    
      `git clone https://github.com/MrThygesen16/COMP3100Stage2`


3. Once downloaded and/or extracted go to the `src` folder: `COMP3100Stage2/src/` 


    We want to make sure the files have correct permissions 
    
    
    Run the following command for the necessary files:
      
      `sudo chmod u+rwx [filename]` 
    
      * Necessary:
        * ds-server
        * test_results
        * Client.java
      
      
      E.g. `sudo chmod u+rwx ds-server`

      
      * (Optional) If there are still issues, try doing the same for the files below: 
           * Server.java
           * Job.java
            

      Essentially this gives the file read, write, and run permissions...
   
        
4. Once files have appropriate permissions:


    * We need to first compile the Client file: 
    
    
      Type: `javac Client.java` (In the terminal)
    
    
    * If there are still issues then do the same for: 
      * `Job.java` & `Server.java`
    
    
5. Whilst still in `src` folder, we can now run the test-script:
    
    
    Type: `./test_results "java Client" -o co -c configs/other/` (Or copy/paste) into terminal
    
    
    The objective of this custom algorithm is cost optimisation (aka co)
    
    
    The usage of the test-script is:
    * `./test_results "java [Client-name] [optional paramters]" -o {tt,ru,co} [-c CONFIG_DIR] [-n] `
         * client_command_string is the name of the java Client class
            * In our case it will be `"java Client"`
            * This Client (`Client.java`) does not accept any command-line paramters
                * The default algorithm is a custom one 
         * -o is objective of algorithm: 
            * tt = turnaround time
            * ru = resource utilisation
            * co = cost optimisation (the objective this algorithm is optimised for)
         * -c is the configuration directory
            * The right config files can be found in `COMP3100Stage2/src/configs/other/` 
         * [-n] = newline mode - Ignore this
            * This is an optional parameter for test script...
            * **We do not want this enabled**
         


6. That should be it.


### Instructions for running individual Configuration Files


Once the steps above have been completed, you may wish to run each configuration file individually.


To do so you will need to open two terminals. One for ds-client, and the other for the DJS Client.


For example:


Terminal 1: (ds-client)


    ./ds-server -c configs/default/ds-config01--wk9.xml -v all
    
    
Terminal 2: (DJS Client)

    java Client



The arguments for ds-client are:

    ./ds-server -c [configuration file] -v [detail option]
    
The option [Configuration file] specifies which config files to use. And [detail option] can be 'brief' or 'all'.
Essentially brief will show less detail than all.

There are 3 folders of configs in `COMP3100Stage2/src/configs/`, each contain:

1. default
   * ds-config01--wk9.xml
   * ds-S1-config00--demo.xml
   * ds-S1-config01--demo.xml
   * ds-S1-config02--demo.xml
   * ds-S1-config03--demo.xml
   * ds-S1-config04--demo.xml
   * ds-S1-config05--demo.xml
   * ds-S1-config06--demo.xml
   * ds-sample-config01.xml
   * ds-sample-config02.xml
   * ds-sample-config03.xml
   * ds-sample-config04.xml
   * ds-sample-config05.xml
3. other
   * config100-long-high.xml
   * config100-long-low.xml
   * config100-long-med.xml
   * config100-med-high.xml
   * config100-med-low.xml
   * config100-med-med.xml
   * config100-short-high.xml
   * config100-short-low.xml
   * config100-short-med.xml
   * config20-long-high.xml
   * config20-long-low.xml
   * config20-long-med.xml
   * config20-med-high.xml
   * config20-med-low.xml
   * config20-med-med.xml
   * config20-short-high.xml
   * config20-short-low.xml
   * config20-short-med.xml
5. week6
   * ds-S1-config01--wk6.xml
   * ds-S1-config02--wk6.xml
   * ds-S1-config03--wk6.xml
   * ds-S1-config04--wk6.xml
   * ds-S1-config05--wk6.xml


So to run any of the above configuration files for DJS client use the example above and specify which
folder and configuratio you want. 

For example:

 Terminal 1: 
     ./ds-server -c configs/other/config100-long-low.xml -v all 
 
 Terminal 2: 
     java Client
 
 
 The above example is running the config file: 'config100-long-low.xml', from the 'other folder'
 

 
 
### Group Members for Stage 1
- Anthony Allan - ` (45634963) `
- Chaz Lambrechtsen - `(45426317)`
