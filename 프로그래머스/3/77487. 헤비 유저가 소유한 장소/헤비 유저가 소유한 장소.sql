WITH HEAVEY_USER_LIST AS (
    SELECT HOST_ID FROM PLACES GROUP BY HOST_ID HAVING COUNT(*) >= 2
)

SELECT *
  FROM PLACES
 WHERE HOST_ID IN ( SELECT HOST_ID FROM HEAVEY_USER_LIST )
ORDER BY ID