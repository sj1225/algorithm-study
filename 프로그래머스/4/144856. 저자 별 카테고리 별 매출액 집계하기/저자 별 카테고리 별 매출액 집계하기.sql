SELECT t2.AUTHOR_ID, t3.AUTHOR_NAME, t2.CATEGORY, SUM(t1.SALES* t2.PRICE) TOTAL_SALES
  FROM BOOK_SALES t1
       JOIN BOOK t2 ON t1.BOOK_ID = t2.BOOK_ID
       JOIN AUTHOR t3 ON t2.AUTHOR_ID = t3.AUTHOR_ID
 WHERE DATE_FORMAT(SALES_DATE, '%Y%m') = '202201'
GROUP BY t2.AUTHOR_ID, t2.CATEGORY
ORDER BY t2.AUTHOR_ID, t2.CATEGORY DESC