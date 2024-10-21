SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
  FROM FOOD_PRODUCT t1
 WHERE CATEGORY IN ('과자','국','김치','식용유')
GROUP BY PRODUCT_ID HAVING PRICE >= ALL ( SELECT MAX(PRICE)
                                            FROM FOOD_PRODUCT
                                           WHERE CATEGORY = t1.CATEGORY
                                          GROUP BY PRODUCT_ID )
ORDER BY PRICE DESC