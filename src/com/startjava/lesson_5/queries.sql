/* Вывод всей таблицы */
SELECT * FROM Jaegers;

/* Отобразить только не уничтоженных роботов */
SELECT * FROM Jaegers WHERE status = 'Active';

/* Отобразить роботов нескольких серий: Mark-1 и Mark-4 */
SELECT * FROM Jaegers WHERE mark IN ('1', '4');

/* Отобразить всех роботов, кроме Mark-1 и Mark-4*/
SELECT * FROM Jaegers WHERE mark NOT IN ('1', '4');

/* Отсортировать таблицу по убыванию по столбцу mark */
SELECT * FROM Jaegers ORDER BY mark DESC;

/* Отобразить информацию о самом старом роботе */
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

/* Отобразить роботов, которые уничтожили больше всех kaiju */
SELECT * FROM Jaegers WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM Jaegers);

/* Отобразить средний вес роботов */
SELECT AVG(weight) FROM Jaegers;

/* Увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены */
UPDATE Jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status = 'Active';

/* Удалить уничтоженных роботов */
DELETE FROM Jaegers WHERE status = 'Destroyed';