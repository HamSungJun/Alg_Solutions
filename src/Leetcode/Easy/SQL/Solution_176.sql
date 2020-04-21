 SELECT IFNULL(
     (SELECT DISTINCT
        E.Salary
     FROM
        Employee AS E
     ORDER BY
        E.Salary DESC LIMIT 1 OFFSET 1
     ), NULL) AS SecondHighestSalary;