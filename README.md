# ** Distributed Cloud Scheduler **

The 'docs' folder contains: 

* Results pdf
* Results excel file
* ds-sim user guide


The 'results' files (pdf/excel, in the docs folder) have been provided so that you can see how the data for the report has been collected, and how the averages were calculated and so on.


----

### Sections in README:

* [0. Easy Demo Instructions](README.md#section-0-easier-demo-instructions)
* [1. Demo Instructions](README.md#section-1-demo-instructions)
* [2. Instructions for testing individual configuration files](README.md#section-2-Instructions-for-running-individual-Configuration-Files)
* [3. Stage 1 Group Members](README.md#Section-3-Group-Members-for-Stage-1)        


----

### Section 0: Easier Demo Instructions

Simply run the script `runTest.sh`:

     ./runTest.sh {tt || co || ru}
     
     Where
         tt = turnaround time
         co = cost optimisation
         ru = resource utilisation    
 

For Example:

    ./runTest.sh co
    

If you are encountering issues with running this script make sure to:

* give permissions to the following files:
   * `runTest.sh`
   * `Client.java`
   * `demoS2Final`
   * `ds-server`

You can give permission to these files by doing:

    chmod u+rwx [fileName]
    
    
For example:

    chmod u+rwx runTest.sh


The script is working properly if you see the following output:

     Testing for: Cost Optimisation (co)

     Running config20-long-low.xml
     Running config20-med-med.xml
     ...
     ...


-----


### Section 1: Demo Instructions:

(This was written before the easy script was made... This is essentially the same process)

1. Make sure you are in Ubuntu and have a terminal open

2. Download/Clone this git repo by doing either:
    *  Download as zip and extract to suitable location; or
    *  Type the follwing in the command-line: 
    
    
    
             git clone https://github.com/MrThygesen16/COMP3100Stage2


3. Once downloaded and/or extracted go to the `src` folder: `COMP3100Stage2/src/` 


    We want to make sure the files have correct permissions 
    
    
    Run the following command for the necessary files:
      
       sudo chmod u+rwx [filename]
    
      * Necessary:
        * `ds-server`
        * `demoS2Final`
        * `Client.java`
      
      
      E.g. 
            
            sudo chmod u+rwx ds-server

      
      * (Optional) If there are still issues, try doing the same for the files below: 
           * `Server.java`
           * `Job.java`
            

      Essentially this gives the file read, write, and run permissions...
   
        
4. Once files have appropriate permissions:


    * We need to first compile the Client file: 
    
    
      Type (In the terminal): 
      
          javac Client.java
    
    
    * If there are still issues then do the same for: 
      * `Job.java` & `Server.java`
    
    
5. Whilst still in `src` folder, we can now run the test-script:
    
    
    Type (Or copy/paste) into terminal: 
    
        ./demoS2Final "java Client" -o co -c configs/S2DemoConfigs/
    
        
    The objective of this custom algorithm is cost optimisation (aka co)
    
    
    The usage of the test-script is:
    
    
         ./demoS2Final "java [Client-name] [optional paramters]" -o {tt,ru,co} [-c CONFIG_DIR] [-n]
         
         
      * client_command_string is the name of the java Client class
        * In our case it will be `"java Client"`
          * This Client (`Client.java`) does not accept any command-line paramters
          * The default algorithm is a custom one 
          
          
      * -o is objective of algorithm: 
        * tt = turnaround time
        * ru = resource utilisation
        * co = cost optimisation (the objective this algorithm is optimised for)
        
        
      * -c is the configuration directory
        * The configuration files can be found in `COMP3100Stage2/src/configs/` 
        
        
      * [-n] = newline mode - Ignore this
        * This is an optional parameter for test script...
         * **We do not want this enabled**
         
         
6. We should expect to see an output like this (once it has finished running):
                  

                  Total rental cost
                  Config                      |ATL       |FF        |BF        |WF        |Yours
                  config100-long-high.xml     |620.01    |776.34    |784.3     |886.06    |726.22
                  config100-long-low.xml      |324.81    |724.66    |713.42    |882.02    |618.71
                  config100-long-med.xml      |625.5     |1095.22   |1099.21   |1097.78   |846.58
                  config100-med-high.xml      |319.7     |373.0     |371.74    |410.09    |352.0
                  config100-med-low.xml       |295.86    |810.53    |778.18    |815.88    |618.65
                  config100-med-med.xml       |308.7     |493.64    |510.13    |498.65    |390.38
                  config100-short-high.xml    |228.75    |213.1     |210.25    |245.96    |219.0
                  config100-short-low.xml     |225.85    |498.18    |474.11    |533.92    |382.77
                  config100-short-med.xml     |228.07    |275.9     |272.29    |310.88    |257.98
                  config20-long-high.xml      |254.81    |306.43    |307.37    |351.72    |303.81
                  config20-long-low.xml       |88.06     |208.94    |211.23    |203.32    |155.53
                  config20-long-med.xml       |167.04    |281.35    |283.34    |250.3     |237.56
                  config20-med-high.xml       |255.58    |299.93    |297.11    |342.98    |296.99
                  config20-med-low.xml        |86.62     |232.07    |232.08    |210.08    |155.06
                  config20-med-med.xml        |164.01    |295.13    |276.4     |267.84    |261.48
                  config20-short-high.xml     |163.69    |168.7     |168.0     |203.66    |173.27
                  config20-short-low.xml      |85.52     |214.16    |212.71    |231.67    |155.1
                  config20-short-med.xml      |166.24    |254.85    |257.62    |231.69    |217.92
                  Average                     |256.05    |417.90    |414.42    |443.03    |353.83
                  Normalised (ATL)            |1.0000    |1.6321    |1.6185    |1.7303    |1.3819
                  Normalised (FF)             |0.6127    |1.0000    |0.9917    |1.0601    |0.8467
                  Normalised (BF)             |0.6178    |1.0084    |1.0000    |1.0690    |0.8538
                  Normalised (WF)             |0.5779    |0.9433    |0.9354    |1.0000    |0.7987
                  Normalised (AVG [FF,BF,WF]) |0.6023    |0.9830    |0.9748    |1.0421    |0.8323


                  Final results:
                  2.1: 1/1
                  2.2: 1/1
                  2.3: 1/1
                  2.4: 6/6


7. That should be it. The results at the bottom indicate the marks (out of 9) for the test script.


----


### Section 2: Instructions for running individual Configuration Files


Once the steps above have been completed, you may wish to run each configuration file individually.


To do so you will need to open two terminals. One for ds-client, and the other for the DJS Client.


For example:


1. Terminal 1: (ds-client)


       ./ds-server -c configs/default/ds-config01--wk9.xml -v all
    
    
 2. Terminal 2: (DJS Client)


        java Client



The arguments for ds-client are:

    ./ds-server -c [configuration file] -v [detail option]
    
In our case it will look something like:

    ./ds-server -c configs/[configuration folder]/[configuration file] -v [detail option]
    
The options for folders are:

* `configs/other/`
* `configs/default/`
* `configs/S2DemoConfigs/`
* `configs/week6/`


The option [Configuration file] specifies which config files to use. And [detail option] can be 'brief' or 'all'.
Essentially brief will show less detail than all.

There 4 folders in `COMP3100Stage2/src/configs/`, contain the follwing configurations:

1. `configs/default/`
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

   
2. `configs/other/`
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


3. `configs/S2DemoConfigs/`  
   * config20-long-low.xml
   * config20-med-med.xml
   * config20-short-high.xml
   * config32-long-high.xml
   * config32-long-med.xml
   * config32-med-high.xml
   * config32-med-low.xml
   * config32-short-low.xml
   * config32-short-med.xml
   * config50-long-high.xml
   * config50-long-low.xml
   * config50-long-med.xml
   * config50-med-high.xml
   * config50-med-low.xml
   * config50-med-med.xml
   * config50-short-high.xml
   * config50-short-low.xml
   * config50-short-med.xml


4. `configs/week6/`
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
 
 
 The above example is running the config file: `config100-long-low.xml`, from `configs/other/`
 

 ----
