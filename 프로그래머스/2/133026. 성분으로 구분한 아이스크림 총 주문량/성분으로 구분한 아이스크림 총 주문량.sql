SELECT t2.INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
  FROM FIRST_HALF AS t1,
       ICECREAM_INFO AS t2
 WHERE t1.FLAVOR = t2.FLAVOR
GROUP BY t2.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER