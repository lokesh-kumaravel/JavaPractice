1. All table should insert 10 records
2. dept name, emp list, manager and their employees
3. Add a new column to the employee and display the highest salary in the department, avg salary of each department,
4. Create column location in the employee, district wise count and the name of the employee
5. Last name starts with N
6. Create column first name+last name add in the new column
7. Highest salary increment 10% from it.


CREATE DATABASE class;
CREATE TABLE Department (

    dept_id INT(10) PRIMARY KEY,
    dept_name VARCHAR(50),
    location VARCHAR(50)
) ENGINE=InnoDB;

CREATE TABLE Employee (
    emp_id INT(10) PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    dept_id INT(10),
    salary DECIMAL(10,2),
    manager_id INT(10) DEFAULT NULL,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

ALTER TABLE Employee 
ADD CONSTRAINT fk_manager FOREIGN KEY (manager_id) REFERENCES Employee(emp_id) ON DELETE SET NULL ON UPDATE CASCADE;

INSERT INTO Department (dept_id, dept_name, location) VALUES
(1, 'HR', 'New York'),
(2, 'Finance', 'Los Angeles'),
(3, 'IT', 'San Francisco'),
(4, 'Sales', 'Chicago'),
(5, 'Marketing', 'Houston'),
(6, 'Support', 'Seattle'),
(7, 'Admin', 'Boston'),
(8, 'Legal', 'Dallas'),
(9, 'Operations', 'Miami'),
(10, 'R&D', 'Denver');

INSERT INTO Employee (emp_id, first_name, last_name, dept_id, salary, manager_id, location) VALUES
(101, 'John', 'Doe', 1, 50000.00, NULL, 'Dindugal'),
(102, 'Jane', 'Smith', 2, 60000.00, 101, 'Palani'),
(103, 'Emily', 'Jones', 3, 55000.00, 101, 'Dindugal'),
(104, 'Michael', 'Brown', 1, 62000.00, 102, 'Dindugal'),
(105, 'Chris', 'Davis', 2, 58000.00, 102, 'Dindugal'),
(106, 'Pat', 'Wilson', 3, 61000.00, 103, 'Palani'),
(107, 'Alex', 'Taylor', 1, 59000.00, 104, 'Coimbatore'),
(108, 'Jordan', 'Anderson', 2, 57000.00, 105, 'Coimbatore'),
(109, 'Morgan', 'Thomas', 3, 60000.00, 106, 'Dindugal'),
(110, 'Casey', 'White', 1, 63000.00, 107, 'Coimbatore');

SELECT * FROM Employee where manager_id="101";

SELECT
    d.dept_name AS Department,
    e.first_name AS Employee,
    m.first_name AS Manager,
    (SELECT GROUP_CONCAT(first_name) 
     FROM Employee
     WHERE manager_id = e.emp_id) AS Managed_Employees
FROM Employee e
JOIN Department d ON e.dept_id = d.dept_id
LEFT JOIN Employee m ON e.manager_id = m.emp_id;

SELECT
d.dept_name AS DepartmentName,
MAX(salary) AS MAX_Salary,
AVG(salary) AS AVG_Salary
FROM Department d JOIN Employee e
ON d.dept_id=e.dept_id
GROUP BY d.dept_name;

SELECT * FROM Employee;
ALTER TABLE Employee
ADD location VARCHAR(100);

SELECT
    location AS District,
    COUNT(*) AS Employee_Count,
    GROUP_CONCAT(CONCAT(first_name, ' ', last_name) ORDER BY first_name ) AS Employee_Names
FROM
    Employee
GROUP BY
    location;

SELECT *
FROM Employee
WHERE last_name LIKE 'N%';

ALTER TABLE Employee
ADD full_name varchar(50);

UPDATE Employee
SET full_name = concat(first_name,' ',last_name);

Disable safe update mode
SET SQL_SAFE_UPDATES = 0;

Perform the update
UPDATE Employee
SET full_name = CONCAT(first_name, ' ', last_name);

Re-enable safe update mode
SET SQL_SAFE_UPDATES = 1;
SET SQL_SAFE_UPDATES=0;
UPDATE Employee
SET salary = salary*1.10
WHERE salary = (SELECT MAX(salary) FROM Employee);
SET SQL_SAFE_UPDATES=1;


SELECT * FROM Employee;