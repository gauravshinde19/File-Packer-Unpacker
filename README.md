# File Packer-Unpacker

## Description :
- This project provides the facility of packing and unpacking the regular 
files. </br>
- In case of packing activity, all the data of multiple regular files gets 
stored in the single file with all related metadata. </br>
- In case of unpacking activity, the data from the from the packed file 
gets extracted into the separate file with all necessary details. </br> </br>

## How to Run and use the project :
### For Packing :-
1) Compile the Packer.java using command </br> </br>
   ```sh
   javac Packer.java
   ```
3) Run the Packer.java using command </br> </br>
   ```sh
   java Packer
   ```
4) It will ask to enter directory name for packing, enter Marvellous
5) It will ask to enter packed file name for packing activity, enter any name to pack file (Mpack)
6) It will packed all the files with extension .txt into Mpack file
7) At the end it will display total number of files inside Marvellous directory and number of packed files (.txt)
   
### For Unpacking :-
1) Compile the Unpacker.java using command </br> </br>
   ```sh
   javac Unpacker.java
   ```
2) Run the Unpacker.java using command </br> </br>
   ```sh
   java Unpacker
   ```
3) It will ask to enter Packed file name for unpacking (Mpack)
4) It will display name of all the drop files from packed file
5) It will display count of all the drop files from packed file
