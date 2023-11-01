import java.util.Scanner;
import java.util.Vector;
import java.util.*;
class Maain {
    public static int findMinValue(Vector<Integer> vector) {
        int minValue = vector.get(0);

        for (int i = 1; i < vector.size(); i++) {
            int currentValue = vector.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
/**
 * 7
3 1 4 1 5 9 2
 */
        return minValue;
    }
    public static Vector<Integer> subsize(Vector<Integer> vector1, int size, int starting) {
        Vector<Integer> temp = new Vector<Integer>();
        for (int i = 0; i < size; i++) {
            if (i + starting < vector1.size()) {
                temp.add(vector1.get(i + starting));
            } else {
                temp.add(0); // Or some other appropriate value
            }
        }
        return temp;
    }

    public static int asymmetric(Vector<Integer> subset) {
        int value = 0;
        int limit;
        int size = subset.size();
        if (size == 1) {
            return 0;
        } else {
            limit = (size % 2 == 0) ? size / 2: ((size - 1) / 2);
        }


        for (int i = 0; i < limit; i++) {

            value += Math.abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }
    public static int asymmetric(List<Integer> subset) {
        int value = 0;
        int limit;
        int size = subset.size();
        if (size == 1) {
            return 0;
        } else {
            limit = (size % 2 == 0) ? size / 2: ((size - 1) / 2);
        }


        for (int i = 0; i < limit; i++) {

            value += Math.abs(subset.get(i) - subset.get(size - i - 1));
        }

        return value;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numMountains = 297;
        System.out.print("");
        //numMountains = input.nextInt();

        Vector<Integer> heights = new Vector<Integer>();
        Vector<Integer> outputs = new Vector<Integer>();

//        input.nextLine();
        String tempInput="1209 1295 1262 1119 1090 1522 1455 1103 1305 1408 1079 1454 1404 1283 1046 1452 1479 1326 1531 1369 1594 1308 1231 1545 1513 1296 1328 1016 1098 1499 1399 1178 1498 1226 1130 1246 1097 1541 1123 1205 1489 1489 1158 1312 1107 1527 1079 1432 1458 1291 1346 1116 1517 1581 1113 1462 1505 1283 1394 1446 1181 1390 1510 1190 1181 1120 1564 1004 1584 1084 1115 1227 1338 1070 1075 1258 1347 1327 1597 1075 1301 1179 1238 1461 1121 1490 1537 1059 1403 1114 1418 1395 1586 1571 1539 1144 1545 1138 1106 1593 1417 1039 1217 1487 1293 1254 1453 1467 1564 1386 1520 1221 1034 1190 1152 1326 1383 1154 1157 1527 1342 1452 1310 1544 1224 1060 1165 1274 1191 1374 1294 1509 1587 1196 1141 1139 1200 1218 1181 1579 1390 1552 1129 1279 1360 1268 1062 1126 1142 1373 1103 1019 1035 1241 1216 1316 1311 1368 1060 1435 1109 1518 1128 1449 1502 1173 1141 1262 1165 1304 1217 1042 1042 1074 1399 1592 1087 1277 1042 1181 1045 1571 1510 1013 1440 1425 1424 1311 1239 1247 1201 1228 1445 1105 1054 1084 1395 1521 1123 1072 1411 1450 1299 1193 1302 1471 1290 1296 1296 1594 1324 1564 1079 1549 1307 1199 1119 1269 1532 1041 1568 1153 1090 1444 1262 1471 1410 1302 1009 1152 1054 1362 1043 1359 1258 1319 1436 1143 1570 1031 1361 1290 1010 1562 1129 1378 1132 1153 1479 1339 1390 1435 1107 1551 1225 1547 1225 1385 1507 1231 1296 1402 1134 1427 1235 1120 1319 1404 1508 1010 1496 1270 1252 1445 1302 1431 1389 1466 1243 1385 1040 1501 1333 1188 1223 1016 1269 1465 1364 1582 1274 1416 1000 1560 1499 1459 1413";


        String[] arrofStr= tempInput.split(" ");

        for(String element : arrofStr) {

            heights.add(Integer.parseInt(element));
        }

        outputs.add(0);


        for (int sizes = 2; sizes < 200; sizes++) {
            Vector<Integer> temp1 = new Vector<Integer>();
            for (int startings = 0; startings < numMountains - sizes; startings += 1) {
                Vector<Integer> temp = subsize(heights, sizes, startings);
                temp1.add(asymmetric(temp));
            }
            outputs.add(findMinValue(temp1));
        }
/*
7
3 1 4 1 5 9 2 */

        Vector<Vector<Integer>> iterations;

//        for(int i = heights.size(); i > 1; i--) {
//            int value = asymmetric(heights.subList(0, i-1));
//            System.out.println(value);
//        }

        for (int element : outputs) {
            System.out.print(element + " ");
        }
        System.out.println();




    }


}

/*
298
0 1 1 1 0 1 0 0 1 1 0 1 0 0 0 0 0 1 1 1 0 0 1 0 1 0 1 0 0 0 1 0 1 1 1 1 0 1 1 1 0 0 1 1 0 1 0 0 1 0 1 0 1 1 0 1 0 0 1 1 0 0 1 1 0 0 1 1 1 0 0 1 0 1 1 1 0 0 0 1 0 0 1 0 1 1 1 1 1 0 0 0 1 0 0 0 1 1 0 0 1 0 0 0 1 1 0 1 1 1 1 1 0 0 0 0 1 0 1 1 1 0 0 0 0 0 0 0 1 0 1 1 1 1 0 1 1 1 0 0 0 0 1 0 0 0 1 0 1 0 1 1 1 1 0 1 0 1 1 1 0 1 0 0 0 0 0 1 0 1 0 0 0 0 0 1 0 1 0 0 0 1 1 0 1 0 0 1 0 0 1 0 1 1 1 1 0 0 0 1 1 1 0 1 1 0 0 0 0 1 1 0 1 1 0 1 1 0 0 1 1 1 0 0 1 1 0 1 1 1 0 0 1 1 1 1 0 0 1 1 0 0 1 1 0 0 0 0 1 1 1 0 0 0 0 1 0 1 0 1 0 1 1 1 0 0 0 0 1 1 1 1 1 0 1 0 1 1 1 1 0 1 0 0 0 0 0 1 0 1 0 1 0 1 0 1 1 1

 */