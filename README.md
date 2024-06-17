# SpringBoot-Batch-Processing

Spring Batch Processing
Spring Batch
Spring Batch is a lightweight, comprehensive batch framework designed to enable the development of robust batch applications.
What is Batch Application?
    The application which processes the bulk of records is called as Batch application. For Example
	Sending Monthly Salaries to all employees in the company
	Generating Monthly PaySlips
	Sending Monlty Account statement to account holders
	Sending Monthly Credit Card bill statement
	Sending Greetings to multiple customers                                                       
	Sending Notices on a daily/weekly/monthly/yearly basis...
Spring Batch Terminology
1)	Job Launcher
2)	Job
3)	Step
4)	Item Reader
5)	Item Processor
6)	Item Writer
7)	Job Repository
  Source                                                                                                        Destination
                                                                                                                                
                                                             	
           Item Reader                   Item Processer                Item Writer          

 
Requirement : Read customer data From CSV file and write it into Database table
 1) Create Spring Starter project with the below dependencies
a)	web-starter
b)	batch
c)	data-jpa
d)	MySQL-driver      
e)	Lombok
 2) Configure Datasource properties in the application.yml file
 3) Keep the Source File under src/main/resources folder (customers.csv)
 4) Create Entity class & Repository interface
 5) Create a Batch Configuration class
