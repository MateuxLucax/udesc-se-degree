#!/bin/bash

runs=5
declare -a arr=("hello" "coffee" "prime" "traditional")

for i in "${arr[@]}"
do
   for j in {1,2,8,250}
   do
     java src/Application.java dataset "$i" "$j" "$runs" true
     echo ""
   done
done
