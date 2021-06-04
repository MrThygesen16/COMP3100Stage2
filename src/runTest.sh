#!/bin/bash

var=$1

case $var in

    "tt") 
        echo "Testing for turnaround time"
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    "co")
        echo "Testing for cost optimisation"
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    "ru")
        echo "Testing for resource utilisation"
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    *)
        echo "error. Script usage: ./runTest.sh {tt || co || ru}"
        ;;
    
esac