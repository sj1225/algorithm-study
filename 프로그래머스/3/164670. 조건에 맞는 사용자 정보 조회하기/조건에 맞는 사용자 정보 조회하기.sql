SELECT USER_ID,
       NICKNAME,
       CONCAT(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) 전체주소,
       CONCAT(SUBSTR(TLNO,1,3),'-',SUBSTR(TLNO,4,4),'-',SUBSTR(TLNO,8,4)) 전화번호
  FROM USED_GOODS_BOARD t1
       JOIN USED_GOODS_USER t2 ON t1.WRITER_ID = t2.USER_ID
GROUP BY t2.USER_ID HAVING COUNT(*) >= 3
ORDER BY USER_ID DESC