SELECT t1.ID, t1.EMAIL, t1.FIRST_NAME, t1.LAST_NAME
  FROM DEVELOPERS AS t1
 WHERE SKILL_CODE & ( SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')
    OR SKILL_CODE & ( SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')
ORDER BY ID