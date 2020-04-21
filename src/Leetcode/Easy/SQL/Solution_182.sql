SELECT DISTINCT
    T.Email AS Email
FROM (
    SELECT
        P1.Email AS Email
    FROM
        Person AS P1 INNER JOIN Person AS P2 ON P1.Id <> P2.Id AND P1.Email = P2.Email
) AS T;