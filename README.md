# San Francisco Movie Locations

## General Information
The city of San Francisco has stored various data on any film, 
such as the names of the films and the locations where they were filmed, 
on the website `https://data.sfgov.org/api/views/yitu-d5am/rows.json`. 
The data itself is updated by the San Francisco at regular intervals.


The Json of the REST **GET** call, which you get after sending, has a special structure.
The Json has a *meta* and a *data block* on the top level. The meta block defines the structure of the data block.

## Json data structure
The *meta block* is structured in such a way that within it there is the
*view block* which contains the column block. The column block defines how the 
structure of the data within the *data block* looks like and which order these data have in the data block.

### meta block structure
![meta_block](/pictures/meta_block.png)

### data block structure
![data_block](/pictures/data_block.png)


## Description of the task
Find out all locations in which the movie **The Matrix** was filmed.
