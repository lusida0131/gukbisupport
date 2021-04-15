use hr;
select employee_id,concat(first_name,' ',last_name) as "name",
salary, job_id, hire_date, manager_id
from employees;
select  concat(first_name,' ',last_name) as "name", job_id as "job", salary, 
 12*salary+100 as "increased Ann_salary", 12*(salary+100) as "increased salary"
from employees;

select concat(last_name, ': 1 Year salary = $', salary*12) as "1 year slary"
from employees;

select distinct department_id, job_id
from employees;

select concat(first_name,' ',last_name) as "name",salary
from employees
where salary not between 7000 and 10000
order by salary;

select sysdate();
select last_name name, employee_id, hire_date
from employees
where hire_date between str_to_date('1995/05/20','%Y/%m/%d')
and str_to_date('1996/05/20','%Y/%m/%d')
order by hire_date;

select last_name as "e and o name"
from employees
where last_name like '%e%' and last_name like '%o%';

select employee_id, concat(last_name,' ',first_name) as "name",salary,
round(salary*12.3,0) as "increased Salary"
from employees
where department_id = 60;

select concat(first_name,' ',last_name) as name,
salary, salary*12, if(commission_pct is null, 'salary+commission','salary only') as "commision 여부"
from employees
order by 2 desc;


select concat(first_name,' ',last_name) as name,
salary, salary*12, commission_pct,(salary*12) + (salary*12*ifnull(commission_pct,0)) as "annual salary",
 if(commission_pct is null, 'salary+commission','salary only') as "commision 여부"
from employees
order by 5 desc;

select concat(first_name,' ',last_name) as "name", hire_date,
date_format(hire_date, '%W')as "day of the week"
from employees
order by date_format(hire_date, '%W');

select count(distinct manager_id) "Count Managers"
from employees;

select department_id, format(sum(salary),0) as '급여합계', format(avg(salary),0)as '급여평균', format(max(salary),0)as '최고급여', format(min(salary),0) as '최소급여'
from employees
group by department_id;

select job_id, avg(salary)
from employees
group by job_id
having avg(salary) > 10000;

select job_id, avg(salary)
from employees
where job_id not like '%cleck%'
group by job_id
having avg(salary) > 10000
order by avg(salary) desc;

desc departments;
desc locations;

select'Han-Bit', concat(first_name,' ',last_name) as "Name", job_id, department_name, city
from employees e, departments d, locations l
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.city like 'Oxford';

