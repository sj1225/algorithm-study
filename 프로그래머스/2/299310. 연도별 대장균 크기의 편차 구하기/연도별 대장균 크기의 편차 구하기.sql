SELECT t2.YEAR, t2.MAX_SIZE_OF_COLONY - t1.SIZE_OF_COLONY YEAR_DEV, t1.ID
  FROM ECOLI_DATA t1
       JOIN ( SELECT YEAR(DIFFERENTIATION_DATE) YEAR,
                     MAX(SIZE_OF_COLONY) MAX_SIZE_OF_COLONY
                FROM ECOLI_DATA
              GROUP BY YEAR(DIFFERENTIATION_DATE) ) t2 ON YEAR(t1.DIFFERENTIATION_DATE) = t2.YEAR
ORDER BY YEAR, YEAR_DEV