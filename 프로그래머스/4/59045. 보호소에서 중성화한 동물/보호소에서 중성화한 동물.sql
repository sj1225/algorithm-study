SELECT t1.ANIMAL_ID, t1.ANIMAL_TYPE, t1.NAME
  FROM ANIMAL_INS t1
       LEFT JOIN ANIMAL_OUTS t2 ON t1.ANIMAL_ID = t2.ANIMAL_ID
 WHERE t1.SEX_UPON_INTAKE <> t2.SEX_UPON_OUTCOME
ORDER BY t1.ANIMAL_ID