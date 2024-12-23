SELECT t3.FLAVOR
  FROM
(
    SELECT t1.FLAVOR, SUM(t1.TOTAL_ORDER) TOTAL_ORDER FROM FIRST_HALF t1 GROUP BY t1.FLAVOR
    UNION ALL
    SELECT t2.FLAVOR, SUM(t2.TOTAL_ORDER) TOTAL_ORDER FROM JULY t2 GROUP BY t2.FLAVOR
) t3
GROUP BY t3.FLAVOR
ORDER BY SUM(t3.TOTAL_ORDER) DESC
LIMIT 3