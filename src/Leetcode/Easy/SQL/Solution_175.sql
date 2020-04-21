SELECT
    P.FirstName AS FirstName,
    P.LastName AS LastName,
    A.City AS City,
    A.State AS State
FROM
    Person AS P LEFT OUTER JOIN Address AS A ON P.PersonId = A.PersonId;