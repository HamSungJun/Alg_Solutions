SELECT
    w2.Id
FROM
    Weather AS w1 INNER JOIN Weather AS w2 ON DATEDIFF(w2.RecordDate, w1.RecordDate) = 1
    AND w2.Temperature > w1.Temperature;