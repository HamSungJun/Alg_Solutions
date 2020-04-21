SELECT
    T.eName AS Employee
FROM (
    SELECT
        E.Name AS eName
    FROM
        Employee AS E INNER JOIN Employee AS M ON E.ManagerId = M.Id
    WHERE E.Salary > M.Salary
) T;