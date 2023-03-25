## RomanToInteger

Romen rakamları yedi farklı sembolle temsil edilir:  I, V, X, L, C,D ve M

| Sembol |  Değer  |
|---|:-------:|
| I |    1    |
| V |    5    |
| X |   10    |
| L |   50    |
| C |   100   |
| D |   500   |
| M |  1000   |

Örneğin, 2 rakamı Romen rakamıyla <code>II</code> olarak yazılır, yalnızca iki tane 1 yazılır.<br>

12, <code>XII</code> olarak yazılır, yani basitçe <code>X + II</code>'dir. 27 sayısı, <code>XX + V + II</code> olan <code>XXVII</code> olarak yazılır.

<br>

* 4 ve 9 yapmak için  V(5) ve X(10)' dan önce  I yerleştirilebilir
* 40 ve 90 yapmak için L (50) ve C'nin (100) önüne  X yerleştirilebilir.
* 400 ve 900 yapmak için D (500) ve M'nin (1000) önüne C  yerleştirilebilir.


### Örnek1
    Input: s = "III"
    Output: 3
    Explanation: III = 3.

### Örnek2
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

### Örnek3

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

