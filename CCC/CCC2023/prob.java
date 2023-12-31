
import java.util.*;


public class prob {
    static Vector<Vector<Integer>> matchUps(List<Integer> main, int size, int domain) {
        Vector<Vector<Integer>> results = new Vector<Vector<Integer>>();

        for (int j = 0; j < size - domain + 1; j++) {
            Vector<Integer> temp = new Vector<Integer>();
            for (int i = j; i < domain + j; i++) {
                temp.add(main.get(i));
            }
            results.add(temp);
        }


        return results;
    }

    static int findBestRoutes(int[] main, int size, int domain) {

        int index = 0;
        Vector<Integer> differences = new Vector<Integer>();
        for (int i = 0; i < size - domain; i++) {
            int difference = main[i]-main[i+domain];

            differences.add(difference);

        }

        int minimumIndex = Math.abs(differences.get(0));
        for (int i = 1; i < differences.size(); i++) {
            if (minimumIndex > Math.abs(differences.get(i))) {
                minimumIndex = Math.abs(differences.get(i));
                if (minimumIndex < 0) {
                    index = i;
                } else {
                    index = i+1;
                }
            }
        }
        System.out.println(differences);

        return index;
    }
    public static int asymmetric(List<Integer> location, int domain) {

        int value = 0;

        //System.out.println(location);

        for (int i = 0; i < location.size()/2; i++) {
            value += Math.abs(location.get(i) - location.get(location.size()-i-1));
        }

        return value;
    }

    public static int route(int numMountains, List<Integer> numbers) {
        int value = 0;

        int first = Math.abs(numbers.get(numbers.size()-2) - numbers.get(0));
        int second = Math.abs(numbers.get(numbers.size()-1) - numbers.get(1));

        if (second < first) {
            value = 1;
        }


        //System.out.println("The array is " + numbers);
        System.out.println("First with\t" + first + " and second with\t" + second + " with best index \t" + value);
        System.out.println(numbers);
        System.out.println("This is with first 1\t" + numbers.get(numbers.size()-2) + "  ");
        System.out.println("This is with first 2\t" + numbers.get(0) + "  ");
        System.out.println("This is with second 1\t" + numbers.get(numbers.size()-1) + "  ");
        System.out.println("This is with second 2\t" + numbers.get(1) + "\n");


        return value;
    }

    public static void main(String[] args) {
        int numMountains = 296;
        int size = 295;

        int[] legend = {1209 , 1295 , 1262 , 1119 , 1090 , 1522 , 1455 , 1103 , 1305 , 1408 , 1079 , 1454 , 1404 , 1283 , 1046 , 1452 , 1479 , 1326 , 1531 , 1369 , 1594 , 1308 , 1231 , 1545 , 1513 , 1296 , 1328 , 1016 , 1098 , 1499 , 1399 , 1178 , 1498 , 1226 , 1130 , 1246 , 1097 , 1541 , 1123 , 1205 , 1489 , 1489 , 1158 , 1312 , 1107 , 1527 , 1079 , 1432 , 1458 , 1291 , 1346 , 1116 , 1517 , 1581 , 1113 , 1462 , 1505 , 1283 , 1394 , 1446 , 1181 , 1390 , 1510 , 1190 , 1181 , 1120 , 1564 , 1004 , 1584 , 1084 , 1115 , 1227 , 1338 , 1070 , 1075 , 1258 , 1347 , 1327 , 1597 , 1075 , 1301 , 1179 , 1238 , 1461 , 1121 , 1490 , 1537 , 1059 , 1403 , 1114 , 1418 , 1395 , 1586 , 1571 , 1539 , 1144 , 1545 , 1138 , 1106 , 1593 , 1417 , 1039 , 1217 , 1487 , 1293 , 1254 , 1453 , 1467 , 1564 , 1386 , 1520 , 1221 , 1034 , 1190 , 1152 , 1326 , 1383 , 1154 , 1157 , 1527 , 1342 , 1452 , 1310 , 1544 , 1224 , 1060 , 1165 , 1274 , 1191 , 1374 , 1294 , 1509 , 1587 , 1196 , 1141 , 1139 , 1200 , 1218 , 1181 , 1579 , 1390 , 1552 , 1129 , 1279 , 1360 , 1268 , 1062 , 1126 , 1142 , 1373 , 1103 , 1019 , 1035 , 1241 , 1216 , 1316 , 1311 , 1368 , 1060 , 1435 , 1109 , 1518 , 1128 , 1449 , 1502 , 1173 , 1141 , 1262 , 1165 , 1304 , 1217 , 1042 , 1042 , 1074 , 1399 , 1592 , 1087 , 1277 , 1042 , 1181 , 1045 , 1571 , 1510 , 1013 , 1440 , 1425 , 1424 , 1311 , 1239 , 1247 , 1201 , 1228 , 1445 , 1105 , 1054 , 1084 , 1395 , 1521 , 1123 , 1072 , 1411 , 1450 , 1299 , 1193 , 1302 , 1471 , 1290 , 1296 , 1296 , 1594 , 1324 , 1564 , 1079 , 1549 , 1307 , 1199 , 1119 , 1269 , 1532 , 1041 , 1568 , 1153 , 1090 , 1444 , 1262 , 1471 , 1410 , 1302 , 1009 , 1152 , 1054 , 1362 , 1043 , 1359 , 1258 , 1319 , 1436 , 1143 , 1570 , 1031 , 1361 , 1290 , 1010 , 1562 , 1129 , 1378 , 1132 , 1153 , 1479 , 1339 , 1390 , 1435 , 1107 , 1551 , 1225 , 1547 , 1225 , 1385 , 1507 , 1231 , 1296 , 1402 , 1134 , 1427 , 1235 , 1120 , 1319 , 1404 , 1508 , 1010 , 1496 , 1270 , 1252 , 1445 , 1302 , 1431 , 1389 , 1466 , 1243 , 1385 , 1040 , 1501 , 1333 , 1188 , 1223 , 1016 , 1269 , 1465 , 1364 , 1582 , 1274 , 1416 , 1000 , 1560 , 1499 , 1459
        };

        Deque<Integer> numbers = new ArrayDeque<>();

        for (int element: legend) {
            numbers.add(element);
        }




        for (int i = 0; i < 2; i++) {
            List<Integer> copy = List.copyOf(numbers);


            int bestResult =   route(size-1-i, copy);
            List<Integer> results;

            if (!(bestResult == 0)) {
                numbers.removeLast();
                results = copy.subList(1, numMountains-i);

            } else {
                numbers.removeFirst();
                results = copy.subList(0, numMountains-i-1);
            }


            System.out.println(asymmetric(results, size) + " with the index of  " + bestResult);
        }




    }
}
