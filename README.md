# SpringBoot-Batch-Processing

Spring Batch is a lightweight, comprehensive batch framework designed to enable the development of robust batch applications.<br>

**What is Batch Application?**<br>
    The application which processes the bulk of records is called as Batch application. For Example<br>
👉🏻	Sending Monthly Salaries to all employees in the company<br>
👉🏻	Generating Monthly PaySlips<br>
👉🏻	Sending Monlty Account statement to account holders<br>
👉🏻	Sending Monthly Credit Card bill statement<br>
👉🏻	Sending Greetings to multiple customers<br>                                                       
👉🏻	Sending Notices on a daily/weekly/monthly/yearly basis...<br>

**Spring Batch Terminology**
1)	Job Launcher
2)	Job
3)	Step
4)	Item Reader
5)	Item Processor
6)	Item Writer
7)	Job Repository

   ![image](https://github.com/Debarjitmohanty/SpringBoot-Batch-Processing/assets/91021174/c08c636d-bc2f-4cd3-8fd7-2de571fd44b8)

 
 
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
