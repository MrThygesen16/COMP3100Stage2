#!/bin/bash

var=$1

case $var in

    "tt") 
        echo "Testing for: Turnaround Time ($var)" $'\n'
        cd src/
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    "co")
        echo "Testing for: Cost Optimisation ($var)" $'\n'
        cd src/
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    "ru")
        echo "Testing for Resource Utilisation ($var)" $'\n'
        cd src/
        ./demoS2Final "java Client" -o $var -c configs/S2DemoConfigs/
        ;;

    *)
        echo "Error, script usage: ./runTest.sh {tt || co || ru}"
        echo $'\t'"tt = turnaround time"
        echo $'\t'"co = cost optimisation"
        echo $'\t'"ru = resource utilisation"
        ;;
    
esac