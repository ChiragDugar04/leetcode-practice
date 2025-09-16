/* Write your T-SQL query statement below */
WITH CTE AS (
    SELECT
        id,
        email,
        ROW_NUMBER() OVER (PARTITION BY email ORDER BY id) AS row_num
    FROM Person
)
DELETE FROM CTE
WHERE row_num > 1;