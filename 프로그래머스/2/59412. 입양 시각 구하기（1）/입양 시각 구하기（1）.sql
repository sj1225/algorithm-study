SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS HOUR, COUNT(*) AS COUNT
  FROM ANIMAL_OUTS
 WHERE TO_CHAR(DATETIME, 'HH24MI') >= '0900' AND TO_CHAR(DATETIME, 'HH24MI') < '1959'
GROUP BY TO_NUMBER(TO_CHAR(DATETIME, 'HH24'))
ORDER BY TO_NUMBER(TO_CHAR(DATETIME, 'HH24'))